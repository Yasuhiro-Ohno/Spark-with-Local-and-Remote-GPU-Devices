package ohno;

import java.lang.String;
import java.lang.System;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import static jcuda.driver.JCudaDriver.*;
import java.io.*;
import jcuda.*;
import jcuda.driver.*;

import ohno.*;

public class IntInt_RDD_Collection{
	public static final int BLOCKSIZE=128;
	public int rdd_id;
	public int length;
	public int len;
	public String rdd_type;
	public int[] ks_rdd_array;
	public int[] rdd_array;
	public int[] ks_result_array;
	public int[] result_array;
	private CUdeviceptr d_ks_rdd_array;

	public IntInt_RDD_Collection(int id, int[] ks_array, int[] array){
		rdd_id = id;
		length = ks_array.length;
		len = ((length-1)/BLOCKSIZE+1) * BLOCKSIZE;
		rdd_type = "Int, Int";
		ks_rdd_array = new int[len];
		rdd_array = new int[len];
		for (int i = 0; i < length; i++) {
			ks_rdd_array[i] = ks_array[i];
			rdd_array[i] = array[i];
		}
		ks_result_array = new int[len];
		result_array = new int[len];
	}

	public void sortByGPU(){
		Arrays.fill(ks_result_array, 0);
		Arrays.fill(result_array, 0);

		// Host Memory Allocate
		int num_array[] = new int[len];// array to record order

		// Device Memory Allocate
		CUdeviceptr d_num_array = new CUdeviceptr();
		cuMemAlloc(d_num_array, len * Sizeof.INT);

		CUdeviceptr d_cp_rdd_array = new CUdeviceptr();
		cuMemAlloc(d_cp_rdd_array, len * Sizeof.INT);

//		// Data Transfer (Host to Device)
//		cuMemcpyHtoD(d_num_array, Pointer.to(num_array), len* Sizeof.INT);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "sortIntKeyByGPU.ptx");

		// Obtain a function pointer to the "sortkey" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "sortkey");


		if (len/BLOCKSIZE <= 65000) {
			int j, k, count;
			count = 0;
			for (k = 2; k <= len; k=k<<1) {
				for (j = k>>1; j>0; j=j>>1) {
					// Set Kernel Parameters
					Pointer kernelParameters = Pointer.to(
						Pointer.to(d_ks_rdd_array),
						Pointer.to(d_cp_rdd_array),
						Pointer.to(d_num_array),
						Pointer.to(new int[]{j}),
						Pointer.to(new int[]{k}),
						Pointer.to(new int[]{count}),
						Pointer.to(new int[]{0})
					);

					// Kernel Execution
					cuLaunchKernel(function,
						len/BLOCKSIZE, 1, 1,
						BLOCKSIZE, 1, 1,
						0, null,
						kernelParameters, null
					);
					cuCtxSynchronize();
					count++;
				}
			}
		} else {
			int j, k, count, loop;
			for (loop = 0; loop < len/BLOCKSIZE/32768; loop++) {
				count = 0;
				for (k = 2; k <= 32768*BLOCKSIZE; k=k<<1) {
					for (j = k>>1; j>0; j=j>>1) {
						// Set Kernel Parameters
						Pointer kernelParameters = Pointer.to(
							Pointer.to(d_ks_rdd_array),
							Pointer.to(d_cp_rdd_array),
							Pointer.to(d_num_array),
							Pointer.to(new int[]{j}),
							Pointer.to(new int[]{k}),
							Pointer.to(new int[]{count}),
							Pointer.to(new int[]{loop})
						);

						// Kernel Execution
						cuLaunchKernel(function,
							32768, 1, 1,
							BLOCKSIZE, 1, 1,
							0, null,
							kernelParameters, null
						);
						cuCtxSynchronize();
						count++;
					}
				}
			}
		}

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(num_array), d_num_array, len * Sizeof.INT);
		cuCtxSynchronize();

		// Result Execution
		if (len/BLOCKSIZE <= 65000) {
			for (int i = 0; i < len; i++) {
				ks_result_array[i] = ks_rdd_array[num_array[i]];
				result_array[i] = rdd_array[num_array[i]];
			}
//		System.out.println(num_array[0]);
//		System.out.println(num_array[1]);
		} else {
			for (int loop = 0; loop < len/BLOCKSIZE/32768; loop++) {//gpu result 
				int s = loop * 32768 * BLOCKSIZE;
				for (int i = 0; i < 32768*BLOCKSIZE; i++) {
					ks_result_array[i + s] = ks_rdd_array[num_array[i + s] + s];
					result_array[i + s] = rdd_array[num_array[i + s] + s];
				}
			}

			for (int s = 32768*BLOCKSIZE; s<len; s*=2) {
				int[] a1 = new int[s];
				int[] a2 = new int[s];
				int[] a = new int[s*2];
				int[] b1 = new int[s];
				int[] b2 = new int[s];
				int[] b = new int[s*2];
				for (int loop = 0; loop < len/s; loop+=2) {
					for (int i=0; i<s; i++) {
						a1[i]=ks_result_array[i+loop*s];
						a2[i]=ks_result_array[i+(loop+1)*s];
						b1[i]=result_array[i+loop*s];
						b2[i]=result_array[i+(loop+1)*s];
					}
					KV_merge(a1,a2,a,b1,b2,b);
					for (int i=0; i<s*2; i++) {
						ks_result_array[i+loop*s]=a[i];
						result_array[i+loop*s]=b[i];
					}
				}
			}
		}

		// Memory Free
		cuMemFree(d_num_array);
		cuMemFree(d_cp_rdd_array);
	}

	public void KV_merge(int[] a1, int[] a2, int[] a, int[] b1, int[] b2, int[] b){
		int i=0, j=0;
		while (i<a1.length || j<a2.length){
			if (j>=a2.length || (i<a1.length && a1[i]<a2[j])) {
				a[i+j]=a1[i];
				b[i+j]=b1[i];
				i++;
			} else {
				a[i+j]=a2[j];
				b[i+j]=b2[j];
				j++;
			}
		}
	}

	public void sortByGPU2(){
		Arrays.fill(ks_result_array, 0);
		Arrays.fill(result_array, 0);

		// Host Memory Allocate
		int num_array[] = new int[len];

		// Device Memory Allocate
		CUdeviceptr d_num_array = new CUdeviceptr();
		cuMemAlloc(d_num_array, len * Sizeof.INT);

		CUdeviceptr d_cp_rdd_array = new CUdeviceptr();
		cuMemAlloc(d_cp_rdd_array, len * Sizeof.INT);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "sortIntKeyByGPU2.ptx");

		// Obtain a function pointer to the "sortkey" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "sortkey");

		int j, k, count;
		count = 0;
		for (k = 2; k <= len; k=k<<1) {
			for (j = k>>1; j>0; j=j>>1) {
				// Set Kernel Parameters
				Pointer kernelParameters = Pointer.to(
					Pointer.to(d_ks_rdd_array),
					Pointer.to(d_cp_rdd_array),
					Pointer.to(d_num_array),
					Pointer.to(new int[]{j}),
					Pointer.to(new int[]{k}),
					Pointer.to(new int[]{count})
				);

				// Kernel Execution
				if (len/BLOCKSIZE <= 65000) {
					cuLaunchKernel(function,
						len/BLOCKSIZE, 1, 1,
						BLOCKSIZE, 1, 1,
						0, null,
						kernelParameters, null
					);
					cuCtxSynchronize();
				} else {
					cuLaunchKernel(function,
						32768, len/BLOCKSIZE/32768, 1,
						BLOCKSIZE, 1, 1,
						0, null,
						kernelParameters, null
					);
					cuCtxSynchronize();
				}
				count++;
			}
		}

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(num_array), d_num_array, len * Sizeof.INT);

		// Result Execution
		for (int i = 0; i < len; i++) {
			ks_result_array[i] = ks_rdd_array[num_array[i]];
			result_array[i] = rdd_array[num_array[i]];
		}

		// Memory Free
		cuMemFree(d_num_array);
		cuMemFree(d_cp_rdd_array);
	}

	public void sortByMultiGPU(){
		MultiGPU t1 = new MultiGPU("thread 1", ks_rdd_array, len);
		MultiGPU t2 = new MultiGPU("thread 2", ks_rdd_array, len);
		MultiGPU t3 = new MultiGPU("thread 3", ks_rdd_array, len);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
		} catch (InterruptedException e) {}
		for (int i = 0; i < len; i++) {
			ks_result_array[i] = ks_rdd_array[t1.num_array[i]];
			result_array[i] = rdd_array[t1.num_array[i]];
		}
		try {
			t2.join();
		} catch (InterruptedException e) {}
		for (int i = 0; i < len; i++) {
			ks_result_array[i] = ks_rdd_array[t2.num_array[i]];
			result_array[i] = rdd_array[t2.num_array[i]];
		}
		try {
			t3.join();
		} catch (InterruptedException e) {}
		for (int i = 0; i < len; i++) {
			ks_result_array[i] = ks_rdd_array[t2.num_array[i]];
			result_array[i] = rdd_array[t2.num_array[i]];
		}
	}

	public void initializeGPU(){
		// Initialize the driver and create a context for the first device
		cuInit(0);
		CUdevice device = new CUdevice();
		cuDeviceGet(device, 0);
		CUcontext context = new CUcontext();
		cuCtxCreate(context, 0, device);

		// Device Memory Allocate
		d_ks_rdd_array = new CUdeviceptr();
		cuMemAlloc(d_ks_rdd_array, len * Sizeof.INT);

		// Data Transfer (Host to Device)
		cuMemcpyHtoD(d_ks_rdd_array, Pointer.to(ks_rdd_array), len * Sizeof.INT);
	}

	public void initmalloc(){
		// Initialize the driver and create a context for the first device
		cuInit(0);
		CUdevice device = new CUdevice();
		cuDeviceGet(device, 0);
		CUcontext context = new CUcontext();
		cuCtxCreate(context, 0, device);

		// Device Memory Allocate
		d_ks_rdd_array = new CUdeviceptr();
		cuMemAlloc(d_ks_rdd_array, 1 * Sizeof.INT);
	}
	
	public void finishGPU(){
		// Memory Free
		cuMemFree(d_ks_rdd_array);
		Arrays.fill(ks_result_array, 0);
		Arrays.fill(result_array, 0);
		System.out.println("Finish.");
	}
}

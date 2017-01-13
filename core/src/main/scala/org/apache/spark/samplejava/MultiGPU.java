//this is made by Ohno!
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

public class MultiGPU extends Thread{
	public static final int BLOCKSIZE=128;
	private String name;
	private int len;
	private int[] ks_rdd_array;
	public int[] num_array;
	
	public MultiGPU(String name, int[] ks_array, int len) {
		this.name = name;
		this.len = len;
		ks_rdd_array = new int[len];
		ks_rdd_array = ks_array;
//		for (int i = 0; i < length; i++) {
//			this.ks_rdd_array
//		}
		num_array = new int[len];
	}

	public void run() {		
		if (name == "thread 1") {			
			System.out.println("Thread 1");

//      long start1 = System.nanoTime();// get thread1 start time
			// Initialize the driver0 and create a context0
			cuInit(0);
			CUdevice device0 = new CUdevice();
			cuDeviceGet(device0, 0);
			CUcontext context0 = new CUcontext();
			cuCtxCreate(context0, 0, device0);

			// Device Memory Allocate
			CUdeviceptr d_ks_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_ks_rdd_array, len * Sizeof.INT);
			CUdeviceptr d_num_array = new CUdeviceptr();
			cuMemAlloc(d_num_array, len * Sizeof.INT);
			CUdeviceptr d_cp_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_cp_rdd_array, len * Sizeof.INT);

			// Data Transfer (Host to Device)
			cuMemcpyHtoD(d_ks_rdd_array, Pointer.to(ks_rdd_array), len * Sizeof.INT);

			// Confirm available device
			int count1[] = new int[2];
			cuDeviceGetCount(count1);
			System.out.println("the num of available GPUs : " + count1[0]);

			// Load the ptx file.						
			CUmodule module = new CUmodule();
			cuModuleLoad(module, "sortIntKeyByGPU2.ptx");
												                             
			// Obtain a function pointer to the "sortkey" function.
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

			// Memory Free
			cuMemFree(d_ks_rdd_array);
			cuMemFree(d_num_array);
			cuMemFree(d_cp_rdd_array);

		} else if (name == "thread 2") {
			System.out.println("Thread 2");
			// Initialize the driver0 and create a context0
			cuInit(0);
			CUdevice device1 = new CUdevice();
			cuDeviceGet(device1, 1);
			CUcontext context1 = new CUcontext();
			cuCtxCreate(context1, 0, device1);

			// Device Memory Allocate
			CUdeviceptr d_ks_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_ks_rdd_array, len * Sizeof.INT);
			CUdeviceptr d_num_array = new CUdeviceptr();
			cuMemAlloc(d_num_array, len * Sizeof.INT);
			CUdeviceptr d_cp_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_cp_rdd_array, len * Sizeof.INT);

			// Data Transfer (Host to Device)
			cuMemcpyHtoD(d_ks_rdd_array, Pointer.to(ks_rdd_array), len * Sizeof.INT);

			// Confirm available device
			int count1[] = new int[2];
			cuDeviceGetCount(count1);
			System.out.println("the num of available GPUs : " + count1[0]);

			// Load the ptx file.						
			CUmodule module = new CUmodule();
			cuModuleLoad(module, "sortIntKeyByGPU2.ptx");
												                             
			// Obtain a function pointer to the "sortkey" function.
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

			// Memory Free
			cuMemFree(d_ks_rdd_array);
			cuMemFree(d_num_array);
			cuMemFree(d_cp_rdd_array);

		} else if (name == "thread 3") {
			System.out.println("Thread 3");
			// Initialize the driver0 and create a context0
			cuInit(0);
			CUdevice device2 = new CUdevice();
			cuDeviceGet(device2, 2);
			CUcontext context2 = new CUcontext();
			cuCtxCreate(context2, 0, device2);

			// Device Memory Allocate
			CUdeviceptr d_ks_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_ks_rdd_array, len * Sizeof.INT);
			CUdeviceptr d_num_array = new CUdeviceptr();
			cuMemAlloc(d_num_array, len * Sizeof.INT);
			CUdeviceptr d_cp_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_cp_rdd_array, len * Sizeof.INT);

			// Data Transfer (Host to Device)
			cuMemcpyHtoD(d_ks_rdd_array, Pointer.to(ks_rdd_array), len * Sizeof.INT);

			// Confirm available device
			int count1[] = new int[2];
			cuDeviceGetCount(count1);
			System.out.println("the num of available GPUs : " + count1[0]);

			// Load the ptx file.						
			CUmodule module = new CUmodule();
			cuModuleLoad(module, "sortIntKeyByGPU2.ptx");
												                             
			// Obtain a function pointer to the "sortkey" function.
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

			// Memory Free
			cuMemFree(d_ks_rdd_array);
			cuMemFree(d_num_array);
			cuMemFree(d_cp_rdd_array);

		}
	}
}

package ohno;

import java.util.*;
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
//import jcuda.runtime.*;

import ohno.*;

public class Int_RDD_Collection{
	public static final int BLOCKSIZE=128;
	public static final int LEN=256000000;
	public int rdd_id;
	public int length;
	public int len;
	public int split = 0;
//	public static int gpu;
	public String rdd_type;
	public int[] rdd_array;
	public int[] result_array;
	public double[] result_array2;
	public int[] result_array3;
	private CUdeviceptr d_rdd_array;

	public Int_RDD_Collection(int id, int[] array){
		rdd_id = id;
		length = array.length;
		len = ((length-1)/BLOCKSIZE+1) * BLOCKSIZE;
		if (len > LEN) {
			for (int i = len; i > 0; i -= LEN) {
				split++;
			}
		}
		System.out.println("split : " + split);
//		int loop = (split + 1) / 2;
//		System.out.println("loop : " + loop);
//		gpu = 0;
		rdd_type = "Int";
		rdd_array = new int[len];
		for (int i = 0; i < length; i++) {
			rdd_array[i] = array[i];
		}
		result_array = new int[len];
		result_array2 = new double[len];
	}

/*
public void template(){

Arrays.fill(result_array, 0);

// Device Memory Allocate
CUdeviceptr d_result_array = new CUdeviceptr();
cuMemAlloc(d_result_array, len * Sizeof.INT);

// Load the ptx file
CUmodule module = new CUmodule();
cuModuleLoad(module, "sortIntByGPU.ptx);

// Obtain a function pointer to the "sort" function
CUfunction function = new CUfunction();
cuModuleGetFunction(function, module, "sort");

// Set Kernel Parameters
Pointer kernelParameters = Pointer.to(
Pointer.to(d_rdd_array),
Pointer.to(d_result_array)
);

// Kernel Execution
cuLaunchKernel(function,
len/BLOCKSIZE, 1, 1,
BLOCKSIZE, 1, 1,
0, null,
kernelParameters, null
);
cuCtxSynchronize();

// Data Transfer (Device to Host)
cuMemcpyDtoH(Pointer.to(result_array), d_result_array, len * Sizeof.INT);

// Result Execution

// Memory Free
cuMemFree(d_result_array);
}
*/

	public int reduceByGPU(){
		Arrays.fill(result_array, 0);
		int result = 0;

		if (split > 0) {
			System.out.println("splitted.");

			for (int loop = 0; loop < (split-1)/3+1; loop++) {
				int result_tmp = 0;
				if (split - loop*3 >= 3) {
					MultiIntSum t1 = new MultiIntSum("thread 1", rdd_array, len, loop);
					MultiIntSum t2 = new MultiIntSum("thread 2", rdd_array, len, loop);
					MultiIntSum t3 = new MultiIntSum("thread 3", rdd_array, len, loop);
					t1.start();
					t2.start();
					t3.start();
					try {
						t1.join();
						System.out.println("t1 sum end.");
					} catch (InterruptedException e) {}
					try {
						t2.join();
						System.out.println("t2 sum end.");
					} catch (InterruptedException e) {}
					try {
						t3.join();
						System.out.println("t3 sum end.");
					} catch (InterruptedException e) {}
					System.out.println("t1.result : " + t1.result);
					System.out.println("t2.result : " + t2.result);
					System.out.println("t3.result : " + t3.result);
					result_tmp = t1.result + t2.result + t3.result;
					System.out.println("result_tmp : " + result_tmp);
				} else {
					int[] tmp_array;
					tmp_array = new int[LEN];
					result_tmp = 0;
					if (split%3 == 1) {
						for (int i = 0; i < LEN; i++) {
							tmp_array[i] = rdd_array[i+loop*3*LEN];
						}

						cuInit(0);
						CUdevice device0 = new CUdevice();
						cuDeviceGet(device0, 1);
						CUcontext context0 = new CUcontext();
						cuCtxCreate(context0, 1, device0);

						CUdeviceptr d_rdd_array = new CUdeviceptr();
						cuMemAlloc(d_rdd_array, LEN * Sizeof.INT);
						CUdeviceptr d_result_array = new CUdeviceptr();
						cuMemAlloc(d_result_array, LEN/BLOCKSIZE * Sizeof.INT);

						cuMemcpyHtoD(d_rdd_array, Pointer.to(tmp_array), LEN * Sizeof.INT);

						CUmodule module = new CUmodule();
						cuModuleLoad(module, "reduceIntByGPU.ptx");

						CUfunction function = new CUfunction();
						cuModuleGetFunction(function, module, "reduce");

						Pointer kernelParameters = Pointer.to(
							Pointer.to(d_rdd_array),
							Pointer.to(d_result_array)
							);

						cuLaunchKernel(function,
							LEN/BLOCKSIZE/1000, 1000, 1,
							BLOCKSIZE, 1, 1,
							0, null,
							kernelParameters, null
							);
						cuCtxSynchronize();

						cuMemcpyDtoH(Pointer.to(result_array), d_result_array, (LEN/BLOCKSIZE) * Sizeof.INT);

						for (int i = 0; i < LEN/BLOCKSIZE; i++) {
							result_tmp += result_array[i];
						}
						System.out.println("result_array[0] = " + result_array[0]);
						System.out.println("result_array[1] = " + result_array[1]);

						cuMemFree(d_rdd_array);
						cuMemFree(d_result_array);
						
						//MultiIntSum t1 = new MultiIntSum("thread 1", rdd_array, len, loop);
						//t1.start();
						//try {
						//	t1.join();
						//	System.out.println("t1 sum end.");
						//} catch (InterruptedException e) {}
						//System.out.println("t1.result : " + t1.result);
						//result_tmp = t1.result;
						System.out.println("result_tmp : " + result_tmp);
					} else if (split%3 == 2) {
						MultiIntSum t1 = new MultiIntSum("thread 1", rdd_array, len, loop);
						MultiIntSum t2 = new MultiIntSum("thread 2", rdd_array, len, loop);
						t1.start();
						t2.start();
						try {
							t1.join();
							System.out.println("t1 sum end.");
						} catch (InterruptedException e) {}
						try {
							t2.join();
							System.out.println("t2 sum end.");
						} catch (InterruptedException e) {}
						System.out.println("t1.result : " + t1.result);
						System.out.println("t2.result : " + t2.result);
						result_tmp = t1.result + t2.result;
						System.out.println("result_tmp : " + result_tmp);
					}
				}
				result += result_tmp;
			}
			/*
			// make split arrays
			int[][] split_array;
			split_array = new int[split][LEN];

			for (int i = 0; i < split; i++) {
				for (int j = 0; j < LEN; j++) {
					if (i*LEN+j == len) {
						break;
					}
					split_array[i][j] = rdd_array[i*LEN+j];
				}
			}

			// Data Transfer (HtoD)
			cuMemcpyHtoD(d_rdd_array, Pointer.to(split_array[1][0]), LEN * Sizeof.INT);

			// Device Memory Allocate
			CUdeviceptr d_result_array = new CUdeviceptr();
			cuMemAlloc(d_result_array, (LEN/BLOCKSIZE) * Sizeof.INT);

			// Load the ptx file
			CUmodule module = new CUmodule();
			cuModuleLoad(module, "reduceIntByGPU.ptx");
	
			// Obtain a function pointer to the "reduce" function
			CUfunction function = new CUfunction();
			cuModuleGetFunction(function, module, "reduce");
	
			// Set Kernel Parameters
			Pointer kernelParameters = Pointer.to(
				Pointer.to(d_rdd_array),
				Pointer.to(d_result_array)
			);
	
			// Kernel Execution
			cuLaunchKernel(function,
				LEN/BLOCKSIZE/10000, 10000, 1,
				BLOCKSIZE, 1, 1,
				0, null,
				kernelParameters, null
			);
			cuCtxSynchronize();
	
			// Data Transfer (Device to Host)
			cuMemcpyDtoH(Pointer.to(result_array), d_result_array, (LEN/BLOCKSIZE) * Sizeof.INT);
	
			// Result Execution
			for (int i = 0; i < LEN/BLOCKSIZE; i++) {
				result += result_array[i];
			}
			System.out.println("result_array[0] = " + result_array[0]);
			System.out.println("result_array[1] = " + result_array[1]);
			System.out.println("result_array[2] = " + result_array[2]);
			System.out.println("result = " + result);
	
			// Memory Free
			cuMemFree(d_result_array);
		*/
			
		} else {
			// Device Memory Allocate
			CUdeviceptr d_result_array = new CUdeviceptr();
			cuMemAlloc(d_result_array, (len/BLOCKSIZE) * Sizeof.INT);

			// Load the ptx file
			CUmodule module = new CUmodule();
			cuModuleLoad(module, "reduceIntByGPU.ptx");
	
			// Obtain a function pointer to the "reduce" function
			CUfunction function = new CUfunction();
			cuModuleGetFunction(function, module, "reduce");
	
			// Set Kernel Parameters
			Pointer kernelParameters = Pointer.to(
				Pointer.to(d_rdd_array),
				Pointer.to(d_result_array)
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
					len/BLOCKSIZE/1000, 1000, 1,
					BLOCKSIZE, 1, 1,
					0, null,
					kernelParameters, null
				);
				cuCtxSynchronize();
			}
	
			// Data Transfer (Device to Host)
			cuMemcpyDtoH(Pointer.to(result_array), d_result_array, (len/BLOCKSIZE) * Sizeof.INT);
	
			// Result Execution
			for (int i = 0; i < len/BLOCKSIZE; i++) {
				result += result_array[i];
			}
			System.out.println("result_array[0] = " + result_array[0]);
			System.out.println("result_array[1] = " + result_array[1]);
			System.out.println("result_array[2] = " + result_array[2]);
			System.out.println("result = " + result);
	
			// Memory Free
			cuMemFree(d_result_array);
		}
		return result;
	}

	public double dispersionByGPU(){
		Arrays.fill(result_array2, 0);
		// Calculate Sum
		int sum = reduceByGPU();
		double avg = sum/length;
		System.out.println("average = " + avg);

		// Device Memory Allocate
		CUdeviceptr d_result_array2 = new CUdeviceptr();
		cuMemAlloc(d_result_array2, (len/BLOCKSIZE) * Sizeof.DOUBLE);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "dispersionIntByGPU.ptx");

		// Obtain a function pointer to the "dispersion" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "dispersion");

		// Set Kernel Parameters
		Pointer kernelParameters = Pointer.to(
			Pointer.to(d_rdd_array),
			Pointer.to(d_result_array2),
			Pointer.to(new double[]{avg})
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
				len/BLOCKSIZE/100, 100, 1,
				BLOCKSIZE, 1, 1,
				0, null,
				kernelParameters, null
			);
			cuCtxSynchronize();
		}

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(result_array2), d_result_array2, (len/BLOCKSIZE) * Sizeof.DOUBLE);
		System.out.println("result_array2[0](dispersion) = " + result_array2[0]);

		// Result Execution
		double result = 0;
		for (int i = 0; i < len/BLOCKSIZE; i++) {
			result += result_array2[i];
		}
		result = result/length;
		System.out.println("dispersion = " + result);
		System.out.println("CompleteDispersion");
		return result;
	}

	public void sortByGPU(){
		Arrays.fill(result_array, 0);

//		// Device Memory Allocate
//		CUdeviceptr d_result_array = new CUdeviceptr();
//		cuMemAlloc(d_result_array, len * Sizeof.INT);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "sortIntByGPU.ptx");

		// Obtain a function pointer to the "sort" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "sort");

		// Set Kernel Parameters
		Pointer kernelParameters = Pointer.to(
			Pointer.to(d_rdd_array),
//			Pointer.to(d_result_array)
			Pointer.to(new int[]{len})
		);

		// Kernel Execution
		cuLaunchKernel(function,
			len/BLOCKSIZE, 1, 1,
			BLOCKSIZE, 1, 1,
			0, null,
			kernelParameters, null
		);
		cuCtxSynchronize();

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(result_array), d_rdd_array, len * Sizeof.INT);

//		// Memory Free
//		cuMemFree(d_result_array);
	}

	public void sortByGPU2(int f){
		Arrays.fill(result_array, 0);

//		// Device Memory Allocate
//		CUdeviceptr d_result_array = new CUdeviceptr();
//		cuMemAlloc(d_result_array, len * Sizeof.INT);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "sortIntByGPU2.ptx");

		// Obtain a function pointer to the "sort" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "sort");

		int j, k;
		for (k = 2; k <= len; k=k<<1) {
			for (j = k>>1; j>0; j=j>>1) {
				// Set Kernel Parameters
				Pointer kernelParameters = Pointer.to(
					Pointer.to(d_rdd_array),
					Pointer.to(new int[]{j}),
					Pointer.to(new int[]{k}),
					Pointer.to(new int[]{f})
				);

				// Kernel Execution
				cuLaunchKernel(function,
					len/BLOCKSIZE, 1, 1,
					BLOCKSIZE, 1, 1,
					0, null,
					kernelParameters, null
				);
//				cuCtxSynchronize();
			}
		}

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(result_array), d_rdd_array, len * Sizeof.INT);

//		// Memory Free
//		cuMemFree(d_result_array);
	}

	public int maxminByGPU(int f){
		result_array3 = new int[2];
		int rep=0;

		for (int i=2; i<=len; i*=2) {
			rep++;
		}
		System.out.println("rep = " + rep);
		System.out.println("len = " + len);

		// Device Memory Allocate
		CUdeviceptr d_max_array = new CUdeviceptr();
		cuMemAlloc(d_max_array, len * Sizeof.INT);
//		CUdeviceptr d_max_array2 = new CUdeviceptr();
//		cuMemAlloc(d_max_array2, len * Sizeof.INT);
		CUdeviceptr d_result_array = new CUdeviceptr();
		cuMemAlloc(d_result_array, 2 * Sizeof.INT);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "maxminIntByGPU.ptx");
		CUmodule module2 = new CUmodule();
		cuModuleLoad(module2, "maxminIntByGPU2.ptx");
		CUmodule module3 = new CUmodule();
		cuModuleLoad(module3, "maxminIntByGPU3.ptx");

		// Obtain a function pointer to the "sort" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "maxmin");
		CUfunction function2 = new CUfunction();
		cuModuleGetFunction(function2, module2, "maxmin2");
		CUfunction function3 = new CUfunction();
		cuModuleGetFunction(function3, module3, "maxmin3");

		// Set Kernel Parameters
		Pointer kernelParameters = Pointer.to(
			Pointer.to(d_rdd_array),
			Pointer.to(d_max_array),
			Pointer.to(new int[]{len})
		);

		Pointer kernelParameters2 = Pointer.to(
			Pointer.to(d_rdd_array),
			Pointer.to(d_max_array)
		);
		Pointer kernelParameters3 = Pointer.to(
			Pointer.to(d_rdd_array),
			Pointer.to(d_result_array),
			Pointer.to(new int[]{len})
		);

		// Kernel Execution
		for (int j=1; j <= rep; j++) {
			if (len/BLOCKSIZE <= 65000) {
				cuLaunchKernel(function2,
					len/BLOCKSIZE, 1, 1,
					BLOCKSIZE, 1, 1,
					0, null,
					kernelParameters2, null
				);
				cuCtxSynchronize();
				cuLaunchKernel(function,
					len/BLOCKSIZE, 1, 1,
					BLOCKSIZE, 1, 1,
					0, null,
					kernelParameters, null
				);
				cuCtxSynchronize();
				if (j == rep) {
					cuLaunchKernel(function3,
						len/BLOCKSIZE, 1, 1,
						BLOCKSIZE, 1, 1,
						0, null,
						kernelParameters3, null
					);
				}
			} else {
				cuLaunchKernel(function2,
					32768, len/BLOCKSIZE/32768, 1,
					BLOCKSIZE, 1, 1,
					0, null,
					kernelParameters2, null
				);
				cuCtxSynchronize();
				cuLaunchKernel(function,
					32768, len/BLOCKSIZE/32768, 1,
					BLOCKSIZE, 1, 1,
					0, null,
					kernelParameters, null
				);
				cuCtxSynchronize();
			}
			if (j == rep) {
				cuLaunchKernel(function3,
					32768, len/BLOCKSIZE/32768, 1,
					BLOCKSIZE, 1, 1,
					0, null,
					kernelParameters3, null
				);
			}
		}

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(result_array3), d_result_array, 2 * Sizeof.INT);
		System.out.println("Max : " + result_array3[0]);
		System.out.println("Min : " + result_array3[1]);
//		System.out.println("max_array[0]" + result_array3[0]);
//		System.out.println("max_array[1000]" + result_array3[1000]);
//		System.out.println("max_array[6000]" + result_array3[6000]);
//		System.out.println("max_array[len-1]" + result_array3[len-1]);

		// Result Execution
		int result;
		if (f == 0) {
			result = result_array3[0];
		} else {
			result = result_array3[1];
		}
		System.out.println("result = " + result);

		// Memory Free
		cuMemFree(d_max_array);
		cuMemFree(d_result_array);

		return result;
	}

	public void initializeGPU(){
		// Initialize the driver and create a context for the first device
		cuInit(0);
		CUdevice device = new CUdevice();
		cuDeviceGet(device, 1);
		CUcontext context = new CUcontext();
		cuCtxCreate(context, 1, device);

		if (split > 0) {
						/*
			// make Multi threads
			MultiIntInit t1 = new MultiIntInit("thread 1", rdd_array, len);
			MultiIntInit t2 = new MultiIntInit("thread 2", rdd_array, len);
			t1.start();
			t2.start();
			try {
				t1.join();
				System.out.println("t1 init end.");
			} catch (InterruptedException e) {}
			try {
				t2.join();
				System.out.println("t2 init end.");
			} catch (InterruptedException e) {}
			*/
		} else {
			// Device Memory Allocate
			d_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_rdd_array, len * Sizeof.INT);

			// Data Transfer (Host to Device)
			cuMemcpyHtoD(d_rdd_array, Pointer.to(rdd_array), len * Sizeof.INT);
		}
	}

	public void initmalloc(){
	// Initialize the driver and create a context for the first device
	cuInit(0);
	CUdevice device = new CUdevice();
	cuDeviceGet(device, 0);
	CUcontext context = new CUcontext();
	cuCtxCreate(context, 0, device);

	// Device Memory Allocate
	d_rdd_array = new CUdeviceptr();
	cuMemAlloc(d_rdd_array, 1 * Sizeof.INT);
	}

	public void initmalloc2(){
	// Initialize the driver and create a context for the first device
	cuInit(0);
	CUdevice device = new CUdevice();
	cuDeviceGet(device, 1);
	CUcontext context = new CUcontext();
	cuCtxCreate(context, 1, device);

	// Device Memory Allocate
	d_rdd_array = new CUdeviceptr();
	cuMemAlloc(d_rdd_array, 1 * Sizeof.INT);
	}

	public void initmalloc3(){
	// Initialize the driver and create a context for the first device
	cuInit(0);
	CUdevice device = new CUdevice();
	cuDeviceGet(device, 2);
	CUcontext context = new CUcontext();
	cuCtxCreate(context, 2, device);

	// Device Memory Allocate
	d_rdd_array = new CUdeviceptr();
	cuMemAlloc(d_rdd_array, 1 * Sizeof.INT);
	}

	public void finishGPU(){
		// Memory Free
		cuMemFree(d_rdd_array);
		Arrays.fill(result_array, 0);
		Arrays.fill(result_array2, 0);
		System.out.println("Finish.");
	}
}


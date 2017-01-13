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

public class MultiIntSum extends Thread{
	public static final int BLOCKSIZE=128;
	public static final int LEN = 256000000;
	private String name;
	private int[] rdd_array;
	private int[] result_array;
	public int result;
	
	public MultiIntSum(String name, int[] array, int len, int loop) {
		this.name = name;
		rdd_array = new int[LEN];
		result_array = new int[LEN/BLOCKSIZE];
		if (name == "thread 1") {
			long t1 = System.nanoTime();
			for (int i = 0; i < LEN; i++) {
				if (i+loop*3*LEN >= len) {
					break;
				}
				rdd_array[i] = array[i+loop*3*LEN];
			}
			long t2 = System.nanoTime();
			System.out.println("array split time " + loop + " : " + (t2 - t1) / 1e9 + " s");
		} else if (name == "thread 2") {
			long t1 = System.nanoTime();
			for (int i = 0; i < LEN; i++) {
				if (i+(loop*3+1)*LEN >= len) {
					break;
				}
				rdd_array[i] = array[i+(loop*3+1)*LEN];
			}
			long t2 = System.nanoTime();
			System.out.println("array split time " + loop + " : " + (t2 - t1) / 1e9 + " s");
		} else if (name == "thread 3") {
			long t1 = System.nanoTime();
			for (int i = 0; i < LEN; i++) {
				if (i+(loop*3+2)*LEN >= len) {
					break;
				}
				rdd_array[i] = array[i+(loop*3+2)*LEN];
			}
			long t2 = System.nanoTime();
			System.out.println("array split time " + loop + " : " + (t2 - t1) / 1e9 + " s");
		}
	}

	public void run() {		
		if (name == "thread 1") {			
			System.out.println("Thread 1");
			result = 0;

//      long start1 = System.nanoTime();// get thread1 start time
//
			// Initialize the driver0 and create a context0
			cuInit(0);
			CUdevice device0 = new CUdevice();
			cuDeviceGet(device0, 1);
			CUcontext context0 = new CUcontext();
			cuCtxCreate(context0, 1, device0);

			// Device Memory Allocate
			CUdeviceptr d_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_rdd_array, LEN * Sizeof.INT);
			CUdeviceptr d_result_array = new CUdeviceptr();
			cuMemAlloc(d_result_array, LEN/BLOCKSIZE * Sizeof.INT);

			// Data Transfer (HtoD)
			cuMemcpyHtoD(d_rdd_array, Pointer.to(rdd_array), LEN * Sizeof.INT);

			// Confirm available device
			int count1[] = new int[2];
			cuDeviceGetCount(count1);
			System.out.println("the num of available GPUs : " + count1[0]);

			// Load the ptx file.						
			CUmodule module = new CUmodule();
			cuModuleLoad(module, "reduceIntByGPU.ptx");
												                             
			// Obtain a function pointer to the "reduce" function.
			CUfunction function = new CUfunction();
			cuModuleGetFunction(function, module, "reduce");
      
			// Set Kernel Parameters
			Pointer kernelParameters = Pointer.to(
				Pointer.to(d_rdd_array),
				Pointer.to(d_result_array)
			);

			// Kernel Execution
			cuLaunchKernel(function,
				LEN/BLOCKSIZE/1000, 1000, 1,
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
			System.out.println("t1.result = " + result);

			// Memory Free
			cuMemFree(d_rdd_array);
			cuMemFree(d_result_array);

		} else if (name == "thread 2") {
			System.out.println("Thread 2");
			result = 0;

//      long start1 = System.nanoTime();// get thread1 start time
//
			// Initialize the driver1 and create a context1
			cuInit(0);
			CUdevice device1 = new CUdevice();
			cuDeviceGet(device1, 0);
			CUcontext context1 = new CUcontext();
			cuCtxCreate(context1, 0, device1);

			// Device Memory Allocate
			CUdeviceptr d_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_rdd_array, LEN * Sizeof.INT);
			CUdeviceptr d_result_array = new CUdeviceptr();
			cuMemAlloc(d_result_array, LEN/BLOCKSIZE * Sizeof.INT);

			// Data Transfer (HtoD)
			cuMemcpyHtoD(d_rdd_array, Pointer.to(rdd_array), LEN * Sizeof.INT);

			// Confirm available device
			int count1[] = new int[2];
			cuDeviceGetCount(count1);
			System.out.println("the num of available GPUs : " + count1[0]);

			// Load the ptx file.						
			CUmodule module = new CUmodule();
			cuModuleLoad(module, "reduceIntByGPU.ptx");
												                             
			// Obtain a function pointer to the "reduce" function.
			CUfunction function = new CUfunction();
			cuModuleGetFunction(function, module, "reduce");
      
			// Set Kernel Parameters
			Pointer kernelParameters = Pointer.to(
				Pointer.to(d_rdd_array),
				Pointer.to(d_result_array)
			);

			// Kernel Execution
			cuLaunchKernel(function,
				LEN/BLOCKSIZE/1000, 1000, 1,
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
			System.out.println("t2.result = " + result);

			// Memory Free
			cuMemFree(d_rdd_array);
			cuMemFree(d_result_array);

		} else if (name == "thread 3") {
			System.out.println("Thread 3");
			result = 0;

//      long start1 = System.nanoTime();// get thread1 start time
//
			// Initialize the driver1 and create a context1
			cuInit(0);
			CUdevice device2 = new CUdevice();
			cuDeviceGet(device2, 2);
			CUcontext context2 = new CUcontext();
			cuCtxCreate(context2, 2, device2);

			// Device Memory Allocate
			CUdeviceptr d_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_rdd_array, LEN * Sizeof.INT);
			CUdeviceptr d_result_array = new CUdeviceptr();
			cuMemAlloc(d_result_array, LEN/BLOCKSIZE * Sizeof.INT);

			// Data Transfer (HtoD)
			cuMemcpyHtoD(d_rdd_array, Pointer.to(rdd_array), LEN * Sizeof.INT);

			// Confirm available device
			int count1[] = new int[2];
			cuDeviceGetCount(count1);
			System.out.println("the num of available GPUs : " + count1[0]);

			// Load the ptx file.						
			CUmodule module = new CUmodule();
			cuModuleLoad(module, "reduceIntByGPU.ptx");
												                             
			// Obtain a function pointer to the "reduce" function.
			CUfunction function = new CUfunction();
			cuModuleGetFunction(function, module, "reduce");
      
			// Set Kernel Parameters
			Pointer kernelParameters = Pointer.to(
				Pointer.to(d_rdd_array),
				Pointer.to(d_result_array)
			);

			// Kernel Execution
			cuLaunchKernel(function,
				LEN/BLOCKSIZE/1000, 1000, 1,
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
			System.out.println("t3.result = " + result);

			// Memory Free
			cuMemFree(d_rdd_array);
			cuMemFree(d_result_array);

		}
	}
}

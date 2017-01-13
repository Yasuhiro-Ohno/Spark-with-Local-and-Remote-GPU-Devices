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

public class MultiIntInit extends Thread{
	public static final int BLOCKSIZE=128;
	public static final int LEN = 256000000;
	private String name;
	private int[] rdd_array;
	
	public MultiIntInit(String name, int[] array, int len) {
		this.name = name;
		rdd_array = new int[LEN];
		if (name == "thread 1") {
			for (int i = 0; i < LEN; i++) {
				rdd_array[i] = array[i];
			}
		} else if (name == "thread 2") {
			for (int i = 0; i < LEN; i++) {
				rdd_array[i] = array[i+LEN];
				if (i+LEN == len) {
					break;
				}
			}
		}
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
			CUdeviceptr d_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_rdd_array, LEN * Sizeof.INT);

			// Data Transfer (Host to Device)
			cuMemcpyHtoD(d_rdd_array, Pointer.to(rdd_array), LEN * Sizeof.INT);

			// Confirm available device
			int count1[] = new int[2];
			cuDeviceGetCount(count1);
			System.out.println("the num of available GPUs : " + count1[0]);

		} else if (name == "thread 2") {
			System.out.println("Thread 2");
			// Initialize the driver1 and create a context1
			cuInit(0);
			CUdevice device1 = new CUdevice();
			cuDeviceGet(device1, 1);
			CUcontext context1 = new CUcontext();
			cuCtxCreate(context1, 0, device1);

			// Device Memory Allocate
			CUdeviceptr d_rdd_array = new CUdeviceptr();
			cuMemAlloc(d_rdd_array, LEN * Sizeof.INT);

			// Data Transfer (Host to Device)
			cuMemcpyHtoD(d_rdd_array, Pointer.to(rdd_array), LEN * Sizeof.INT);

			// Confirm available device
			int count1[] = new int[2];
			cuDeviceGetCount(count1);
			System.out.println("the num of available GPUs : " + count1[0]);

		}
		/*
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
		}
		*/
	}
}

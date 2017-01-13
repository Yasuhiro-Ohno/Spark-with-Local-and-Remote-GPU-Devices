package ohno;

import java.lang.String;
import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import static jcuda.driver.JCudaDriver.*;
import java.io.*;
import jcuda.*;
import jcuda.driver.*;

public class JCudaVectorSum {
	public static final int BLOCKSIZE=128;

	// Make Private int
	private int LENGTH;
	private int LEN;
	private int[] h_A;

	// Constructor
	public JCudaVectorSum(int length){
		LENGTH = length;
		LEN = ((LENGTH-1)/BLOCKSIZE+1) * BLOCKSIZE;//arraysize for GPUblock
	}

	// Copy Array from Spark
	public void MakeVector(int[] array){
		System.out.println("array.length = " + array.length);
		h_A = new int[LEN];
		System.out.println("LENGTH = " + LENGTH);
		System.out.println("LEN = " + LEN);
		for (int i = 0; i < LENGTH; i++) {
			h_A[i] = array[i];
		}
		for (int j = LENGTH; j < LEN; j++) {
			h_A[j] = 0;
		}
	}

	public int GPUVectorSum() throws IOException{
		// Enable exceptions and omit all subsequent error checks
		JCudaDriver.setExceptionsEnabled(true);

		// Initialize the driver and create a context for the first device.
		cuInit(0);
		CUdevice device = new CUdevice();
		cuDeviceGet(device, 0);
		CUcontext context = new CUcontext();
		cuCtxCreate(context, 0, device);

		// Load the ptx file.
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "Jcuda_Reduction_Kernel1.ptx");

		// Obtain a function pointer to the "add" function.
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "reduction1");

		// Host Memory Allocate
		int[] h_B = new int[LENGTH/BLOCKSIZE + 1];

		// Device Memory Allocate
		CUdeviceptr d_A = new CUdeviceptr();
		cuMemAlloc(d_A, LEN * Sizeof.INT);
		CUdeviceptr d_B = new CUdeviceptr();
		cuMemAlloc(d_B, (LEN/BLOCKSIZE) * Sizeof.INT);

		// Data Transfer (Host to Device)
		cuMemcpyHtoD(d_A, Pointer.to(h_A), LEN * Sizeof.INT);

		// Set Kernel Parameters
		Pointer kernelParameters = Pointer.to(
			Pointer.to(d_A),
			Pointer.to(d_B)
		);

		// Kernel Execution
		cuLaunchKernel(function,
			LEN/BLOCKSIZE, 1, 1,
			BLOCKSIZE, 1, 1,
			0, null,
			kernelParameters, null
		);
		cuCtxSynchronize();

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(h_B), d_B, (LEN/BLOCKSIZE) * Sizeof.INT);

		// Result Execution
		int result = 0;
		for (int i = 0; i < LEN/BLOCKSIZE; i++) {
//			System.out.println("h_B[" + i + "]=" + h_B[i]);
			result += h_B[i];
		}
		System.out.println("result=" + result);

		//Memory Free
		cuMemFree(d_A);
		cuMemFree(d_B);

		System.out.println("Complete.");
		return result;
	}

	public int CPUVectorSum() {
		int sum = 0;
		for (int i = 0; i < LENGTH; i++) {
			//System.out.println("array[" + i + "] is " + h_A[i]);
			sum += h_A[i];
		}
		return sum;
	}
}


package org.apache.spark.examples.ohno.jcuda;

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

public class GPUActions {
	public static final int BLOCKSIZE = 128;

	private int LENGTH;
	private int LEN;
	private double[] h_A;
	private double[] h_B;
	private CUdeviceptr d_A;
	private CUdeviceptr d_B;

	public GPUActions(double[] array, int n){
		LENGTH = n;
		LEN = ((LENGTH-1)/BLOCKSIZE+1) * BLOCKSIZE;

		//Host Memory Allocate
		h_A = new double[LEN];
		for (int i = 0; i < LENGTH; i++) {
			h_A[i] = array[i];
		}
		for (int j = LENGTH; j < LEN; j++) {
			h_A[j] = 0;
		}
		h_B = new double[LEN/BLOCKSIZE];

		// Initialize the driver and create a context for the first device
		cuInit(0);
		CUdevice device = new CUdevice();
		cuDeviceGet(device, 0);
		CUcontext context = new CUcontext();
		cuCtxCreate(context, 0, device);

		// Device Memory Allocate
		//CUdeviceptr d_A = new CUdeviceptr();
		d_A = new CUdeviceptr();
		cuMemAlloc(d_A, LEN * Sizeof.DOUBLE);
		//CUdeviceptr d_B = new CUdeviceptr();
		d_B = new CUdeviceptr();
		cuMemAlloc(d_B, (LEN/BLOCKSIZE) * Sizeof.DOUBLE);

		// Data Transfer (Host to Device)
		cuMemcpyHtoD(d_A, Pointer.to(h_A), LEN * Sizeof.DOUBLE);
		//
	}

	public double GPUSum(){
		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "GPUSum.ptx");

		// Obtain a function pointer to the "sum" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "sum");

		// Set Kernel Parameters
		Pointer kernelParameters = Pointer.to(
			Pointer.to(d_A),
			Pointer.to(d_B)
		);

		// Kernel Execution
		if (LEN/BLOCKSIZE <= 65000) {
			cuLaunchKernel(function,
				LEN/BLOCKSIZE, 1, 1,
				BLOCKSIZE, 1, 1,
				0, null,
				kernelParameters, null
			);
			cuCtxSynchronize();
		} else {
			cuLaunchKernel(function,
				LEN/BLOCKSIZE/100, 100, 1,
				BLOCKSIZE, 1, 1,
				0, null,
				kernelParameters, null
			);
			cuCtxSynchronize();
		}

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(h_B), d_B, (LEN/BLOCKSIZE) * Sizeof.DOUBLE);
		System.out.println("h_A[0](sum) = " + h_A[0]);
		System.out.println("h_B[0](sum) = " + h_B[0]);
		System.out.println("h_B[500](sum) = " + h_B[500]);
		System.out.println("h_B[2000](sum) = " + h_B[2000]);
		System.out.println("h_B[10000](sum) = " + h_B[50000]);
		System.out.println("h_B[50000](sum) = " + h_B[60000]);
		System.out.println("h_B[70000](sum) = " + h_B[70000]);

		/*
		double hehe = 0;
		for (int i = 0; i < BLOCKSIZE; i++) {
			hehe += h_A[i];
		}
		System.out.println("h_A[0]+...+h_A[127] = " + hehe);
		*/

		// Result Execution
		double result = 0;
		for (int i = 0; i < LEN/BLOCKSIZE; i++) {
			result += h_B[i];
		}
		System.out.println("sum = " + result);
		System.out.println("CompleteSum");
		return result;
	}

	public double GPUDispersion(){
		// Calculate Sum
		double sum = GPUSum();
		double avg = sum/LENGTH;
		System.out.println("average = " + avg);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "GPUDispersion.ptx");

		// Obtain a function pointer to the "dispersion" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "dispersion");

		// Set Kernel Parameters
		Pointer kernelParameters = Pointer.to(
			Pointer.to(d_A),
			Pointer.to(d_B),
			Pointer.to(new double[]{avg})
		);

		// Kernel Execution
		if (LEN/BLOCKSIZE <= 65000) {
			cuLaunchKernel(function,
				LEN/BLOCKSIZE, 1, 1,
				BLOCKSIZE, 1, 1,
				0, null,
				kernelParameters, null
			);
			cuCtxSynchronize();
		} else {
			cuLaunchKernel(function,
				LEN/BLOCKSIZE/100, 100, 1,
				BLOCKSIZE, 1, 1,
				0, null,
				kernelParameters, null
			);
			cuCtxSynchronize();
		}

		// Data Transfer (Device to Host)
		cuMemcpyDtoH(Pointer.to(h_B), d_B, (LEN/BLOCKSIZE) * Sizeof.DOUBLE);
		System.out.println("h_A[0](dispersion) = " + h_A[0]);
		System.out.println("h_B[0](dispersion) = " + h_B[0]);

		// Result Execution
		double result = 0;
		for (int i = 0; i < LEN/BLOCKSIZE; i++) {
			result += h_B[i];
		}
		result = result/LENGTH;
		System.out.println("dispersion = " + result);
		System.out.println("CompleteDispersion");
		return result;
	}

	public void GPUFinish(){
		// Memory Free
		cuMemFree(d_A);
		cuMemFree(d_B);
		System.out.println("Finish.");
	}
}

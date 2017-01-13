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

public class Double_RDD_Collection{
	public static final int BLOCKSIZE=128;
	public int rdd_id;
	public int length;
	public int len;
	public String rdd_type;
	public double[] rdd_array;
	public double[] result_array;
	private CUdeviceptr d_rdd_array;

	public Double_RDD_Collection(int id, double[] array){
		rdd_id = id;
		length = array.length;
		len = ((length-1)/BLOCKSIZE+1) * BLOCKSIZE;
		rdd_type = "Double";
		rdd_array = new double[len];
		for (int i = 0; i < length; i++) {
			rdd_array[i] = array[i];
		}
		result_array = new double[len];
	}

	public double reduceByGPU(){
		Arrays.fill(result_array, 0);
		
		// Device Memory Allocate
		CUdeviceptr d_result_array = new CUdeviceptr();
		cuMemAlloc(d_result_array, (len/BLOCKSIZE) * Sizeof.DOUBLE);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "reduceDoubleByGPU.ptx");

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
				len/BLOCKSIZE/32768, 32768, 1,
				BLOCKSIZE, 1, 1,
				0, null,
				kernelParameters, null
			);
			cuCtxSynchronize();
		}

		// Data Transfer (DtoH)
		cuMemcpyDtoH(Pointer.to(result_array), d_result_array, (len/BLOCKSIZE) * Sizeof.DOUBLE);

		// Result Execution
		double result = 0;
		for (int i = 0; i < len/BLOCKSIZE; i++) {
			result += result_array[i];
		}
		System.out.println("result_array[0] = " + result_array[0]);
		System.out.println("result_array[1] = " + result_array[1]);
		System.out.println("result = " + result);

		// Memory Free
		cuMemFree(d_result_array);

		return result;
	}

	public void initializeGPU(){
		// Initialize the driver and create a context for the first device
		cuInit(0);
		CUdevice device = new CUdevice();
		cuDeviceGet(device, 0);
		CUcontext context = new CUcontext();
		cuCtxCreate(context, 0, device);

		// Device Memory Allocate
		d_rdd_array = new CUdeviceptr();
		cuMemAlloc(d_rdd_array, len * Sizeof.DOUBLE);

		// Data Transfer (Host to Device)
		cuMemcpyHtoD(d_rdd_array, Pointer.to(rdd_array), len * Sizeof.DOUBLE);
	}

	public void initmalloc(){
		cuInit(0);
		CUdevice device = new CUdevice();
		cuDeviceGet(device, 0);
		CUcontext context = new CUcontext();
		cuCtxCreate(context, 0, device);

		// Device Memory Allocate
		d_rdd_array = new CUdeviceptr();
		cuMemAlloc(d_rdd_array, 1 * Sizeof.DOUBLE);
	}

	public void finishGPU(){
		// Memory Free
		cuMemFree(d_rdd_array);
		Arrays.fill(result_array, 0);
		System.out.println("Finish.");
	}

}

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

import ohno.*;

public class Byte_RDD_Collection{
	public static final int BLOCKSIZE=128;
	public int rdd_id;
	public int length;
	public int len;
//	public static int gpu;
	public String rdd_type;
	public byte[] rdd_array;
	public int[] result_array_int;
	public byte[] result_array_byte;
//	public byte[] result_array_byte2;
	private CUdeviceptr d_rdd_array;

	public Byte_RDD_Collection(int id, byte[] array){
		rdd_id = id;
		length = array.length;
		len = ((length-1)/BLOCKSIZE+1) * BLOCKSIZE;
//		gpu = 0;
		rdd_type = "Byte";
		rdd_array = new byte[len];
		for (int i = 0; i < length; i++) {
			rdd_array[i] = array[i];
		}
		result_array_int = new int[len/BLOCKSIZE];
		result_array_byte = new byte[length];
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

	public void initializeGPU(){
		// Initialize the driver and create a context for the first device
		cuInit(0);
		CUdevice device = new CUdevice();
		cuDeviceGet(device, 0);
		CUcontext context = new CUcontext();
		cuCtxCreate(context, 0, device);

		// Device Memory Allocate
		d_rdd_array = new CUdeviceptr();
		cuMemAlloc(d_rdd_array, len * Sizeof.BYTE);

		// Data Transfer (Host to Device)
		cuMemcpyHtoD(d_rdd_array, Pointer.to(rdd_array), len * Sizeof.BYTE);
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
	cuMemAlloc(d_rdd_array, 1 * Sizeof.BYTE);
	}

	public void finishGPU(){
		// Memory Free
		cuMemFree(d_rdd_array);
		Arrays.fill(result_array_int, 0);
		//Arrays.fill(result_array_byte, " ");
		System.out.println("Finish.");
	}

	public int wordcountByGPU(){
		Arrays.fill(result_array_int, 0);

		// Device Memory Allocate
		CUdeviceptr d_result_array = new CUdeviceptr();
		cuMemAlloc(d_result_array, (len/BLOCKSIZE) * Sizeof.INT);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "wordcountByGPU.ptx");

		// Obtain a function pointer to the "" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "wordcount");
		
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
		cuMemcpyDtoH(Pointer.to(result_array_int), d_result_array, (len/BLOCKSIZE) * Sizeof.INT);
		
		// Result Execution
		//int result = result_array_int[0];
		int result = 0;
		for (int i = 0; i < len/BLOCKSIZE; i++) {
			result += result_array_int[i];
		}
		//result += 1;
		System.out.println("result = " + result);

		// Memory Free
		cuMemFree(d_result_array);

		return result;
	}

	public int linecountByGPU(){
		Arrays.fill(result_array_int, 0);

		// Device Memory Allocate
		CUdeviceptr d_result_array = new CUdeviceptr();
		cuMemAlloc(d_result_array, (len/BLOCKSIZE) * Sizeof.INT);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "linecountByGPU.ptx");

		// Obtain a function pointer to the "" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "linecount");
		
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
		cuMemcpyDtoH(Pointer.to(result_array_int), d_result_array, (len/BLOCKSIZE) * Sizeof.INT);
		
		// Result Execution
		//int result = result_array_int[0];
		int result = 0;
		for (int i = 0; i < len/BLOCKSIZE; i++) {
			result += result_array_int[i];
		}
		//result += 1;
		System.out.println("result = " + result);

		// Memory Free
		cuMemFree(d_result_array);

		return result;
	}

	public void wordconversionByGPU(int f){
		//Arrays.fill(result_array_int, 0);

		// Device Memory Allocate
		CUdeviceptr d_result_array = new CUdeviceptr();
		cuMemAlloc(d_result_array, length * Sizeof.BYTE);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "wordconversionByGPU.ptx");

		// Obtain a function pointer to the "" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "wordconversion");
		
		// Set Kernel Parameters
		Pointer kernelParameters = Pointer.to(
			Pointer.to(d_rdd_array),
			Pointer.to(d_result_array),
			Pointer.to(new int[]{f})
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
		cuMemcpyDtoH(Pointer.to(result_array_byte), d_result_array, length * Sizeof.BYTE);
		
		// Result Execution

		// Memory Free
		cuMemFree(d_result_array);
	}

	public void patternmatchByGPU(byte[] pattern_array){

		byte[] flag_array = new byte[length];
		//public byte[] result_array_byte2;
		int p_length = pattern_array.length;

		// Device Memory Allocate
		CUdeviceptr d_pattern_array = new CUdeviceptr();
		cuMemAlloc(d_pattern_array, p_length * Sizeof.BYTE);
		CUdeviceptr d_flag_array = new CUdeviceptr();
		cuMemAlloc(d_flag_array, len * Sizeof.BYTE);

		// Data Transfer (Host to Device)
		cuMemcpyHtoD(d_pattern_array, Pointer.to(pattern_array), p_length * Sizeof.BYTE);

		// Load the ptx file
		CUmodule module = new CUmodule();
		cuModuleLoad(module, "patternmatchByGPU.ptx");

		// Obtain a function pointer to the "" function
		CUfunction function = new CUfunction();
		cuModuleGetFunction(function, module, "patternmatch");
		
		// Set Kernel Parameters
		Pointer kernelParameters = Pointer.to(
			Pointer.to(d_rdd_array),
			Pointer.to(d_pattern_array),
			Pointer.to(d_flag_array),
			Pointer.to(new int[]{length}),
			Pointer.to(new int[]{p_length})
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
//		flag_array = new byte[length];
		cuMemcpyDtoH(Pointer.to(flag_array), d_flag_array, length * Sizeof.BYTE);
		
		// Result Execution
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (flag_array[i] != '0') {
				result_array_byte[count] = flag_array[i];
				count++;
			}
		}
		System.out.println("length = " + length);
		System.out.println("match = " + count);

		// Memory Free
		cuMemFree(d_pattern_array);
		cuMemFree(d_flag_array);
	}

}

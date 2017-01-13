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

public class IntString_RDD_Collection{
	public static final int BLOCKSIZE=128;
	public int rdd_id;
	public int length;
	public int len;
	public String rdd_type;
	public int[] ks_rdd_array;
	public String[] rdd_array;
	public int[] ks_result_array;
	public String[] result_array;
	private CUdeviceptr d_ks_rdd_array;
//	private CUdeviceptr d_rdd_array;

	public IntString_RDD_Collection(int id, int[] ks_array, String[] array){
		rdd_id = id;
		length = ks_array.length;
		len = ((length-1)/BLOCKSIZE+1) * BLOCKSIZE;
		rdd_type = "Int, String";
		ks_rdd_array = new int[len];
		rdd_array = new String[len];
		for (int i = 0; i < length; i++) {
			ks_rdd_array[i] = ks_array[i];
			rdd_array[i] = array[i];
		}
		ks_result_array = new int[len];
		result_array = new String[len];
	}

	public void initializeGPU(){
		// Initialize the driver and create a context for the first device
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

	public void finishGPU(){
		// Memory Free
		cuMemFree(d_ks_rdd_array);
		Arrays.fill(ks_result_array, 0);
		Arrays.fill(result_array, 0);
		System.out.println("Finish.");
	}
}

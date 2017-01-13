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

public class RDD_Collection{
	public static final int BLOCKSIZE=128;
	public int rdd_id;
	public int length;
	public int len;
	public String rdd_type;
	public int rdd_id2;
	public static int int_count = 0;
	public static int double_count = 0;
	public static int byte_count = 0;
	public static int intint_count = 0;
	public static int intstring_count = 0;

	public RDD_Collection(int id, int l, String st){
		rdd_id = id;
		length = l;
		len = ((length-1)/BLOCKSIZE+1) * BLOCKSIZE;
		rdd_type = st;
		switch (rdd_type){
			case "Int":
				rdd_id2 = int_count;
				int_count++;
				break;
			case "Double":
				rdd_id2 = double_count;
				double_count++;
				break;
			case "Byte":
				rdd_id2 = byte_count;
				byte_count++;
				break;
			case "Int, Int":
				rdd_id2 = intint_count;
				intint_count++;
				break;
			case "Int, String":
				rdd_id2 = intstring_count;
				intstring_count++;
				break;
		}
	}
}

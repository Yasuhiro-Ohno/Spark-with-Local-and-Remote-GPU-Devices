package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.rdd._
import ohno._


object GPUMin {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("GPU Min")
    val sc = new SparkContext(conf)
    val start2 = System.nanoTime
    val slices = if (args.length > 0) args(0).toInt else 2
//    val n = 1048576 * slices//8M
//    val n = 2097152 * slices//16M
//    val n = 4194304 * slices//32M
//    val n = 8388608 * slices//64M
//    val n = 16000000 * slices//128M
//    val n = 16777216 * slices//128M
//    val n = 32000000 * slices//256M
//    val n = 33554432 * slices//256M
//    val n = 64000000 * slices//512M
//    val n = 67108864 * slices//512M
//    val n = 128000000 * slices//1G
    val n = 134217728 * slices//1G
    //make rdd of array
    val rdd1 = sc.parallelize(Array.fill(n)(floor(random * 1000).toInt))
    val start3 = System.nanoTime
    //registerRDD and initmalloc
    sc.registerRDD(rdd1.id, rdd1.collect())
    val start3_2 = System.nanoTime
    //initmalloc
    rdd1.initmallocInt()
    val start4 = System.nanoTime
    //min(1)
    val min1 = rdd1.minIntByGPU()
    val start5 = System.nanoTime
    //min(2)
    val min2 = rdd1.minIntByGPU()
    val start6 = System.nanoTime
    //min(3)
    val min3 = rdd1.minIntByGPU()
    val start7 = System.nanoTime
    //min(4)
    val min4 = rdd1.minIntByGPU()
    val start8 = System.nanoTime
    //min(5)
    val min5 = rdd1.minIntByGPU()
    val start9 = System.nanoTime

    println("Min1 is " + min1)
    println("Min2 is " + min2)
    println("n = " + n)
    println("DataSize = " + (n*4) + "Byte")
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD) " + (start3 - start2) / 1e9 + " s")
    println("It takes(registerRDD) " + (start3_2 - start3) / 1e9 + " s")
    println("It takes(initmalloc) " + (start4 - start3_2) / 1e9 + " s")
    println("It takes(min1) " + (start5 - start4) / 1e9 + " s")
    println("It takes(min2) " + (start6 - start5) / 1e9 + " s")
    println("It takes(min3) " + (start7 - start6) / 1e9 + " s")
    println("It takes(min4) " + (start8 - start7) / 1e9 + " s")
    println("It takes(min5) " + (start9 - start8) / 1e9 + " s")
    sc.stop()
  }
}


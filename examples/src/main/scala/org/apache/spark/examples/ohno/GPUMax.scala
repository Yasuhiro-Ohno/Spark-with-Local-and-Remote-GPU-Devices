package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.rdd._
import ohno._


object GPUMax {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("GPU Max")
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
//    val n = 134217728 * slices//1G
      val n = 200000000 * slices//1.5G
//    val n = 268435456 * slices//2G
    //make rdd of array
    val rdd1 = sc.parallelize(Array.fill(n)(floor(random * 1000).toInt))
    val start3 = System.nanoTime
    //registerRDD and initmalloc
    sc.registerRDD(rdd1.id, rdd1.collect())
    val start3_2 = System.nanoTime
    //initmalloc
    rdd1.initmallocInt()
    val start4 = System.nanoTime
    //max(1)
    val max1 = rdd1.maxIntByGPU()
    val start5 = System.nanoTime
    //max(2)
    val max2 = rdd1.maxIntByGPU()
    val start6 = System.nanoTime
    //max(3)
    val max3 = rdd1.maxIntByGPU()
    val start7 = System.nanoTime
    //max(4)
    val max4 = rdd1.maxIntByGPU()
    val start8 = System.nanoTime
    //max(5)
    val max5 = rdd1.maxIntByGPU()
    val start9 = System.nanoTime

    println("Max1 is " + max1)
    println("Max2 is " + max2)
    println("n = " + n)
    println("DataSize = " + (n*4) + "Byte")
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD) " + (start3 - start2) / 1e9 + " s")
    println("It takes(registerRDD) " + (start3_2 - start3) / 1e9 + " s")
    println("It takes(initmalloc) " + (start4 - start3_2) / 1e9 + " s")
    println("It takes(max1) " + (start5 - start4) / 1e9 + " s")
    println("It takes(max2) " + (start6 - start5) / 1e9 + " s")
    println("It takes(max3) " + (start7 - start6) / 1e9 + " s")
    println("It takes(max4) " + (start8 - start7) / 1e9 + " s")
    println("It takes(max5) " + (start9 - start8) / 1e9 + " s")
    sc.stop()
  }
}


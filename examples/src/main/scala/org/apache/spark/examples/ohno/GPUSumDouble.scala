package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.rdd._
import ohno._


object GPUSumDouble {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("GPU SumDouble")
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
      val n = 128000000 * slices//1G
//    val n = 134217728 * slices//1G
//    val n = 200000000 * slices//1.5G
//    val n = 256000000 * slices//2G
//    val n = 268435456 * slices//2G
//    val n = 536870912 * slices//4G
//
    println("DataSize = " + (n*8) + "Byte")
    //make rdd of array
    val rdd1 = sc.parallelize(Array.fill(n)(floor(random * 1000).toDouble))
    val start3 = System.nanoTime
    //registerRDD and initmalloc
    sc.registerRDD(rdd1.id, rdd1.collect())
    val start3_2 = System.nanoTime
    //initmalloc
    rdd1.initmallocDouble()
    val start4 = System.nanoTime
    //dispersion(1)
    val sum1 = rdd1.reduceDoubleByGPU()
    val start5 = System.nanoTime
    //dispersion(2)
    val sum2 = rdd1.reduceDoubleByGPU()
    val start6 = System.nanoTime
    //dispersion(3)
    val sum3 = rdd1.reduceDoubleByGPU()
    val start7 = System.nanoTime
    //dispersion(4)
    val sum4 = rdd1.reduceDoubleByGPU()
    val start8 = System.nanoTime
    //dispersion(5)
    val sum5 = rdd1.reduceDoubleByGPU()
    val start9 = System.nanoTime

    println("Sum1 is " + sum1)
    println("Sum2 is " + sum2)
    println("n = " + n)
    println("DataSize = " + (n*8) + "Byte")
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD) " + (start3 - start2) / 1e9 + " s")
    println("It takes(registerRDD) " + (start3_2 - start3) / 1e9 + " s")
    println("It takes(initmalloc) " + (start4 - start3_2) / 1e9 + " s")
    println("It takes(sum1) " + (start5 - start4) / 1e9 + " s")
    println("It takes(sum2) " + (start6 - start5) / 1e9 + " s")
    println("It takes(sum3) " + (start7 - start6) / 1e9 + " s")
    println("It takes(sum4) " + (start8 - start7) / 1e9 + " s")
    println("It takes(sum5) " + (start9 - start8) / 1e9 + " s")
    sc.stop()
  }
}


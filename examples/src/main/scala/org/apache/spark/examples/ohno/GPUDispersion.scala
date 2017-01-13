package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.rdd._
import ohno._


object GPUDispersion {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("GPU Dispersion")
    val sc = new SparkContext(conf)
    val start2 = System.nanoTime
    val slices = if (args.length > 0) args(0).toInt else 2
//    val n = 1048576 * slices//8M
//    val n = 2097152 * slices//16M
//    val n = 4194304 * slices//32M
//    val n = 8388608 * slices//64M
//    val n = 16777216 * slices//128M
//    val n = 33554432 * slices//256M
//    val n = 64000000 * slices//512M
//    val n = 67108864 * slices//512M
      val n = 128000000 * slices//1G
//    val n = 134217728 * slices//1G
    //make rdd of array
    val rdd1 = sc.parallelize(Array.fill(n)(floor(random * 1000).toInt))
    val start3 = System.nanoTime
    //registerRDD and initmalloc
    sc.registerRDD(rdd1.id, rdd1.collect())
    val start3_2 = System.nanoTime
    //initmalloc
    rdd1.initmallocInt()
    val start4 = System.nanoTime
    //dispersion(1)
    val dis1 = rdd1.dispersionIntByGPU()
    val start5 = System.nanoTime
    //dispersion(2)
    val dis2 = rdd1.dispersionIntByGPU()
    val start6 = System.nanoTime
    //dispersion(3)
    val dis3 = rdd1.dispersionIntByGPU()
    val start7 = System.nanoTime
    //dispersion(4)
    val dis4 = rdd1.dispersionIntByGPU()
    val start8 = System.nanoTime
    //dispersion(5)
    val dis5 = rdd1.dispersionIntByGPU()
    val start9 = System.nanoTime

    println("Dispersion1 is " + dis1)
    println("Dispersion2 is " + dis2)
    println("n = " + n)
    println("DataSize = " + (n*4) + "Byte")
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD) " + (start3 - start2) / 1e9 + " s")
    println("It takes(registerRDD) " + (start3_2 - start3) / 1e9 + " s")
    println("It takes(initmalloc) " + (start4 - start3_2) / 1e9 + " s")
    println("It takes(dispersion1) " + (start5 - start4) / 1e9 + " s")
    println("It takes(dispersion2) " + (start6 - start5) / 1e9 + " s")
    println("It takes(dispersion3) " + (start7 - start6) / 1e9 + " s")
    println("It takes(dispersion4) " + (start8 - start7) / 1e9 + " s")
    println("It takes(dispersion5) " + (start9 - start8) / 1e9 + " s")
    sc.stop()
  }
}


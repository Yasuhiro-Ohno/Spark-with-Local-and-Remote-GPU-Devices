package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.rdd._
import ohno._


object GPUWordconversion {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("GPU Wordconversion")
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
    //make rdd of array
    val rdd1 = sc.textFile("../../README.txt")
    val start3 = System.nanoTime
    //RDD[String] -> RDD[Byte]
    val rdd2 = rdd1.map(_+'\\').flatMap(_.getBytes())
    val start4 = System.nanoTime
    //registerRDD
    sc.registerRDD(rdd2.id, rdd2.collect())
    val start5 = System.nanoTime
    //initmalloc
    rdd2.initmallocByte()
    val start6 = System.nanoTime
    //wordconversion(1)
    val rdd3 = rdd2.wordconversionByGPU()
    val start7 = System.nanoTime
    //wordconversion(2)
    val rdd4 = rdd2.wordconversionByGPU()
    val start8 = System.nanoTime
    //wordconversion(3)
    val rdd5 = rdd2.wordconversionByGPU()
    val start9 = System.nanoTime
    //wordconversion(4)
    val rdd6 = rdd2.wordconversionByGPU()
    val start10 = System.nanoTime
    //wordconversion(5)
    val rdd7 = rdd2.wordconversionByGPU()
    val start11 = System.nanoTime

    //println("n = " + n)
    //println("DataSize = " + (n*4) + "Byte")
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(txt->rdd) " + (start3 - start2) / 1e9 + " s")
    println("It takes(RDD[String]->RDD[Byte]) " + (start4 - start3) / 1e9 + " s")
    println("It takes(registerRDD) " + (start5 - start4) / 1e9 + " s")
    println("It takes(initmalloc) " + (start6 - start5) / 1e9 + " s")
    println("It takes(wordconversion1) " + (start7 - start6) / 1e9 + " s")
    println("It takes(wordconversion2) " + (start8 - start7) / 1e9 + " s")
    println("It takes(wordconversion3) " + (start9 - start8) / 1e9 + " s")
    println("It takes(wordconversion4) " + (start10 - start9) / 1e9 + " s")
    println("It takes(wordconversion5) " + (start11 - start10) / 1e9 + " s")
    sc.stop()
  }
}


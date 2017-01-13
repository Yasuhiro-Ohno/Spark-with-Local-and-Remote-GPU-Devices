package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

object SparkSum {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Sum")
    val sc = new SparkContext(conf)
    val start2 = System.nanoTime
    val slices = if (args.length > 0) args(0).toInt else 2
//    val n = 1000000 * slices//8M
//    val n = 2000000 * slices//16M
//    val n = 4000000 * slices//32M
//    val n = 8000000 * slices//64M
//    val n = 16000000 * slices//128M
//    val n = 32000000 * slices//256M
//    val n = 64000000 * slices//512M
//    val n = 128000000 * slices//1G
//    val n = 256000000 * slices//2G
//    val n = 268435456 * slices//2G
//    val n = 384000000 * slices//3G
      val n = 512000000 * slices//4G
//    val n = 640000000 * slices//5G
//    val n = 768000000 * slices//6G
//    val n = 896000000 * slices//7G
//    val n = 1024000000 * slices//8G
//
//    println("n = " + n)
    //make rdd of array
    val rdd = sc.makeRDD(Array.fill(n)(floor(random * 3).toInt))
    val start3 = System.nanoTime
    //calculate dispersion(1)
    val sum1 = rdd.reduce(_ + _)//average
    val start4 = System.nanoTime
    //calculate dispersion(2)
    val sum2 = rdd.reduce(_ + _)
    val start5 = System.nanoTime
    //calculate dispersion(3)
    val sum3 = rdd.reduce(_ + _)
    val start6 = System.nanoTime
    //calculate dispersion(4)
//    val sum4 = rdd.reduce(_ + _)
//    val start7 = System.nanoTime
    //calculate dispersion(5)
//    val sum5 = rdd.reduce(_ + _)
//    val start8 = System.nanoTime
    
    println("Sum is " + sum1)
    println("n = " + n)
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD) " + (start3 - start2) / 1e9 + " s")
    println("It takes(sum1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(sum2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(sum3) " + (start6 - start5) / 1e9 + " s")
//    println("It takes(sum4) " + (start7 - start6) / 1e9 + " s")
//    println("It takes(sum5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

object SparkMin {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Min")
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
    val n = 128000000 * slices//1G
    println("n = " + n)
    //make rdd of array
    val rdd = sc.makeRDD(Array.fill(n)(floor(random * 1000).toInt))
    val start3 = System.nanoTime
    //calculate min(1)
    val min1 = rdd.min()
    val start4 = System.nanoTime
    //calculate min(2)
    val min2 = rdd.min()
    val start5 = System.nanoTime
    //calculate min(3)
    val min3 = rdd.min()
    val start6 = System.nanoTime
    //calculate min(4)
    val min4 = rdd.min()
    val start7 = System.nanoTime
    //calculate min(5)
    val min5 = rdd.min()
    val start8 = System.nanoTime
    
    println("Min is " + min1)
    println("Min2 is " + min2)
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD) " + (start3 - start2) / 1e9 + " s")
    println("It takes(min1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(min2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(min3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(min4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(min5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


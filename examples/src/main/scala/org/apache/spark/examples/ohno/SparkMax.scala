package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

object SparkMax {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Max")
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
    //calculate max(1)
    val max1 = rdd.max()
    val start4 = System.nanoTime
    //calculate max(2)
    val max2 = rdd.max()
    val start5 = System.nanoTime
    //calculate max(3)
    val max3 = rdd.max()
    val start6 = System.nanoTime
    //calculate max(4)
    val max4 = rdd.max()
    val start7 = System.nanoTime
    //calculate max(5)
    val max5 = rdd.max()
    val start8 = System.nanoTime
    
    println("Max is " + max1)
    println("Max2 is " + max2)
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD) " + (start3 - start2) / 1e9 + " s")
    println("It takes(max1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(max2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(max3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(max4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(max5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

object SparkLinecount {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Linecount")
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
//    println("n = " + n)

    //make rdd of array
    val rdd = sc.textFile("../../README.txt")
    val start3 = System.nanoTime
    //linecount(1)
    val count1 = rdd.count()
    val start4 = System.nanoTime
    //linecount(2)
    val count2 = rdd.count()
    val start5 = System.nanoTime
    //linecount(3)
    val count3 = rdd.count()
    val start6 = System.nanoTime
    //linecount(4)
    val count4 = rdd.count()
    val start7 = System.nanoTime
    //linecount(5)
    val count5 = rdd.count()
    val start8 = System.nanoTime

    println("Count1 is " + count1)
    println("Count2 is " + count2)
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(txt->rdd) " + (start3 - start2) / 1e9 + " s")
    println("It takes(linecount1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(linecount2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(linecount3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(linecount4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(linecount5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


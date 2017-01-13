package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

object SparkWordconversion2 {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Wordconversion2")
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
    val rdd1 = sc.textFile("../../README.md")
      //val rdd1 = sc.textFile("README.md")
    val start3 = System.nanoTime
    //wordconversion(1)
    //val rdd2 = rdd1.map(_.toUpperCase())
    rdd1.takeSample(false, 3)
    val start4 = System.nanoTime
    //wordconversion(2)
    //val rdd3 = rdd1.map(_.toUpperCase())
    rdd1.takeSample(false, 3)
    val start5 = System.nanoTime
    //wordconversion(3)
    //val rdd4 = rdd1.map(_.toUpperCase())
    rdd1.takeSample(false, 3)
    val start6 = System.nanoTime
    //wordconversion(4)
    //val rdd5 = rdd1.map(_.toUpperCase())
    rdd1.takeSample(false, 3)
    val start7 = System.nanoTime
    //wordconversion(5)
    //val rdd6 = rdd1.map(_.toUpperCase())
    rdd1.takeSample(false, 3)
    val start8 = System.nanoTime

    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(txt->rdd) " + (start3 - start2) / 1e9 + " s")
    //println("It takes(takeSample1) " + (start3_2 - start3) / 1e9 + " s")
    //println("It takes(takeSample2) " + (start3_3 - start3_2) / 1e9 + " s")
    println("It takes(wordconversion1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(wordconversion2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(wordconversion3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(wordconversion4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(wordconversion5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


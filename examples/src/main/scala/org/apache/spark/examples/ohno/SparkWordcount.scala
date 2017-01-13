package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

object SparkWordcount {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Wordcount")
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
    val rdd = sc.textFile("../../README.md")
    val start3 = System.nanoTime
    //wordcount(1)
    val count1 = rdd.flatMap(line => line.split(" "))
                    .map(word => (word, 1))
                    .reduceByKey(_ + _)
    val start4 = System.nanoTime
    //wordcount(2)
    val count2 = rdd.flatMap(line => line.split(" "))
                    .map(word => (word, 1))
                    .reduceByKey(_ + _)
    val start5 = System.nanoTime
    //wordcount(3)
    val count3 = rdd.flatMap(line => line.split(" "))
                    .map(word => (word, 1))
                    .reduceByKey(_ + _)
    val start6 = System.nanoTime
    //wordcount(4)
    val count4 = rdd.flatMap(line => line.split(" "))
                    .map(word => (word, 1))
                    .reduceByKey(_ + _)
    val start7 = System.nanoTime
    //wordcount(5)
    val count5 = rdd.flatMap(line => line.split(" "))
                    .map(word => (word, 1))
                    .reduceByKey(_ + _)
    val start8 = System.nanoTime

    println("Count1 is " + count1)
    println("Count2 is " + count2)
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(txt->rdd) " + (start3 - start2) / 1e9 + " s")
    println("It takes(wordcount1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(wordcount2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(wordcount3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(wordcount4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(wordcount5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


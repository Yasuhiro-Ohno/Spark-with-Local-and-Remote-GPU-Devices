package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

// rate = 1%
object SparkSample2 {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Sample2")
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
    val rdd = sc.textFile("../../README3.txt")
    //val rdd2 = sc.textFile("../../README3.md")
    //val rdd3 = sc.textFile("../../README3.md")
    //val rdd4 = sc.textFile("../../README3.md")
    //val rdd5 = sc.textFile("../../README3.md")
    val start3 = System.nanoTime
    //takeSample(1)
      //rdd.collect()
      rdd.count()
      //rdd.max()
      //rdd.takeSample(false, 3)
      //rdd.saveAsTextFile("ponpon1")
    val start4 = System.nanoTime
    //takeSample(2)
      //rdd.collect()
      rdd.count()
      //rdd.max()
      //rdd.takeSample(false, 3)
      //rdd.saveAsTextFile("ponpon2")
    val start5 = System.nanoTime
    //takeSample(3)
      //rdd.collect()
      rdd.count()
      //rdd.max()
      //rdd.takeSample(false, 3)
      //rdd.saveAsTextFile("ponpon3")
    val start6 = System.nanoTime
    //takeSample(4)
      //rdd.collect()
      rdd.count()
      //rdd.max()
      //rdd.takeSample(false, 3)
      //rdd.saveAsTextFile("ponpon4")
    val start7 = System.nanoTime
    //takeSample(5)
      //rdd.collect()
      rdd.count()
      //rdd.max()
      //rdd.takeSample(false, 3)
      //rdd.saveAsTextFile("ponpon5")
    val start8 = System.nanoTime

    //println("Count1 is " + count1)
    //println("Count2 is " + count2)
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(txt->rdd) " + (start3 - start2) / 1e9 + " s")
    println("It takes(takeSample1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(takeSample2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(takeSample3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(takeSample4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(takeSample5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


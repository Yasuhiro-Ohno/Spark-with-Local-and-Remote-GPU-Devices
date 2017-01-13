package org.apache.spark.examples.ohno.jcuda

import scala.math.random

import org.apache.spark._

import org.apache.spark.examples.ohno.jcuda._

object GPUDispersion2 {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Statistics")
    val sc = new SparkContext(conf)
    val start2 = System.nanoTime
    val slices = if (args.length > 0) args(0).toInt else 2
//    val n = 6400000 * slices//100M
    val n = 64000000 * slices//1G
    println("n = " + n)
    //make rdd of array
    val rdd = sc.makeRDD(Array.fill(n)(random * 10))
    val start3 = System.nanoTime
    //calculate dispersion by GPU(1)
    val array = rdd.collect()//from RDD to IntArray
    val start3_2 = System.nanoTime
    val obj = new GPUActions(array, n)
    val dis = obj.GPUDispersion()//dispersion
    val start4 = System.nanoTime
    //calculate dispersion by GPU(2)
    val dis2 = obj.GPUDispersion()//dispersion(not send array)
    val start5 = System.nanoTime
    //calculate dispersion by GPU(3)
    val dis3 = obj.GPUDispersion()//dispersion()
    val start6 = System.nanoTime
    //calculate dispersion by GPU(4)
    val dis4 = obj.GPUDispersion()//dispersion()
    val start7 = System.nanoTime
    //calculate dispersion by GPU(5)
    val dis5 = obj.GPUDispersion()//dispersion()

    println("Dispersion is " + dis)
    println("Dispersion2 is " + dis2)
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + "s")
    println("It takes(make rdd) " + (start3 - start2) / 1e9 + "s")
    println("It takes(rdd.collect()) " + (start3_2 - start3) / 1e9 + "s")
    println("It takes(transfer/dispersion) " + (start4 - start3_2) / 1e9 + "s")
    println("It takes(dispersion2) " + (start5 - start4) / 1e9 + "s")
    println("It takes(dispersion3) " + (start6 - start5) / 1e9 + "s")
    println("It takes(dispersion4) " + (start7 - start6) / 1e9 + "s")
    println("It takes(dispersion5) " + (System.nanoTime - start7) / 1e9 + "s")
    obj.GPUFinish()//finish
    sc.stop()
  }
}


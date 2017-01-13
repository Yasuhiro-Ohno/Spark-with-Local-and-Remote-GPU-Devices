package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

object SparkDispersion {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Statistics")
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
    val rdd = sc.makeRDD(Array.fill(n)(floor(random * 10).toInt))
    val start3 = System.nanoTime
    //calculate dispersion(1)
    val avg = (rdd.reduce(_ + _)).toDouble / n//average
    val dev = rdd.map(_ - avg)//deviation
    val devdev = dev.map(i => i * i)//deviation^2
    val dis = (devdev.reduce(_ + _)) / n//dispersion
    val start4 = System.nanoTime
    //calculate dispersion(2)
    val avg2 = (rdd.reduce(_ + _)).toDouble / n
    val dev2 = rdd.map(_ - avg2)
    val devdev2 = dev2.map(i => i * i)
    val dis2 = (devdev2.reduce(_ + _)) / n
    val start5 = System.nanoTime
    //calculate dispersion(3)
    val avg3 = (rdd.reduce(_ + _)).toDouble / n
    val dev3 = rdd.map(_ - avg3)
    val devdev3 = dev3.map(i => i * i)
    val dis3 = (devdev3.reduce(_ + _)) / n
    val start6 = System.nanoTime
    //calculate dispersion(4)
    val avg4 = (rdd.reduce(_ + _)).toDouble / n
    val dev4 = rdd.map(_ - avg4)
    val devdev4 = dev4.map(i => i * i)
    val dis4 = (devdev4.reduce(_ + _)) / n
    val start7 = System.nanoTime
    //calculate dispersion(5)
    val avg5 = (rdd.reduce(_ + _)).toDouble / n
    val dev5 = rdd.map(_ - avg5)
    val devdev5 = dev5.map(i => i * i)
    val dis5 = (devdev5.reduce(_ + _)) / n
    val start8 = System.nanoTime

    println("Dispersion is " + dis)
    println("Dispersion2 is " + dis2)
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD) " + (start3 - start2) / 1e9 + " s")
    println("It takes(dispersion1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(dispersion2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(dispersion3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(dispersion4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(dispersion5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


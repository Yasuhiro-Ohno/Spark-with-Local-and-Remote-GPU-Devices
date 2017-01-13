package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.rdd._

object SparkSortKey {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark SortKey")
    val sc = new SparkContext(conf)
    val start2 = System.nanoTime
    val slices = if (args.length > 0) args(0).toInt else 2
//    val n = 1048576 * slices//8M,8M
//    val n = 2097152 * slices//16M,16M
//    val n = 4194304 * slices//32M,32M
//    val n = 8388608 * slices//64M,64M
//    val n = 16777216 * slices//128M,128M
//    val n = 33554432 * slices//256M,256M
    val n = 67108864 * slices//512M,512M
//    val n = 134217728 * slices//1G,1G
    //make (K,V) rdd
    val rdd1 = sc.parallelize(Array.fill(n)(floor(random * 1000).toInt, floor(random * 1000).toInt))
    val start3 = System.nanoTime
    //sortkey(1)
    val rdd2 = rdd1.sortByKey()
    val start4 = System.nanoTime
    //sortkey(2)
    val rdd3 = rdd1.sortByKey()
    val start5 = System.nanoTime
    //sortkey(3)
    val rdd4 = rdd1.sortByKey()
    val start6 = System.nanoTime
    //sortkey(4)
    val rdd5 = rdd1.sortByKey()
    val start7 = System.nanoTime
    //sortkey(5)
    val rdd6 = rdd1.sortByKey()
    val start8 = System.nanoTime

    println("n = " + n)
    println("DataSize = " + (n*4) + "Byte")
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD(K,V)) " + (start3 - start2) / 1e9 + " s")
    println("It takes(sortkey1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(sortkey2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(sortkey3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(sortkey4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(sortkey5) " + (start8 - start7) / 1e9 + " s")
    sc.stop()
  }
}


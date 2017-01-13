//This is program for Demo
//2016.5.8
package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.rdd._
import ohno._


object SingleGPUSortKey {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("SingleGPU SortKey")
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
    val rdd1 = sc.parallelize(Array.fill(n)(floor(random * 10000000).toInt, floor(random * 100000).toInt))
    val start3 = System.nanoTime
    //registerRDD and initmalloc
    sc.registerRDD(rdd1.id, rdd1.keys.collect(), rdd1.values.collect())
//    val start3_2 = System.nanoTime
    //initmalloc
//    rdd1.initmallocIntInt()
    val start4 = System.nanoTime
    //sortkey(twice)
    val rdd2 = rdd1.sortIntKeyByGPU2()
    val rdd3 = rdd1.sortIntKeyByGPU2()
    val rdd4 = rdd1.sortIntKeyByGPU2()
    val start5 = System.nanoTime

    /*
    //sortkey(2)
    val rdd3 = rdd1.sortIntKeyByGPU2()
    val start6 = System.nanoTime
    //sortkey(3)
    val rdd4 = rdd1.sortIntKeyByGPU2()
    val start7 = System.nanoTime
    //sortkey(4)
    val rdd5 = rdd1.sortIntKeyByGPU2()
    val start8 = System.nanoTime
    //sortkey(5)
    val rdd6 = rdd1.sortIntKeyByGPU2()
    val start9 = System.nanoTime
    */

    //result check
    val array = rdd2.keys.take(10)

    println("n = " + n)
    println("DataSize = " + (n*4) + "Byte, " + (n*4) + "Byte")
    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(makeRDD(K,V)) " + (start3 - start2) / 1e9 + " s")
    println("It takes(registerRDD) " + (start4 - start3) / 1e9 + " s")
//    println("It takes(initmalloc) " + (start4 - start3_2) / 1e9 + " s")
    println("It takes(SortKeyBySingleGPU) " + (start5 - start4) / 1e9 + " s")
//    println("It takes(sortkey2) " + (start6 - start5) / 1e9 + " s")
//    println("It takes(sortkey3) " + (start7 - start6) / 1e9 + " s")
//    println("It takes(sortkey4) " + (start8 - start7) / 1e9 + " s")
//    println("It takes(sortkey5) " + (start9 - start8) / 1e9 + " s")
//    println("It takes(result check) " + (System.nanoTime - start9) / 1e9 + " s")
    for (i <- 0 to 9) {
      println("array(" + i + ") = " + array(i))
    }
    sc.stop()
  }
}


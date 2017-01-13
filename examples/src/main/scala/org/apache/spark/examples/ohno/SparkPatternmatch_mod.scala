package org.apache.spark.examples.ohno

import scala.math.random
import scala.math._
import org.apache.spark._
import org.apache.spark.SparkContext._

// matching rate = 30%
object SparkPatternmatch_mod {
  def main(args: Array[String]) {
    val start = System.nanoTime
    val conf = new SparkConf().setAppName("Spark Patternmatch")
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
    val start3 = System.nanoTime
    //patternmatch(1)
    val rdd2 = rdd1.filter(line => line.contains("Spark") | line.contains("spark") | line.contains("e gui") | line.contains("hoge") | line.contains("systems"))
      //rdd2.collect()
      //rdd2.takeSample(false, 3)
      //rdd2.count()
      rdd2.saveAsTextFile("ponpon1")
    val start4 = System.nanoTime
    //patternmatch(2)
    val rdd3 = rdd1.filter(line => line.contains("Spark") | line.contains("spark") | line.contains("e gui") | line.contains("hoge") | line.contains("systems"))
      //rdd3.collect()
      //rdd3.takeSample(false, 3)
      //rdd3.count()
      rdd3.saveAsTextFile("ponpon2")
    val start5 = System.nanoTime
    //patternmatch(3)
    val rdd4 = rdd1.filter(line => line.contains("Spark") | line.contains("spark") | line.contains("e gui") | line.contains("hoge") | line.contains("systems"))
      //rdd4.collect()
      //rdd4.takeSample(false, 3)
      //rdd4.count()
      rdd4.saveAsTextFile("ponpon3")
    val start6 = System.nanoTime
    //patternmatch(4)
    val rdd5 = rdd1.filter(line => line.contains("Spark") | line.contains("spark") | line.contains("e gui") | line.contains("hoge") | line.contains("systems"))
      //rdd5.collect()
      //rdd5.takeSample(false, 3)
      //rdd5.count()
      rdd5.saveAsTextFile("ponpon4")
    val start7 = System.nanoTime
    //patternmatch(5)
    val rdd6 = rdd1.filter(line => line.contains("Spark") | line.contains("spark") | line.contains("e gui") | line.contains("hoge") | line.contains("systems"))
      //val array = rdd6.collect()
      //rdd6.takeSample(false, 3)
      //rdd6.count()
      rdd6.saveAsTextFile("ponpon5")
    val start8 = System.nanoTime
    
    /*
    rdd2.cache()
    rdd3.cache()
    rdd4.cache()
    rdd5.cache()
    rdd6.cache()
    

    val start8_2 = System.nanoTime
    //save(1)
    rdd2.saveAsTextFile("ponpon6")
    val start9 = System.nanoTime
    //save(2)
    rdd3.saveAsTextFile("ponpon7")
    val start10 = System.nanoTime
    //save(3)
    rdd4.saveAsTextFile("ponpon8")
    val start11 = System.nanoTime
    //save(4)
    rdd5.saveAsTextFile("ponpon9")
    val start12 = System.nanoTime
    //save(5)
    rdd6.saveAsTextFile("ponpon10")
    val start13 = System.nanoTime

    */
    
    //println("array(0): " + array(0))
    //println("array(1): " + array(1))
    //println("array(2): " + array(2))

    println("It takes(SparkContext) " + (start2 - start) / 1e9 + " s")
    println("It takes(txt->rdd) " + (start3 - start2) / 1e9 + " s")
    println("It takes(patternmatch1) " + (start4 - start3) / 1e9 + " s")
    println("It takes(patternmatch2) " + (start5 - start4) / 1e9 + " s")
    println("It takes(patternmatch3) " + (start6 - start5) / 1e9 + " s")
    println("It takes(patternmatch4) " + (start7 - start6) / 1e9 + " s")
    println("It takes(patternmatch5) " + (start8 - start7) / 1e9 + " s")
    /*
    println("It takes(save1) " + (start9 - start8_2) / 1e9 + " s")
    println("It takes(save2) " + (start10 - start9) / 1e9 + " s")
    println("It takes(save3) " + (start11 - start10) / 1e9 + " s")
    println("It takes(save4) " + (start12 - start11) / 1e9 + " s")
    println("It takes(save5) " + (start13 - start12) / 1e9 + " s")
    */
    sc.stop()
  }
}


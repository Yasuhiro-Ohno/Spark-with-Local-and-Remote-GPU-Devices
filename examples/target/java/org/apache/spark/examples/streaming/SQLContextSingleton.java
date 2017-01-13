package org.apache.spark.examples.streaming;
// no position
/** Lazily instantiated singleton instance of SQLContext */
public  class SQLContextSingleton {
  static private  org.apache.spark.sql.SQLContext instance () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLContext getInstance (org.apache.spark.SparkContext sparkContext) { throw new RuntimeException(); }
}

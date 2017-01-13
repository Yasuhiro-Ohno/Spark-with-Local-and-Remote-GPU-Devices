package org.apache.spark.examples.sql.hive;
// no position
public  class HiveFromSpark {
  static public  class Record implements scala.Product, scala.Serializable {
    public  int key () { throw new RuntimeException(); }
    public  java.lang.String value () { throw new RuntimeException(); }
    // not preceding
    public   Record (int key, java.lang.String value) { throw new RuntimeException(); }
  }
  // no position
  static public  class Record$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.String, org.apache.spark.examples.sql.hive.HiveFromSpark.Record> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Record$ MODULE$ = null;
    public   Record$ () { throw new RuntimeException(); }
  }
  static public  java.io.InputStream kv1Stream () { throw new RuntimeException(); }
  static public  java.io.File kv1File () { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.trees;
// no position
public  class CurrentOrigin {
  static private  java.lang.ThreadLocal<org.apache.spark.sql.catalyst.trees.Origin> value () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.Origin get () { throw new RuntimeException(); }
  static public  void set (org.apache.spark.sql.catalyst.trees.Origin o) { throw new RuntimeException(); }
  static public  void reset () { throw new RuntimeException(); }
  static public  void setPosition (int line, int start) { throw new RuntimeException(); }
  static public <A extends java.lang.Object> A withOrigin (org.apache.spark.sql.catalyst.trees.Origin o, scala.Function0<A> f) { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
/** <value> PRECEDING boundary. */
public  class ValuePreceding implements org.apache.spark.sql.catalyst.expressions.FrameBoundary, scala.Product, scala.Serializable {
  public  int value () { throw new RuntimeException(); }
  // not preceding
  public   ValuePreceding (int value) { throw new RuntimeException(); }
  public  boolean notFollows (org.apache.spark.sql.catalyst.expressions.FrameBoundary other) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
public  class LessThan extends org.apache.spark.sql.catalyst.expressions.BinaryComparison implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  // not preceding
  public   LessThan (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.AbstractDataType inputType () { throw new RuntimeException(); }
  public  java.lang.String symbol () { throw new RuntimeException(); }
  private  scala.math.Ordering<java.lang.Object> ordering () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input1, Object input2) { throw new RuntimeException(); }
}

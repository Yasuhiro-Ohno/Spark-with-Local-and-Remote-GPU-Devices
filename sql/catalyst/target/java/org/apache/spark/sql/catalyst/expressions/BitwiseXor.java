package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that calculates bitwise xor of two numbers.
 * <p>
 * Code generation inherited from BinaryArithmetic.
 */
public  class BitwiseXor extends org.apache.spark.sql.catalyst.expressions.BinaryArithmetic implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  // not preceding
  public   BitwiseXor (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.AbstractDataType inputType () { throw new RuntimeException(); }
  public  java.lang.String symbol () { throw new RuntimeException(); }
  private  scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> xor () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input1, Object input2) { throw new RuntimeException(); }
}

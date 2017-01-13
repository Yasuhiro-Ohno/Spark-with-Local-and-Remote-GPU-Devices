package org.apache.spark.sql.catalyst.expressions;
public  class Remainder extends org.apache.spark.sql.catalyst.expressions.BinaryArithmetic implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  // not preceding
  public   Remainder (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.AbstractDataType inputType () { throw new RuntimeException(); }
  public  java.lang.String symbol () { throw new RuntimeException(); }
  public  java.lang.String decimalMethod () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  private  scala.math.Integral<java.lang.Object> integral () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  /**
   * Special case handling for x % 0 ==&gt; null.
   * @param ctx (undocumented)
   * @param ev (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

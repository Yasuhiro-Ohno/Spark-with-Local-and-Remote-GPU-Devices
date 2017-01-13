package org.apache.spark.sql.catalyst.expressions;
/**
 * Computes the logarithm of a number.
 * param:  left the logarithm base, default to e.
 * param:  right the number to compute the logarithm of.
 */
public  class Logarithm extends org.apache.spark.sql.catalyst.expressions.BinaryMathExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  // not preceding
  public   Logarithm (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right) { throw new RuntimeException(); }
  /**
   * Natural log, i.e. using e as the base.
   * @param child (undocumented)
   */
  public   Logarithm (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input1, Object input2) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

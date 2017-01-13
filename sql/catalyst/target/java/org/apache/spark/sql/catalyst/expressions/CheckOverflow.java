package org.apache.spark.sql.catalyst.expressions;
/**
 * Rounds the decimal to given scale and check whether the decimal can fit in provided precision
 * or not, returns null if not.
 */
public  class CheckOverflow extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DecimalType dataType () { throw new RuntimeException(); }
  // not preceding
  public   CheckOverflow (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.types.DecimalType dataType) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object input) { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

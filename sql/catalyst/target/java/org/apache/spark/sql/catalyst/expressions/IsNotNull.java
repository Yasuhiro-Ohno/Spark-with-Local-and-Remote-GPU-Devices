package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that is evaluated to true if the input is not null.
 */
public  class IsNotNull extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.Predicate, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  // not preceding
  public   IsNotNull (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

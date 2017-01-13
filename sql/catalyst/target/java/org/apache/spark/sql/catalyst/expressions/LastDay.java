package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the last day of the month which the date belongs to.
 */
public  class LastDay extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression startDate () { throw new RuntimeException(); }
  // not preceding
  public   LastDay (org.apache.spark.sql.catalyst.expressions.Expression startDate) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object date) { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
}

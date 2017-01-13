package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the number of days from startDate to endDate.
 */
public  class DateDiff extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression endDate () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression startDate () { throw new RuntimeException(); }
  // not preceding
  public   DateDiff (org.apache.spark.sql.catalyst.expressions.Expression endDate, org.apache.spark.sql.catalyst.expressions.Expression startDate) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object end, Object start) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

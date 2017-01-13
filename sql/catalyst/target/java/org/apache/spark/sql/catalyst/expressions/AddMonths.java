package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the date that is num_months after start_date.
 */
public  class AddMonths extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression startDate () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression numMonths () { throw new RuntimeException(); }
  // not preceding
  public   AddMonths (org.apache.spark.sql.catalyst.expressions.Expression startDate, org.apache.spark.sql.catalyst.expressions.Expression numMonths) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object start, Object months) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

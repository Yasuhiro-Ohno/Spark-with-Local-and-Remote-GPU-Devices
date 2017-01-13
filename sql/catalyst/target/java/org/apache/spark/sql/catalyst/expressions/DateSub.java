package org.apache.spark.sql.catalyst.expressions;
/**
 * Subtracts a number of days to startdate.
 */
public  class DateSub extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression startDate () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression days () { throw new RuntimeException(); }
  // not preceding
  public   DateSub (org.apache.spark.sql.catalyst.expressions.Expression startDate, org.apache.spark.sql.catalyst.expressions.Expression days) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object start, Object d) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

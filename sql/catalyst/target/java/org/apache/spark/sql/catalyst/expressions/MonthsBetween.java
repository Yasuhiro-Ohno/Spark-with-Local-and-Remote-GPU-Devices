package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns number of months between dates date1 and date2.
 */
public  class MonthsBetween extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression date1 () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression date2 () { throw new RuntimeException(); }
  // not preceding
  public   MonthsBetween (org.apache.spark.sql.catalyst.expressions.Expression date1, org.apache.spark.sql.catalyst.expressions.Expression date2) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object t1, Object t2) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

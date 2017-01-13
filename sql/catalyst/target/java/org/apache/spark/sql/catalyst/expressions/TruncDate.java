package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns date truncated to the unit specified by the format.
 */
public  class TruncDate extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression date () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression format () { throw new RuntimeException(); }
  // not preceding
  public   TruncDate (org.apache.spark.sql.catalyst.expressions.Expression date, org.apache.spark.sql.catalyst.expressions.Expression format) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  private  int truncLevel () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

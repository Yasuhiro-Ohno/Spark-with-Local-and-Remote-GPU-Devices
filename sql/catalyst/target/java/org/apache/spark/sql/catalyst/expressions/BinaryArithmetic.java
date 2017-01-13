package org.apache.spark.sql.catalyst.expressions;
public abstract class BinaryArithmetic extends org.apache.spark.sql.catalyst.expressions.BinaryOperator {
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression>> unapply (org.apache.spark.sql.catalyst.expressions.BinaryArithmetic e) { throw new RuntimeException(); }
  public   BinaryArithmetic () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  /** Name of the function for this expression on a {@link Decimal} type. */
  public  java.lang.String decimalMethod () { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
/**
 * A place holder for the loop variable used in {@link MapObjects}.  This should never be constructed
 * manually, but will instead be passed into the provided lambda function.
 */
public  class LambdaVariable extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  java.lang.String value () { throw new RuntimeException(); }
  public  java.lang.String isNull () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  // not preceding
  public   LambdaVariable (java.lang.String value, java.lang.String isNull, org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode gen (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
}

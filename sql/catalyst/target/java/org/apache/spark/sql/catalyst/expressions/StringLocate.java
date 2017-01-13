package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that returns the position of the first occurrence of substr
 * in given string after position pos.
 */
public  class StringLocate extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression substr () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression str () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression start () { throw new RuntimeException(); }
  // not preceding
  public   StringLocate (org.apache.spark.sql.catalyst.expressions.Expression substr, org.apache.spark.sql.catalyst.expressions.Expression str, org.apache.spark.sql.catalyst.expressions.Expression start) { throw new RuntimeException(); }
  public   StringLocate (org.apache.spark.sql.catalyst.expressions.Expression substr, org.apache.spark.sql.catalyst.expressions.Expression str) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
}

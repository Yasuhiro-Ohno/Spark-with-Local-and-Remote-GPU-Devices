package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that takes a substring of its first argument starting at a given position.
 * Defined for String and Binary types.
 */
public  class Substring extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression str () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression pos () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression len () { throw new RuntimeException(); }
  // not preceding
  public   Substring (org.apache.spark.sql.catalyst.expressions.Expression str, org.apache.spark.sql.catalyst.expressions.Expression pos, org.apache.spark.sql.catalyst.expressions.Expression len) { throw new RuntimeException(); }
  public   Substring (org.apache.spark.sql.catalyst.expressions.Expression str, org.apache.spark.sql.catalyst.expressions.Expression pos) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object string, Object pos, Object len) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

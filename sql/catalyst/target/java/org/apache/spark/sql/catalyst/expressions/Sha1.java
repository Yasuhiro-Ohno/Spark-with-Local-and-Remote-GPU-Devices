package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that calculates a sha1 hash value and returns it as a hex string
 * For input of type {@link BinaryType} or {@link StringType}
 */
public  class Sha1 extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  // not preceding
  public   Sha1 (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

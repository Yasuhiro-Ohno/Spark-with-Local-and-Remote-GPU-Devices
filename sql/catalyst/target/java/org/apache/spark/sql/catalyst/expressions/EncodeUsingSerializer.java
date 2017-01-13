package org.apache.spark.sql.catalyst.expressions;
/**
 * Serializes an input object using a generic serializer (Kryo or Java).
 * param:  kryo if true, use Kryo. Otherwise, use Java.
 */
public  class EncodeUsingSerializer extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  boolean kryo () { throw new RuntimeException(); }
  // not preceding
  public   EncodeUsingSerializer (org.apache.spark.sql.catalyst.expressions.Expression child, boolean kryo) { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
}

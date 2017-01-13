package org.apache.spark.sql.catalyst.expressions;
/**
 * Cast the child expression to the target data type, but will throw error if the cast might
 * truncate, e.g. long -> int, timestamp -> data.
 */
public  class UpCast extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> walkedTypePath () { throw new RuntimeException(); }
  // not preceding
  public   UpCast (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.types.DataType dataType, scala.collection.Seq<java.lang.String> walkedTypePath) { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
}

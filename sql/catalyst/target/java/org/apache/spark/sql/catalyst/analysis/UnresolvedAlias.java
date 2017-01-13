package org.apache.spark.sql.catalyst.analysis;
/**
 * Holds the expression that has yet to be aliased.
 */
public  class UnresolvedAlias extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.NamedExpression, org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedAlias (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute toAttribute () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> qualifiers () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExprId exprId () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
public  class UnresolvedWindowExpression extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.UnresolvedWindowFunction child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.WindowSpecReference windowSpec () { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedWindowExpression (org.apache.spark.sql.catalyst.expressions.UnresolvedWindowFunction child, org.apache.spark.sql.catalyst.expressions.WindowSpecReference windowSpec) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
}

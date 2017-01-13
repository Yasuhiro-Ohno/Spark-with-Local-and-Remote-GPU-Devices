package org.apache.spark.sql.catalyst.expressions;
public  class WindowExpression extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.WindowFunction windowFunction () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.WindowSpecDefinition windowSpec () { throw new RuntimeException(); }
  // not preceding
  public   WindowExpression (org.apache.spark.sql.catalyst.expressions.WindowFunction windowFunction, org.apache.spark.sql.catalyst.expressions.WindowSpecDefinition windowSpec) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

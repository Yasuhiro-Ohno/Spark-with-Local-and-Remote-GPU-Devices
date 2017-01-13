package org.apache.spark.sql.catalyst.expressions;
public  class UnresolvedWindowFunction extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.WindowFunction, org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  java.lang.String name () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedWindowFunction (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  void init () { throw new RuntimeException(); }
  public  void reset () { throw new RuntimeException(); }
  public  java.lang.Object prepareInputParameters (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  void update (java.lang.Object input) { throw new RuntimeException(); }
  public  void batchUpdate (java.lang.Object[] inputs) { throw new RuntimeException(); }
  public  void evaluate () { throw new RuntimeException(); }
  public  Object get (int index) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.WindowFunction newInstance () { throw new RuntimeException(); }
}

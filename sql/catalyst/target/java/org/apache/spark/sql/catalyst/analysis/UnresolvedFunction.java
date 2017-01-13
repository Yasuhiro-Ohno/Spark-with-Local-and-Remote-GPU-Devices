package org.apache.spark.sql.catalyst.analysis;
public  class UnresolvedFunction extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  java.lang.String name () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean isDistinct () { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedFunction (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children, boolean isDistinct) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  java.lang.String prettyString () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

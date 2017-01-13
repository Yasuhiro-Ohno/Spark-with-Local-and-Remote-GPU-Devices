package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * A container for an {@link AggregateFunction} with its {@link AggregateMode} and a field
 * (<code>isDistinct</code>) indicating if DISTINCT keyword is specified for this function.
 */
  class AggregateExpression extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction aggregateFunction () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateMode mode () { throw new RuntimeException(); }
  public  boolean isDistinct () { throw new RuntimeException(); }
  // not preceding
  public   AggregateExpression (org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction aggregateFunction, org.apache.spark.sql.catalyst.expressions.aggregate.AggregateMode mode, boolean isDistinct) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references () { throw new RuntimeException(); }
  public  java.lang.String prettyString () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

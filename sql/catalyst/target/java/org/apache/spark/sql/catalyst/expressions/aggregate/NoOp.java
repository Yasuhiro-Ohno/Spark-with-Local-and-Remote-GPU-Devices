package org.apache.spark.sql.catalyst.expressions.aggregate;
// no position
/**
 * A place holder expressions used in code-gen, it does not change the corresponding value
 * in the row.
 */
  class NoOp extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public  boolean nullable () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
}

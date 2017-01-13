package org.apache.spark.sql.catalyst.expressions;
/**
 * A predicate that is evaluated to be true if there are at least <code>n</code> non-null and non-NaN values.
 */
public  class AtLeastNNonNulls extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Predicate, scala.Product, scala.Serializable {
  public  int n () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   AtLeastNNonNulls (int n, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  boolean eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

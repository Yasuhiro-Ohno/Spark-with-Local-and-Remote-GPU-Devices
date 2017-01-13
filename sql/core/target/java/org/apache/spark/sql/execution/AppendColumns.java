package org.apache.spark.sql.execution;
/**
 * Applies the given function to each input row, appending the encoded result at the end of the row.
 */
public  class AppendColumns<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, scala.Product, scala.Serializable {
  public  scala.Function1<T, U> func () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> newColumns () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  // not preceding
  public   AppendColumns (scala.Function1<T, U> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> newColumns, org.apache.spark.sql.execution.SparkPlan child) { throw new RuntimeException(); }
  public  boolean canProcessSafeRows () { throw new RuntimeException(); }
  public  boolean canProcessUnsafeRows () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute () { throw new RuntimeException(); }
}

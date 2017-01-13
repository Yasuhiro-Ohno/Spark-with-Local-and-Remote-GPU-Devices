package org.apache.spark.sql.execution;
/**
 * Groups the input rows together and calls the function with each group and an iterator containing
 * all elements in the group.  The result of this function is encoded and flattened before
 * being output.
 */
public  class MapGroups<K extends java.lang.Object, T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, scala.Product, scala.Serializable {
  public  scala.Function2<K, scala.collection.Iterator<T>, scala.collection.TraversableOnce<U>> func () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<K> kEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  // not preceding
  public   MapGroups (scala.Function2<K, scala.collection.Iterator<T>, scala.collection.TraversableOnce<U>> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<K> kEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.execution.SparkPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution () { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering () { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute () { throw new RuntimeException(); }
}

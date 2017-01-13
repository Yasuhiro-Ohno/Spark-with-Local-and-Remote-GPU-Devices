package org.apache.spark.sql.execution;
/**
 * Co-groups the data from left and right children, and calls the function with each group and 2
 * iterators containing all elements in the group from left and right side.
 * The result of this function is encoded and flattened before being output.
 */
public  class CoGroup<Key extends java.lang.Object, Left extends java.lang.Object, Right extends java.lang.Object, Result extends java.lang.Object> extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.BinaryNode, scala.Product, scala.Serializable {
  public  scala.Function3<Key, scala.collection.Iterator<Left>, scala.collection.Iterator<Right>, scala.collection.TraversableOnce<Result>> func () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Key> keyEnc () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Left> leftEnc () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Right> rightEnc () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Result> resultEnc () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftGroup () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightGroup () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan right () { throw new RuntimeException(); }
  // not preceding
  public   CoGroup (scala.Function3<Key, scala.collection.Iterator<Left>, scala.collection.Iterator<Right>, scala.collection.TraversableOnce<Result>> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Key> keyEnc, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Left> leftEnc, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Right> rightEnc, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Result> resultEnc, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftGroup, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightGroup, org.apache.spark.sql.execution.SparkPlan left, org.apache.spark.sql.execution.SparkPlan right) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution () { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering () { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute () { throw new RuntimeException(); }
}

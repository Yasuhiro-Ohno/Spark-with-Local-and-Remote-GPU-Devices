package org.apache.spark.sql.catalyst.plans.logical;
// no position
/** Factory for constructing new `CoGroup` nodes. */
public  class CoGroup$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CoGroup$ MODULE$ = null;
  public   CoGroup$ () { throw new RuntimeException(); }
  public <Key extends java.lang.Object, Left extends java.lang.Object, Right extends java.lang.Object, Result extends java.lang.Object> org.apache.spark.sql.catalyst.plans.logical.CoGroup<Key, Left, Right, Result> apply (scala.Function3<Key, scala.collection.Iterator<Left>, scala.collection.Iterator<Right>, scala.collection.TraversableOnce<Result>> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Key> keyEnc, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Left> leftEnc, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<Right> rightEnc, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftGroup, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightGroup, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.Encoder<Result> evidence$3) { throw new RuntimeException(); }
}

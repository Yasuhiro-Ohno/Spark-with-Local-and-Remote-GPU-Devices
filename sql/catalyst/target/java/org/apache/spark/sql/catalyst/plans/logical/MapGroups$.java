package org.apache.spark.sql.catalyst.plans.logical;
// no position
/** Factory for constructing new `MapGroups` nodes. */
public  class MapGroups$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapGroups$ MODULE$ = null;
  public   MapGroups$ () { throw new RuntimeException(); }
  public <K extends java.lang.Object, T extends java.lang.Object, U extends java.lang.Object> org.apache.spark.sql.catalyst.plans.logical.MapGroups<K, T, U> apply (scala.Function2<K, scala.collection.Iterator<T>, scala.collection.TraversableOnce<U>> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<K> kEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, org.apache.spark.sql.Encoder<U> evidence$2) { throw new RuntimeException(); }
}

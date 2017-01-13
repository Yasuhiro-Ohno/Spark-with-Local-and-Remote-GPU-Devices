package org.apache.spark.sql.catalyst.plans.logical;
public  class MapGroups<K extends java.lang.Object, T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  static public <K extends java.lang.Object, T extends java.lang.Object, U extends java.lang.Object> org.apache.spark.sql.catalyst.plans.logical.MapGroups<K, T, U> apply (scala.Function2<K, scala.collection.Iterator<T>, scala.collection.TraversableOnce<U>> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<K> kEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, org.apache.spark.sql.Encoder<U> evidence$2) { throw new RuntimeException(); }
  public  scala.Function2<K, scala.collection.Iterator<T>, scala.collection.TraversableOnce<U>> func () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<K> kEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  // not preceding
  public   MapGroups (scala.Function2<K, scala.collection.Iterator<T>, scala.collection.TraversableOnce<U>> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<K> kEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput () { throw new RuntimeException(); }
}

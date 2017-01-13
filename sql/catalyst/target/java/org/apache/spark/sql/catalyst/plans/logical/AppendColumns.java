package org.apache.spark.sql.catalyst.plans.logical;
public  class AppendColumns<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  static public <T extends java.lang.Object, U extends java.lang.Object> org.apache.spark.sql.catalyst.plans.logical.AppendColumns<T, U> apply (scala.Function1<T, U> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, org.apache.spark.sql.Encoder<U> evidence$1) { throw new RuntimeException(); }
  public  scala.Function1<T, U> func () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> newColumns () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  // not preceding
  public   AppendColumns (scala.Function1<T, U> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> newColumns, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput () { throw new RuntimeException(); }
}

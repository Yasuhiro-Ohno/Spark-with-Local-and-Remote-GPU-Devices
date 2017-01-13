package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A relation produced by applying <code>func</code> to each partition of the <code>child</code>. tEncoder/uEncoder are
 * used respectively to decode/encode from the JVM object representation expected by <code>func.</code>
 */
public  class MapPartitions<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  public  scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> func () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  // not preceding
  public   MapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> func, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> tEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> uEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput () { throw new RuntimeException(); }
}

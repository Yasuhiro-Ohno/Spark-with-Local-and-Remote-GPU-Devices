package org.apache.spark.sql.catalyst.plans.logical;
public  class Generate extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Generator generator () { throw new RuntimeException(); }
  public  boolean join () { throw new RuntimeException(); }
  public  boolean outer () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> qualifier () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> generatorOutput () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  // not preceding
  public   Generate (org.apache.spark.sql.catalyst.expressions.Generator generator, boolean join, boolean outer, scala.Option<java.lang.String> qualifier, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> generatorOutput, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  /** The set of all attributes produced by this node. */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet generatedSet () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
}

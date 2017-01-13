package org.apache.spark.sql.catalyst.plans.logical;
public  class WithWindowDefinition extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.expressions.WindowSpecDefinition> windowDefinitions () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  // not preceding
  public   WithWindowDefinition (scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.expressions.WindowSpecDefinition> windowDefinitions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
}

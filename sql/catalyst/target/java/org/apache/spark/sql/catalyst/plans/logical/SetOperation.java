package org.apache.spark.sql.catalyst.plans.logical;
public abstract class SetOperation extends org.apache.spark.sql.catalyst.plans.logical.BinaryNode {
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.SetOperation p) { throw new RuntimeException(); }
  public   SetOperation (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public final  boolean resolved () { throw new RuntimeException(); }
}

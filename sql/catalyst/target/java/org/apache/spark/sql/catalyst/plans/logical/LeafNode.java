package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan node with no children.
 */
public abstract class LeafNode extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan {
  public   LeafNode () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children () { throw new RuntimeException(); }
}

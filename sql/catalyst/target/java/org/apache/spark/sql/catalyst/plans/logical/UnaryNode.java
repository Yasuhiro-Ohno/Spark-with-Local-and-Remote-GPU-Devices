package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan node with single child.
 */
public abstract class UnaryNode extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan {
  public   UnaryNode () { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children () { throw new RuntimeException(); }
}

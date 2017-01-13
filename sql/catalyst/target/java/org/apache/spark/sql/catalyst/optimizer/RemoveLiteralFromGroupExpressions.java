package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Removes literals from group expressions in {@link Aggregate}, as they have no effect to the result
 * but only makes the grouping key bigger.
 */
public  class RemoveLiteralFromGroupExpressions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

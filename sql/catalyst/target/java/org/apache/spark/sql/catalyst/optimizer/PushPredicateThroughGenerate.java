package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Push {@link Filter} operators through {@link Generate} operators. Parts of the predicate that reference
 * attributes generated in {@link Generate} will remain above, and the rest should be pushed beneath.
 */
public  class PushPredicateThroughGenerate extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

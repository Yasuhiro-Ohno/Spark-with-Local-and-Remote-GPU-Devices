package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Push {@link Filter} operators through {@link Generate} operators. Parts of the predicate that reference
 * attributes generated in {@link Generate} will remain above, and the rest should be pushed beneath.
 */
public  class PushPredicateThroughGenerate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushPredicateThroughGenerate$ MODULE$ = null;
  public   PushPredicateThroughGenerate$ () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

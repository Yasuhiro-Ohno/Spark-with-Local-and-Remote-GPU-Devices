package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Push {@link Filter} operators through {@link Aggregate} operators, iff the filters reference only
 * non-aggregate attributes (typically literals or grouping expressions).
 */
public  class PushPredicateThroughAggregate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushPredicateThroughAggregate$ MODULE$ = null;
  public   PushPredicateThroughAggregate$ () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

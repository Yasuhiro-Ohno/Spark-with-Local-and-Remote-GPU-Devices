package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Pushes {@link Filter} operators through {@link Project} operators, in-lining any {@link Alias Aliases}
 * that were defined in the projection.
 * <p>
 * This heuristic is valid assuming the expression evaluation cost is minimal.
 */
public  class PushPredicateThroughProject extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

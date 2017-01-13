package org.apache.spark.sql.hive;
// no position
/**
 * Resolves {@link UnresolvedWindowFunction} to {@link HiveWindowFunction}.
 */
  class ResolveHiveWindowFunction extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  static private  boolean shouldResolveFunction (org.apache.spark.sql.catalyst.expressions.UnresolvedWindowFunction unresolvedWindowFunction, org.apache.spark.sql.catalyst.expressions.WindowSpecDefinition windowSpec) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

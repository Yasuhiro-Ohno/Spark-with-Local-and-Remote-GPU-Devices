package org.apache.spark.sql.hive;
// no position
/**
 * Resolves {@link UnresolvedWindowFunction} to {@link HiveWindowFunction}.
 */
  class ResolveHiveWindowFunction$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResolveHiveWindowFunction$ MODULE$ = null;
  public   ResolveHiveWindowFunction$ () { throw new RuntimeException(); }
  private  boolean shouldResolveFunction (org.apache.spark.sql.catalyst.expressions.UnresolvedWindowFunction unresolvedWindowFunction, org.apache.spark.sql.catalyst.expressions.WindowSpecDefinition windowSpec) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

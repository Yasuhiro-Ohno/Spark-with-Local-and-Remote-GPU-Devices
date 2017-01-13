package org.apache.spark.sql.catalyst.analysis;
// no position
/**
 * Replace the <code>UpCast</code> expression by <code>Cast</code>, and throw exceptions if the cast may truncate.
 */
public  class ResolveUpCast extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  static private  scala.runtime.Nothing$ fail (org.apache.spark.sql.catalyst.expressions.Expression from, org.apache.spark.sql.types.DataType to, scala.collection.Seq<java.lang.String> walkedTypePath) { throw new RuntimeException(); }
  static private  boolean illegalNumericPrecedence (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

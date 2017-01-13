package org.apache.spark.sql.catalyst.analysis;
// no position
/**
 * Replace the <code>UpCast</code> expression by <code>Cast</code>, and throw exceptions if the cast may truncate.
 */
public  class ResolveUpCast$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResolveUpCast$ MODULE$ = null;
  public   ResolveUpCast$ () { throw new RuntimeException(); }
  private  scala.runtime.Nothing$ fail (org.apache.spark.sql.catalyst.expressions.Expression from, org.apache.spark.sql.types.DataType to, scala.collection.Seq<java.lang.String> walkedTypePath) { throw new RuntimeException(); }
  private  boolean illegalNumericPrecedence (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

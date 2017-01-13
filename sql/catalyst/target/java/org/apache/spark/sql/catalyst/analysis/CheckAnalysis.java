package org.apache.spark.sql.catalyst.analysis;
/**
 * Throws user facing errors when passed invalid queries that fail to analyze.
 */
public  interface CheckAnalysis {
  /**
   * Override to provide additional checks for correct analysis.
   * These rules will be evaluated after our built-in check rules.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.runtime.BoxedUnit>> extendedCheckRules () ;
  public  scala.runtime.Nothing$ failAnalysis (java.lang.String msg) ;
  public  boolean containsMultipleGenerators (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs) ;
  public  void checkAnalysis (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
}

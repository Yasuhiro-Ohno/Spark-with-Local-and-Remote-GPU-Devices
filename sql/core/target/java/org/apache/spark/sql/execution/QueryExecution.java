package org.apache.spark.sql.execution;
/**
 * The primary workflow for executing relational queries using Spark.  Designed to allow easy
 * access to the intermediate phases of query execution for developers.
 * <p>
 * While this is not a public class, we should avoid changing the function names for the sake of
 * changing them, because a lot of developers use the feature for debugging.
 */
public  class QueryExecution {
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical () { throw new RuntimeException(); }
  // not preceding
  public   QueryExecution (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical) { throw new RuntimeException(); }
  public  void assertAnalyzed () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzed () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withCachedData () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimizedPlan () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan sparkPlan () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan executedPlan () { throw new RuntimeException(); }
  /** Internal version of the RDD. Avoids copies and has no schema */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toRdd () { throw new RuntimeException(); }
  protected <A extends java.lang.Object> java.lang.String stringOrError (scala.Function0<A> f) { throw new RuntimeException(); }
  public  java.lang.String simpleString () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

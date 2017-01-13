package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Sample the dataset.
 * <p>
 * param:  lowerBound Lower-bound of the sampling probability (usually 0.0)
 * param:  upperBound Upper-bound of the sampling probability. The expected fraction sampled
 *                   will be ub - lb.
 * param:  withReplacement Whether to sample with replacement.
 * param:  seed the random seed
 * param:  child the LogicalPlan
 */
public  class Sample extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  public  double lowerBound () { throw new RuntimeException(); }
  public  double upperBound () { throw new RuntimeException(); }
  public  boolean withReplacement () { throw new RuntimeException(); }
  public  long seed () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  // not preceding
  public   Sample (double lowerBound, double upperBound, boolean withReplacement, long seed, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
}

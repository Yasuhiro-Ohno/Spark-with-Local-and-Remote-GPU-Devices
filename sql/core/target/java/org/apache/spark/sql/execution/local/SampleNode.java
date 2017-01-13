package org.apache.spark.sql.execution.local;
/**
 * Sample the dataset.
 * <p>
 * param:  conf the SQLConf
 * param:  lowerBound Lower-bound of the sampling probability (usually 0.0)
 * param:  upperBound Upper-bound of the sampling probability. The expected fraction sampled
 *                   will be ub - lb.
 * param:  withReplacement Whether to sample with replacement.
 * param:  seed the random seed
 * param:  child the LocalNode
 */
public  class SampleNode extends org.apache.spark.sql.execution.local.UnaryLocalNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  public  double lowerBound () { throw new RuntimeException(); }
  public  double upperBound () { throw new RuntimeException(); }
  public  boolean withReplacement () { throw new RuntimeException(); }
  public  long seed () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode child () { throw new RuntimeException(); }
  // not preceding
  public   SampleNode (org.apache.spark.sql.SQLConf conf, double lowerBound, double upperBound, boolean withReplacement, long seed, org.apache.spark.sql.execution.local.LocalNode child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  void open () { throw new RuntimeException(); }
  public  boolean next () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow fetch () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}

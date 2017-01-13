package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Estimates of various statistics.  The default estimation logic simply lazily multiplies the
 * corresponding statistic produced by the children.  To override this behavior, override
 * <code>statistics</code> and assign it an overridden version of <code>Statistics</code>.
 * <p>
 * '''NOTE''': concrete and/or overridden versions of statistics fields should pay attention to the
 * performance of the implementations.  The reason is that estimations might get triggered in
 * performance-critical processes, such as query plan planning.
 * <p>
 * Note that we are using a BigInt here since it is easy to overflow a 64-bit integer in
 * cardinality estimation (e.g. cartesian joins).
 * <p>
 * param:  sizeInBytes Physical size in bytes. For leaf operators this defaults to 1, otherwise it
 *                    defaults to the product of children's <code>sizeInBytes</code>.
 */
  class Statistics implements scala.Product, scala.Serializable {
  public  scala.math.BigInt sizeInBytes () { throw new RuntimeException(); }
  // not preceding
  public   Statistics (scala.math.BigInt sizeInBytes) { throw new RuntimeException(); }
}

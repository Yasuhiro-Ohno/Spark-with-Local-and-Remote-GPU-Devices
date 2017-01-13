package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * A central moment is the expected value of a specified power of the deviation of a random
 * variable from the mean. Central moments are often used to characterize the properties of about
 * the shape of a distribution.
 * <p>
 * This class implements online, one-pass algorithms for computing the central moments of a set of
 * points.
 * <p>
 * Behavior:
 *  - null values are ignored
 *  - returns <code>Double.NaN</code> when the column contains <code>Double.NaN</code> values
 * <p>
 * References:
 *  - Xiangrui Meng.  "Simpler Online Updates for Arbitrary-Order Central Moments."
 *      2015. http://arxiv.org/abs/1510.04923
 * <p>
 * @see {@link https://en.wikipedia.org/wiki/Algorithms_for_calculating_variance
 *     Algorithms for calculating variance (Wikipedia)}
 * <p>
 * param:  child to compute central moments of.
 */
public abstract class CentralMomentAgg extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate implements scala.Serializable {
  public   CentralMomentAgg (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  /**
   * The central moment order to be computed.
   * @return (undocumented)
   */
  protected abstract  int momentOrder () ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType aggBufferSchema () { throw new RuntimeException(); }
  /**
   * Size of aggregation buffer.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes () { throw new RuntimeException(); }
  /**
   * Initialize all moments to zero.
   * @param buffer (undocumented)
   */
  public  void initialize (org.apache.spark.sql.catalyst.expressions.MutableRow buffer) { throw new RuntimeException(); }
  /**
   * Update the central moments buffer.
   * @param buffer (undocumented)
   * @param input (undocumented)
   */
  public  void update (org.apache.spark.sql.catalyst.expressions.MutableRow buffer, org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  /**
   * Merge two central moment buffers.
   * @param buffer1 (undocumented)
   * @param buffer2 (undocumented)
   */
  public  void merge (org.apache.spark.sql.catalyst.expressions.MutableRow buffer1, org.apache.spark.sql.catalyst.InternalRow buffer2) { throw new RuntimeException(); }
  /**
   * Compute aggregate statistic from sufficient moments.
   * @param centralMoments Length <code>momentOrder + 1</code> array of central moments (un-normalized)
   *                       needed to compute the aggregate stat.
   * @param n (undocumented)
   * @param mean (undocumented)
   * @return (undocumented)
   */
  public abstract  Object getStatistic (double n, double mean, double[] centralMoments) ;
  public final  Object eval (org.apache.spark.sql.catalyst.InternalRow buffer) { throw new RuntimeException(); }
}

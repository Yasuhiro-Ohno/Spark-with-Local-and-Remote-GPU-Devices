package org.apache.spark.streaming.scheduler.rate;
// no position
public  class RateEstimator$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RateEstimator$ MODULE$ = null;
  public   RateEstimator$ () { throw new RuntimeException(); }
  /**
   * Return a new RateEstimator based on the value of <code>spark.streaming.RateEstimator</code>.
   * <p>
   * The only known estimator right now is <code>pid</code>.
   * <p>
   * @return An instance of RateEstimator
   * @throws IllegalArgumentException if there is a configured RateEstimator that doesn't match any
   *         known estimators.
   * @param conf (undocumented)
   * @param batchInterval (undocumented)
   */
  public  org.apache.spark.streaming.scheduler.rate.RateEstimator create (org.apache.spark.SparkConf conf, org.apache.spark.streaming.Duration batchInterval) { throw new RuntimeException(); }
}

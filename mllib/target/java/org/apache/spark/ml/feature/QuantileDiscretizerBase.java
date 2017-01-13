package org.apache.spark.ml.feature;
/**
 * Params for {@link QuantileDiscretizer}.
 */
  interface QuantileDiscretizerBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * Maximum number of buckets (quantiles, or categories) into which data points are grouped. Must
   * be >= 2.
   * default: 2
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numBuckets () ;
  /** @group getParam */
  public  int getNumBuckets () ;
}

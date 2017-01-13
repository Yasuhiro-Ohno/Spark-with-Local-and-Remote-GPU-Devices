package org.apache.spark.ml.feature;
/**
 * Params for {@link ChiSqSelector} and {@link ChiSqSelectorModel}.
 */
  interface ChiSqSelectorParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasLabelCol {
  /**
   * Number of features that selector will select (ordered by statistic value descending). If the
   * number of features is < numTopFeatures, then this will select all features. The default value
   * of numTopFeatures is 50.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numTopFeatures () ;
  /** @group getParam */
  public  int getNumTopFeatures () ;
}

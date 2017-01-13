package org.apache.spark.ml.feature;
/**
 * Params for {@link StandardScaler} and {@link StandardScalerModel}.
 */
  interface StandardScalerParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * Whether to center the data with mean before scaling.
   * It will build a dense output, so this does not work on sparse input
   * and will raise an exception.
   * Default: false
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam withMean () ;
  /** @group getParam */
  public  boolean getWithMean () ;
  /**
   * Whether to scale the data to unit standard deviation.
   * Default: true
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam withStd () ;
  /** @group getParam */
  public  boolean getWithStd () ;
}

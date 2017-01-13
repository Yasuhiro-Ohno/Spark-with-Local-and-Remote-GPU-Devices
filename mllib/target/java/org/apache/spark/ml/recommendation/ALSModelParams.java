package org.apache.spark.ml.recommendation;
/**
 * Common params for ALS and ALSModel.
 */
  interface ALSModelParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasPredictionCol {
  /**
   * Param for the column name for user ids.
   * Default: "user"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> userCol () ;
  /** @group getParam */
  public  java.lang.String getUserCol () ;
  /**
   * Param for the column name for item ids.
   * Default: "item"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> itemCol () ;
  /** @group getParam */
  public  java.lang.String getItemCol () ;
}

package org.apache.spark.ml.tuning;
/**
 * :: DeveloperApi ::
 * Common params for {@link TrainValidationSplitParams} and {@link CrossValidatorParams}.
 */
  interface ValidatorParams extends org.apache.spark.ml.param.Params {
  /**
   * param for the estimator to be validated
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator () ;
  /** @group getParam */
  public  org.apache.spark.ml.Estimator<?> getEstimator () ;
  /**
   * param for estimator param maps
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps () ;
  /** @group getParam */
  public  org.apache.spark.ml.param.ParamMap[] getEstimatorParamMaps () ;
  /**
   * param for the evaluator used to select hyper-parameters that maximize the validated metric
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.evaluation.Evaluator> evaluator () ;
  /** @group getParam */
  public  org.apache.spark.ml.evaluation.Evaluator getEvaluator () ;
}

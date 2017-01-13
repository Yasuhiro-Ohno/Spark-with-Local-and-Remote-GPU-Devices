package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * Fit a parametric survival regression model named accelerated failure time (AFT) model
 * ({@link https://en.wikipedia.org/wiki/Accelerated_failure_time_model})
 * based on the Weibull distribution of the survival time.
 */
public  class AFTSurvivalRegression extends org.apache.spark.ml.Estimator<org.apache.spark.ml.regression.AFTSurvivalRegressionModel> implements org.apache.spark.ml.regression.AFTSurvivalRegressionParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.Logging {
  static public  org.apache.spark.ml.regression.AFTSurvivalRegression load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   AFTSurvivalRegression (java.lang.String uid) { throw new RuntimeException(); }
  public   AFTSurvivalRegression () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setCensorCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setQuantileProbabilities (double[] value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setQuantilesCol (java.lang.String value) { throw new RuntimeException(); }
  /**
   * Set if we should fit the intercept
   * Default is true.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setFitIntercept (boolean value) { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setMaxIter (int value) { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * Default is 1E-6.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setTol (double value) { throw new RuntimeException(); }
  /**
   * Extract {@link featuresCol}, {@link labelCol} and {@link censorCol} from input dataset,
   * and put it in an RDD with strong types.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.regression.AFTPoint> extractAFTPoints (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.AFTSurvivalRegression copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

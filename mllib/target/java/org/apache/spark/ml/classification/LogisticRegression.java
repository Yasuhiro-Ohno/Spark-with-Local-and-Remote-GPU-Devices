package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Logistic regression.
 * Currently, this class only supports binary classification.  It will support multiclass
 * in the future.
 */
public  class LogisticRegression extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.LogisticRegression, org.apache.spark.ml.classification.LogisticRegressionModel> implements org.apache.spark.ml.classification.LogisticRegressionParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.Logging {
  static public  org.apache.spark.ml.classification.LogisticRegression load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   LogisticRegression (java.lang.String uid) { throw new RuntimeException(); }
  public   LogisticRegression () { throw new RuntimeException(); }
  /**
   * Set the regularization parameter.
   * Default is 0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setRegParam (double value) { throw new RuntimeException(); }
  /**
   * Set the ElasticNet mixing parameter.
   * For alpha = 0, the penalty is an L2 penalty. For alpha = 1, it is an L1 penalty.
   * For 0 < alpha < 1, the penalty is a combination of L1 and L2.
   * Default is 0.0 which is an L2 penalty.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setElasticNetParam (double value) { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setMaxIter (int value) { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * Default is 1E-6.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setTol (double value) { throw new RuntimeException(); }
  /**
   * Whether to fit an intercept term.
   * Default is true.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setFitIntercept (boolean value) { throw new RuntimeException(); }
  /**
   * Whether to standardize the training features before fitting the model.
   * The coefficients of models will be always returned on the original scale,
   * so it will be transparent for users. Note that with/without standardization,
   * the models should be always converged to the same solution when no regularization
   * is applied. In R's GLMNET package, the default behavior is true as well.
   * Default is true.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setStandardization (boolean value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setThreshold (double value) { throw new RuntimeException(); }
  public  double getThreshold () { throw new RuntimeException(); }
  /**
   * Whether to over-/under-sample training instances according to the given weights in weightCol.
   * If empty, all instances are treated equally (weight 1.0).
   * Default is empty, so all instances have weight one.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setWeightCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setThresholds (double[] value) { throw new RuntimeException(); }
  public  double[] getThresholds () { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.LogisticRegressionModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

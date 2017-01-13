package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * Linear regression.
 * <p>
 * The learning objective is to minimize the squared error, with regularization.
 * The specific squared error loss function used is:
 *   L = 1/2n ||A coefficients - y||^2^
 * <p>
 * This support multiple types of regularization:
 *  - none (a.k.a. ordinary least squares)
 *  - L2 (ridge regression)
 *  - L1 (Lasso)
 *  - L2 + L1 (elastic net)
 */
public  class LinearRegression extends org.apache.spark.ml.regression.Regressor<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.LinearRegression, org.apache.spark.ml.regression.LinearRegressionModel> implements org.apache.spark.ml.regression.LinearRegressionParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.Logging {
  static public  org.apache.spark.ml.regression.LinearRegression load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   LinearRegression (java.lang.String uid) { throw new RuntimeException(); }
  public   LinearRegression () { throw new RuntimeException(); }
  /**
   * Set the regularization parameter.
   * Default is 0.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setRegParam (double value) { throw new RuntimeException(); }
  /**
   * Set if we should fit the intercept
   * Default is true.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setFitIntercept (boolean value) { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.regression.LinearRegression setStandardization (boolean value) { throw new RuntimeException(); }
  /**
   * Set the ElasticNet mixing parameter.
   * For alpha = 0, the penalty is an L2 penalty. For alpha = 1, it is an L1 penalty.
   * For 0 < alpha < 1, the penalty is a combination of L1 and L2.
   * Default is 0.0 which is an L2 penalty.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setElasticNetParam (double value) { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setMaxIter (int value) { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * Default is 1E-6.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setTol (double value) { throw new RuntimeException(); }
  /**
   * Whether to over-/under-sample training instances according to the given weights in weightCol.
   * If empty, all instances are treated equally (weight 1.0).
   * Default is empty, so all instances have weight one.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setWeightCol (java.lang.String value) { throw new RuntimeException(); }
  /**
   * Set the solver algorithm used for optimization.
   * In case of linear regression, this can be "l-bfgs", "normal" and "auto".
   * "l-bfgs" denotes Limited-memory BFGS which is a limited-memory quasi-Newton
   * optimization method. "normal" denotes using Normal Equation as an analytical
   * solution to the linear regression problem.
   * The default value is "auto" which means that the solver algorithm is
   * selected automatically.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setSolver (java.lang.String value) { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.LinearRegressionModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.LinearRegression copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

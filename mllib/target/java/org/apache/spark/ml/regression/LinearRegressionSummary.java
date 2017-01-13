package org.apache.spark.ml.regression;
public  class LinearRegressionSummary implements scala.Serializable {
  public  org.apache.spark.sql.DataFrame predictions () { throw new RuntimeException(); }
  public  java.lang.String predictionCol () { throw new RuntimeException(); }
  public  java.lang.String labelCol () { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.LinearRegressionModel model () { throw new RuntimeException(); }
  private  double[] diagInvAtWA () { throw new RuntimeException(); }
     LinearRegressionSummary (org.apache.spark.sql.DataFrame predictions, java.lang.String predictionCol, java.lang.String labelCol, org.apache.spark.ml.regression.LinearRegressionModel model, double[] diagInvAtWA) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.evaluation.RegressionMetrics metrics () { throw new RuntimeException(); }
  public  double explainedVariance () { throw new RuntimeException(); }
  /**
   * Returns the mean absolute error, which is a risk function corresponding to the
   * expected value of the absolute error loss or l1-norm loss.
   * <p>
   * Note: This ignores instance weights (setting all to 1.0) from {@link LinearRegression.weightCol}.
   *       This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double meanAbsoluteError () { throw new RuntimeException(); }
  /**
   * Returns the mean squared error, which is a risk function corresponding to the
   * expected value of the squared error loss or quadratic loss.
   * <p>
   * Note: This ignores instance weights (setting all to 1.0) from {@link LinearRegression.weightCol}.
   *       This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double meanSquaredError () { throw new RuntimeException(); }
  /**
   * Returns the root mean squared error, which is defined as the square root of
   * the mean squared error.
   * <p>
   * Note: This ignores instance weights (setting all to 1.0) from {@link LinearRegression.weightCol}.
   *       This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double rootMeanSquaredError () { throw new RuntimeException(); }
  /**
   * Returns R^2^, the coefficient of determination.
   * Reference: {@link http://en.wikipedia.org/wiki/Coefficient_of_determination}
   * <p>
   * Note: This ignores instance weights (setting all to 1.0) from {@link LinearRegression.weightCol}.
   *       This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double r2 () { throw new RuntimeException(); }
  /** Residuals (label - predicted value) */
  public  org.apache.spark.sql.DataFrame residuals () { throw new RuntimeException(); }
  /** Number of instances in DataFrame predictions */
  public  long numInstances () { throw new RuntimeException(); }
  /** Degrees of freedom */
  private  long degreesOfFreedom () { throw new RuntimeException(); }
  /**
   * The weighted residuals, the usual residuals rescaled by
   * the square root of the instance weights.
   * @return (undocumented)
   */
  public  double[] devianceResiduals () { throw new RuntimeException(); }
  /**
   * Standard error of estimated coefficients and intercept.
   * @return (undocumented)
   */
  public  double[] coefficientStandardErrors () { throw new RuntimeException(); }
  /**
   * T-statistic of estimated coefficients and intercept.
   * @return (undocumented)
   */
  public  double[] tValues () { throw new RuntimeException(); }
  /**
   * Two-sided p-value of estimated coefficients and intercept.
   * @return (undocumented)
   */
  public  double[] pValues () { throw new RuntimeException(); }
}

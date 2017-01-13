package org.apache.spark.ml.classification;
/**
 * Params for logistic regression.
 */
  interface LogisticRegressionParams extends org.apache.spark.ml.classification.ProbabilisticClassifierParams, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasElasticNetParam, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasStandardization, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasThreshold {
  /**
   * Set threshold in binary classification, in range [0, 1].
   * <p>
   * If the estimated probability of class label 1 is > threshold, then predict 1, else 0.
   * A high threshold encourages the model to predict 0 more often;
   * a low threshold encourages the model to predict 1 more often.
   * <p>
   * Note: Calling this with threshold p is equivalent to calling <code>setThresholds(Array(1-p, p))</code>.
   *       When {@link setThreshold()} is called, any user-set value for {@link thresholds} will be cleared.
   *       If both {@link threshold} and {@link thresholds} are set in a ParamMap, then they must be
   *       equivalent.
   * <p>
   * Default is 0.5.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionParams setThreshold (double value) ;
  /**
   * Get threshold for binary classification.
   * <p>
   * If {@link threshold} is set, returns that value.
   * Otherwise, if {@link thresholds} is set with length 2 (i.e., binary classification),
   * this returns the equivalent threshold: <pre><code>1 / (1 + thresholds(0) / thresholds(1))</code></pre>.
   * Otherwise, returns {&#64;link threshold} default value.
   *
   * &#64;group getParam
   * &#64;throws IllegalArgumentException if {&#64;link thresholds} is set to an array of length other than 2.
   * @return (undocumented)
   */
  public  double getThreshold () ;
  /**
   * Set thresholds in multiclass (or binary) classification to adjust the probability of
   * predicting each class. Array must have length equal to the number of classes, with values >= 0.
   * The class with largest value p/t is predicted, where p is the original probability of that
   * class and t is the class' threshold.
   * <p>
   * Note: When {@link setThresholds()} is called, any user-set value for {@link threshold} will be cleared.
   *       If both {@link threshold} and {@link thresholds} are set in a ParamMap, then they must be
   *       equivalent.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionParams setThresholds (double[] value) ;
  /**
   * Get thresholds for binary or multiclass classification.
   * <p>
   * If {@link thresholds} is set, return its value.
   * Otherwise, if {@link threshold} is set, return the equivalent thresholds for binary
   * classification: (1-threshold, threshold).
   * If neither are set, throw an exception.
   * <p>
   * @group getParam
   * @return (undocumented)
   */
  public  double[] getThresholds () ;
  /**
   * If {@link threshold} and {@link thresholds} are both set, ensures they are consistent.
   * @throws IllegalArgumentException if {@link threshold} and {@link thresholds} are not equivalent
   */
  public  void checkThresholdConsistency () ;
  public  void validateParams () ;
}

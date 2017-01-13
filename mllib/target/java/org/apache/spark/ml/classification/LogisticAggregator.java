package org.apache.spark.ml.classification;
/**
 * LogisticAggregator computes the gradient and loss for binary logistic loss function, as used
 * in binary classification for instances in sparse or dense vector in a online fashion.
 * <p>
 * Note that multinomial logistic loss is not supported yet!
 * <p>
 * Two LogisticAggregator can be merged together to have a summary of loss and gradient of
 * the corresponding joint dataset.
 * <p>
 * param:  coefficients The coefficients corresponding to the features.
 * param:  numClasses the number of possible outcomes for k classes classification problem in
 *                   Multinomial Logistic Regression.
 * param:  fitIntercept Whether to fit an intercept term.
 * param:  featuresStd The standard deviation values of the features.
 * param:  featuresMean The mean values of the features.
 */
public  class LogisticAggregator implements scala.Serializable {
  public   LogisticAggregator (org.apache.spark.mllib.linalg.Vector coefficients, int numClasses, boolean fitIntercept, double[] featuresStd, double[] featuresMean) { throw new RuntimeException(); }
  private  double weightSum () { throw new RuntimeException(); }
  private  double lossSum () { throw new RuntimeException(); }
  private  double[] coefficientsArray () { throw new RuntimeException(); }
  private  int dim () { throw new RuntimeException(); }
  private  double[] gradientSumArray () { throw new RuntimeException(); }
  /**
   * Add a new training instance to this LogisticAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This LogisticAggregator object.
   */
  public  org.apache.spark.ml.classification.LogisticAggregator add (org.apache.spark.ml.feature.Instance instance) { throw new RuntimeException(); }
  /**
   * Merge another LogisticAggregator, and update the loss and gradient
   * of the objective function.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other LogisticAggregator to be merged.
   * @return This LogisticAggregator object.
   */
  public  org.apache.spark.ml.classification.LogisticAggregator merge (org.apache.spark.ml.classification.LogisticAggregator other) { throw new RuntimeException(); }
  public  double loss () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector gradient () { throw new RuntimeException(); }
}

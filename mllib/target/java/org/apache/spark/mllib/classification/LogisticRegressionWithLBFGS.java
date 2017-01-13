package org.apache.spark.mllib.classification;
/**
 * Train a classification model for Multinomial/Binary Logistic Regression using
 * Limited-memory BFGS. Standard feature scaling and L2 regularization are used by default.
 * NOTE: Labels used in Logistic Regression should be {0, 1, ..., k - 1}
 * for k classes multi-label classification problem.
 */
public  class LogisticRegressionWithLBFGS extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.classification.LogisticRegressionModel> implements scala.Serializable {
  public   LogisticRegressionWithLBFGS () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.LBFGS optimizer () { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators () { throw new RuntimeException(); }
  private  scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object> multiLabelValidator () { throw new RuntimeException(); }
  /**
   * Set the number of possible outcomes for k classes classification problem in
   * Multinomial Logistic Regression.
   * By default, it is binary logistic regression so k will be set to 2.
   * @param numClasses (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionWithLBFGS setNumClasses (int numClasses) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.classification.LogisticRegressionModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept) { throw new RuntimeException(); }
}

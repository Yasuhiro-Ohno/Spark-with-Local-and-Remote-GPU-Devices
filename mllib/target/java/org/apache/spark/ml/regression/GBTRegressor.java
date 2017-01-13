package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Gradient_boosting Gradient-Boosted Trees (GBTs)}
 * learning algorithm for regression.
 * It supports both continuous and categorical features.
 */
public final class GBTRegressor extends org.apache.spark.ml.Predictor<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.GBTRegressor, org.apache.spark.ml.regression.GBTRegressionModel> implements org.apache.spark.ml.tree.GBTParams, org.apache.spark.ml.tree.TreeRegressorParams, org.apache.spark.Logging {
  /** Accessor for supported loss settings: squared (L2), absolute (L1) */
  static public final  java.lang.String[] supportedLossTypes () { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   GBTRegressor (java.lang.String uid) { throw new RuntimeException(); }
  public   GBTRegressor () { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setMaxDepth (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setMaxBins (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setMinInstancesPerNode (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setMinInfoGain (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setMaxMemoryInMB (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setCacheNodeIds (boolean value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setCheckpointInterval (int value) { throw new RuntimeException(); }
  /**
   * The impurity setting is ignored for GBT models.
   * Individual trees are built using impurity "Variance."
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GBTRegressor setImpurity (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setSubsamplingRate (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setSeed (long value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setMaxIter (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor setStepSize (double value) { throw new RuntimeException(); }
  /**
   * Loss function which GBT tries to minimize. (case-insensitive)
   * Supported: "squared" (L2) and "absolute" (L1)
   * (default = squared)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> lossType () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setLossType (java.lang.String value) { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getLossType () { throw new RuntimeException(); }
  /** (private[ml]) Convert new loss to old loss. */
    org.apache.spark.mllib.tree.loss.Loss getOldLossType () { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.GBTRegressionModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

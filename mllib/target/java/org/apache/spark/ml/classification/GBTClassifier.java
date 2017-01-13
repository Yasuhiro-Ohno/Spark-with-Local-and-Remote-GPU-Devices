package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Gradient_boosting Gradient-Boosted Trees (GBTs)}
 * learning algorithm for classification.
 * It supports binary labels, as well as both continuous and categorical features.
 * Note: Multiclass labels are not currently supported.
 */
public final class GBTClassifier extends org.apache.spark.ml.Predictor<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.GBTClassifier, org.apache.spark.ml.classification.GBTClassificationModel> implements org.apache.spark.ml.tree.GBTParams, org.apache.spark.ml.tree.TreeClassifierParams, org.apache.spark.Logging {
  /** Accessor for supported loss settings: logistic */
  static public final  java.lang.String[] supportedLossTypes () { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   GBTClassifier (java.lang.String uid) { throw new RuntimeException(); }
  public   GBTClassifier () { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setMaxDepth (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setMaxBins (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setMinInstancesPerNode (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setMinInfoGain (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setMaxMemoryInMB (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setCacheNodeIds (boolean value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setCheckpointInterval (int value) { throw new RuntimeException(); }
  /**
   * The impurity setting is ignored for GBT models.
   * Individual trees are built using impurity "Variance."
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.GBTClassifier setImpurity (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setSubsamplingRate (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setSeed (long value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setMaxIter (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier setStepSize (double value) { throw new RuntimeException(); }
  /**
   * Loss function which GBT tries to minimize. (case-insensitive)
   * Supported: "logistic"
   * (default = logistic)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> lossType () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.GBTClassifier setLossType (java.lang.String value) { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getLossType () { throw new RuntimeException(); }
  /** (private[ml]) Convert new loss to old loss. */
    org.apache.spark.mllib.tree.loss.Loss getOldLossType () { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.GBTClassificationModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassifier copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Random_forest  Random Forest} learning algorithm for
 * classification.
 * It supports both binary and multiclass labels, as well as both continuous and categorical
 * features.
 */
public final class RandomForestClassifier extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.RandomForestClassifier, org.apache.spark.ml.classification.RandomForestClassificationModel> implements org.apache.spark.ml.tree.RandomForestParams, org.apache.spark.ml.tree.TreeClassifierParams {
  /** Accessor for supported impurity settings: entropy, gini */
  static public final  java.lang.String[] supportedImpurities () { throw new RuntimeException(); }
  /** Accessor for supported featureSubsetStrategy settings: auto, all, onethird, sqrt, log2 */
  static public final  java.lang.String[] supportedFeatureSubsetStrategies () { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   RandomForestClassifier (java.lang.String uid) { throw new RuntimeException(); }
  public   RandomForestClassifier () { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setMaxDepth (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setMaxBins (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setMinInstancesPerNode (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setMinInfoGain (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setMaxMemoryInMB (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setCacheNodeIds (boolean value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setCheckpointInterval (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setImpurity (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setSubsamplingRate (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setSeed (long value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setNumTrees (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier setFeatureSubsetStrategy (java.lang.String value) { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.RandomForestClassificationModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassifier copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

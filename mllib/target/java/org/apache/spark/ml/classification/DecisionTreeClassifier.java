package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Decision_tree_learning Decision tree} learning algorithm
 * for classification.
 * It supports both binary and multiclass labels, as well as both continuous and categorical
 * features.
 */
public final class DecisionTreeClassifier extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.DecisionTreeClassifier, org.apache.spark.ml.classification.DecisionTreeClassificationModel> implements org.apache.spark.ml.tree.DecisionTreeParams, org.apache.spark.ml.tree.TreeClassifierParams {
  /** Accessor for supported impurities: entropy, gini */
  static public final  java.lang.String[] supportedImpurities () { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   DecisionTreeClassifier (java.lang.String uid) { throw new RuntimeException(); }
  public   DecisionTreeClassifier () { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxDepth (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxBins (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMinInstancesPerNode (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMinInfoGain (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxMemoryInMB (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setCacheNodeIds (boolean value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setCheckpointInterval (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setImpurity (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setSeed (long value) { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.DecisionTreeClassificationModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  /** (private[ml]) Create a Strategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Decision_tree_learning Decision tree} learning algorithm
 * for regression.
 * It supports both continuous and categorical features.
 */
public final class DecisionTreeRegressor extends org.apache.spark.ml.Predictor<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.DecisionTreeRegressor, org.apache.spark.ml.regression.DecisionTreeRegressionModel> implements org.apache.spark.ml.tree.DecisionTreeParams, org.apache.spark.ml.tree.TreeRegressorParams {
  /** Accessor for supported impurities: variance */
  static public final  java.lang.String[] supportedImpurities () { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   DecisionTreeRegressor (java.lang.String uid) { throw new RuntimeException(); }
  public   DecisionTreeRegressor () { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setMaxDepth (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setMaxBins (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setMinInstancesPerNode (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setMinInfoGain (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setMaxMemoryInMB (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setCacheNodeIds (boolean value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setCheckpointInterval (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setImpurity (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor setSeed (long value) { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.DecisionTreeRegressionModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  /** (private[ml]) Create a Strategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressor copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Random_forest  Random Forest} learning algorithm for regression.
 * It supports both continuous and categorical features.
 */
public final class RandomForestRegressor extends org.apache.spark.ml.Predictor<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.RandomForestRegressor, org.apache.spark.ml.regression.RandomForestRegressionModel> implements org.apache.spark.ml.tree.RandomForestParams, org.apache.spark.ml.tree.TreeRegressorParams {
  /** Accessor for supported impurity settings: variance */
  static public final  java.lang.String[] supportedImpurities () { throw new RuntimeException(); }
  /** Accessor for supported featureSubsetStrategy settings: auto, all, onethird, sqrt, log2 */
  static public final  java.lang.String[] supportedFeatureSubsetStrategies () { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   RandomForestRegressor (java.lang.String uid) { throw new RuntimeException(); }
  public   RandomForestRegressor () { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxDepth (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxBins (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setMinInstancesPerNode (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setMinInfoGain (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxMemoryInMB (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setCacheNodeIds (boolean value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setCheckpointInterval (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setImpurity (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setSubsamplingRate (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setSeed (long value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setNumTrees (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor setFeatureSubsetStrategy (java.lang.String value) { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.RandomForestRegressionModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

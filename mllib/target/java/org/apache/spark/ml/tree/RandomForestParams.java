package org.apache.spark.ml.tree;
/**
 * Parameters for Random Forest algorithms.
 * <p>
 * Note: Marked as private and DeveloperApi since this may be made public in the future.
 */
  interface RandomForestParams extends org.apache.spark.ml.tree.TreeEnsembleParams {
  /**
   * Number of trees to train (>= 1).
   * If 1, then no bootstrapping is used.  If > 1, then bootstrapping is done.
   * TODO: Change to always do bootstrapping (simpler).  SPARK-7130
   * (default = 20)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numTrees () ;
  /**
   * The number of features to consider for splits at each tree node.
   * Supported options:
   *  - "auto": Choose automatically for task:
   *            If numTrees == 1, set to "all."
   *            If numTrees > 1 (forest), set to "sqrt" for classification and
   *              to "onethird" for regression.
   *  - "all": use all features
   *  - "onethird": use 1/3 of the features
   *  - "sqrt": use sqrt(number of features)
   *  - "log2": use log2(number of features)
   * (default = "auto")
   * <p>
   * These various settings are based on the following references:
   *  - log2: tested in Breiman (2001)
   *  - sqrt: recommended by Breiman manual for random forests
   *  - The defaults of sqrt (classification) and onethird (regression) match the R randomForest
   *    package.
   * @see <a href="http://www.stat.berkeley.edu/~breiman/randomforest2001.pdf  Breiman (2001)"/>
   * @see {@link http://www.stat.berkeley.edu/~breiman/Using_random_forests_V3.1.pdf  Breiman manual for
   *     random forests}
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> featureSubsetStrategy () ;
  /** @group setParam */
  public  org.apache.spark.ml.tree.RandomForestParams setNumTrees (int value) ;
  /** @group getParam */
  public  int getNumTrees () ;
  /** @group setParam */
  public  org.apache.spark.ml.tree.RandomForestParams setFeatureSubsetStrategy (java.lang.String value) ;
  /** @group getParam */
  public  java.lang.String getFeatureSubsetStrategy () ;
}

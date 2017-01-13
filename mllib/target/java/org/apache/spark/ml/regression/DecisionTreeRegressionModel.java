package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Decision_tree_learning Decision tree} model for regression.
 * It supports both continuous and categorical features.
 * param:  rootNode  Root of the decision tree
 */
public final class DecisionTreeRegressionModel extends org.apache.spark.ml.PredictionModel<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.DecisionTreeRegressionModel> implements org.apache.spark.ml.tree.DecisionTreeModel, scala.Serializable {
  /** (private[ml]) Convert a model from the old API */
  static public  org.apache.spark.ml.regression.DecisionTreeRegressionModel fromOld (org.apache.spark.mllib.tree.model.DecisionTreeModel oldModel, org.apache.spark.ml.regression.DecisionTreeRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.Node rootNode () { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  // not preceding
     DecisionTreeRegressionModel (java.lang.String uid, org.apache.spark.ml.tree.Node rootNode, int numFeatures) { throw new RuntimeException(); }
  /**
   * Construct a decision tree regression model.
   * @param rootNode  Root node of tree, with other nodes attached.
   * @param numFeatures (undocumented)
   */
     DecisionTreeRegressionModel (org.apache.spark.ml.tree.Node rootNode, int numFeatures) { throw new RuntimeException(); }
  protected  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressionModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /** Convert to a model in the old API */
    org.apache.spark.mllib.tree.model.DecisionTreeModel toOld () { throw new RuntimeException(); }
}

package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Random_forest  Random Forest} model for regression.
 * It supports both continuous and categorical features.
 * param:  _trees  Decision trees in the ensemble.
 * param:  numFeatures  Number of features used by this model
 */
public final class RandomForestRegressionModel extends org.apache.spark.ml.PredictionModel<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.RandomForestRegressionModel> implements org.apache.spark.ml.tree.TreeEnsembleModel, scala.Serializable {
  /** (private[ml]) Convert a model from the old API */
  static public  org.apache.spark.ml.regression.RandomForestRegressionModel fromOld (org.apache.spark.mllib.tree.model.RandomForestModel oldModel, org.apache.spark.ml.regression.RandomForestRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  private  org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees () { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  // not preceding
     RandomForestRegressionModel (java.lang.String uid, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees, int numFeatures) { throw new RuntimeException(); }
  /**
   * Construct a random forest regression model, with all trees weighted equally.
   * @param trees  Component trees
   * @param numFeatures (undocumented)
   */
     RandomForestRegressionModel (org.apache.spark.ml.regression.DecisionTreeRegressionModel[] trees, int numFeatures) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.DecisionTreeModel[] trees () { throw new RuntimeException(); }
  private  double[] _treeWeights () { throw new RuntimeException(); }
  public  double[] treeWeights () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.DataFrame transformImpl (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  protected  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressionModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * Estimate of the importance of each feature.
   * <p>
   * This generalizes the idea of "Gini" importance to other losses,
   * following the explanation of Gini importance from "Random Forests" documentation
   * by Leo Breiman and Adele Cutler, and following the implementation from scikit-learn.
   * <p>
   * This feature importance is calculated as follows:
   *  - Average over trees:
   *     - importance(feature j) = sum (over nodes which split on feature j) of the gain,
   *       where gain is scaled by the number of instances passing through node
   *     - Normalize importances for tree based on total number of training instances used
   *       to build tree.
   *  - Normalize feature importance vector to sum to 1.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector featureImportances () { throw new RuntimeException(); }
  /** (private[ml]) Convert to a model in the old API */
    org.apache.spark.mllib.tree.model.RandomForestModel toOld () { throw new RuntimeException(); }
}

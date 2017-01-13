package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * <p>
 * {@link http://en.wikipedia.org/wiki/Gradient_boosting Gradient-Boosted Trees (GBTs)}
 * model for regression.
 * It supports both continuous and categorical features.
 * param:  _trees  Decision trees in the ensemble.
 * param:  _treeWeights  Weights for the decision trees in the ensemble.
 */
public final class GBTRegressionModel extends org.apache.spark.ml.PredictionModel<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.GBTRegressionModel> implements org.apache.spark.ml.tree.TreeEnsembleModel, scala.Serializable {
  /** (private[ml]) Convert a model from the old API */
  static public  org.apache.spark.ml.regression.GBTRegressionModel fromOld (org.apache.spark.mllib.tree.model.GradientBoostedTreesModel oldModel, org.apache.spark.ml.regression.GBTRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  private  org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees () { throw new RuntimeException(); }
  private  double[] _treeWeights () { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  // not preceding
     GBTRegressionModel (java.lang.String uid, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees, double[] _treeWeights, int numFeatures) { throw new RuntimeException(); }
  /**
   * Construct a GBTRegressionModel
   * @param _trees  Decision trees in the ensemble.
   * @param _treeWeights  Weights for the decision trees in the ensemble.
   * @param uid (undocumented)
   */
  public   GBTRegressionModel (java.lang.String uid, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees, double[] _treeWeights) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.DecisionTreeModel[] trees () { throw new RuntimeException(); }
  public  double[] treeWeights () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.DataFrame transformImpl (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  protected  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressionModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /** (private[ml]) Convert to a model in the old API */
    org.apache.spark.mllib.tree.model.GradientBoostedTreesModel toOld () { throw new RuntimeException(); }
}

package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * {@link http://en.wikipedia.org/wiki/Decision_tree_learning Decision tree} model for classification.
 * It supports both binary and multiclass labels, as well as both continuous and categorical
 * features.
 */
public final class DecisionTreeClassificationModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.DecisionTreeClassificationModel> implements org.apache.spark.ml.tree.DecisionTreeModel, scala.Serializable {
  /** (private[ml]) Convert a model from the old API */
  static public  org.apache.spark.ml.classification.DecisionTreeClassificationModel fromOld (org.apache.spark.mllib.tree.model.DecisionTreeModel oldModel, org.apache.spark.ml.classification.DecisionTreeClassifier parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.Node rootNode () { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  public  int numClasses () { throw new RuntimeException(); }
  // not preceding
     DecisionTreeClassificationModel (java.lang.String uid, org.apache.spark.ml.tree.Node rootNode, int numFeatures, int numClasses) { throw new RuntimeException(); }
  /**
   * Construct a decision tree classification model.
   * @param rootNode  Root node of tree, with other nodes attached.
   * @param numFeatures (undocumented)
   * @param numClasses (undocumented)
   */
     DecisionTreeClassificationModel (org.apache.spark.ml.tree.Node rootNode, int numFeatures, int numClasses) { throw new RuntimeException(); }
  protected  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.linalg.Vector predictRaw (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.linalg.Vector raw2probabilityInPlace (org.apache.spark.mllib.linalg.Vector rawPrediction) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassificationModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /** (private[ml]) Convert to a model in the old API */
    org.apache.spark.mllib.tree.model.DecisionTreeModel toOld () { throw new RuntimeException(); }
}

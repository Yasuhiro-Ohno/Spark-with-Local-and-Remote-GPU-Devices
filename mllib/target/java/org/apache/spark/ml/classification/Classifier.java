package org.apache.spark.ml.classification;
/**
 * :: DeveloperApi ::
 * <p>
 * Single-label binary or multiclass classification.
 * Classes are indexed {0, 1, ..., numClasses - 1}.
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., {@link Vector}
 * @tparam E  Concrete Estimator type
 * @tparam M  Concrete Model type
 */
public abstract class Classifier<FeaturesType extends java.lang.Object, E extends org.apache.spark.ml.classification.Classifier<FeaturesType, E, M>, M extends org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.Predictor<FeaturesType, E, M> implements org.apache.spark.ml.classification.ClassifierParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.Classifier), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("E"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ClassificationModel), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  public   Classifier () { throw new RuntimeException(); }
  /** @group setParam */
  public  E setRawPredictionCol (java.lang.String value) { throw new RuntimeException(); }
}

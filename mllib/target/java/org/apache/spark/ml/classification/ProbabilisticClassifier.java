package org.apache.spark.ml.classification;
/**
 * :: DeveloperApi ::
 * <p>
 * Single-label binary or multiclass classifier which can output class conditional probabilities.
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., {@link Vector}
 * @tparam E  Concrete Estimator type
 * @tparam M  Concrete Model type
 */
public abstract class ProbabilisticClassifier<FeaturesType extends java.lang.Object, E extends org.apache.spark.ml.classification.ProbabilisticClassifier<FeaturesType, E, M>, M extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.classification.Classifier<FeaturesType, E, M> implements org.apache.spark.ml.classification.ProbabilisticClassifierParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ProbabilisticClassifier), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("E"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ProbabilisticClassificationModel), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  public   ProbabilisticClassifier () { throw new RuntimeException(); }
  /** @group setParam */
  public  E setProbabilityCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  E setThresholds (double[] value) { throw new RuntimeException(); }
}

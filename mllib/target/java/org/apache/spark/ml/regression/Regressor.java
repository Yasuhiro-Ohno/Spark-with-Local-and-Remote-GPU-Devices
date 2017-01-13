package org.apache.spark.ml.regression;
/**
 * :: DeveloperApi ::
 * <p>
 * Single-label regression
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., {@link org.apache.spark.mllib.linalg.Vector}
 * @tparam Learner  Concrete Estimator type
 * @tparam M  Concrete Model type
 */
 abstract class Regressor<FeaturesType extends java.lang.Object, Learner extends org.apache.spark.ml.regression.Regressor<FeaturesType, Learner, M>, M extends org.apache.spark.ml.regression.RegressionModel<FeaturesType, M>> extends org.apache.spark.ml.Predictor<FeaturesType, Learner, M> implements org.apache.spark.ml.PredictorParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.regression.Regressor), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("Learner"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.regression.RegressionModel), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  public   Regressor () { throw new RuntimeException(); }
}

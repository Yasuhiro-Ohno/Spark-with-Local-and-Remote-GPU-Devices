package org.apache.spark.ml.regression;
/**
 * :: DeveloperApi ::
 * <p>
 * Model produced by a {@link Regressor}.
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., {@link org.apache.spark.mllib.linalg.Vector}
 * @tparam M  Concrete Model type.
 */
public abstract class RegressionModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.regression.RegressionModel<FeaturesType, M>> extends org.apache.spark.ml.PredictionModel<FeaturesType, M> implements org.apache.spark.ml.PredictorParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.regression.RegressionModel), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  public   RegressionModel () { throw new RuntimeException(); }
}

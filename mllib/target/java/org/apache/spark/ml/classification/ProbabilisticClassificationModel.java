package org.apache.spark.ml.classification;
/**
 * :: DeveloperApi ::
 * <p>
 * Model produced by a {@link ProbabilisticClassifier}.
 * Classes are indexed {0, 1, ..., numClasses - 1}.
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., {@link Vector}
 * @tparam M  Concrete Model type
 */
public abstract class ProbabilisticClassificationModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M> implements org.apache.spark.ml.classification.ProbabilisticClassifierParams {
  /**
   * Normalize a vector of raw predictions to be a multinomial probability vector, in place.
   * <p>
   * The input raw predictions should be >= 0.
   * The output vector sums to 1, unless the input vector is all-0 (in which case the output is
   * all-0 too).
   * <p>
   * NOTE: This is NOT applicable to all models, only ones which effectively use class
   *       instance counts for raw predictions.
   * @param v (undocumented)
   */
  static public  void normalizeToProbabilitiesInPlace (org.apache.spark.mllib.linalg.DenseVector v) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ProbabilisticClassificationModel), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  public   ProbabilisticClassificationModel () { throw new RuntimeException(); }
  /** @group setParam */
  public  M setProbabilityCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  M setThresholds (double[] value) { throw new RuntimeException(); }
  /**
   * Transforms dataset by reading from {@link featuresCol}, and appending new columns as specified by
   * parameters:
   *  - predicted labels as {@link predictionCol} of type {@link Double}
   *  - raw predictions (confidences) as {@link rawPredictionCol} of type {@link Vector}
   *  - probability of each class as {@link probabilityCol} of type {@link Vector}.
   * <p>
   * @param dataset input dataset
   * @return transformed dataset
   */
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  /**
   * Estimate the probability of each class given the raw prediction,
   * doing the computation in-place.
   * These predictions are also called class conditional probabilities.
   * <p>
   * This internal method is used to implement {@link transform()} and output {@link probabilityCol}.
   * <p>
   * @return Estimated class conditional probabilities (modified input vector)
   * @param rawPrediction (undocumented)
   */
  protected abstract  org.apache.spark.mllib.linalg.Vector raw2probabilityInPlace (org.apache.spark.mllib.linalg.Vector rawPrediction) ;
  /** Non-in-place version of {@link raw2probabilityInPlace()} */
  protected  org.apache.spark.mllib.linalg.Vector raw2probability (org.apache.spark.mllib.linalg.Vector rawPrediction) { throw new RuntimeException(); }
  protected  double raw2prediction (org.apache.spark.mllib.linalg.Vector rawPrediction) { throw new RuntimeException(); }
  /**
   * Predict the probability of each class given the features.
   * These predictions are also called class conditional probabilities.
   * <p>
   * This internal method is used to implement {@link transform()} and output {@link probabilityCol}.
   * <p>
   * @return Estimated class conditional probabilities
   * @param features (undocumented)
   */
  protected  org.apache.spark.mllib.linalg.Vector predictProbability (FeaturesType features) { throw new RuntimeException(); }
  /**
   * Given a vector of class conditional probabilities, select the predicted label.
   * This supports thresholds which favor particular labels.
   * @return  predicted label
   * @param probability (undocumented)
   */
  protected  double probability2prediction (org.apache.spark.mllib.linalg.Vector probability) { throw new RuntimeException(); }
}

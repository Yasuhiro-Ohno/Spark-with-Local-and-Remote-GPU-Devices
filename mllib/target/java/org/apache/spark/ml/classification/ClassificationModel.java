package org.apache.spark.ml.classification;
/**
 * :: DeveloperApi ::
 * <p>
 * Model produced by a {@link Classifier}.
 * Classes are indexed {0, 1, ..., numClasses - 1}.
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., {@link Vector}
 * @tparam M  Concrete Model type
 */
public abstract class ClassificationModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.PredictionModel<FeaturesType, M> implements org.apache.spark.ml.classification.ClassifierParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ClassificationModel), List(TypeTree().setOriginal(Ident(newTypeName("FeaturesType"))), TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  public   ClassificationModel () { throw new RuntimeException(); }
  /** @group setParam */
  public  M setRawPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  /** Number of classes (values which the label can take). */
  public abstract  int numClasses () ;
  /**
   * Transforms dataset by reading from {@link featuresCol}, and appending new columns as specified by
   * parameters:
   *  - predicted labels as {@link predictionCol} of type {@link Double}
   *  - raw predictions (confidences) as {@link rawPredictionCol} of type {@link Vector}.
   * <p>
   * @param dataset input dataset
   * @return transformed dataset
   */
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  /**
   * Predict label for the given features.
   * This internal method is used to implement {@link transform()} and output {@link predictionCol}.
   * <p>
   * This default implementation for classification predicts the index of the maximum value
   * from {@link predictRaw()}.
   * @param features (undocumented)
   * @return (undocumented)
   */
  protected  double predict (FeaturesType features) { throw new RuntimeException(); }
  /**
   * Raw prediction for each possible label.
   * The meaning of a "raw" prediction may vary between algorithms, but it intuitively gives
   * a measure of confidence in each possible label (where larger = more confident).
   * This internal method is used to implement {@link transform()} and output {@link rawPredictionCol}.
   * <p>
   * @return  vector where element i is the raw prediction for label i.
   *          This raw prediction may be any real number, where a larger value indicates greater
   *          confidence for that label.
   * @param features (undocumented)
   */
  protected abstract  org.apache.spark.mllib.linalg.Vector predictRaw (FeaturesType features) ;
  /**
   * Given a vector of raw predictions, select the predicted label.
   * This may be overridden to support thresholds which favor particular labels.
   * @return  predicted label
   * @param rawPrediction (undocumented)
   */
  protected  double raw2prediction (org.apache.spark.mllib.linalg.Vector rawPrediction) { throw new RuntimeException(); }
}

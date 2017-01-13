package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * <p>
 * Reduction of Multiclass Classification to Binary Classification.
 * Performs reduction using one against all strategy.
 * For a multiclass classification with k classes, train k models (one per class).
 * Each example is scored against all k models and the model with highest score
 * is picked to label the example.
 */
public final class OneVsRest extends org.apache.spark.ml.Estimator<org.apache.spark.ml.classification.OneVsRestModel> implements org.apache.spark.ml.classification.OneVsRestParams {
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   OneVsRest (java.lang.String uid) { throw new RuntimeException(); }
  public   OneVsRest () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setClassifier (org.apache.spark.ml.classification.Classifier<?, ?, ?> value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRest setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.OneVsRestModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.OneVsRest copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

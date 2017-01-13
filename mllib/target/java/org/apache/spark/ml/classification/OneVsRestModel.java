package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Model produced by {@link OneVsRest}.
 * This stores the models resulting from training k binary classifiers: one for each class.
 * Each example is scored against all k models, and the model with the highest score
 * is picked to label the example.
 * <p>
 * param:  labelMetadata Metadata of label column if it exists, or Nominal attribute
 *                      representing the number of classes in training dataset otherwise.
 * param:  models The binary classification models for the reduction.
 *               The i-th model is produced by testing the i-th class (taking label 1) vs the rest
 *               (taking label 0).
 */
public final class OneVsRestModel extends org.apache.spark.ml.Model<org.apache.spark.ml.classification.OneVsRestModel> implements org.apache.spark.ml.classification.OneVsRestParams {
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  Object models () { throw new RuntimeException(); }
  // not preceding
     OneVsRestModel (java.lang.String uid, org.apache.spark.sql.types.Metadata labelMetadata, org.apache.spark.ml.classification.ClassificationModel[] models) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.OneVsRestModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

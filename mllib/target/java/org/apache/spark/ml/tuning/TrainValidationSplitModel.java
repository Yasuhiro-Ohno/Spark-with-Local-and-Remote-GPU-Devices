package org.apache.spark.ml.tuning;
/**
 * :: Experimental ::
 * Model from train validation split.
 * <p>
 * param:  uid Id.
 * param:  bestModel Estimator determined best model.
 * param:  validationMetrics Evaluated validation metrics.
 */
public  class TrainValidationSplitModel extends org.apache.spark.ml.Model<org.apache.spark.ml.tuning.TrainValidationSplitModel> implements org.apache.spark.ml.tuning.TrainValidationSplitParams {
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  Object bestModel () { throw new RuntimeException(); }
  public  double[] validationMetrics () { throw new RuntimeException(); }
  // not preceding
     TrainValidationSplitModel (java.lang.String uid, org.apache.spark.ml.Model<?> bestModel, double[] validationMetrics) { throw new RuntimeException(); }
  public  void validateParams () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

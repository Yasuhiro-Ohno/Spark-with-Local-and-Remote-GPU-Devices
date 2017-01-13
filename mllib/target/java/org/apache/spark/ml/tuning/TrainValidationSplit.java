package org.apache.spark.ml.tuning;
/**
 * :: Experimental ::
 * Validation for hyper-parameter tuning.
 * Randomly splits the input dataset into train and validation sets,
 * and uses evaluation metric on the validation set to select the best model.
 * Similar to {@link CrossValidator}, but only splits the set once.
 */
public  class TrainValidationSplit extends org.apache.spark.ml.Estimator<org.apache.spark.ml.tuning.TrainValidationSplitModel> implements org.apache.spark.ml.tuning.TrainValidationSplitParams, org.apache.spark.Logging {
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   TrainValidationSplit (java.lang.String uid) { throw new RuntimeException(); }
  public   TrainValidationSplit () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEstimator (org.apache.spark.ml.Estimator<?> value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEstimatorParamMaps (org.apache.spark.ml.param.ParamMap[] value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEvaluator (org.apache.spark.ml.evaluation.Evaluator value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setTrainRatio (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  void validateParams () { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplit copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

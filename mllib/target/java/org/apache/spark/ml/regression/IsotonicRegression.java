package org.apache.spark.ml.regression;
public  class IsotonicRegression extends org.apache.spark.ml.Estimator<org.apache.spark.ml.regression.IsotonicRegressionModel> implements org.apache.spark.ml.regression.IsotonicRegressionBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.regression.IsotonicRegression load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public   IsotonicRegression (java.lang.String uid) { throw new RuntimeException(); }
  public   IsotonicRegression () { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.IsotonicRegression setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setIsotonic (boolean value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setWeightCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegression setFeatureIndex (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.IsotonicRegression copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.IsotonicRegressionModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
}

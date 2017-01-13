package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Chi-Squared feature selection, which selects categorical features to use for predicting a
 * categorical label.
 */
public final class ChiSqSelector extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.ChiSqSelectorModel> implements org.apache.spark.ml.feature.ChiSqSelectorParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.ChiSqSelector load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   ChiSqSelector (java.lang.String uid) { throw new RuntimeException(); }
  public   ChiSqSelector () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setNumTopFeatures (int value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelector setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelectorModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelector copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

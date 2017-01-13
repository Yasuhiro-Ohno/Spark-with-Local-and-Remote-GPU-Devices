package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Standardizes features by removing the mean and scaling to unit variance using column summary
 * statistics on the samples in the training set.
 */
public  class StandardScaler extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.StandardScalerModel> implements org.apache.spark.ml.feature.StandardScalerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.StandardScaler load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   StandardScaler (java.lang.String uid) { throw new RuntimeException(); }
  public   StandardScaler () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScaler setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScaler setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScaler setWithMean (boolean value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StandardScaler setWithStd (boolean value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScaler copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

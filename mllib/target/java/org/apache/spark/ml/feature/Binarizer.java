package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Binarize a column of continuous features given a threshold.
 */
public final class Binarizer extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.Binarizer load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   Binarizer (java.lang.String uid) { throw new RuntimeException(); }
  public   Binarizer () { throw new RuntimeException(); }
  /**
   * Param for threshold used to binarize continuous features.
   * The features greater than the threshold, will be binarized to 1.0.
   * The features equal to or less than the threshold, will be binarized to 0.0.
   * Default: 0.0
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam threshold () { throw new RuntimeException(); }
  /** @group getParam */
  public  double getThreshold () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setThreshold (double value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Binarizer setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Binarizer copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

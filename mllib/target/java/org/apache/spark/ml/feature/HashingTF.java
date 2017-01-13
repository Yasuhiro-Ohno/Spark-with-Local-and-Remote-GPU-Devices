package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Maps a sequence of terms to their term frequencies using the hashing trick.
 */
public  class HashingTF extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.HashingTF load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   HashingTF (java.lang.String uid) { throw new RuntimeException(); }
  public   HashingTF () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.HashingTF setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.HashingTF setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /**
   * Number of features.  Should be > 0.
   * (default = 2^18^)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numFeatures () { throw new RuntimeException(); }
  /** @group getParam */
  public  int getNumFeatures () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.HashingTF setNumFeatures (int value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.HashingTF copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

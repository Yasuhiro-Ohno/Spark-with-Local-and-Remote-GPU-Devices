package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * <code>Bucketizer</code> maps a column of continuous features to a column of feature buckets.
 */
public final class Bucketizer extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.Bucketizer> implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  /** We require splits to be of length >= 3 and to be in strictly increasing order. */
  static   boolean checkSplits (double[] splits) { throw new RuntimeException(); }
  /**
   * Binary searching in several buckets to place each data point.
   * @throws SparkException if a feature is < splits.head or > splits.last
   * @param splits (undocumented)
   * @param feature (undocumented)
   * @return (undocumented)
   */
  static   double binarySearchForBuckets (double[] splits, double feature) { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Bucketizer load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   Bucketizer (java.lang.String uid) { throw new RuntimeException(); }
  public   Bucketizer () { throw new RuntimeException(); }
  /**
   * Parameter for mapping continuous features into buckets. With n+1 splits, there are n buckets.
   * A bucket defined by splits x,y holds values in the range [x,y) except the last bucket, which
   * also includes y. Splits should be strictly increasing.
   * Values at -inf, inf must be explicitly provided to cover all Double values;
   * otherwise, values outside the splits specified will be treated as errors.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleArrayParam splits () { throw new RuntimeException(); }
  /** @group getParam */
  public  double[] getSplits () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setSplits (double[] value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Bucketizer setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructField prepOutputField (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Bucketizer copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

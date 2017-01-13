package org.apache.spark.ml.feature;
// no position
public  class Bucketizer$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.Bucketizer>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Bucketizer$ MODULE$ = null;
  public   Bucketizer$ () { throw new RuntimeException(); }
  /** We require splits to be of length >= 3 and to be in strictly increasing order. */
    boolean checkSplits (double[] splits) { throw new RuntimeException(); }
  /**
   * Binary searching in several buckets to place each data point.
   * @throws SparkException if a feature is < splits.head or > splits.last
   * @param splits (undocumented)
   * @param feature (undocumented)
   * @return (undocumented)
   */
    double binarySearchForBuckets (double[] splits, double feature) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Bucketizer load (java.lang.String path) { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * <code>QuantileDiscretizer</code> takes a column with continuous features and outputs a column with binned
 * categorical features. The bin ranges are chosen by taking a sample of the data and dividing it
 * into roughly equal parts. The lower and upper bin bounds will be -Infinity and +Infinity,
 * covering all real values. This attempts to find numBuckets partitions based on a sample of data,
 * but it may find fewer depending on the data sample values.
 */
public final class QuantileDiscretizer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.Bucketizer> implements org.apache.spark.ml.feature.QuantileDiscretizerBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static   org.apache.spark.sql.Row[] getSampledInput (org.apache.spark.sql.DataFrame dataset, int numBins) { throw new RuntimeException(); }
  static   double[] findSplitCandidates (double[] samples, int numSplits) { throw new RuntimeException(); }
  /**
   * Adjust split candidates to proper splits by: adding positive/negative infinity to both sides as
   * needed, and adding a default split value of 0 if no good candidates are found.
   * @param candidates (undocumented)
   * @return (undocumented)
   */
  static   double[] getSplits (double[] candidates) { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.QuantileDiscretizer load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   QuantileDiscretizer (java.lang.String uid) { throw new RuntimeException(); }
  public   QuantileDiscretizer () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.QuantileDiscretizer setNumBuckets (int value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.QuantileDiscretizer setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.QuantileDiscretizer setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Bucketizer fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.QuantileDiscretizer copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

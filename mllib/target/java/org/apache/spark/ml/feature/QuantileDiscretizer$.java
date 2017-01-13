package org.apache.spark.ml.feature;
// no position
public  class QuantileDiscretizer$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.QuantileDiscretizer>, org.apache.spark.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final QuantileDiscretizer$ MODULE$ = null;
  public   QuantileDiscretizer$ () { throw new RuntimeException(); }
    org.apache.spark.sql.Row[] getSampledInput (org.apache.spark.sql.DataFrame dataset, int numBins) { throw new RuntimeException(); }
    double[] findSplitCandidates (double[] samples, int numSplits) { throw new RuntimeException(); }
  /**
   * Adjust split candidates to proper splits by: adding positive/negative infinity to both sides as
   * needed, and adding a default split value of 0 if no good candidates are found.
   * @param candidates (undocumented)
   * @return (undocumented)
   */
    double[] getSplits (double[] candidates) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.QuantileDiscretizer load (java.lang.String path) { throw new RuntimeException(); }
}

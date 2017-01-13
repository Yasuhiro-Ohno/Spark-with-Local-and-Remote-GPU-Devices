package org.apache.spark.ml.tree;
/**
 * :: DeveloperApi ::
 * Split which tests a continuous feature.
 * param:  featureIndex  Index of the feature to test
 * param:  threshold  If the feature value is <= this threshold, then the split goes left.
 *                    Otherwise, it goes right.
 */
public final class ContinuousSplit implements org.apache.spark.ml.tree.Split {
  public  int featureIndex () { throw new RuntimeException(); }
  public  double threshold () { throw new RuntimeException(); }
  // not preceding
     ContinuousSplit (int featureIndex, double threshold) { throw new RuntimeException(); }
    boolean shouldGoLeft (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
    boolean shouldGoLeft (int binnedFeature, org.apache.spark.ml.tree.Split[] splits) { throw new RuntimeException(); }
  public  boolean equals (Object o) { throw new RuntimeException(); }
    org.apache.spark.mllib.tree.model.Split toOld () { throw new RuntimeException(); }
}

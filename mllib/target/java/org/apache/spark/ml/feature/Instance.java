package org.apache.spark.ml.feature;
/**
 * Class that represents an instance of weighted data point with label and features.
 * <p>
 * param:  label Label for this data point.
 * param:  weight The weight of this instance.
 * param:  features The vector of features for this data point.
 */
  class Instance implements scala.Product, scala.Serializable {
  public  double label () { throw new RuntimeException(); }
  public  double weight () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector features () { throw new RuntimeException(); }
  // not preceding
  public   Instance (double label, double weight, org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
}

package org.apache.spark.ml.ann;
// no position
/**
 * Fabric for feed forward ANN models
 */
  class FeedForwardModel$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FeedForwardModel$ MODULE$ = null;
  public   FeedForwardModel$ () { throw new RuntimeException(); }
  /**
   * Creates a model from a topology and weights
   * @param topology topology
   * @param weights weights
   * @return model
   */
  public  org.apache.spark.ml.ann.FeedForwardModel apply (org.apache.spark.ml.ann.FeedForwardTopology topology, org.apache.spark.mllib.linalg.Vector weights) { throw new RuntimeException(); }
  /**
   * Creates a model given a topology and seed
   * @param topology topology
   * @param seed seed for generating the weights
   * @return model
   */
  public  org.apache.spark.ml.ann.FeedForwardModel apply (org.apache.spark.ml.ann.FeedForwardTopology topology, long seed) { throw new RuntimeException(); }
}

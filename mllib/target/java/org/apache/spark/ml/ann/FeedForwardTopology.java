package org.apache.spark.ml.ann;
/**
 * Feed forward ANN
 * param:  layers
 */
  class FeedForwardTopology implements org.apache.spark.ml.ann.Topology {
  /**
   * Creates a feed forward topology from the array of layers
   * @param layers array of layers
   * @return feed forward topology
   */
  static public  org.apache.spark.ml.ann.FeedForwardTopology apply (org.apache.spark.ml.ann.Layer[] layers) { throw new RuntimeException(); }
  /**
   * Creates a multi-layer perceptron
   * @param layerSizes sizes of layers including input and output size
   * @param softmax wether to use SoftMax or Sigmoid function for an output layer.
   *                Softmax is default
   * @return multilayer perceptron topology
   */
  static public  org.apache.spark.ml.ann.FeedForwardTopology multiLayerPerceptron (int[] layerSizes, boolean softmax) { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.Layer[] layers () { throw new RuntimeException(); }
  // not preceding
  private   FeedForwardTopology (org.apache.spark.ml.ann.Layer[] layers) { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.TopologyModel getInstance (org.apache.spark.mllib.linalg.Vector weights) { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.TopologyModel getInstance (long seed) { throw new RuntimeException(); }
}

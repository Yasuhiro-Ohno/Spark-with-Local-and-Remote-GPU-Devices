package org.apache.spark.ml.ann;
/**
 * Neural network gradient. Does nothing but calling Model's gradient
 * param:  topology topology
 * param:  dataStacker data stacker
 */
  class ANNGradient extends org.apache.spark.mllib.optimization.Gradient {
  public   ANNGradient (org.apache.spark.ml.ann.Topology topology, org.apache.spark.ml.ann.DataStacker dataStacker) { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights) { throw new RuntimeException(); }
  public  double compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights, org.apache.spark.mllib.linalg.Vector cumGradient) { throw new RuntimeException(); }
}

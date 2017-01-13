package org.apache.spark.ml.ann;
/**
 * Functional layer properties, y = f(x)
 * param:  activationFunction activation function
 */
  class FunctionalLayer implements org.apache.spark.ml.ann.Layer {
  public  org.apache.spark.ml.ann.ActivationFunction activationFunction () { throw new RuntimeException(); }
  // not preceding
  public   FunctionalLayer (org.apache.spark.ml.ann.ActivationFunction activationFunction) { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel getInstance (org.apache.spark.mllib.linalg.Vector weights, int position) { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel getInstance (long seed) { throw new RuntimeException(); }
}

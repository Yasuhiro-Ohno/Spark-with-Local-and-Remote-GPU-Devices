package org.apache.spark.ml.ann;
/**
 * Layer properties of affine transformations, that is y=A*x+b
 * param:  numIn number of inputs
 * param:  numOut number of outputs
 */
  class AffineLayer implements org.apache.spark.ml.ann.Layer {
  public  int numIn () { throw new RuntimeException(); }
  public  int numOut () { throw new RuntimeException(); }
  // not preceding
  public   AffineLayer (int numIn, int numOut) { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel getInstance (org.apache.spark.mllib.linalg.Vector weights, int position) { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel getInstance (long seed) { throw new RuntimeException(); }
}

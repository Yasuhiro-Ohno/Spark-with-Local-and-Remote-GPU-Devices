package org.apache.spark.ml.ann;
// no position
/**
 * Fabric for Affine layer models
 */
  class AffineLayerModel$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AffineLayerModel$ MODULE$ = null;
  public   AffineLayerModel$ () { throw new RuntimeException(); }
  /**
   * Creates a model of Affine layer
   * @param layer layer properties
   * @param weights vector with weights
   * @param position position of weights in the vector
   * @return model of Affine layer
   */
  public  org.apache.spark.ml.ann.AffineLayerModel apply (org.apache.spark.ml.ann.AffineLayer layer, org.apache.spark.mllib.linalg.Vector weights, int position) { throw new RuntimeException(); }
  /**
   * Creates a model of Affine layer
   * @param layer layer properties
   * @param seed seed
   * @return model of Affine layer
   */
  public  org.apache.spark.ml.ann.AffineLayerModel apply (org.apache.spark.ml.ann.AffineLayer layer, long seed) { throw new RuntimeException(); }
  /**
   * Unrolls the weights from the vector
   * @param weights vector with weights
   * @param position position of weights for this layer
   * @param numIn number of layer inputs
   * @param numOut number of layer outputs
   * @return matrix A and vector b
   */
  public  scala.Tuple2<breeze.linalg.DenseMatrix<java.lang.Object>, breeze.linalg.DenseVector<java.lang.Object>> unroll (org.apache.spark.mllib.linalg.Vector weights, int position, int numIn, int numOut) { throw new RuntimeException(); }
  /**
   * Roll the layer weights into a vector
   * @param a matrix A
   * @param b vector b
   * @return vector of weights
   */
  public  org.apache.spark.mllib.linalg.Vector roll (breeze.linalg.DenseMatrix<java.lang.Object> a, breeze.linalg.DenseVector<java.lang.Object> b) { throw new RuntimeException(); }
  /**
   * Generate random weights for the layer
   * @param numIn number of inputs
   * @param numOut number of outputs
   * @param seed seed
   * @return (matrix A, vector b)
   */
  public  scala.Tuple2<breeze.linalg.DenseMatrix<java.lang.Object>, breeze.linalg.DenseVector<java.lang.Object>> randomWeights (int numIn, int numOut, long seed) { throw new RuntimeException(); }
}

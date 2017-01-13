package org.apache.spark.ml.ann;
/**
 * Model of Affine layer y=A*x+b
 * param:  w weights (matrix A)
 * param:  b bias (vector b)
 */
  class AffineLayerModel implements org.apache.spark.ml.ann.LayerModel {
  /**
   * Creates a model of Affine layer
   * @param layer layer properties
   * @param weights vector with weights
   * @param position position of weights in the vector
   * @return model of Affine layer
   */
  static public  org.apache.spark.ml.ann.AffineLayerModel apply (org.apache.spark.ml.ann.AffineLayer layer, org.apache.spark.mllib.linalg.Vector weights, int position) { throw new RuntimeException(); }
  /**
   * Creates a model of Affine layer
   * @param layer layer properties
   * @param seed seed
   * @return model of Affine layer
   */
  static public  org.apache.spark.ml.ann.AffineLayerModel apply (org.apache.spark.ml.ann.AffineLayer layer, long seed) { throw new RuntimeException(); }
  /**
   * Unrolls the weights from the vector
   * @param weights vector with weights
   * @param position position of weights for this layer
   * @param numIn number of layer inputs
   * @param numOut number of layer outputs
   * @return matrix A and vector b
   */
  static public  scala.Tuple2<breeze.linalg.DenseMatrix<java.lang.Object>, breeze.linalg.DenseVector<java.lang.Object>> unroll (org.apache.spark.mllib.linalg.Vector weights, int position, int numIn, int numOut) { throw new RuntimeException(); }
  /**
   * Roll the layer weights into a vector
   * @param a matrix A
   * @param b vector b
   * @return vector of weights
   */
  static public  org.apache.spark.mllib.linalg.Vector roll (breeze.linalg.DenseMatrix<java.lang.Object> a, breeze.linalg.DenseVector<java.lang.Object> b) { throw new RuntimeException(); }
  /**
   * Generate random weights for the layer
   * @param numIn number of inputs
   * @param numOut number of outputs
   * @param seed seed
   * @return (matrix A, vector b)
   */
  static public  scala.Tuple2<breeze.linalg.DenseMatrix<java.lang.Object>, breeze.linalg.DenseVector<java.lang.Object>> randomWeights (int numIn, int numOut, long seed) { throw new RuntimeException(); }
  private   AffineLayerModel (breeze.linalg.DenseMatrix<java.lang.Object> w, breeze.linalg.DenseVector<java.lang.Object> b) { throw new RuntimeException(); }
  public  int size () { throw new RuntimeException(); }
  public  double[] gwb () { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object> gw () { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> gb () { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object> z () { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object> d () { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> ones () { throw new RuntimeException(); }
  public  breeze.linalg.DenseMatrix<java.lang.Object> eval (breeze.linalg.DenseMatrix<java.lang.Object> data) { throw new RuntimeException(); }
  public  breeze.linalg.DenseMatrix<java.lang.Object> prevDelta (breeze.linalg.DenseMatrix<java.lang.Object> nextDelta, breeze.linalg.DenseMatrix<java.lang.Object> input) { throw new RuntimeException(); }
  public  double[] grad (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> input) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector weights () { throw new RuntimeException(); }
}

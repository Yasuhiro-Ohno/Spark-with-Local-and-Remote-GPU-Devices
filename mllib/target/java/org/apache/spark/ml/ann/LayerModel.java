package org.apache.spark.ml.ann;
/**
 * Trait that holds Layer weights (or parameters).
 * Implements functions needed for forward propagation, computing delta and gradient.
 * Can return weights in Vector format.
 */
  interface LayerModel extends scala.Serializable {
  /**
   * number of weights
   * @return (undocumented)
   */
  public  int size () ;
  /**
   * Evaluates the data (process the data through the layer)
   * @param data data
   * @return processed data
   */
  public  breeze.linalg.DenseMatrix<java.lang.Object> eval (breeze.linalg.DenseMatrix<java.lang.Object> data) ;
  /**
   * Computes the delta for back propagation
   * @param nextDelta delta of the next layer
   * @param input input data
   * @return delta
   */
  public  breeze.linalg.DenseMatrix<java.lang.Object> prevDelta (breeze.linalg.DenseMatrix<java.lang.Object> nextDelta, breeze.linalg.DenseMatrix<java.lang.Object> input) ;
  /**
   * Computes the gradient
   * @param delta delta for this layer
   * @param input input data
   * @return gradient
   */
  public  double[] grad (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> input) ;
  /**
   * Returns weights for the layer in a single vector
   * @return layer weights
   */
  public  org.apache.spark.mllib.linalg.Vector weights () ;
}

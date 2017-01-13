package org.apache.spark.ml.ann;
/**
 * Trait for functions and their derivatives for functional layers
 */
  interface ActivationFunction extends scala.Serializable {
  /**
   * Implements a function
   * @param x input data
   * @param y output data
   */
  public  void eval (breeze.linalg.DenseMatrix<java.lang.Object> x, breeze.linalg.DenseMatrix<java.lang.Object> y) ;
  /**
   * Implements a derivative of a function (needed for the back propagation)
   * @param x input data
   * @param y output data
   */
  public  void derivative (breeze.linalg.DenseMatrix<java.lang.Object> x, breeze.linalg.DenseMatrix<java.lang.Object> y) ;
  /**
   * Implements a cross entropy error of a function.
   * Needed if the functional layer that contains this function is the output layer
   * of the network.
   * @param target target output
   * @param output computed output
   * @param result intermediate result
   * @return cross-entropy
   */
  public  double crossEntropy (breeze.linalg.DenseMatrix<java.lang.Object> target, breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> result) ;
  /**
   * Implements a mean squared error of a function
   * @param target target output
   * @param output computed output
   * @param result intermediate result
   * @return mean squared error
   */
  public  double squared (breeze.linalg.DenseMatrix<java.lang.Object> target, breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> result) ;
}

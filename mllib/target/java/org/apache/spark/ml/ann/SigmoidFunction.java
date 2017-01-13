package org.apache.spark.ml.ann;
/**
 * Implements Sigmoid activation function
 */
  class SigmoidFunction implements org.apache.spark.ml.ann.ActivationFunction {
  public   SigmoidFunction () { throw new RuntimeException(); }
  public  void eval (breeze.linalg.DenseMatrix<java.lang.Object> x, breeze.linalg.DenseMatrix<java.lang.Object> y) { throw new RuntimeException(); }
  public  double crossEntropy (breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> target, breeze.linalg.DenseMatrix<java.lang.Object> result) { throw new RuntimeException(); }
  public  void derivative (breeze.linalg.DenseMatrix<java.lang.Object> x, breeze.linalg.DenseMatrix<java.lang.Object> y) { throw new RuntimeException(); }
  public  double squared (breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> target, breeze.linalg.DenseMatrix<java.lang.Object> result) { throw new RuntimeException(); }
}

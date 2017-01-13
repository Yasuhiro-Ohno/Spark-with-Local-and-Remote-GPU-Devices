package org.apache.spark.ml.ann;
// no position
/**
 * In-place DGEMM and DGEMV for Breeze
 */
  class BreezeUtil$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BreezeUtil$ MODULE$ = null;
  public   BreezeUtil$ () { throw new RuntimeException(); }
  private  java.lang.String transposeString (breeze.linalg.DenseMatrix<java.lang.Object> a) { throw new RuntimeException(); }
  /**
   * DGEMM: C := alpha * A * B + beta * C
   * @param alpha alpha
   * @param a A
   * @param b B
   * @param beta beta
   * @param c C
   */
  public  void dgemm (double alpha, breeze.linalg.DenseMatrix<java.lang.Object> a, breeze.linalg.DenseMatrix<java.lang.Object> b, double beta, breeze.linalg.DenseMatrix<java.lang.Object> c) { throw new RuntimeException(); }
  /**
   * DGEMV: y := alpha * A * x + beta * y
   * @param alpha alpha
   * @param a A
   * @param x x
   * @param beta beta
   * @param y y
   */
  public  void dgemv (double alpha, breeze.linalg.DenseMatrix<java.lang.Object> a, breeze.linalg.DenseVector<java.lang.Object> x, double beta, breeze.linalg.DenseVector<java.lang.Object> y) { throw new RuntimeException(); }
}

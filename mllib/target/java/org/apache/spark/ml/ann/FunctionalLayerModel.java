package org.apache.spark.ml.ann;
/**
 * Functional layer model. Holds no weights.
 * param:  activationFunction activation function
 */
  class FunctionalLayerModel implements org.apache.spark.ml.ann.LayerModel {
  static public  org.apache.spark.ml.ann.FunctionalLayerModel apply (org.apache.spark.ml.ann.FunctionalLayer layer) { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.ActivationFunction activationFunction () { throw new RuntimeException(); }
  // not preceding
  private   FunctionalLayerModel (org.apache.spark.ml.ann.ActivationFunction activationFunction) { throw new RuntimeException(); }
  public  int size () { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object> f () { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object> d () { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object> e () { throw new RuntimeException(); }
  private  double[] dg () { throw new RuntimeException(); }
  public  breeze.linalg.DenseMatrix<java.lang.Object> eval (breeze.linalg.DenseMatrix<java.lang.Object> data) { throw new RuntimeException(); }
  public  breeze.linalg.DenseMatrix<java.lang.Object> prevDelta (breeze.linalg.DenseMatrix<java.lang.Object> nextDelta, breeze.linalg.DenseMatrix<java.lang.Object> input) { throw new RuntimeException(); }
  public  double[] grad (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> input) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector weights () { throw new RuntimeException(); }
  public  scala.Tuple2<breeze.linalg.DenseMatrix<java.lang.Object>, java.lang.Object> crossEntropy (breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> target) { throw new RuntimeException(); }
  public  scala.Tuple2<breeze.linalg.DenseMatrix<java.lang.Object>, java.lang.Object> squared (breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> target) { throw new RuntimeException(); }
  public  scala.Tuple2<breeze.linalg.DenseMatrix<java.lang.Object>, java.lang.Object> error (breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> target) { throw new RuntimeException(); }
}

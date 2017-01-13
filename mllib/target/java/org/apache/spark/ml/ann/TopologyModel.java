package org.apache.spark.ml.ann;
/**
 * Trait for ANN topology model
 */
  interface TopologyModel extends scala.Serializable {
  /**
   * Forward propagation
   * @param data input data
   * @return array of outputs for each of the layers
   */
  public  breeze.linalg.DenseMatrix<java.lang.Object>[] forward (breeze.linalg.DenseMatrix<java.lang.Object> data) ;
  /**
   * Prediction of the model
   * @param data input data
   * @return prediction
   */
  public  org.apache.spark.mllib.linalg.Vector predict (org.apache.spark.mllib.linalg.Vector data) ;
  /**
   * Computes gradient for the network
   * @param data input data
   * @param target target output
   * @param cumGradient cumulative gradient
   * @param blockSize block size
   * @return error
   */
  public  double computeGradient (breeze.linalg.DenseMatrix<java.lang.Object> data, breeze.linalg.DenseMatrix<java.lang.Object> target, org.apache.spark.mllib.linalg.Vector cumGradient, int blockSize) ;
  /**
   * Returns the weights of the ANN
   * @return weights
   */
  public  org.apache.spark.mllib.linalg.Vector weights () ;
}

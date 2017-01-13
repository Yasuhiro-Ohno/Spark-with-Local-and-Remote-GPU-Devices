package org.apache.spark.ml.ann;
/**
 * Trait that holds Layer properties, that are needed to instantiate it.
 * Implements Layer instantiation.
 * <p>
 */
  interface Layer extends scala.Serializable {
  /**
   * Returns the instance of the layer based on weights provided
   * @param weights vector with layer weights
   * @param position position of weights in the vector
   * @return the layer model
   */
  public  org.apache.spark.ml.ann.LayerModel getInstance (org.apache.spark.mllib.linalg.Vector weights, int position) ;
  /**
   * Returns the instance of the layer with random generated weights
   * @param seed seed
   * @return the layer model
   */
  public  org.apache.spark.ml.ann.LayerModel getInstance (long seed) ;
}

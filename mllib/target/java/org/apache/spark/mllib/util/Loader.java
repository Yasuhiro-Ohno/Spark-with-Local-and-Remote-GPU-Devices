package org.apache.spark.mllib.util;
/**
 * :: DeveloperApi ::
 * <p>
 * Trait for classes which can load models and transformers from files.
 * This should be inherited by an object paired with the model class.
 */
public  interface Loader<M extends org.apache.spark.mllib.util.Saveable> {
  /**
   * Load a model from the given path.
   * <p>
   * The model should have been saved by {@link Saveable.save}.
   * <p>
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  public  M load (org.apache.spark.SparkContext sc, java.lang.String path) ;
}

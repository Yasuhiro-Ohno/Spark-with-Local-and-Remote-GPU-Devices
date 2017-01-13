package org.apache.spark.mllib.feature;
/**
 * Maps a sequence of terms to their term frequencies using the hashing trick.
 * <p>
 * param:  numFeatures number of features (default: 2^20^)
 */
public  class HashingTF implements scala.Serializable {
  public  int numFeatures () { throw new RuntimeException(); }
  // not preceding
  public   HashingTF (int numFeatures) { throw new RuntimeException(); }
  /**
   */
  public   HashingTF () { throw new RuntimeException(); }
  /**
   * Returns the index of the input term.
   * @param term (undocumented)
   * @return (undocumented)
   */
  public  int indexOf (Object term) { throw new RuntimeException(); }
  /**
   * Transforms the input document into a sparse term frequency vector.
   * @param document (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector transform (scala.collection.Iterable<java.lang.Object> document) { throw new RuntimeException(); }
  /**
   * Transforms the input document into a sparse term frequency vector (Java version).
   * @param document (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector transform (java.lang.Iterable<?> document) { throw new RuntimeException(); }
  /**
   * Transforms the input document to term frequency vectors.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public <D extends scala.collection.Iterable<java.lang.Object>> org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.rdd.RDD<D> dataset) { throw new RuntimeException(); }
  /**
   * Transforms the input document to term frequency vectors (Java version).
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public <D extends java.lang.Iterable<?>> org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.api.java.JavaRDD<D> dataset) { throw new RuntimeException(); }
}

package org.apache.spark.mllib.clustering;
/**
 * Clustering model produced by {@link BisectingKMeans}.
 * The prediction is done level-by-level from the root node to a leaf node, and at each node among
 * its children the closest to the input point is selected.
 * <p>
 * param:  root the root node of the clustering tree
 */
public  class BisectingKMeansModel implements scala.Serializable, org.apache.spark.Logging {
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode root () { throw new RuntimeException(); }
  // not preceding
     BisectingKMeansModel (org.apache.spark.mllib.clustering.ClusteringTreeNode root) { throw new RuntimeException(); }
  /**
   * Leaf cluster centers.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector[] clusterCenters () { throw new RuntimeException(); }
  /**
   * Number of leaf clusters.
   * @return (undocumented)
   */
  public  int k () { throw new RuntimeException(); }
  /**
   * Predicts the index of the cluster that the input point belongs to.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  int predict (org.apache.spark.mllib.linalg.Vector point) { throw new RuntimeException(); }
  /**
   * Predicts the indices of the clusters that the input points belong to.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link predict()}.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Integer> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> points) { throw new RuntimeException(); }
  /**
   * Computes the squared distance between the input point and the cluster center it belongs to.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.mllib.linalg.Vector point) { throw new RuntimeException(); }
  /**
   * Computes the sum of squared distances between the input points and their corresponding cluster
   * centers.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link computeCost()}.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data) { throw new RuntimeException(); }
}

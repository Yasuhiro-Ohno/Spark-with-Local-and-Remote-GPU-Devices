package org.apache.spark.mllib.clustering;
  class ClusteringTreeNode implements scala.Serializable {
  public  int index () { throw new RuntimeException(); }
  public  long size () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.clustering.VectorWithNorm centerWithNorm () { throw new RuntimeException(); }
  public  double cost () { throw new RuntimeException(); }
  public  double height () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] children () { throw new RuntimeException(); }
     ClusteringTreeNode (int index, long size, org.apache.spark.mllib.clustering.VectorWithNorm centerWithNorm, double cost, double height, org.apache.spark.mllib.clustering.ClusteringTreeNode[] children) { throw new RuntimeException(); }
  public  boolean isLeaf () { throw new RuntimeException(); }
  /**
   * Returns all leaf nodes from this node.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector center () { throw new RuntimeException(); }
  public  int predict (org.apache.spark.mllib.linalg.Vector point) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] predictPath (org.apache.spark.mllib.linalg.Vector point) { throw new RuntimeException(); }
  private  scala.collection.immutable.List<org.apache.spark.mllib.clustering.ClusteringTreeNode> predictPath (org.apache.spark.mllib.clustering.VectorWithNorm pointWithNorm) { throw new RuntimeException(); }
  public  double computeCost (org.apache.spark.mllib.linalg.Vector point) { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.Object, java.lang.Object> predict (org.apache.spark.mllib.clustering.VectorWithNorm pointWithNorm) { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.Object, java.lang.Object> predict (org.apache.spark.mllib.clustering.VectorWithNorm pointWithNorm, double cost) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] leafNodes () { throw new RuntimeException(); }
}

package org.apache.spark.ml.tree.impl;
  class NodeIdCache implements org.apache.spark.Logging {
  static public  org.apache.spark.ml.tree.impl.NodeIdCache init (org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> data, int numTrees, int checkpointInterval, int initVal) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<int[]> nodeIdsForInstances () { throw new RuntimeException(); }
  public  int checkpointInterval () { throw new RuntimeException(); }
  public   NodeIdCache (org.apache.spark.rdd.RDD<int[]> nodeIdsForInstances, int checkpointInterval) { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<int[]> prevNodeIdsForInstances () { throw new RuntimeException(); }
  private  scala.collection.mutable.Queue<org.apache.spark.rdd.RDD<int[]>> checkpointQueue () { throw new RuntimeException(); }
  private  int rddUpdateCount () { throw new RuntimeException(); }
  private  boolean canCheckpoint () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs () { throw new RuntimeException(); }
  public  void updateNodeIndices (org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> data, scala.collection.mutable.Map<java.lang.Object, org.apache.spark.ml.tree.impl.NodeIndexUpdater>[] nodeIdUpdaters, org.apache.spark.ml.tree.Split[][] splits) { throw new RuntimeException(); }
  public  void deleteAllCheckpoints () { throw new RuntimeException(); }
}

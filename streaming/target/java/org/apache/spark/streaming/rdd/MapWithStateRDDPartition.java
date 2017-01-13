package org.apache.spark.streaming.rdd;
/**
 * Partition of the {@link MapWithStateRDD}, which depends on corresponding partitions of prev state
 * RDD, and a partitioned keyed-data RDD
 */
  class MapWithStateRDDPartition implements org.apache.spark.Partition {
  private  Object prevStateRDD () { throw new RuntimeException(); }
  private  Object partitionedDataRDD () { throw new RuntimeException(); }
  // not preceding
  public   MapWithStateRDDPartition (int idx, org.apache.spark.rdd.RDD<?> prevStateRDD, org.apache.spark.rdd.RDD<?> partitionedDataRDD) { throw new RuntimeException(); }
  public  org.apache.spark.Partition previousSessionRDDPartition () { throw new RuntimeException(); }
  public  org.apache.spark.Partition partitionedDataRDDPartition () { throw new RuntimeException(); }
  public  int index () { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) { throw new RuntimeException(); }
}

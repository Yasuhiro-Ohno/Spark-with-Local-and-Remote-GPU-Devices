package org.apache.spark.streaming.scheduler;
  class DoCheckpoint implements org.apache.spark.streaming.scheduler.JobGeneratorEvent, scala.Product, scala.Serializable {
  public  org.apache.spark.streaming.Time time () { throw new RuntimeException(); }
  public  boolean clearCheckpointDataLater () { throw new RuntimeException(); }
  // not preceding
  public   DoCheckpoint (org.apache.spark.streaming.Time time, boolean clearCheckpointDataLater) { throw new RuntimeException(); }
}

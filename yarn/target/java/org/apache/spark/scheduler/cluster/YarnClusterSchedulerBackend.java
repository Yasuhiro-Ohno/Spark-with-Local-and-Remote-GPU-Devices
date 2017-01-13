package org.apache.spark.scheduler.cluster;
  class YarnClusterSchedulerBackend extends org.apache.spark.scheduler.cluster.YarnSchedulerBackend {
  // not preceding
  public   YarnClusterSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  java.lang.String applicationId () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> applicationAttemptId () { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> getDriverLogUrls () { throw new RuntimeException(); }
}

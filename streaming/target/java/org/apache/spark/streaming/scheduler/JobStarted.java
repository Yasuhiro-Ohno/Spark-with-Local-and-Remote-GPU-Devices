package org.apache.spark.streaming.scheduler;
  class JobStarted implements org.apache.spark.streaming.scheduler.JobSchedulerEvent, scala.Product, scala.Serializable {
  public  org.apache.spark.streaming.scheduler.Job job () { throw new RuntimeException(); }
  public  long startTime () { throw new RuntimeException(); }
  // not preceding
  public   JobStarted (org.apache.spark.streaming.scheduler.Job job, long startTime) { throw new RuntimeException(); }
}

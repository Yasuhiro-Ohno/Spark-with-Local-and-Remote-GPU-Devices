package org.apache.spark.streaming.scheduler;
  class JobCompleted implements org.apache.spark.streaming.scheduler.JobSchedulerEvent, scala.Product, scala.Serializable {
  public  org.apache.spark.streaming.scheduler.Job job () { throw new RuntimeException(); }
  public  long completedTime () { throw new RuntimeException(); }
  // not preceding
  public   JobCompleted (org.apache.spark.streaming.scheduler.Job job, long completedTime) { throw new RuntimeException(); }
}

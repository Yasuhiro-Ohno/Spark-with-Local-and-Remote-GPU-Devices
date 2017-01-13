package org.apache.spark.streaming.scheduler;
  class UpdateReceiverRateLimit implements org.apache.spark.streaming.scheduler.ReceiverTrackerLocalMessage, scala.Product, scala.Serializable {
  public  int streamUID () { throw new RuntimeException(); }
  public  long newRate () { throw new RuntimeException(); }
  // not preceding
  public   UpdateReceiverRateLimit (int streamUID, long newRate) { throw new RuntimeException(); }
}

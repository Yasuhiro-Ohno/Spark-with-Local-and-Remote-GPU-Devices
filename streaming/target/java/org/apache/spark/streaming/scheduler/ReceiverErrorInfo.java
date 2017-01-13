package org.apache.spark.streaming.scheduler;
  class ReceiverErrorInfo implements scala.Product, scala.Serializable {
  public  java.lang.String lastErrorMessage () { throw new RuntimeException(); }
  public  java.lang.String lastError () { throw new RuntimeException(); }
  public  long lastErrorTime () { throw new RuntimeException(); }
  // not preceding
  public   ReceiverErrorInfo (java.lang.String lastErrorMessage, java.lang.String lastError, long lastErrorTime) { throw new RuntimeException(); }
}

package org.apache.spark.streaming.api.java;
/**
 * Class having information about a receiver
 */
  class JavaReceiverInfo implements scala.Product, scala.Serializable {
  public  int streamId () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  boolean active () { throw new RuntimeException(); }
  public  java.lang.String location () { throw new RuntimeException(); }
  public  java.lang.String executorId () { throw new RuntimeException(); }
  public  java.lang.String lastErrorMessage () { throw new RuntimeException(); }
  public  java.lang.String lastError () { throw new RuntimeException(); }
  public  long lastErrorTime () { throw new RuntimeException(); }
  // not preceding
  public   JavaReceiverInfo (int streamId, java.lang.String name, boolean active, java.lang.String location, java.lang.String executorId, java.lang.String lastErrorMessage, java.lang.String lastError, long lastErrorTime) { throw new RuntimeException(); }
}

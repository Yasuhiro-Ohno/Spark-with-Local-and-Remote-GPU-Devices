package org.apache.spark.streaming.scheduler;
// no position
/**
 * This message will trigger ReceiverTrackerEndpoint to send stop signals to all registered
 * receivers.
 */
  class StopAllReceivers$ implements org.apache.spark.streaming.scheduler.ReceiverTrackerLocalMessage, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StopAllReceivers$ MODULE$ = null;
  public   StopAllReceivers$ () { throw new RuntimeException(); }
}

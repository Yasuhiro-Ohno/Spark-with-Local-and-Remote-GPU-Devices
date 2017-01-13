package org.apache.spark.streaming.scheduler;
// no position
/** Enumeration to identify current state of a Receiver */
  class ReceiverState extends scala.Enumeration {
  static public  scala.Enumeration.Value INACTIVE () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value SCHEDULED () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value ACTIVE () { throw new RuntimeException(); }
}

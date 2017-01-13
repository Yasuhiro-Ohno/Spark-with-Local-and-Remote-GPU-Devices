package org.apache.spark.streaming.flume;
// no position
/**
 * A simple object that provides the implementation of readExternal and writeExternal for both
 * the wrapper classes for Flume-style Events.
 */
  class EventTransformer implements org.apache.spark.Logging {
  static public  scala.Tuple2<java.util.HashMap<java.lang.CharSequence, java.lang.CharSequence>, byte[]> readExternal (java.io.ObjectInput in) { throw new RuntimeException(); }
  static public  void writeExternal (java.io.ObjectOutput out, java.util.Map<java.lang.CharSequence, java.lang.CharSequence> headers, byte[] body) { throw new RuntimeException(); }
}

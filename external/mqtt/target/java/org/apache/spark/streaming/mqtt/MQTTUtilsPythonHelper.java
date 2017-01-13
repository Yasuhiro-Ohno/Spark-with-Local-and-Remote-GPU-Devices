package org.apache.spark.streaming.mqtt;
/**
 * This is a helper class that wraps the methods in MQTTUtils into more Python-friendly class and
 * function so that it can be easily instantiated and called from Python's MQTTUtils.
 */
  class MQTTUtilsPythonHelper {
  public   MQTTUtilsPythonHelper () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.String> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String brokerUrl, java.lang.String topic, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
}

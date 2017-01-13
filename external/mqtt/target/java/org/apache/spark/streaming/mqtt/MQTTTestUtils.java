package org.apache.spark.streaming.mqtt;
/**
 * Share codes for Scala and Python unit tests
 */
  class MQTTTestUtils implements org.apache.spark.Logging {
  public   MQTTTestUtils () { throw new RuntimeException(); }
  private  java.io.File persistenceDir () { throw new RuntimeException(); }
  private  java.lang.String brokerHost () { throw new RuntimeException(); }
  private  int brokerPort () { throw new RuntimeException(); }
  private  org.apache.activemq.broker.BrokerService broker () { throw new RuntimeException(); }
  private  org.apache.activemq.broker.TransportConnector connector () { throw new RuntimeException(); }
  public  java.lang.String brokerUri () { throw new RuntimeException(); }
  public  void setup () { throw new RuntimeException(); }
  public  void teardown () { throw new RuntimeException(); }
  private  int findFreePort () { throw new RuntimeException(); }
  public  void publishData (java.lang.String topic, java.lang.String data) { throw new RuntimeException(); }
}

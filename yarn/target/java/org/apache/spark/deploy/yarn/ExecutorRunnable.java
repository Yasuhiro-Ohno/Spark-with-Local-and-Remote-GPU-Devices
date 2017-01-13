package org.apache.spark.deploy.yarn;
public  class ExecutorRunnable implements java.lang.Runnable, org.apache.spark.Logging {
  public   ExecutorRunnable (org.apache.hadoop.yarn.api.records.Container container, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf, java.lang.String masterAddress, java.lang.String slaveId, java.lang.String hostname, int executorMemory, int executorCores, java.lang.String appId, org.apache.spark.SecurityManager securityMgr) { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.ipc.YarnRPC rpc () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.client.api.NMClient nmClient () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env () { throw new RuntimeException(); }
  public  void run () { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.nio.ByteBuffer> startContainer () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.String> prepareCommand (java.lang.String masterAddress, java.lang.String slaveId, java.lang.String hostname, int executorMemory, int executorCores, java.lang.String appId, scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources) { throw new RuntimeException(); }
  private  void setupDistributedCache (java.lang.String file, org.apache.hadoop.yarn.api.records.LocalResourceType rtype, scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources, java.lang.String timestamp, java.lang.String size, java.lang.String vis) { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> prepareLocalResources () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> prepareEnvironment (org.apache.hadoop.yarn.api.records.Container container) { throw new RuntimeException(); }
}

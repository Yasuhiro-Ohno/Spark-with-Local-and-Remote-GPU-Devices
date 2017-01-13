package org.apache.spark.sql.hive.client;
  class Shim_v1_2 extends org.apache.spark.sql.hive.client.Shim_v1_1 {
  public   Shim_v1_2 () { throw new RuntimeException(); }
  private  java.lang.reflect.Method loadDynamicPartitionsMethod () { throw new RuntimeException(); }
  public  void loadDynamicPartitions (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, java.util.Map<java.lang.String, java.lang.String> partSpec, boolean replace, int numDP, boolean holdDDLTime, boolean listBucketingEnabled) { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive.client;
  class Shim_v0_12 extends org.apache.spark.sql.hive.client.Shim implements org.apache.spark.Logging {
  public   Shim_v0_12 () { throw new RuntimeException(); }
  private  java.lang.reflect.Method startMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getDataLocationMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method setDataLocationMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getAllPartitionsMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getCommandProcessorMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getDriverResultsMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method loadPartitionMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method loadTableMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method loadDynamicPartitionsMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method dropIndexMethod () { throw new RuntimeException(); }
  public  void setCurrentSessionState (org.apache.hadoop.hive.ql.session.SessionState state) { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getDataLocation (org.apache.hadoop.hive.ql.metadata.Table table) { throw new RuntimeException(); }
  public  void setDataLocation (org.apache.hadoop.hive.ql.metadata.Table table, java.lang.String loc) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> getAllPartitions (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.hive.ql.metadata.Table table) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> getPartitionsByFilter (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.hive.ql.metadata.Table table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates) { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.processors.CommandProcessor getCommandProcessor (java.lang.String token, org.apache.hadoop.hive.conf.HiveConf conf) { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getDriverResults (org.apache.hadoop.hive.ql.Driver driver) { throw new RuntimeException(); }
  public  long getMetastoreClientConnectRetryDelayMillis (org.apache.hadoop.hive.conf.HiveConf conf) { throw new RuntimeException(); }
  public  void loadPartition (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, java.util.Map<java.lang.String, java.lang.String> partSpec, boolean replace, boolean holdDDLTime, boolean inheritTableSpecs, boolean isSkewedStoreAsSubdir) { throw new RuntimeException(); }
  public  void loadTable (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, boolean replace, boolean holdDDLTime) { throw new RuntimeException(); }
  public  void loadDynamicPartitions (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, java.util.Map<java.lang.String, java.lang.String> partSpec, boolean replace, int numDP, boolean holdDDLTime, boolean listBucketingEnabled) { throw new RuntimeException(); }
  public  void dropIndex (org.apache.hadoop.hive.ql.metadata.Hive hive, java.lang.String dbName, java.lang.String tableName, java.lang.String indexName) { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive.client;
  class Shim_v0_13 extends org.apache.spark.sql.hive.client.Shim_v0_12 {
  public   Shim_v0_13 () { throw new RuntimeException(); }
  private  java.lang.reflect.Method setCurrentSessionStateMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method setDataLocationMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getAllPartitionsMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getPartitionsByFilterMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getCommandProcessorMethod () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getDriverResultsMethod () { throw new RuntimeException(); }
  public  void setCurrentSessionState (org.apache.hadoop.hive.ql.session.SessionState state) { throw new RuntimeException(); }
  public  void setDataLocation (org.apache.hadoop.hive.ql.metadata.Table table, java.lang.String loc) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> getAllPartitions (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.hive.ql.metadata.Table table) { throw new RuntimeException(); }
  /**
   * Converts catalyst expression to the format that Hive's getPartitionsByFilter() expects, i.e.
   * a string that represents partition predicates like "str_key=\"value\" and int_key=1 ...".
   * <p>
   * Unsupported predicates are skipped.
   * @param table (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String convertFilters (org.apache.hadoop.hive.ql.metadata.Table table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> getPartitionsByFilter (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.hive.ql.metadata.Table table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates) { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.processors.CommandProcessor getCommandProcessor (java.lang.String token, org.apache.hadoop.hive.conf.HiveConf conf) { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getDriverResults (org.apache.hadoop.hive.ql.Driver driver) { throw new RuntimeException(); }
}

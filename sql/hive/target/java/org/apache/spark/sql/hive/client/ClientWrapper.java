package org.apache.spark.sql.hive.client;
/**
 * A class that wraps the HiveClient and converts its responses to externally visible classes.
 * Note that this class is typically loaded with an internal classloader for each instantiation,
 * allowing it to interact directly with a specific isolated version of Hive.  Loading this class
 * with the isolated classloader however will result in it only being visible as a ClientInterface,
 * not a ClientWrapper.
 * <p>
 * This class needs to interact with multiple versions of Hive, but will always be compiled with
 * the 'native', execution version of Hive.  Therefore, any places where hive breaks compatibility
 * must use reflection after matching on <code>version</code>.
 * <p>
 * param:  version the version of hive used when pick function calls that are not compatible.
 * param:  config  a collection of configuration options that will be added to the hive conf before
 *                opening the hive client.
 * param:  initClassLoader the classloader used when creating the <code>state</code> field of
 *                        this ClientWrapper.
 */
  class ClientWrapper implements org.apache.spark.sql.hive.client.ClientInterface, org.apache.spark.Logging {
  public  org.apache.spark.sql.hive.client.HiveVersion version () { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.client.IsolatedClientLoader clientLoader () { throw new RuntimeException(); }
  // not preceding
  public   ClientWrapper (org.apache.spark.sql.hive.client.HiveVersion version, scala.collection.immutable.Map<java.lang.String, java.lang.String> config, java.lang.ClassLoader initClassLoader, org.apache.spark.sql.hive.client.IsolatedClientLoader clientLoader) { throw new RuntimeException(); }
  private  void overrideHadoopShims () { throw new RuntimeException(); }
  // not preceding
  private  void loadHadoop20SShims () { throw new RuntimeException(); }
  private  org.apache.spark.util.CircularBuffer outputBuffer () { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.client.Shim_v0_12 shim () { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.session.SessionState state () { throw new RuntimeException(); }
  /** Returns the configuration for the current session. */
  public  org.apache.hadoop.hive.conf.HiveConf conf () { throw new RuntimeException(); }
  public  java.lang.String getConf (java.lang.String key, java.lang.String defaultValue) { throw new RuntimeException(); }
  private  int retryLimit () { throw new RuntimeException(); }
  private  long retryDelayMillis () { throw new RuntimeException(); }
  /**
   * Runs <code>f</code> with multiple retries in case the hive metastore is temporarily unreachable.
   * @param f (undocumented)
   * @return (undocumented)
   */
  private <A extends java.lang.Object> A retryLocked (scala.Function0<A> f) { throw new RuntimeException(); }
  private  boolean causedByThrift (java.lang.Throwable e) { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.metadata.Hive client () { throw new RuntimeException(); }
  /**
   * Runs <code>f</code> with ThreadLocal session state and classloaders configured for this version of hive.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <A extends java.lang.Object> A withHiveState (scala.Function0<A> f) { throw new RuntimeException(); }
  public  void setOut (java.io.PrintStream stream) { throw new RuntimeException(); }
  public  void setInfo (java.io.PrintStream stream) { throw new RuntimeException(); }
  public  void setError (java.io.PrintStream stream) { throw new RuntimeException(); }
  public  java.lang.String currentDatabase () { throw new RuntimeException(); }
  public  void createDatabase (org.apache.spark.sql.hive.client.HiveDatabase database) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.hive.client.HiveDatabase> getDatabaseOption (java.lang.String name) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.hive.client.HiveTable> getTableOption (java.lang.String dbName, java.lang.String tableName) { throw new RuntimeException(); }
  private  java.lang.Class<? extends org.apache.hadoop.mapred.InputFormat<?, ?>> toInputFormat (java.lang.String name) { throw new RuntimeException(); }
  private  java.lang.Class<? extends org.apache.hadoop.hive.ql.io.HiveOutputFormat<?, ?>> toOutputFormat (java.lang.String name) { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.metadata.Table toQlTable (org.apache.spark.sql.hive.client.HiveTable table) { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.metadata.Table toViewTable (org.apache.spark.sql.hive.client.HiveTable view) { throw new RuntimeException(); }
  public  void createView (org.apache.spark.sql.hive.client.HiveTable view) { throw new RuntimeException(); }
  public  void alertView (org.apache.spark.sql.hive.client.HiveTable view) { throw new RuntimeException(); }
  public  void createTable (org.apache.spark.sql.hive.client.HiveTable table) { throw new RuntimeException(); }
  public  void alterTable (org.apache.spark.sql.hive.client.HiveTable table) { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.client.HivePartition toHivePartition (org.apache.hadoop.hive.ql.metadata.Partition partition) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.hive.client.HivePartition> getPartitionOption (org.apache.spark.sql.hive.client.HiveTable table, java.util.Map<java.lang.String, java.lang.String> partitionSpec) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HivePartition> getAllPartitions (org.apache.spark.sql.hive.client.HiveTable hTable) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HivePartition> getPartitionsByFilter (org.apache.spark.sql.hive.client.HiveTable hTable, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates) { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listTables (java.lang.String dbName) { throw new RuntimeException(); }
  /**
   * Runs the specified SQL query using Hive.
   * @param sql (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> runSqlHive (java.lang.String sql) { throw new RuntimeException(); }
  /**
   * Execute the command using Hive and return the results as a sequence. Each element
   * in the sequence is one row.
   * @param cmd (undocumented)
   * @param maxRows (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<java.lang.String> runHive (java.lang.String cmd, int maxRows) { throw new RuntimeException(); }
  public  void loadPartition (java.lang.String loadPath, java.lang.String tableName, java.util.LinkedHashMap<java.lang.String, java.lang.String> partSpec, boolean replace, boolean holdDDLTime, boolean inheritTableSpecs, boolean isSkewedStoreAsSubdir) { throw new RuntimeException(); }
  public  void loadTable (java.lang.String loadPath, java.lang.String tableName, boolean replace, boolean holdDDLTime) { throw new RuntimeException(); }
  public  void loadDynamicPartitions (java.lang.String loadPath, java.lang.String tableName, java.util.LinkedHashMap<java.lang.String, java.lang.String> partSpec, boolean replace, int numDP, boolean holdDDLTime, boolean listBucketingEnabled) { throw new RuntimeException(); }
  public  void addJar (java.lang.String path) { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.client.ClientWrapper newSession () { throw new RuntimeException(); }
  public  void reset () { throw new RuntimeException(); }
}

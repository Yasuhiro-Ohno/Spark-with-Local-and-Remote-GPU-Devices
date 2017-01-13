package org.apache.spark.sql.hive.client;
/**
 * An externally visible interface to the Hive client.  This interface is shared across both the
 * internal and external classloaders for a given version of Hive and thus must expose only
 * shared classes.
 */
  interface ClientInterface {
  /** Returns the Hive Version of this client. */
  public  org.apache.spark.sql.hive.client.HiveVersion version () ;
  /** Returns the configuration for the given key in the current session. */
  public  java.lang.String getConf (java.lang.String key, java.lang.String defaultValue) ;
  /**
   * Runs a HiveQL command using Hive, returning the results as a list of strings.  Each row will
   * result in one string.
   * @param sql (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> runSqlHive (java.lang.String sql) ;
  public  void setOut (java.io.PrintStream stream) ;
  public  void setInfo (java.io.PrintStream stream) ;
  public  void setError (java.io.PrintStream stream) ;
  /** Returns the names of all tables in the given database. */
  public  scala.collection.Seq<java.lang.String> listTables (java.lang.String dbName) ;
  /** Returns the name of the active database. */
  public  java.lang.String currentDatabase () ;
  /** Returns the metadata for specified database, throwing an exception if it doesn't exist */
  public  org.apache.spark.sql.hive.client.HiveDatabase getDatabase (java.lang.String name) ;
  /** Returns the metadata for a given database, or None if it doesn't exist. */
  public  scala.Option<org.apache.spark.sql.hive.client.HiveDatabase> getDatabaseOption (java.lang.String name) ;
  /** Returns the specified table, or throws {@link NoSuchTableException}. */
  public  org.apache.spark.sql.hive.client.HiveTable getTable (java.lang.String dbName, java.lang.String tableName) ;
  /** Returns the metadata for the specified table or None if it doens't exist. */
  public  scala.Option<org.apache.spark.sql.hive.client.HiveTable> getTableOption (java.lang.String dbName, java.lang.String tableName) ;
  /** Creates a view with the given metadata. */
  public  void createView (org.apache.spark.sql.hive.client.HiveTable view) ;
  /** Updates the given view with new metadata. */
  public  void alertView (org.apache.spark.sql.hive.client.HiveTable view) ;
  /** Creates a table with the given metadata. */
  public  void createTable (org.apache.spark.sql.hive.client.HiveTable table) ;
  /** Updates the given table with new metadata. */
  public  void alterTable (org.apache.spark.sql.hive.client.HiveTable table) ;
  /** Creates a new database with the given name. */
  public  void createDatabase (org.apache.spark.sql.hive.client.HiveDatabase database) ;
  /** Returns the specified paritition or None if it does not exist. */
  public  scala.Option<org.apache.spark.sql.hive.client.HivePartition> getPartitionOption (org.apache.spark.sql.hive.client.HiveTable hTable, java.util.Map<java.lang.String, java.lang.String> partitionSpec) ;
  /** Returns all partitions for the given table. */
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HivePartition> getAllPartitions (org.apache.spark.sql.hive.client.HiveTable hTable) ;
  /** Returns partitions filtered by predicates for the given table. */
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HivePartition> getPartitionsByFilter (org.apache.spark.sql.hive.client.HiveTable hTable, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates) ;
  /** Loads a static partition into an existing table. */
  public  void loadPartition (java.lang.String loadPath, java.lang.String tableName, java.util.LinkedHashMap<java.lang.String, java.lang.String> partSpec, boolean replace, boolean holdDDLTime, boolean inheritTableSpecs, boolean isSkewedStoreAsSubdir) ;
  /** Loads data into an existing table. */
  public  void loadTable (java.lang.String loadPath, java.lang.String tableName, boolean replace, boolean holdDDLTime) ;
  /** Loads new dynamic partitions into an existing table. */
  public  void loadDynamicPartitions (java.lang.String loadPath, java.lang.String tableName, java.util.LinkedHashMap<java.lang.String, java.lang.String> partSpec, boolean replace, int numDP, boolean holdDDLTime, boolean listBucketingEnabled) ;
  /** Add a jar into class loader */
  public  void addJar (java.lang.String path) ;
  /** Return a ClientInterface as new session, that will share the class loader and Hive client */
  public  org.apache.spark.sql.hive.client.ClientInterface newSession () ;
  /** Run a function within Hive state (SessionState, HiveConf, Hive client and class loader) */
  public <A extends java.lang.Object> A withHiveState (scala.Function0<A> f) ;
  /** Used for testing only.  Removes all metadata from this instance of Hive. */
  public  void reset () ;
}

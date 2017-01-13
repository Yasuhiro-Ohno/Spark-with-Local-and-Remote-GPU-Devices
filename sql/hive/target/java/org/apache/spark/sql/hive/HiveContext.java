package org.apache.spark.sql.hive;
/**
 * An instance of the Spark SQL execution engine that integrates with data stored in Hive.
 * Configuration for Hive is read from hive-site.xml on the classpath.
 * <p>
 * @since 1.0.0
 */
public  class HiveContext extends org.apache.spark.sql.SQLContext implements org.apache.spark.Logging {
  /** Extends QueryExecution with hive specific features. */
  protected  class QueryExecution extends org.apache.spark.sql.execution.QueryExecution {
    public   QueryExecution (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan) { throw new RuntimeException(); }
    /**
     * Returns the result as a hive compatible sequence of strings.  For native commands, the
     * execution is simply passed back to Hive.
     * @return (undocumented)
     */
    public  scala.collection.Seq<java.lang.String> stringResult () { throw new RuntimeException(); }
    public  java.lang.String simpleString () { throw new RuntimeException(); }
  }
  /** The version of hive used internally by Spark SQL. */
  static public  java.lang.String hiveExecutionVersion () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> HIVE_METASTORE_VERSION () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> HIVE_EXECUTION_VERSION () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> HIVE_METASTORE_JARS () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> CONVERT_METASTORE_PARQUET () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> CONVERT_METASTORE_PARQUET_WITH_SCHEMA_MERGING () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> CONVERT_CTAS () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<scala.collection.Seq<java.lang.String>> HIVE_METASTORE_SHARED_PREFIXES () { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> jdbcPrefixes () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<scala.collection.Seq<java.lang.String>> HIVE_METASTORE_BARRIER_PREFIXES () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> HIVE_THRIFT_SERVER_ASYNC () { throw new RuntimeException(); }
  /** Constructs a configuration for hive, where the metastore is located in a temp directory. */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> newTemporaryConfiguration () { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.types.AtomicType> primitiveTypes () { throw new RuntimeException(); }
  static protected  java.lang.String toHiveString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a) { throw new RuntimeException(); }
  /** Hive outputs fields of structs slightly differently than top level attributes. */
  static protected  java.lang.String toHiveStructString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a) { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.client.ClientWrapper execHive () { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.client.ClientInterface metaHive () { throw new RuntimeException(); }
  // not preceding
     HiveContext (org.apache.spark.SparkContext sc, org.apache.spark.sql.execution.CacheManager cacheManager, org.apache.spark.sql.execution.ui.SQLListener listener, org.apache.spark.sql.hive.client.ClientWrapper execHive, org.apache.spark.sql.hive.client.ClientInterface metaHive, boolean isRootContext) { throw new RuntimeException(); }
  public   HiveContext (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public   HiveContext (org.apache.spark.api.java.JavaSparkContext sc) { throw new RuntimeException(); }
  /**
   * Returns a new HiveContext as new session, which will have separated SQLConf, UDF/UDAF,
   * temporary tables and SessionState, but sharing the same CacheManager, IsolatedClientLoader
   * and Hive client (both of execution and metadata) with existing HiveContext.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.HiveContext newSession () { throw new RuntimeException(); }
  /**
   * When true, enables an experimental feature where metastore tables that use the parquet SerDe
   * are automatically converted to use the Spark SQL parquet table scan, instead of the Hive
   * SerDe.
   * @return (undocumented)
   */
  protected  boolean convertMetastoreParquet () { throw new RuntimeException(); }
  /**
   * When true, also tries to merge possibly different but compatible Parquet schemas in different
   * Parquet data files.
   * <p>
   * This configuration is only effective when "spark.sql.hive.convertMetastoreParquet" is true.
   * @return (undocumented)
   */
  protected  boolean convertMetastoreParquetWithSchemaMerging () { throw new RuntimeException(); }
  /**
   * When true, a table created by a Hive CTAS statement (no USING clause) will be
   * converted to a data source table, using the data source set by spark.sql.sources.default.
   * The table in CTAS statement will be converted when it meets any of the following conditions:
   *   - The CTAS does not specify any of a SerDe (ROW FORMAT SERDE), a File Format (STORED AS), or
   *     a Storage Hanlder (STORED BY), and the value of hive.default.fileformat in hive-site.xml
   *     is either TextFile or SequenceFile.
   *   - The CTAS statement specifies TextFile (STORED AS TEXTFILE) as the file format and no SerDe
   *     is specified (no ROW FORMAT SERDE clause).
   *   - The CTAS statement specifies SequenceFile (STORED AS SEQUENCEFILE) as the file format
   *     and no SerDe is specified (no ROW FORMAT SERDE clause).
   * @return (undocumented)
   */
  protected  boolean convertCTAS () { throw new RuntimeException(); }
  /**
   * The version of the hive client that will be used to communicate with the metastore.  Note that
   * this does not necessarily need to be the same version of Hive that is used internally by
   * Spark SQL for execution.
   * @return (undocumented)
   */
  protected  java.lang.String hiveMetastoreVersion () { throw new RuntimeException(); }
  /**
   * The location of the jars that should be used to instantiate the HiveMetastoreClient.  This
   * property can be one of three options:
   *  - a classpath in the standard format for both hive and hadoop.
   *  - builtin - attempt to discover the jars that were used to load Spark SQL and use those. This
   *              option is only valid when using the execution version of Hive.
   *  - maven - download the correct version of hive on demand from maven.
   * @return (undocumented)
   */
  protected  java.lang.String hiveMetastoreJars () { throw new RuntimeException(); }
  /**
   * A comma separated list of class prefixes that should be loaded using the classloader that
   * is shared between Spark SQL and a specific version of Hive. An example of classes that should
   * be shared is JDBC drivers that are needed to talk to the metastore. Other classes that need
   * to be shared are those that interact with classes that are already shared.  For example,
   * custom appenders that are used by log4j.
   * @return (undocumented)
   */
  protected  scala.collection.Seq<java.lang.String> hiveMetastoreSharedPrefixes () { throw new RuntimeException(); }
  /**
   * A comma separated list of class prefixes that should explicitly be reloaded for each version
   * of Hive that Spark SQL is communicating with.  For example, Hive UDFs that are declared in a
   * prefix that typically would be shared (i.e. org.apache.spark.*)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<java.lang.String> hiveMetastoreBarrierPrefixes () { throw new RuntimeException(); }
  protected  boolean hiveThriftServerAsync () { throw new RuntimeException(); }
  protected  boolean hiveThriftServerSingleSession () { throw new RuntimeException(); }
  protected  org.apache.hadoop.hive.ql.parse.VariableSubstitution substitutor () { throw new RuntimeException(); }
  /**
   * The copy of the hive client that is used for execution.  Currently this must always be
   * Hive 13 as this is the version of Hive that is packaged with Spark SQL.  This copy of the
   * client is used for execution related tasks like registering temporary functions or ensuring
   * that the ThreadLocal SessionState is correctly populated.  This copy of Hive is *not* used
   * for storing persistent metadata, and only point to a dummy metastore in a temporary directory.
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.hive.client.ClientWrapper executionHive () { throw new RuntimeException(); }
  /**
   * Overrides default Hive configurations to avoid breaking changes to Spark SQL users.
   *  - allow SQL11 keywords to be used as identifiers
   */
    void defaultOverrides () { throw new RuntimeException(); }
  /**
   * The copy of the Hive client that is used to retrieve metadata from the Hive MetaStore.
   * The version of the Hive client that is used here must match the metastore that is configured
   * in the hive-site.xml file.
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.hive.client.ClientInterface metadataHive () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parseSql (java.lang.String sql) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.hive.HiveContext.QueryExecution executePlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  /**
   * Invalidate and refresh all the cached the metadata of the given table. For performance reasons,
   * Spark SQL or the external data source library it uses might cache certain metadata about a
   * table, such as the location of blocks. When those change outside of Spark SQL, users should
   * call this function to invalidate the cache.
   * <p>
   * @since 1.3.0
   * @param tableName (undocumented)
   */
  public  void refreshTable (java.lang.String tableName) { throw new RuntimeException(); }
  protected  void invalidateTable (java.lang.String tableName) { throw new RuntimeException(); }
  /**
   * Analyzes the given table in the current database to generate statistics, which will be
   * used in query optimizations.
   * <p>
   * Right now, it only supports Hive tables and it only updates the size of a Hive table
   * in the Hive metastore.
   * <p>
   * @since 1.2.0
   * @param tableName (undocumented)
   */
  public  void analyze (java.lang.String tableName) { throw new RuntimeException(); }
  public  void setConf (java.lang.String key, java.lang.String value) { throw new RuntimeException(); }
   <T extends java.lang.Object> void setConf (org.apache.spark.sql.SQLConf.SQLConfEntry<T> entry, T value) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.hive.HiveMetastoreCatalog catalog () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer analyzer () { throw new RuntimeException(); }
  /** Overridden by child classes that need to set configuration before the client init. */
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> configure () { throw new RuntimeException(); }
  /**
   * SQLConf and HiveConf contracts:
   * <p>
   * 1. create a new SessionState for each HiveContext
   * 2. when the Hive session is first initialized, params in HiveConf will get picked up by the
   *    SQLConf.  Additionally, any properties set by set() or a SET command inside sql() will be
   *    set in the SQLConf *as well as* in the HiveConf.
   * @return (undocumented)
   */
  protected  org.apache.hadoop.hive.conf.HiveConf hiveconf () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.ParserDialect getSQLDialect () { throw new RuntimeException(); }
  private  org.apache.spark.sql.SQLContext.SparkPlanner hivePlanner () { throw new RuntimeException(); }
  private  java.util.regex.Matcher functionOrMacroDDLPattern (java.lang.String command) { throw new RuntimeException(); }
  protected  scala.collection.Seq<java.lang.String> runSqlHive (java.lang.String sql) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.SQLContext.SparkPlanner planner () { throw new RuntimeException(); }
  protected  void addJar (java.lang.String path) { throw new RuntimeException(); }
}

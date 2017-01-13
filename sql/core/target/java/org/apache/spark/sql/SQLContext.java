package org.apache.spark.sql;
/**
 * The entry point for working with structured data (rows and columns) in Spark.  Allows the
 * creation of {@link DataFrame} objects as well as the execution of SQL queries.
 * <p>
 * @groupname basic Basic Operations
 * @groupname ddl_ops Persistent Catalog DDL
 * @groupname cachemgmt Cached Table Management
 * @groupname genericdata Generic Data Sources
 * @groupname specificdata Specific Data Sources
 * @groupname config Configuration
 * @groupname dataframes Custom DataFrame Creation
 * @groupname Ungrouped Support functions for language integrated queries
 * <p>
 * @since 1.0.0
 */
public  class SQLContext implements org.apache.spark.Logging, scala.Serializable {
  // no position
  /**
   * :: Experimental ::
   * (Scala-specific) Implicit methods available in Scala for converting
   * common Scala objects into {@link DataFrame}s.
   * <p>
   * <pre><code>
   *   val sqlContext = new SQLContext(sc)
   *   import sqlContext.implicits._
   * </code></pre>
   * <p>
   * @group basic
   * @since 1.3.0
   */
  public  class implicits$ extends org.apache.spark.sql.SQLImplicits implements scala.Serializable {
    public   implicits$ () { throw new RuntimeException(); }
    protected  org.apache.spark.sql.SQLContext _sqlContext () { throw new RuntimeException(); }
    /**
     * Converts $"col name" into an {@link Column}.
     * @since 1.3.0
     */
    public  class StringToColumn {
      public  scala.StringContext sc () { throw new RuntimeException(); }
      // not preceding
      public   StringToColumn (scala.StringContext sc) { throw new RuntimeException(); }
    }
  }
  protected  class SparkPlanner extends org.apache.spark.sql.execution.SparkPlanner {
    public   SparkPlanner () { throw new RuntimeException(); }
  }
  protected  class QueryExecution extends org.apache.spark.sql.execution.QueryExecution {
    public   QueryExecution (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical) { throw new RuntimeException(); }
  }
  /**
   * The active SQLContext for the current thread.
   * @return (undocumented)
   */
  static private  java.lang.InheritableThreadLocal<org.apache.spark.sql.SQLContext> activeContext () { throw new RuntimeException(); }
  /**
   * Reference to the created SQLContext.
   * @return (undocumented)
   */
  static private  java.util.concurrent.atomic.AtomicReference<org.apache.spark.sql.SQLContext> instantiatedContext () { throw new RuntimeException(); }
  /**
   * Get the singleton SQLContext if it exists or create a new one using the given SparkContext.
   * <p>
   * This function can be used to create a singleton SQLContext object that can be shared across
   * the JVM.
   * <p>
   * If there is an active SQLContext for current thread, it will be returned instead of the global
   * one.
   * <p>
   * @since 1.5.0
   * @param sparkContext (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.SQLContext getOrCreate (org.apache.spark.SparkContext sparkContext) { throw new RuntimeException(); }
  static   void clearInstantiatedContext () { throw new RuntimeException(); }
  static   void setInstantiatedContext (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.sql.SQLContext> getInstantiatedContextOption () { throw new RuntimeException(); }
  /**
   * Changes the SQLContext that will be returned in this thread and its children when
   * SQLContext.getOrCreate() is called. This can be used to ensure that a given thread receives
   * a SQLContext with an isolated session, instead of the global (first created) context.
   * <p>
   * @since 1.6.0
   * @param sqlContext (undocumented)
   */
  static public  void setActive (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  /**
   * Clears the active SQLContext for current thread. Subsequent calls to getOrCreate will
   * return the first created context instead of a thread-local override.
   * <p>
   * @since 1.6.0
   */
  static public  void clearActive () { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.sql.SQLContext> getActive () { throw new RuntimeException(); }
  /**
   * Converts an iterator of Java Beans to InternalRow using the provided
   * bean info &amp; schema. This is not related to the singleton, but is a static
   * method for internal use.
   * @param data (undocumented)
   * @param beanInfo (undocumented)
   * @param attrs (undocumented)
   * @return (undocumented)
   */
  static private  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> beansToRows (scala.collection.Iterator<java.lang.Object> data, java.beans.BeanInfo beanInfo, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attrs) { throw new RuntimeException(); }
  /**
   * Create a SQLListener then add it into SparkContext, and create an SQLTab if there is SparkUI.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  static   org.apache.spark.sql.execution.ui.SQLListener createListenerAndUI (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  /**
   * Loads a Parquet file, returning the result as a {@link DataFrame}. This function returns an empty
   * {@link DataFrame} if no paths are passed in.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().parquet()</code>. This will be removed in Spark 2.0.
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame parquetFile (java.lang.String... paths) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sparkContext () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.CacheManager cacheManager () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.ui.SQLListener listener () { throw new RuntimeException(); }
  public  boolean isRootContext () { throw new RuntimeException(); }
  // not preceding
     SQLContext (org.apache.spark.SparkContext sparkContext, org.apache.spark.sql.execution.CacheManager cacheManager, org.apache.spark.sql.execution.ui.SQLListener listener, boolean isRootContext) { throw new RuntimeException(); }
  public   SQLContext (org.apache.spark.SparkContext sparkContext) { throw new RuntimeException(); }
  public   SQLContext (org.apache.spark.api.java.JavaSparkContext sparkContext) { throw new RuntimeException(); }
  private  boolean allowMultipleContexts () { throw new RuntimeException(); }
  /**
   * Returns a SQLContext as new session, with separated SQL configurations, temporary tables,
   * registered functions, but sharing the same SparkContext, CacheManager, SQLListener and SQLTab.
   * <p>
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext newSession () { throw new RuntimeException(); }
  /**
   * @return Spark SQL configuration
   */
  protected  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  /**
   * Set Spark SQL configuration properties.
   * <p>
   * @group config
   * @since 1.0.0
   * @param props (undocumented)
   */
  public  void setConf (java.util.Properties props) { throw new RuntimeException(); }
  /** Set the given Spark SQL configuration property. */
   <T extends java.lang.Object> void setConf (org.apache.spark.sql.SQLConf.SQLConfEntry<T> entry, T value) { throw new RuntimeException(); }
  /**
   * Set the given Spark SQL configuration property.
   * <p>
   * @group config
   * @since 1.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void setConf (java.lang.String key, java.lang.String value) { throw new RuntimeException(); }
  /**
   * Return the value of Spark SQL configuration property for the given key.
   * <p>
   * @group config
   * @since 1.0.0
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getConf (java.lang.String key) { throw new RuntimeException(); }
  /**
   * Return the value of Spark SQL configuration property for the given key. If the key is not set
   * yet, return <code>defaultValue</code> in {@link SQLConfEntry}.
   * @param entry (undocumented)
   * @return (undocumented)
   */
   <T extends java.lang.Object> T getConf (org.apache.spark.sql.SQLConf.SQLConfEntry<T> entry) { throw new RuntimeException(); }
  /**
   * Return the value of Spark SQL configuration property for the given key. If the key is not set
   * yet, return <code>defaultValue</code>. This is useful when <code>defaultValue</code> in SQLConfEntry is not the
   * desired one.
   * @param entry (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
   <T extends java.lang.Object> T getConf (org.apache.spark.sql.SQLConf.SQLConfEntry<T> entry, T defaultValue) { throw new RuntimeException(); }
  /**
   * Return the value of Spark SQL configuration property for the given key. If the key is not set
   * yet, return <code>defaultValue</code>.
   * <p>
   * @group config
   * @since 1.0.0
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getConf (java.lang.String key, java.lang.String defaultValue) { throw new RuntimeException(); }
  /**
   * Return all the configuration properties that have been set (i.e. not the default).
   * This creates a new copy of the config properties in the form of a Map.
   * <p>
   * @group config
   * @since 1.0.0
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getAllConfs () { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.ExecutionListenerManager listenerManager () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.Catalog catalog () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer analyzer () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.optimizer.Optimizer optimizer () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.DDLParser ddlParser () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkSQLParser sqlParser () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.ParserDialect getSQLDialect () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parseSql (java.lang.String sql) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.QueryExecution executeSql (java.lang.String sql) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.QueryExecution executePlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  protected  java.lang.String dialectClassName () { throw new RuntimeException(); }
  /**
   * Add a jar to SQLContext
   * @param path (undocumented)
   */
  protected  void addJar (java.lang.String path) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * A collection of methods that are considered experimental, but can be used to hook into
   * the query planner for advanced functionality.
   * <p>
   * @group basic
   * @since 1.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.ExperimentalMethods experimental () { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a {@link DataFrame} with no rows or columns.
   * <p>
   * @group basic
   * @since 1.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame emptyDataFrame () { throw new RuntimeException(); }
  /**
   * A collection of methods for registering user-defined functions (UDF).
   * <p>
   * The following example registers a Scala closure as UDF:
   * <pre><code>
   *   sqlContext.udf.register("myUDF", (arg1: Int, arg2: String) =&gt; arg2 + arg1)
   * </code></pre>
   * <p>
   * The following example registers a UDF in Java:
   * <pre><code>
   *   sqlContext.udf().register("myUDF",
   *       new UDF2&lt;Integer, String, String&gt;() {
   *           &#64;Override
   *           public String call(Integer arg1, String arg2) {
   *               return arg2 + arg1;
   *           }
   *      }, DataTypes.StringType);
   * </code></pre>
   * <p>
   * Or, to use Java 8 lambda syntax:
   * <pre><code>
   *   sqlContext.udf().register("myUDF",
   *       (Integer arg1, String arg2) -&gt; arg2 + arg1,
   *       DataTypes.StringType);
   * </code></pre>
   * <p>
   * @group basic
   * @since 1.3.0
   * TODO move to SQLSession?
   * @return (undocumented)
   */
  public  org.apache.spark.sql.UDFRegistration udf () { throw new RuntimeException(); }
  /**
   * Returns true if the table is currently cached in-memory.
   * @group cachemgmt
   * @since 1.3.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public  boolean isCached (java.lang.String tableName) { throw new RuntimeException(); }
  /**
   * Returns true if the {@link Queryable} is currently cached in-memory.
   * @group cachemgmt
   * @since 1.3.0
   * @param qName (undocumented)
   * @return (undocumented)
   */
    boolean isCached (org.apache.spark.sql.execution.Queryable qName) { throw new RuntimeException(); }
  /**
   * Caches the specified table in-memory.
   * @group cachemgmt
   * @since 1.3.0
   * @param tableName (undocumented)
   */
  public  void cacheTable (java.lang.String tableName) { throw new RuntimeException(); }
  /**
   * Removes the specified table from the in-memory cache.
   * @group cachemgmt
   * @since 1.3.0
   * @param tableName (undocumented)
   */
  public  void uncacheTable (java.lang.String tableName) { throw new RuntimeException(); }
  /**
   * Removes all cached tables from the in-memory cache.
   * @since 1.3.0
   */
  public  void clearCache () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext.implicits$ implicits () { throw new RuntimeException(); }
  public <A extends scala.Product> org.apache.spark.sql.DataFrame createDataFrame (org.apache.spark.rdd.RDD<A> rdd, scala.reflect.api.TypeTags.TypeTag<A> evidence$1) { throw new RuntimeException(); }
  public <A extends scala.Product> org.apache.spark.sql.DataFrame createDataFrame (scala.collection.Seq<A> data, scala.reflect.api.TypeTags.TypeTag<A> evidence$2) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame baseRelationToDataFrame (org.apache.spark.sql.sources.BaseRelation baseRelation) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createDataFrame (org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
    org.apache.spark.sql.DataFrame createDataFrame (org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema, boolean needsConversion) { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (scala.collection.Seq<T> data, org.apache.spark.sql.Encoder<T> evidence$3) { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (org.apache.spark.rdd.RDD<T> data, org.apache.spark.sql.Encoder<T> evidence$4) { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (java.util.List<T> data, org.apache.spark.sql.Encoder<T> evidence$5) { throw new RuntimeException(); }
    org.apache.spark.sql.DataFrame internalCreateDataFrame (org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> catalystRows, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createDataFrame (org.apache.spark.api.java.JavaRDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createDataFrame (java.util.List<org.apache.spark.sql.Row> rows, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createDataFrame (org.apache.spark.rdd.RDD<?> rdd, java.lang.Class<?> beanClass) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createDataFrame (org.apache.spark.api.java.JavaRDD<?> rdd, java.lang.Class<?> beanClass) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createDataFrame (java.util.List<?> data, java.lang.Class<?> beanClass) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrameReader read () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createExternalTable (java.lang.String tableName, java.lang.String path) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createExternalTable (java.lang.String tableName, java.lang.String path, java.lang.String source) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createExternalTable (java.lang.String tableName, java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createExternalTable (java.lang.String tableName, java.lang.String source, scala.collection.immutable.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
    void registerDataFrameAsTable (org.apache.spark.sql.DataFrame df, java.lang.String tableName) { throw new RuntimeException(); }
  public  void dropTempTable (java.lang.String tableName) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame range (long end) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame range (long start, long end) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame range (long start, long end, long step, int numPartitions) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame sql (java.lang.String sqlText) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame table (java.lang.String tableName) { throw new RuntimeException(); }
  private  org.apache.spark.sql.DataFrame table (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame tables () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame tables (java.lang.String databaseName) { throw new RuntimeException(); }
  public  java.lang.String[] tableNames () { throw new RuntimeException(); }
  public  java.lang.String[] tableNames (java.lang.String databaseName) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkPlanner planner () { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> emptyResult () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.execution.SparkPlan> prepareForExecution () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType parseDataType (java.lang.String dataTypeString) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.DataFrame applySchemaToPythonRDD (org.apache.spark.rdd.RDD<java.lang.Object[]> rdd, java.lang.String schemaString) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.DataFrame applySchemaToPythonRDD (org.apache.spark.rdd.RDD<java.lang.Object[]> rdd, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> getSchema (java.lang.Class<?> beanClass) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame applySchema (org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame applySchema (org.apache.spark.api.java.JavaRDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame applySchema (org.apache.spark.rdd.RDD<?> rdd, java.lang.Class<?> beanClass) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame applySchema (org.apache.spark.api.java.JavaRDD<?> rdd, java.lang.Class<?> beanClass) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame parquetFile (scala.collection.Seq<java.lang.String> paths) { throw new RuntimeException(); }
  /**
   * Loads a JSON file (one object per line), returning the result as a {@link DataFrame}.
   * It goes through the entire dataset once to determine the schema.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonFile (java.lang.String path) { throw new RuntimeException(); }
  /**
   * Loads a JSON file (one object per line) and applies the given schema,
   * returning the result as a {@link DataFrame}.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param path (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonFile (java.lang.String path, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  /**
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param path (undocumented)
   * @param samplingRatio (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonFile (java.lang.String path, double samplingRatio) { throw new RuntimeException(); }
  /**
   * Loads an RDD[String] storing JSON objects (one object per record), returning the result as a
   * {@link DataFrame}.
   * It goes through the entire dataset once to determine the schema.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param json (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonRDD (org.apache.spark.rdd.RDD<java.lang.String> json) { throw new RuntimeException(); }
  /**
   * Loads an RDD[String] storing JSON objects (one object per record), returning the result as a
   * {@link DataFrame}.
   * It goes through the entire dataset once to determine the schema.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param json (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonRDD (org.apache.spark.api.java.JavaRDD<java.lang.String> json) { throw new RuntimeException(); }
  /**
   * Loads an RDD[String] storing JSON objects (one object per record) and applies the given schema,
   * returning the result as a {@link DataFrame}.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param json (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonRDD (org.apache.spark.rdd.RDD<java.lang.String> json, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  /**
   * Loads an JavaRDD<String> storing JSON objects (one object per record) and applies the given
   * schema, returning the result as a {@link DataFrame}.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param json (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonRDD (org.apache.spark.api.java.JavaRDD<java.lang.String> json, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  /**
   * Loads an RDD[String] storing JSON objects (one object per record) inferring the
   * schema, returning the result as a {@link DataFrame}.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param json (undocumented)
   * @param samplingRatio (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonRDD (org.apache.spark.rdd.RDD<java.lang.String> json, double samplingRatio) { throw new RuntimeException(); }
  /**
   * Loads a JavaRDD[String] storing JSON objects (one object per record) inferring the
   * schema, returning the result as a {@link DataFrame}.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>. This will be removed in Spark 2.0.
   * @param json (undocumented)
   * @param samplingRatio (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jsonRDD (org.apache.spark.api.java.JavaRDD<java.lang.String> json, double samplingRatio) { throw new RuntimeException(); }
  /**
   * Returns the dataset stored at path as a DataFrame,
   * using the default data source configured by spark.sql.sources.default.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by <code>read().load(path)</code>. This will be removed in Spark 2.0.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame load (java.lang.String path) { throw new RuntimeException(); }
  /**
   * Returns the dataset stored at path as a DataFrame, using the given data source.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by <code>read().format(source).load(path)</code>.
   *             This will be removed in Spark 2.0.
   * @param path (undocumented)
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame load (java.lang.String path, java.lang.String source) { throw new RuntimeException(); }
  /**
   * (Java-specific) Returns the dataset specified by the given data source and
   * a set of options as a DataFrame.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by <code>read().format(source).options(options).load()</code>.
   *             This will be removed in Spark 2.0.
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame load (java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns the dataset specified by the given data source and
   * a set of options as a DataFrame.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by <code>read().format(source).options(options).load()</code>.
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame load (java.lang.String source, scala.collection.immutable.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  /**
   * (Java-specific) Returns the dataset specified by the given data source and
   * a set of options as a DataFrame, using the given schema as the schema of the DataFrame.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by
   *            <code>read().format(source).schema(schema).options(options).load()</code>.
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame load (java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns the dataset specified by the given data source and
   * a set of options as a DataFrame, using the given schema as the schema of the DataFrame.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by
   *            <code>read().format(source).schema(schema).options(options).load()</code>.
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame load (java.lang.String source, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  /**
   * Construct a {@link DataFrame} representing the database table accessible via JDBC URL
   * url named table.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().jdbc()</code>. This will be removed in Spark 2.0.
   * @param url (undocumented)
   * @param table (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jdbc (java.lang.String url, java.lang.String table) { throw new RuntimeException(); }
  /**
   * Construct a {@link DataFrame} representing the database table accessible via JDBC URL
   * url named table.  Partitions of the table will be retrieved in parallel based on the parameters
   * passed to this function.
   * <p>
   * @param columnName the name of a column of integral type that will be used for partitioning.
   * @param lowerBound the minimum value of <code>columnName</code> used to decide partition stride
   * @param upperBound the maximum value of <code>columnName</code> used to decide partition stride
   * @param numPartitions the number of partitions.  the range <code>minValue</code>-<code>maxValue</code> will be split
   *                      evenly into this many partitions
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().jdbc()</code>. This will be removed in Spark 2.0.
   * @param url (undocumented)
   * @param table (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jdbc (java.lang.String url, java.lang.String table, java.lang.String columnName, long lowerBound, long upperBound, int numPartitions) { throw new RuntimeException(); }
  /**
   * Construct a {@link DataFrame} representing the database table accessible via JDBC URL
   * url named table. The theParts parameter gives a list expressions
   * suitable for inclusion in WHERE clauses; each one defines one partition
   * of the {@link DataFrame}.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().jdbc()</code>. This will be removed in Spark 2.0.
   * @param url (undocumented)
   * @param table (undocumented)
   * @param theParts (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame jdbc (java.lang.String url, java.lang.String table, java.lang.String[] theParts) { throw new RuntimeException(); }
}

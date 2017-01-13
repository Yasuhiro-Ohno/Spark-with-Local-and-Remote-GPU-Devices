package org.apache.spark.sql;
// no position
  class SQLConf$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SQLConf$ MODULE$ = null;
  public   SQLConf$ () { throw new RuntimeException(); }
  private  java.util.Map<java.lang.String, org.apache.spark.sql.SQLConf.SQLConfEntry<?>> sqlConfEntries () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> ALLOW_MULTIPLE_CONTEXTS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> COMPRESS_CACHED () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> COLUMN_BATCH_SIZE () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> IN_MEMORY_PARTITION_PRUNING () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> AUTO_BROADCASTJOIN_THRESHOLD () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> DEFAULT_SIZE_IN_BYTES () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> SHUFFLE_PARTITIONS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> SHUFFLE_TARGET_POSTSHUFFLE_INPUT_SIZE () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> ADAPTIVE_EXECUTION_ENABLED () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> SHUFFLE_MIN_NUM_POSTSHUFFLE_PARTITIONS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> SUBEXPRESSION_ELIMINATION_ENABLED () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> DIALECT () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> CASE_SENSITIVE () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARQUET_SCHEMA_MERGING_ENABLED () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARQUET_SCHEMA_RESPECT_SUMMARIES () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARQUET_BINARY_AS_STRING () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARQUET_INT96_AS_TIMESTAMP () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARQUET_CACHE_METADATA () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> PARQUET_COMPRESSION () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARQUET_FILTER_PUSHDOWN_ENABLED () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARQUET_WRITE_LEGACY_FORMAT () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> PARQUET_OUTPUT_COMMITTER_CLASS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARQUET_UNSAFE_ROW_RECORD_READER_ENABLED () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> ORC_FILTER_PUSHDOWN_ENABLED () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> HIVE_VERIFY_PARTITION_PATH () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> HIVE_METASTORE_PARTITION_PRUNING () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> NATIVE_VIEW () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> COLUMN_NAME_OF_CORRUPT_RECORD () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> BROADCAST_TIMEOUT () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> THRIFTSERVER_POOL () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> THRIFTSERVER_UI_STATEMENT_LIMIT () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> THRIFTSERVER_UI_SESSION_LIMIT () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> DEFAULT_DATA_SOURCE_NAME () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> SCHEMA_STRING_LENGTH_THRESHOLD () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARTITION_DISCOVERY_ENABLED () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARTITION_COLUMN_TYPE_INFERENCE () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARTITION_MAX_FILES () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> OUTPUT_COMMITTER_CLASS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> PARALLEL_PARTITION_DISCOVERY_THRESHOLD () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> DATAFRAME_EAGER_ANALYSIS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> DATAFRAME_SELF_JOIN_AUTO_RESOLVE_AMBIGUITY () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> DATAFRAME_RETAIN_GROUP_COLUMNS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> DATAFRAME_PIVOT_MAX_VALUES () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> RUN_SQL_ON_FILES () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> SPECIALIZE_SINGLE_DISTINCT_AGG_PLANNING () { throw new RuntimeException(); }
}

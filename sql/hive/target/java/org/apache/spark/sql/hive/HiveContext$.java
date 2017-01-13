package org.apache.spark.sql.hive;
// no position
  class HiveContext$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveContext$ MODULE$ = null;
  public   HiveContext$ () { throw new RuntimeException(); }
  /** The version of hive used internally by Spark SQL. */
  public  java.lang.String hiveExecutionVersion () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> HIVE_METASTORE_VERSION () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> HIVE_EXECUTION_VERSION () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.String> HIVE_METASTORE_JARS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> CONVERT_METASTORE_PARQUET () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> CONVERT_METASTORE_PARQUET_WITH_SCHEMA_MERGING () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> CONVERT_CTAS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<scala.collection.Seq<java.lang.String>> HIVE_METASTORE_SHARED_PREFIXES () { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> jdbcPrefixes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<scala.collection.Seq<java.lang.String>> HIVE_METASTORE_BARRIER_PREFIXES () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf.SQLConfEntry<java.lang.Object> HIVE_THRIFT_SERVER_ASYNC () { throw new RuntimeException(); }
  /** Constructs a configuration for hive, where the metastore is located in a temp directory. */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> newTemporaryConfiguration () { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.types.AtomicType> primitiveTypes () { throw new RuntimeException(); }
  protected  java.lang.String toHiveString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a) { throw new RuntimeException(); }
  /** Hive outputs fields of structs slightly differently than top level attributes. */
  protected  java.lang.String toHiveStructString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a) { throw new RuntimeException(); }
}

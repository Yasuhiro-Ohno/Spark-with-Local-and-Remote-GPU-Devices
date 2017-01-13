package org.apache.spark.sql.hive;
  class HiveMetastoreCatalog implements org.apache.spark.sql.catalyst.analysis.Catalog, org.apache.spark.Logging {
  public  org.apache.spark.sql.hive.client.ClientInterface client () { throw new RuntimeException(); }
  // not preceding
  public   HiveMetastoreCatalog (org.apache.spark.sql.hive.client.ClientInterface client, org.apache.spark.sql.hive.HiveContext hive) { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  /** Usages should lock on `this`. */
  protected  org.apache.hadoop.hive.metastore.Warehouse hiveWarehouse () { throw new RuntimeException(); }
  /** A fully qualified identifier for a table (i.e., database.tableName) */
  public  class QualifiedTableName implements scala.Product, scala.Serializable {
    public  java.lang.String database () { throw new RuntimeException(); }
    public  java.lang.String name () { throw new RuntimeException(); }
    // not preceding
    public   QualifiedTableName (java.lang.String database, java.lang.String name) { throw new RuntimeException(); }
  }
  // no position
  public  class QualifiedTableName extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.hive.HiveMetastoreCatalog.QualifiedTableName> implements scala.Serializable {
    public   QualifiedTableName () { throw new RuntimeException(); }
  }
  private  org.apache.spark.sql.hive.HiveMetastoreCatalog.QualifiedTableName getQualifiedTableName (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.HiveMetastoreCatalog.QualifiedTableName getQualifiedTableName (org.apache.spark.sql.hive.client.HiveTable hiveTable) { throw new RuntimeException(); }
  /** A cache of Spark SQL data source tables that have been accessed. */
  protected  com.google.common.cache.LoadingCache<org.apache.spark.sql.hive.HiveMetastoreCatalog.QualifiedTableName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> cachedDataSourceTables () { throw new RuntimeException(); }
  public  void refreshTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  void invalidateTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  void createDataSourceTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, java.lang.String[] partitionColumns, java.lang.String provider, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, boolean isExternal) { throw new RuntimeException(); }
  public  java.lang.String hiveDefaultTableFilePath (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  boolean tableExists (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<java.lang.String> alias) { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.LogicalRelation convertToParquetRelation (org.apache.spark.sql.hive.MetastoreRelation metastoreRelation) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> getTables (scala.Option<java.lang.String> databaseName) { throw new RuntimeException(); }
  // no position
  public  class ParquetConversions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * When scanning or writing to non-partitioned Metastore Parquet tables, convert them to Parquet
     * data source relations for better performance.
     */
    public   ParquetConversions () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog.ParquetConversions$ ParquetConversions () { throw new RuntimeException(); }
  // no position
  public  class CreateTables extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Creates any tables required for query execution.
     * For example, because of a CREATE TABLE X AS statement.
     */
    public   CreateTables () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog.CreateTables$ CreateTables () { throw new RuntimeException(); }
  // no position
  public  class PreInsertionCasts extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Casts input data to correct data types according to table definition before inserting into
     * that table.
     */
    public   PreInsertionCasts () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan castChildOutput (org.apache.spark.sql.catalyst.plans.logical.InsertIntoTable p, org.apache.spark.sql.hive.MetastoreRelation table, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog.PreInsertionCasts$ PreInsertionCasts () { throw new RuntimeException(); }
  /**
   * UNIMPLEMENTED: It needs to be decided how we will persist in-memory tables to the metastore.
   * For now, if this functionality is desired mix in the in-memory {@link OverrideCatalog}.
   * @param tableIdent (undocumented)
   * @param plan (undocumented)
   */
  public  void registerTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  /**
   * UNIMPLEMENTED: It needs to be decided how we will persist in-memory tables to the metastore.
   * For now, if this functionality is desired mix in the in-memory {@link OverrideCatalog}.
   * @param tableIdent (undocumented)
   */
  public  void unregisterTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  void unregisterAllTables () { throw new RuntimeException(); }
}

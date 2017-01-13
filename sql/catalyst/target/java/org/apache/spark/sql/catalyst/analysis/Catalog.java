package org.apache.spark.sql.catalyst.analysis;
/**
 * An interface for looking up relations by name.  Used by an {@link Analyzer}.
 */
public  interface Catalog {
  public  org.apache.spark.sql.catalyst.CatalystConf conf () ;
  public  boolean tableExists (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<java.lang.String> alias) ;
  /**
   * Returns tuples of (tableName, isTemporary) for all tables in the given database.
   * isTemporary is a Boolean value indicates if a table is a temporary or not.
   * @param databaseName (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> getTables (scala.Option<java.lang.String> databaseName) ;
  public  void refreshTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) ;
  public  void registerTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
  public  void unregisterTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) ;
  public  void unregisterAllTables () ;
  /**
   * Get the table name of TableIdentifier for temporary tables.
   * @param tableIdent (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getTableName (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) ;
}

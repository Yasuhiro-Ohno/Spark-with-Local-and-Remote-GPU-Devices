package org.apache.spark.sql.catalyst.analysis;
/**
 * A trait that can be mixed in with other Catalogs allowing specific tables to be overridden with
 * new logical plans.  This can be used to bind query result to virtual tables, or replace tables
 * with in-memory cached versions.  Note that the set of overrides is stored in memory and thus
 * lost when the JVM exits.
 */
public  interface OverrideCatalog extends org.apache.spark.sql.catalyst.analysis.Catalog {
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> getOverriddenTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) ;
  public  boolean tableExists (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<java.lang.String> alias) ;
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> getTables (scala.Option<java.lang.String> databaseName) ;
  public  void registerTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
  public  void unregisterTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) ;
  public  void unregisterAllTables () ;
}

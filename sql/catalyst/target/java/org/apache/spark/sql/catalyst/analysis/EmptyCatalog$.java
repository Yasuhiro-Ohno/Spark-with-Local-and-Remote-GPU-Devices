package org.apache.spark.sql.catalyst.analysis;
// no position
/**
 * A trivial catalog that returns an error when a relation is requested.  Used for testing when all
 * relations are already filled in and the analyzer needs only to resolve attribute references.
 */
public  class EmptyCatalog$ implements org.apache.spark.sql.catalyst.analysis.Catalog {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EmptyCatalog$ MODULE$ = null;
  public   EmptyCatalog$ () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.CatalystConf conf () { throw new RuntimeException(); }
  public  boolean tableExists (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<java.lang.String> alias) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> getTables (scala.Option<java.lang.String> databaseName) { throw new RuntimeException(); }
  public  void registerTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  public  void unregisterTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  void unregisterAllTables () { throw new RuntimeException(); }
  public  void refreshTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
}

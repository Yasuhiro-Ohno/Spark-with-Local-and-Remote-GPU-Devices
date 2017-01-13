package org.apache.spark.sql.catalyst.analysis;
// no position
/**
 * A trivial catalog that returns an error when a relation is requested.  Used for testing when all
 * relations are already filled in and the analyzer needs only to resolve attribute references.
 */
public  class EmptyCatalog implements org.apache.spark.sql.catalyst.analysis.Catalog {
  static public  org.apache.spark.sql.catalyst.CatalystConf conf () { throw new RuntimeException(); }
  static public  boolean tableExists (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<java.lang.String> alias) { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> getTables (scala.Option<java.lang.String> databaseName) { throw new RuntimeException(); }
  static public  void registerTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  static public  void unregisterTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  static public  void unregisterAllTables () { throw new RuntimeException(); }
  static public  void refreshTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
}

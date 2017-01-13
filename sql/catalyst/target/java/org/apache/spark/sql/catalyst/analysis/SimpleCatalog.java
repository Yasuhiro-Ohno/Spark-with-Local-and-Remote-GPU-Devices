package org.apache.spark.sql.catalyst.analysis;
public  class SimpleCatalog implements org.apache.spark.sql.catalyst.analysis.Catalog {
  public  org.apache.spark.sql.catalyst.CatalystConf conf () { throw new RuntimeException(); }
  // not preceding
  public   SimpleCatalog (org.apache.spark.sql.catalyst.CatalystConf conf) { throw new RuntimeException(); }
  public  void registerTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  public  void unregisterTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  void unregisterAllTables () { throw new RuntimeException(); }
  public  boolean tableExists (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<java.lang.String> alias) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> getTables (scala.Option<java.lang.String> databaseName) { throw new RuntimeException(); }
  public  void refreshTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent) { throw new RuntimeException(); }
}

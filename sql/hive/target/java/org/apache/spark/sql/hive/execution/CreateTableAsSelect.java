package org.apache.spark.sql.hive.execution;
/**
 * Create table and insert the query result into it.
 * param:  tableDesc the Table Describe, which may contains serde, storage handler etc.
 * param:  query the query whose result will be insert into the new relation
 * param:  allowExisting allow continue working if it's already exists, otherwise
 *                      raise exception
 */
  class CreateTableAsSelect extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.RunnableCommand, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.client.HiveTable tableDesc () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query () { throw new RuntimeException(); }
  public  boolean allowExisting () { throw new RuntimeException(); }
  // not preceding
  public   CreateTableAsSelect (org.apache.spark.sql.hive.client.HiveTable tableDesc, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, boolean allowExisting) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  public  java.lang.String argString () { throw new RuntimeException(); }
}

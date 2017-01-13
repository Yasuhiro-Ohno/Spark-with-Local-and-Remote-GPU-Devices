package org.apache.spark.sql.hive.execution;
/**
 * Create Hive view on non-hive-compatible tables by specifying schema ourselves instead of
 * depending on Hive meta-store.
 */
  class CreateViewAsSelect extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.RunnableCommand, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.client.HiveTable tableDesc () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> childSchema () { throw new RuntimeException(); }
  public  boolean allowExisting () { throw new RuntimeException(); }
  public  boolean orReplace () { throw new RuntimeException(); }
  // not preceding
  public   CreateViewAsSelect (org.apache.spark.sql.hive.client.HiveTable tableDesc, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> childSchema, boolean allowExisting, boolean orReplace) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.client.HiveTable prepareTable () { throw new RuntimeException(); }
  private  java.lang.String verbose (java.lang.String name) { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive;
  class CreateTableAsSelect extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.client.HiveTable tableDesc () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  public  boolean allowExisting () { throw new RuntimeException(); }
  // not preceding
  public   CreateTableAsSelect (org.apache.spark.sql.hive.client.HiveTable tableDesc, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, boolean allowExisting) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive.execution;
  class DropTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.RunnableCommand, scala.Product, scala.Serializable {
  public  java.lang.String tableName () { throw new RuntimeException(); }
  public  boolean ifExists () { throw new RuntimeException(); }
  public   DropTable (java.lang.String tableName, boolean ifExists) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
}

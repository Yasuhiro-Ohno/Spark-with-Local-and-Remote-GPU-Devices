package org.apache.spark.sql.hive;
  class MetastoreRelation extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation, org.apache.spark.sql.execution.FileRelation, scala.Product, scala.Serializable {
  public  class SchemaAttribute {
    public   SchemaAttribute (org.apache.spark.sql.hive.client.HiveColumn f) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.AttributeReference toAttribute () { throw new RuntimeException(); }
  }
  public  java.lang.String databaseName () { throw new RuntimeException(); }
  public  java.lang.String tableName () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> alias () { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.client.HiveTable table () { throw new RuntimeException(); }
  private  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  // not preceding
  public   MetastoreRelation (java.lang.String databaseName, java.lang.String tableName, scala.Option<java.lang.String> alias, org.apache.spark.sql.hive.client.HiveTable table, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  public  boolean equals (Object other) { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.metadata.Table hiveQlTable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics statistics () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HivePartition> allPartitions () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> getHiveQlPartitions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates) { throw new RuntimeException(); }
  /** Only compare database and tablename, not alias. */
  public  boolean sameResult (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.plan.TableDesc tableDesc () { throw new RuntimeException(); }
  /** PartitionKey attributes */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> partitionKeys () { throw new RuntimeException(); }
  /** Non-partitionKey attributes */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> output () { throw new RuntimeException(); }
  /** An attribute map that can be used to lookup original attributes based on expression id. */
  public  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.AttributeReference> attributeMap () { throw new RuntimeException(); }
  /** An attribute map for determining the ordinal for non-partition columns. */
  public  org.apache.spark.sql.catalyst.expressions.AttributeMap<java.lang.Object> columnOrdinals () { throw new RuntimeException(); }
  public  java.lang.String[] inputFiles () { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.MetastoreRelation newInstance () { throw new RuntimeException(); }
}

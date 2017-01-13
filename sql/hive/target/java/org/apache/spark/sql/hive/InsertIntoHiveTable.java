package org.apache.spark.sql.hive;
/**
 * A logical plan representing insertion into Hive table.
 * This plan ignores nullability of ArrayType, MapType, StructType unlike InsertIntoTable
 * because Hive table doesn't have nullability for ARRAY, MAP, STRUCT types.
 */
  class InsertIntoHiveTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.MetastoreRelation table () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  public  boolean overwrite () { throw new RuntimeException(); }
  public  boolean ifNotExists () { throw new RuntimeException(); }
  // not preceding
  public   InsertIntoHiveTable (org.apache.spark.sql.hive.MetastoreRelation table, scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, boolean overwrite, boolean ifNotExists) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  int numDynamicPartitions () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> tableOutput () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
}

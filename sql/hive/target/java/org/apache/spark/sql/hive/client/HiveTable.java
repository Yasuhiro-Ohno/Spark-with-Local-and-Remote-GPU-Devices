package org.apache.spark.sql.hive.client;
  class HiveTable implements scala.Product, scala.Serializable {
  public  scala.Option<java.lang.String> specifiedDatabase () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HiveColumn> schema () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HiveColumn> partitionColumns () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> serdeProperties () { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.client.TableType tableType () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> location () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> inputFormat () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputFormat () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> serde () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> viewText () { throw new RuntimeException(); }
  public   HiveTable (scala.Option<java.lang.String> specifiedDatabase, java.lang.String name, scala.collection.Seq<org.apache.spark.sql.hive.client.HiveColumn> schema, scala.collection.Seq<org.apache.spark.sql.hive.client.HiveColumn> partitionColumns, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.collection.immutable.Map<java.lang.String, java.lang.String> serdeProperties, org.apache.spark.sql.hive.client.TableType tableType, scala.Option<java.lang.String> location, scala.Option<java.lang.String> inputFormat, scala.Option<java.lang.String> outputFormat, scala.Option<java.lang.String> serde, scala.Option<java.lang.String> viewText) { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.client.ClientInterface client () { throw new RuntimeException(); }
    org.apache.spark.sql.hive.client.HiveTable withClient (org.apache.spark.sql.hive.client.ClientInterface ci) { throw new RuntimeException(); }
  public  java.lang.String database () { throw new RuntimeException(); }
  public  boolean isPartitioned () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HivePartition> getAllPartitions () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.client.HivePartition> getPartitions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates) { throw new RuntimeException(); }
  public  java.lang.String qualifiedName () { throw new RuntimeException(); }
}

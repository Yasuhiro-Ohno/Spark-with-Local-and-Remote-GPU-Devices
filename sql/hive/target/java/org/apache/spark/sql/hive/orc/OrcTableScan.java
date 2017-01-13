package org.apache.spark.sql.hive.orc;
  class OrcTableScan implements org.apache.spark.Logging, org.apache.spark.sql.hive.HiveInspectors, scala.Product, scala.Serializable {
  static public  java.lang.String SARG_PUSHDOWN () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.orc.OrcRelation relation () { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter[] filters () { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileStatus[] inputPaths () { throw new RuntimeException(); }
  // not preceding
  public   OrcTableScan (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes, org.apache.spark.sql.hive.orc.OrcRelation relation, org.apache.spark.sql.sources.Filter[] filters, org.apache.hadoop.fs.FileStatus[] inputPaths) { throw new RuntimeException(); }
  private  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  private  void addColumnIds (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.hive.orc.OrcRelation relation, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  private  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> fillObject (java.lang.String path, org.apache.hadoop.conf.Configuration conf, scala.collection.Iterator<org.apache.hadoop.io.Writable> iterator, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> nonPartitionKeyAttrs) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> execute () { throw new RuntimeException(); }
}

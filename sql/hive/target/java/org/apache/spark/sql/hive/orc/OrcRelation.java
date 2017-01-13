package org.apache.spark.sql.hive.orc;
  class OrcRelation extends org.apache.spark.sql.sources.HadoopFsRelation implements org.apache.spark.Logging {
  public  java.lang.String[] paths () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> userDefinedPartitionColumns () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  // not preceding
  public   OrcRelation (java.lang.String[] paths, scala.Option<org.apache.spark.sql.types.StructType> maybeDataSchema, scala.Option<org.apache.spark.sql.execution.datasources.PartitionSpec> maybePartitionSpec, scala.Option<org.apache.spark.sql.types.StructType> userDefinedPartitionColumns, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
     OrcRelation (java.lang.String[] paths, scala.Option<org.apache.spark.sql.types.StructType> maybeDataSchema, scala.Option<org.apache.spark.sql.execution.datasources.PartitionSpec> maybePartitionSpec, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType dataSchema () { throw new RuntimeException(); }
  public  boolean needConversion () { throw new RuntimeException(); }
  public  boolean equals (Object other) { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> buildInternalScan (java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters, org.apache.hadoop.fs.FileStatus[] inputPaths, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf) { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.OutputWriterFactory prepareJobForWrite (org.apache.hadoop.mapreduce.Job job) { throw new RuntimeException(); }
}

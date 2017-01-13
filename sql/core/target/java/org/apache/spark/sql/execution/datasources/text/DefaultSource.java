package org.apache.spark.sql.execution.datasources.text;
/**
 * A data source for reading text files.
 */
public  class DefaultSource implements org.apache.spark.sql.sources.HadoopFsRelationProvider, org.apache.spark.sql.sources.DataSourceRegister {
  public   DefaultSource () { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.HadoopFsRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, java.lang.String[] paths, scala.Option<org.apache.spark.sql.types.StructType> dataSchema, scala.Option<org.apache.spark.sql.types.StructType> partitionColumns, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters) { throw new RuntimeException(); }
  public  java.lang.String shortName () { throw new RuntimeException(); }
  private  void verifySchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
}

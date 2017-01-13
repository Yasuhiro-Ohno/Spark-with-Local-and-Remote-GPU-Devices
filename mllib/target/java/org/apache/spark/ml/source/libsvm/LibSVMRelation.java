package org.apache.spark.ml.source.libsvm;
/**
 * LibSVMRelation provides the DataFrame constructed from LibSVM format data.
 * param:  path File path of LibSVM format
 * param:  numFeatures The number of features
 * param:  vectorType The type of vector. It can be 'sparse' or 'dense'
 * param:  sqlContext The Spark SQLContext
 */
  class LibSVMRelation extends org.apache.spark.sql.sources.BaseRelation implements org.apache.spark.sql.sources.TableScan, org.apache.spark.Logging, scala.Serializable {
  public  java.lang.String path () { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  public  java.lang.String vectorType () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  // not preceding
  public   LibSVMRelation (java.lang.String path, int numFeatures, java.lang.String vectorType, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan () { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
  public  boolean equals (Object other) { throw new RuntimeException(); }
}

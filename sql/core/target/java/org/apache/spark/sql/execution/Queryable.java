package org.apache.spark.sql.execution;
/** A trait that holds shared code between DataFrames and Datasets. */
  interface Queryable {
  public  org.apache.spark.sql.types.StructType schema () ;
  public  org.apache.spark.sql.execution.QueryExecution queryExecution () ;
  public  org.apache.spark.sql.SQLContext sqlContext () ;
  public  java.lang.String toString () ;
  public  void printSchema () ;
  public  void explain (boolean extended) ;
  public  void explain () ;
}

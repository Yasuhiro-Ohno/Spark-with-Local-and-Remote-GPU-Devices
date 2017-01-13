package org.apache.spark.sql.execution.metric;
public  class LongSQLMetricParam implements org.apache.spark.sql.execution.metric.SQLMetricParam<org.apache.spark.sql.execution.metric.LongSQLMetricValue, java.lang.Object> {
  public  scala.Function1<scala.collection.Seq<java.lang.Object>, java.lang.String> stringValue () { throw new RuntimeException(); }
  // not preceding
  public   LongSQLMetricParam (scala.Function1<scala.collection.Seq<java.lang.Object>, java.lang.String> stringValue, long initialValue) { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.metric.LongSQLMetricValue addAccumulator (org.apache.spark.sql.execution.metric.LongSQLMetricValue r, long t) { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.metric.LongSQLMetricValue addInPlace (org.apache.spark.sql.execution.metric.LongSQLMetricValue r1, org.apache.spark.sql.execution.metric.LongSQLMetricValue r2) { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.metric.LongSQLMetricValue zero (org.apache.spark.sql.execution.metric.LongSQLMetricValue initialValue) { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.metric.LongSQLMetricValue zero () { throw new RuntimeException(); }
}

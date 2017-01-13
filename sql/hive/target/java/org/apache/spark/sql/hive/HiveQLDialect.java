package org.apache.spark.sql.hive;
/**
 * This is the HiveQL Dialect, this dialect is strongly bind with HiveContext
 */
  class HiveQLDialect extends org.apache.spark.sql.catalyst.ParserDialect {
  public   HiveQLDialect (org.apache.spark.sql.hive.HiveContext sqlContext) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parse (java.lang.String sqlText) { throw new RuntimeException(); }
}

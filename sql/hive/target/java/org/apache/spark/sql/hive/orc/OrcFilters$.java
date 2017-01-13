package org.apache.spark.sql.hive.orc;
// no position
/**
 * It may be optimized by push down partial filters. But we are conservative here.
 * Because if some filters fail to be parsed, the tree may be corrupted,
 * and cannot be used anymore.
 */
  class OrcFilters$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OrcFilters$ MODULE$ = null;
  public   OrcFilters$ () { throw new RuntimeException(); }
  public  scala.Option<org.apache.hadoop.hive.ql.io.sarg.SearchArgument> createFilter (org.apache.spark.sql.sources.Filter[] filters) { throw new RuntimeException(); }
  private  scala.Option<org.apache.hadoop.hive.ql.io.sarg.SearchArgument.Builder> buildSearchArgument (org.apache.spark.sql.sources.Filter expression, org.apache.hadoop.hive.ql.io.sarg.SearchArgument.Builder builder) { throw new RuntimeException(); }
}

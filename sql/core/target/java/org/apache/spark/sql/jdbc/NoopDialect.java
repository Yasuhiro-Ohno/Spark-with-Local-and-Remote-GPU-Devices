package org.apache.spark.sql.jdbc;
// no position
/**
 * NOOP dialect object, always returning the neutral element.
 */
public  class NoopDialect extends org.apache.spark.sql.jdbc.JdbcDialect {
  static public  boolean canHandle (java.lang.String url) { throw new RuntimeException(); }
}

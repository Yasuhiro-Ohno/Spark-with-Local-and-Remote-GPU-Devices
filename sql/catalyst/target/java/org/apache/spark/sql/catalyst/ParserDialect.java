package org.apache.spark.sql.catalyst;
/**
 * Root class of SQL Parser Dialect, and we don't guarantee the binary
 * compatibility for the future release, let's keep it as the internal
 * interface for advanced user.
 * <p>
 */
public abstract class ParserDialect {
  public   ParserDialect () { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parse (java.lang.String sqlText) ;
}

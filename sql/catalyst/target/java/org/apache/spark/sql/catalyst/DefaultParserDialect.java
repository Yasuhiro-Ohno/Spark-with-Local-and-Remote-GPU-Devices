package org.apache.spark.sql.catalyst;
/**
 * Currently we support the default dialect named "sql", associated with the class
 * {@link DefaultParserDialect}
 * <p>
 * And we can also provide custom SQL Dialect, for example in Spark SQL CLI:
 * <pre><code>
 *-- switch to "hiveql" dialect
 *   spark-sql&gt;SET spark.sql.dialect=hiveql;
 *   spark-sql&gt;SELECT * FROM src LIMIT 1;
 *
 *-- switch to "sql" dialect
 *   spark-sql&gt;SET spark.sql.dialect=sql;
 *   spark-sql&gt;SELECT * FROM src LIMIT 1;
 *
 *-- register the new SQL dialect
 *   spark-sql&gt; SET spark.sql.dialect=com.xxx.xxx.SQL99Dialect;
 *   spark-sql&gt; SELECT * FROM src LIMIT 1;
 *
 *-- register the non-exist SQL dialect
 *   spark-sql&gt; SET spark.sql.dialect=NotExistedClass;
 *   spark-sql&gt; SELECT * FROM src LIMIT 1;
 *
 *-- Exception will be thrown and switch to dialect
 *-- "sql" (for SQLContext) or
 *-- "hiveql" (for HiveContext)
 * </code></pre>
 */
  class DefaultParserDialect extends org.apache.spark.sql.catalyst.ParserDialect {
  public   DefaultParserDialect () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.SqlParser$ sqlParser () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parse (java.lang.String sqlText) { throw new RuntimeException(); }
}

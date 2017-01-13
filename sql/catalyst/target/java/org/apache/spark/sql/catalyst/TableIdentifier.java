package org.apache.spark.sql.catalyst;
/**
 * Identifies a <code>table</code> in <code>database</code>.  If <code>database</code> is not defined, the current database is used.
 */
  class TableIdentifier implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.TableIdentifier apply (java.lang.String tableName) { throw new RuntimeException(); }
  public  java.lang.String table () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> database () { throw new RuntimeException(); }
  // not preceding
  public   TableIdentifier (java.lang.String table, scala.Option<java.lang.String> database) { throw new RuntimeException(); }
  public   TableIdentifier (java.lang.String table) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  java.lang.String quotedString () { throw new RuntimeException(); }
  public  java.lang.String unquotedString () { throw new RuntimeException(); }
}

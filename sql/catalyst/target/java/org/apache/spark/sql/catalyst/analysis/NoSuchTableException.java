package org.apache.spark.sql.catalyst.analysis;
/**
 * Thrown by a catalog when a table cannot be found.  The analyzer will rethrow the exception
 * as an AnalysisException with the correct position information.
 */
public  class NoSuchTableException extends java.lang.Exception {
  public   NoSuchTableException () { throw new RuntimeException(); }
}

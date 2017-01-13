package org.apache.spark.sql;
/**
 * :: DeveloperApi ::
 * Thrown when a query fails to analyze, usually because the query itself is invalid.
 */
public  class AnalysisException extends java.lang.Exception implements scala.Serializable {
  public  java.lang.String message () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> line () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startPosition () { throw new RuntimeException(); }
  // not preceding
  protected   AnalysisException (java.lang.String message, scala.Option<java.lang.Object> line, scala.Option<java.lang.Object> startPosition) { throw new RuntimeException(); }
  public  org.apache.spark.sql.AnalysisException withPosition (scala.Option<java.lang.Object> line, scala.Option<java.lang.Object> startPosition) { throw new RuntimeException(); }
  public  java.lang.String getMessage () { throw new RuntimeException(); }
}

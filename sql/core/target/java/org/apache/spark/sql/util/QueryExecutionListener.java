package org.apache.spark.sql.util;
/**
 * :: Experimental ::
 * The interface of query execution listener that can be used to analyze execution metrics.
 * <p>
 * Note that implementations should guarantee thread-safety as they can be invoked by
 * multiple different threads.
 */
public  interface QueryExecutionListener {
  /**
   * A callback function that will be called when a query executed successfully.
   * Note that this can be invoked by multiple different threads.
   * <p>
   * @param funcName name of the action that triggered this query.
   * @param qe the QueryExecution object that carries detail information like logical plan,
   *           physical plan, etc.
   * @param durationNs the execution time for this query in nanoseconds.
   */
  public  void onSuccess (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, long durationNs) ;
  /**
   * A callback function that will be called when a query execution failed.
   * Note that this can be invoked by multiple different threads.
   * <p>
   * @param funcName the name of the action that triggered this query.
   * @param qe the QueryExecution object that carries detail information like logical plan,
   *           physical plan, etc.
   * @param exception the exception that failed this query.
   */
  public  void onFailure (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, java.lang.Exception exception) ;
}

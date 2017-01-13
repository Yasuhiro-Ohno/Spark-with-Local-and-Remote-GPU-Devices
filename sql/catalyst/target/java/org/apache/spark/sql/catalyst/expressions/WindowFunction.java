package org.apache.spark.sql.catalyst.expressions;
/**
 * Every window function needs to maintain a output buffer for its output.
 * It should expect that for a n-row window frame, it will be called n times
 * to retrieve value corresponding with these n rows.
 */
public  interface WindowFunction {
  public  void init () ;
  public  void reset () ;
  public  java.lang.Object prepareInputParameters (org.apache.spark.sql.catalyst.InternalRow input) ;
  public  void update (java.lang.Object input) ;
  public  void batchUpdate (java.lang.Object[] inputs) ;
  public  void evaluate () ;
  public  Object get (int index) ;
  public  org.apache.spark.sql.catalyst.expressions.WindowFunction newInstance () ;
}

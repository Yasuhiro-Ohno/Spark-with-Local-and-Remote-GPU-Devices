package org.apache.spark.ml.util;
/**
 * Trait for {@link MLWriter} and {@link MLReader}.
 */
  interface BaseReadWrite {
  public  scala.Option<org.apache.spark.sql.SQLContext> optionSQLContext () ;
  /**
   * Sets the SQL context to use for saving/loading.
   * @param sqlContext (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.BaseReadWrite context (org.apache.spark.sql.SQLContext sqlContext) ;
  /**
   * Returns the user-specified SQL context or the default.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext sqlContext () ;
  /** Returns the {@link SparkContext} underlying {@link sqlContext} */
  public  org.apache.spark.SparkContext sc () ;
}

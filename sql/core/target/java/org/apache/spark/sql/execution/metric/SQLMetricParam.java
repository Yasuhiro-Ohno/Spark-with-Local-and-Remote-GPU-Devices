package org.apache.spark.sql.execution.metric;
/**
 * Create a layer for specialized metric. We cannot add <code>@specialized</code> to
 * <code>Accumulable/AccumulableParam</code> because it will break Java source compatibility.
 */
  interface SQLMetricParam<R extends org.apache.spark.sql.execution.metric.SQLMetricValue<T>, T extends java.lang.Object> extends org.apache.spark.AccumulableParam<R, T> {
  /**
   * A function that defines how we aggregate the final accumulator results among all tasks,
   * and represent it in string for a SQL physical operator.
   * @return (undocumented)
   */
  public  scala.Function1<scala.collection.Seq<T>, java.lang.String> stringValue () ;
  public  R zero () ;
}

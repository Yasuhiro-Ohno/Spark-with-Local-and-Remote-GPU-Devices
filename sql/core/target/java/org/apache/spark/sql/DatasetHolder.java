package org.apache.spark.sql;
/**
 * A container for a {@link Dataset}, used for implicit conversions.
 * <p>
 * To use this, import implicit conversions in SQL:
 * <pre><code>
 *   import sqlContext.implicits._
 * </code></pre>
 * <p>
 * @since 1.6.0
 */
public  class DatasetHolder<T extends java.lang.Object> implements scala.Product, scala.Serializable {
  private  org.apache.spark.sql.Dataset<T> ds () { throw new RuntimeException(); }
  // not preceding
     DatasetHolder (org.apache.spark.sql.Dataset<T> ds) { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<T> toDS () { throw new RuntimeException(); }
}

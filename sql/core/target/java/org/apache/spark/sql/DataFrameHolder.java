package org.apache.spark.sql;
/**
 * A container for a {@link DataFrame}, used for implicit conversions.
 * <p>
 * To use this, import implicit conversions in SQL:
 * <pre><code>
 *   import sqlContext.implicits._
 * </code></pre>
 * <p>
 * @since 1.3.0
 */
public  class DataFrameHolder implements scala.Product, scala.Serializable {
  private  org.apache.spark.sql.DataFrame df () { throw new RuntimeException(); }
  // not preceding
     DataFrameHolder (org.apache.spark.sql.DataFrame df) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame toDF () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame toDF (scala.collection.Seq<java.lang.String> colNames) { throw new RuntimeException(); }
}

package org.apache.spark.sql;
/**
 * A collection of implicit methods for converting common Scala objects into {@link DataFrame}s.
 * <p>
 * @since 1.6.0
 */
public abstract class SQLImplicits {
  public   SQLImplicits () { throw new RuntimeException(); }
  protected abstract  org.apache.spark.sql.SQLContext _sqlContext () ;
  /** @since 1.6.0 */
  public <T extends scala.Product> org.apache.spark.sql.Encoder<T> newProductEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$1) { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newIntEncoder () { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newLongEncoder () { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newDoubleEncoder () { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newFloatEncoder () { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newByteEncoder () { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newShortEncoder () { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newBooleanEncoder () { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.String> newStringEncoder () { throw new RuntimeException(); }
  /**
   * Creates a {@link Dataset} from an RDD.
   * @since 1.6.0
   * @param rdd (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.DatasetHolder<T> rddToDatasetHolder (org.apache.spark.rdd.RDD<T> rdd, org.apache.spark.sql.Encoder<T> evidence$2) { throw new RuntimeException(); }
  /**
   * Creates a {@link Dataset} from a local Seq.
   * @since 1.6.0
   * @param s (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.DatasetHolder<T> localSeqToDatasetHolder (scala.collection.Seq<T> s, org.apache.spark.sql.Encoder<T> evidence$3) { throw new RuntimeException(); }
  /**
   * An implicit conversion that turns a Scala <code>Symbol</code> into a {@link Column}.
   * @since 1.3.0
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.ColumnName symbolToColumn (scala.Symbol s) { throw new RuntimeException(); }
  /**
   * Creates a DataFrame from an RDD of Product (e.g. case classes, tuples).
   * @since 1.3.0
   * @param rdd (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <A extends scala.Product> org.apache.spark.sql.DataFrameHolder rddToDataFrameHolder (org.apache.spark.rdd.RDD<A> rdd, scala.reflect.api.TypeTags.TypeTag<A> evidence$4) { throw new RuntimeException(); }
  /**
   * Creates a DataFrame from a local Seq of Product.
   * @since 1.3.0
   * @param data (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <A extends scala.Product> org.apache.spark.sql.DataFrameHolder localSeqToDataFrameHolder (scala.collection.Seq<A> data, scala.reflect.api.TypeTags.TypeTag<A> evidence$5) { throw new RuntimeException(); }
  /**
   * Creates a single column DataFrame from an RDD[Int].
   * @since 1.3.0
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameHolder intRddToDataFrameHolder (org.apache.spark.rdd.RDD<java.lang.Object> data) { throw new RuntimeException(); }
  /**
   * Creates a single column DataFrame from an RDD[Long].
   * @since 1.3.0
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameHolder longRddToDataFrameHolder (org.apache.spark.rdd.RDD<java.lang.Object> data) { throw new RuntimeException(); }
  /**
   * Creates a single column DataFrame from an RDD[String].
   * @since 1.3.0
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameHolder stringRddToDataFrameHolder (org.apache.spark.rdd.RDD<java.lang.String> data) { throw new RuntimeException(); }
}

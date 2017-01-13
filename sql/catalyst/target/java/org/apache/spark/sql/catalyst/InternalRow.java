package org.apache.spark.sql.catalyst;
/**
 * An abstract class for row used internal in Spark SQL, which only contain the columns as
 * internal types.
 */
public abstract class InternalRow implements org.apache.spark.sql.catalyst.expressions.SpecializedGetters, scala.Serializable {
  /**
   * This method can be used to construct a {@link InternalRow} with the given values.
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.InternalRow apply (scala.collection.Seq<java.lang.Object> values) { throw new RuntimeException(); }
  /**
   * This method can be used to construct a {@link InternalRow} from a {@link Seq} of values.
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.InternalRow fromSeq (scala.collection.Seq<java.lang.Object> values) { throw new RuntimeException(); }
  /** Returns an empty {@link InternalRow}. */
  static public  org.apache.spark.sql.catalyst.InternalRow empty () { throw new RuntimeException(); }
  public   InternalRow () { throw new RuntimeException(); }
  public abstract  int numFields () ;
  public  java.lang.String getString (int ordinal) { throw new RuntimeException(); }
  /**
   * Make a copy of the current {@link InternalRow} object.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.InternalRow copy () ;
  /** Returns true if there are any NULL values in this row. */
  public abstract  boolean anyNull () ;
  /**
   * Return a Scala Seq representing the row. Elements are placed in the same order in the Seq.
   * @param fieldTypes (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> toSeq (scala.collection.Seq<org.apache.spark.sql.types.DataType> fieldTypes) { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> toSeq (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
}

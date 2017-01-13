package org.apache.spark.sql.catalyst.encoders;
public  class ExpressionEncoder<T extends java.lang.Object> implements org.apache.spark.sql.Encoder<T>, scala.Product, scala.Serializable {
  static public <T extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> apply (scala.reflect.api.TypeTags.TypeTag<T> evidence$1) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> javaBean (java.lang.Class<T> beanClass) { throw new RuntimeException(); }
  /**
   * Given a set of N encoders, constructs a new encoder that produce objects as items in an
   * N-tuple.  Note that these encoders should be unresolved so that information about
   * name/positional binding is preserved.
   * @param encoders (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<?> tuple (scala.collection.Seq<org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<?>> encoders) { throw new RuntimeException(); }
  static public <T1 extends java.lang.Object, T2 extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple2<T1, T2>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T1> e1, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T2> e2) { throw new RuntimeException(); }
  static public <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple3<T1, T2, T3>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T1> e1, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T2> e2, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T3> e3) { throw new RuntimeException(); }
  static public <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object, T4 extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple4<T1, T2, T3, T4>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T1> e1, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T2> e2, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T3> e3, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T4> e4) { throw new RuntimeException(); }
  static public <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object, T4 extends java.lang.Object, T5 extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple5<T1, T2, T3, T4, T5>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T1> e1, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T2> e2, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T3> e3, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T4> e4, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T5> e5) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema () { throw new RuntimeException(); }
  public  boolean flat () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> toRowExpressions () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression fromRowExpression () { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> clsTag () { throw new RuntimeException(); }
  // not preceding
  public   ExpressionEncoder (org.apache.spark.sql.types.StructType schema, boolean flat, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> toRowExpressions, org.apache.spark.sql.catalyst.expressions.Expression fromRowExpression, scala.reflect.ClassTag<T> clsTag) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection extractProjection () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.GenericMutableRow inputRow () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Projection constructProjection () { throw new RuntimeException(); }
  /**
   * Returns an encoded version of <code>t</code> as a Spark SQL row.  Note that multiple calls to
   * toRow are allowed to return the same actual {@link InternalRow} object.  Thus, the caller should
   * copy the result before making another call if required.
   * @param t (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow toRow (T t) { throw new RuntimeException(); }
  /**
   * Returns an object of type <code>T</code>, extracting the required values from the provided row.  Note that
   * you must <code>resolve</code> and <code>bind</code> an encoder to a specific schema before you can call this
   * function.
   * @param row (undocumented)
   * @return (undocumented)
   */
  public  T fromRow (org.apache.spark.sql.catalyst.InternalRow row) { throw new RuntimeException(); }
  /**
   * The process of resolution to a given schema throws away information about where a given field
   * is being bound by ordinal instead of by name.  This method checks to make sure this process
   * has not been done already in places where we plan to do later composition of encoders.
   */
  public  void assertUnresolved () { throw new RuntimeException(); }
  /**
   * Returns a new copy of this encoder, where the expressions used by <code>fromRow</code> are resolved to the
   * given schema.
   * @param schema (undocumented)
   * @param outerScopes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> resolve (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> outerScopes) { throw new RuntimeException(); }
  /**
   * Returns a copy of this encoder where the expressions used to construct an object from an input
   * row have been bound to the ordinals of the given schema.  Note that you need to first call
   * resolve before bind.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> bind (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema) { throw new RuntimeException(); }
  /**
   * Returns a new encoder with input columns shifted by <code>delta</code> ordinals
   * @param delta (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> shift (int delta) { throw new RuntimeException(); }
  protected  scala.collection.Seq<java.lang.String> attrs () { throw new RuntimeException(); }
  protected  java.lang.String schemaString () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

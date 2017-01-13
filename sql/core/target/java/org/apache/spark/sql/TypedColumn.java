package org.apache.spark.sql;
/**
 * A {@link Column} where an {@link Encoder} has been given for the expected input and return type.
 * To create a {@link TypedColumn}, use the <code>as</code> function on a {@link Column}.
 * <p>
 * @tparam T The input type expected for this expression.  Can be <code>Any</code> if the expression is type
 *           checked by the analyzer instead of the compiler (i.e. <code>expr("sum(...)")</code>).
 * @tparam U The output type of this column.
 * <p>
 * @since 1.6.0
 */
public  class TypedColumn<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.sql.Column {
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> encoder () { throw new RuntimeException(); }
  // not preceding
  public   TypedColumn (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> encoder) { throw new RuntimeException(); }
  /**
   * Inserts the specific input type and schema into any expressions that are expected to operate
   * on a decoded object.
   * @param inputEncoder (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.TypedColumn<T, U> withInputType (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<?> inputEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema) { throw new RuntimeException(); }
}

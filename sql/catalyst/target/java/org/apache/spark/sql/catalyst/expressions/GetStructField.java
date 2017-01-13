package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the value of fields in the Struct <code>child</code>.
 * <p>
 * No need to do type checking since it is handled by {@link ExtractValue}.
 * <p>
 * Note that we can pass in the field name directly to keep case preserving in <code>toString</code>.
 * For example, when get field <code>yEAr</code> from <code><year: int, month: int></code>, we should pass in <code>yEAr</code>.
 */
public  class GetStructField extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  int ordinal () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name () { throw new RuntimeException(); }
  // not preceding
  public   GetStructField (org.apache.spark.sql.catalyst.expressions.Expression child, int ordinal, scala.Option<java.lang.String> name) { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructField field () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

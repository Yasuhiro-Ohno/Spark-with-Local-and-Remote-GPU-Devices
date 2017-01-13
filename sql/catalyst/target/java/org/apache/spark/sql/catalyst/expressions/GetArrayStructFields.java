package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the array of value of fields in the Array of Struct <code>child</code>.
 * <p>
 * No need to do type checking since it is handled by {@link ExtractValue}.
 */
public  class GetArrayStructFields extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructField field () { throw new RuntimeException(); }
  public  int ordinal () { throw new RuntimeException(); }
  public  int numFields () { throw new RuntimeException(); }
  public  boolean containsNull () { throw new RuntimeException(); }
  // not preceding
  public   GetArrayStructFields (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.types.StructField field, int ordinal, int numFields, boolean containsNull) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

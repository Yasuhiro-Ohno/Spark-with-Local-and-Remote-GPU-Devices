package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression to generate a 64-bit long prefix used in sorting.
 */
public  class SortPrefix extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.SortOrder child () { throw new RuntimeException(); }
  // not preceding
  public   SortPrefix (org.apache.spark.sql.catalyst.expressions.SortOrder child) { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
}

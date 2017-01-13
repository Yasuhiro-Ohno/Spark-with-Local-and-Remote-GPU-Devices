package org.apache.spark.sql.catalyst.expressions;
public  class Literal extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.Literal apply (Object v) { throw new RuntimeException(); }
  /**
   * Constructs a {@link Literal} of {@link ObjectType}, for example when you need to pass an object
   * into code generation.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.Literal fromObject (java.lang.Object obj) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Literal create (Object v, org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  public  Object value () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  // not preceding
  protected   Literal (Object value, org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  boolean equals (Object other) { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
public  class Hex extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  static public  byte[] hexDigits () { throw new RuntimeException(); }
  static public  byte[] unhexDigits () { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.types.UTF8String hex (byte[] bytes) { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.types.UTF8String hex (long num) { throw new RuntimeException(); }
  static public  byte[] unhex (byte[] bytes) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  // not preceding
  public   Hex (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object num) { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

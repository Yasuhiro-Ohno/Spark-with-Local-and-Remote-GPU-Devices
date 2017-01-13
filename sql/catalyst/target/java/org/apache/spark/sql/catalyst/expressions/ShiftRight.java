package org.apache.spark.sql.catalyst.expressions;
/**
 * Bitwise unsigned left shift.
 * param:  left the base number to shift.
 * param:  right number of bits to left shift.
 */
public  class ShiftRight extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  // not preceding
  public   ShiftRight (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input1, Object input2) { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

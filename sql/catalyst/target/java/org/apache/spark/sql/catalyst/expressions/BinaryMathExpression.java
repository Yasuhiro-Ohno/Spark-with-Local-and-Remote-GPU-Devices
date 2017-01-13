package org.apache.spark.sql.catalyst.expressions;
/**
 * A binary expression specifically for math functions that take two <code>Double</code>s as input and returns
 * a <code>Double</code>.
 * param:  f The math function.
 * param:  name The short name of the function
 */
public abstract class BinaryMathExpression extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements scala.Serializable, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public   BinaryMathExpression (scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> f, java.lang.String name) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input1, Object input2) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

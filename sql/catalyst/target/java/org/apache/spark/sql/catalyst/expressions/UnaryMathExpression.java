package org.apache.spark.sql.catalyst.expressions;
/**
 * A unary expression specifically for math functions. Math Functions expect a specific type of
 * input format, therefore these functions extend <code>ExpectsInputTypes</code>.
 * param:  f The math function.
 * param:  name The short name of the function
 */
public abstract class UnaryMathExpression extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Serializable, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public  scala.Function1<java.lang.Object, java.lang.Object> f () { throw new RuntimeException(); }
  // not preceding
  public   UnaryMathExpression (scala.Function1<java.lang.Object, java.lang.Object> f, java.lang.String name) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input) { throw new RuntimeException(); }
  public  java.lang.String funcName () { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

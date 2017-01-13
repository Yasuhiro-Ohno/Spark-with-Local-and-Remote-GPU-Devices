package org.apache.spark.sql.catalyst.expressions;
public abstract class UnaryLogExpression extends org.apache.spark.sql.catalyst.expressions.UnaryMathExpression {
  public   UnaryLogExpression (scala.Function1<java.lang.Object, java.lang.Object> f, java.lang.String name) { throw new RuntimeException(); }
  protected  double yAsymptote () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

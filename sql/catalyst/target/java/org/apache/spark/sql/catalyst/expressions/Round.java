package org.apache.spark.sql.catalyst.expressions;
/**
 * Round the <code>child</code>'s result to <code>scale</code> decimal place when <code>scale</code> >= 0
 * or round at integral part when <code>scale</code> < 0.
 * For example, round(31.415, 2) = 31.42 and round(31.415, -1) = 30.
 * <p>
 * Child of IntegralType would round to itself when <code>scale</code> >= 0.
 * Child of FractionalType whose value is NaN or Infinite would always round to itself.
 * <p>
 * Round's dataType would always equal to <code>child</code>'s dataType except for DecimalType,
 * which would lead scale decrease from the origin DecimalType.
 * <p>
 * param:  child expr to be round, all {@link NumericType} is allowed as Input
 * param:  scale new scale to be round to, this should be a constant int at runtime
 */
public  class Round extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression scale () { throw new RuntimeException(); }
  // not preceding
  public   Round (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression scale) { throw new RuntimeException(); }
  public   Round (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  private  Object scaleV () { throw new RuntimeException(); }
  private  int _scale () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  Object nullSafeEval (Object input1) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression with three inputs and one output. The output is by default evaluated to null
 * if any input is evaluated to null.
 */
public abstract class TernaryExpression extends org.apache.spark.sql.catalyst.expressions.Expression {
  public   TernaryExpression () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  /**
   * Default behavior of evaluation according to the default nullability of TernaryExpression.
   * If subclass of BinaryExpression override nullable, probably should also override this.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  /**
   * Called by default {@link eval} implementation.  If subclass of TernaryExpression keep the default
   * nullability, they can override this method to save null-check code.  If we need full control
   * of evaluation process, we should override {@link eval}.
   * @param input1 (undocumented)
   * @param input2 (undocumented)
   * @param input3 (undocumented)
   * @return (undocumented)
   */
  protected  Object nullSafeEval (Object input1, Object input2, Object input3) { throw new RuntimeException(); }
  /**
   * Short hand for generating binary evaluation code.
   * If either of the sub-expressions is null, the result of this computation
   * is assumed to be null.
   * <p>
   * @param f accepts two variable names and returns Java code to compute the output.
   * @param ctx (undocumented)
   * @param ev (undocumented)
   * @return (undocumented)
   */
  protected  java.lang.String defineCodeGen (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev, scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> f) { throw new RuntimeException(); }
  /**
   * Short hand for generating binary evaluation code.
   * If either of the sub-expressions is null, the result of this computation
   * is assumed to be null.
   * <p>
   * @param f function that accepts the 2 non-null evaluation result names of children
   *          and returns Java code to compute the output.
   * @param ctx (undocumented)
   * @param ev (undocumented)
   * @return (undocumented)
   */
  protected  java.lang.String nullSafeCodeGen (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev, scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> f) { throw new RuntimeException(); }
}

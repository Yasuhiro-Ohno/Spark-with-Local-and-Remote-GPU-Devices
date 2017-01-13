package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Java source for evaluating an {@link Expression} given a {@link InternalRow} of input.
 * <p>
 * param:  code The sequence of statements required to evaluate the expression.
 * param:  isNull A term that holds a boolean value representing whether the expression evaluated
 *                 to null.
 * param:  value A term for a (possibly primitive) value of the result of the evaluation. Not
 *              valid if <code>isNull</code> is set to <code>true</code>.
 */
public  class GeneratedExpressionCode implements scala.Product, scala.Serializable {
  public  java.lang.String code () { throw new RuntimeException(); }
  public  java.lang.String isNull () { throw new RuntimeException(); }
  public  java.lang.String value () { throw new RuntimeException(); }
  // not preceding
  public   GeneratedExpressionCode (java.lang.String code, java.lang.String isNull, java.lang.String value) { throw new RuntimeException(); }
}

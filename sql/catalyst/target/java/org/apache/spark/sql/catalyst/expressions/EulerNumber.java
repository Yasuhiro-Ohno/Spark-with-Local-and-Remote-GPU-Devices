package org.apache.spark.sql.catalyst.expressions;
/**
 * Euler's number. Note that there is no code generation because this is only
 * evaluated by the optimizer during constant folding.
 */
public  class EulerNumber extends org.apache.spark.sql.catalyst.expressions.LeafMathExpression implements scala.Product, scala.Serializable {
  public   EulerNumber () { throw new RuntimeException(); }
}

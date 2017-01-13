package org.apache.spark.sql.catalyst.analysis;
/**
 * Extracts a value or values from an Expression
 * <p>
 * param:  child The expression to extract value from,
 *              can be Map, Array, Struct or array of Structs.
 * param:  extraction The expression to describe the extraction,
 *                   can be key of Map, index of Array, field name of Struct.
 */
public  class UnresolvedExtractValue extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression extraction () { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedExtractValue (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression extraction) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the field at <code>ordinal</code> in the Array <code>child</code>.
 * <p>
 * We need to do type checking here as <code>ordinal</code> expression maybe unresolved.
 */
public  class GetArrayItem extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression ordinal () { throw new RuntimeException(); }
  // not preceding
  public   GetArrayItem (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression ordinal) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  /** `Null` is returned for invalid ordinals. */
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object value, Object ordinal) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

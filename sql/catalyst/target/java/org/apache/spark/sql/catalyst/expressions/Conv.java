package org.apache.spark.sql.catalyst.expressions;
/**
 * Convert a num from one base to another
 * param:  numExpr the number to be converted
 * param:  fromBaseExpr from which base
 * param:  toBaseExpr to which base
 */
public  class Conv extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression numExpr () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression fromBaseExpr () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression toBaseExpr () { throw new RuntimeException(); }
  // not preceding
  public   Conv (org.apache.spark.sql.catalyst.expressions.Expression numExpr, org.apache.spark.sql.catalyst.expressions.Expression fromBaseExpr, org.apache.spark.sql.catalyst.expressions.Expression toBaseExpr) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object num, Object fromBase, Object toBase) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

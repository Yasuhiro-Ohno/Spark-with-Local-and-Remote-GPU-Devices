package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the substring from string str before count occurrences of the delimiter delim.
 * If count is positive, everything the left of the final delimiter (counting from left) is
 * returned. If count is negative, every to the right of the final delimiter (counting from the
 * right) is returned. substring_index performs a case-sensitive match when searching for delim.
 */
public  class SubstringIndex extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression strExpr () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression delimExpr () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression countExpr () { throw new RuntimeException(); }
  // not preceding
  public   SubstringIndex (org.apache.spark.sql.catalyst.expressions.Expression strExpr, org.apache.spark.sql.catalyst.expressions.Expression delimExpr, org.apache.spark.sql.catalyst.expressions.Expression countExpr) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object str, Object delim, Object count) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

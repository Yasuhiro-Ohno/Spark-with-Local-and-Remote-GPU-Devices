package org.apache.spark.sql.catalyst.expressions;
/** Generate a random column with i.i.d. uniformly distributed values in [0, 1). */
public  class Rand extends org.apache.spark.sql.catalyst.expressions.RDG implements scala.Product, scala.Serializable {
  public  long seed () { throw new RuntimeException(); }
  // not preceding
  public   Rand (long seed) { throw new RuntimeException(); }
  protected  double evalInternal (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public   Rand () { throw new RuntimeException(); }
  public   Rand (org.apache.spark.sql.catalyst.expressions.Expression seed) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

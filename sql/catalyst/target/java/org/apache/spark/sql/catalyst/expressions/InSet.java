package org.apache.spark.sql.catalyst.expressions;
/**
 * Optimized version of In clause, when all filter values of In clause are
 * static.
 */
public  class InSet extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.Predicate, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> hset () { throw new RuntimeException(); }
  // not preceding
  public   InSet (org.apache.spark.sql.catalyst.expressions.Expression child, scala.collection.immutable.Set<java.lang.Object> hset) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  private  boolean hasNull () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object value) { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> getHSet () { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

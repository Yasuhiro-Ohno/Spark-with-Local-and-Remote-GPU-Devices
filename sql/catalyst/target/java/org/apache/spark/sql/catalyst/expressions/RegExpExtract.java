package org.apache.spark.sql.catalyst.expressions;
/**
 * Extract a specific(idx) group identified by a Java regex.
 * <p>
 * NOTE: this expression is not THREAD-SAFE, as it has some internal mutable status.
 */
public  class RegExpExtract extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression subject () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression regexp () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression idx () { throw new RuntimeException(); }
  // not preceding
  public   RegExpExtract (org.apache.spark.sql.catalyst.expressions.Expression subject, org.apache.spark.sql.catalyst.expressions.Expression regexp, org.apache.spark.sql.catalyst.expressions.Expression idx) { throw new RuntimeException(); }
  public   RegExpExtract (org.apache.spark.sql.catalyst.expressions.Expression s, org.apache.spark.sql.catalyst.expressions.Expression r) { throw new RuntimeException(); }
  private  org.apache.spark.unsafe.types.UTF8String lastRegex () { throw new RuntimeException(); }
  private  java.util.regex.Pattern pattern () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object s, Object p, Object r) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

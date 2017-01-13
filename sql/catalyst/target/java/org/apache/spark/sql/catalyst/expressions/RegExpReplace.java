package org.apache.spark.sql.catalyst.expressions;
/**
 * Replace all substrings of str that match regexp with rep.
 * <p>
 * NOTE: this expression is not THREAD-SAFE, as it has some internal mutable status.
 */
public  class RegExpReplace extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression subject () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression regexp () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression rep () { throw new RuntimeException(); }
  // not preceding
  public   RegExpReplace (org.apache.spark.sql.catalyst.expressions.Expression subject, org.apache.spark.sql.catalyst.expressions.Expression regexp, org.apache.spark.sql.catalyst.expressions.Expression rep) { throw new RuntimeException(); }
  private  org.apache.spark.unsafe.types.UTF8String lastRegex () { throw new RuntimeException(); }
  private  java.util.regex.Pattern pattern () { throw new RuntimeException(); }
  private  java.lang.String lastReplacement () { throw new RuntimeException(); }
  private  org.apache.spark.unsafe.types.UTF8String lastReplacementInUTF8 () { throw new RuntimeException(); }
  private  java.lang.StringBuffer result () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object s, Object p, Object r) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

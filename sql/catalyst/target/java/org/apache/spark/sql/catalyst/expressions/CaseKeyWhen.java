package org.apache.spark.sql.catalyst.expressions;
/**
 * Case statements of the form "CASE a WHEN b THEN c [WHEN d THEN e]* [ELSE f] END".
 * Refer to this link for the corresponding semantics:
 * https://cwiki.apache.org/confluence/display/Hive/LanguageManual+UDF#LanguageManualUDF-ConditionalFunctions
 */
public  class CaseKeyWhen extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.CaseWhenLike, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression key () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> branches () { throw new RuntimeException(); }
  // not preceding
  public   CaseKeyWhen (org.apache.spark.sql.catalyst.expressions.Expression key, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> branches) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression[] branchesArr () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkTypesInternal () { throw new RuntimeException(); }
  private  Object evalElse (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  /** Written in imperative fashion for performance considerations. */
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

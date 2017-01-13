package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that is evaluated to the first non-null input.
 * <p>
 * <pre><code>
 *   coalesce(1, 2) =&gt; 1
 *   coalesce(null, 1, 2) =&gt; 1
 *   coalesce(null, null, 2) =&gt; 2
 *   coalesce(null, null, null) =&gt; null
 * </code></pre>
 */
public  class Coalesce extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   Coalesce (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  /** Coalesce is nullable if all of its children are nullable, or if it has no children. */
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

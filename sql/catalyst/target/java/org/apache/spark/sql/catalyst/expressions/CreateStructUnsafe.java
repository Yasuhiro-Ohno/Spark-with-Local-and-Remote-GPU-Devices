package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns a Row containing the evaluation of all children expressions. This is a variant that
 * returns UnsafeRow directly. The unsafe projection operator replaces {@link CreateStruct} with
 * this expression automatically at runtime.
 */
public  class CreateStructUnsafe extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   CreateStructUnsafe (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType dataType () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
/**
 * Expression that returns the name of the current file being read in using {@link SqlNewHadoopRDD}
 */
public  class InputFileName extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.Nondeterministic, scala.Product, scala.Serializable {
  public   InputFileName () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  protected  void initInternal () { throw new RuntimeException(); }
  protected  org.apache.spark.unsafe.types.UTF8String evalInternal (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

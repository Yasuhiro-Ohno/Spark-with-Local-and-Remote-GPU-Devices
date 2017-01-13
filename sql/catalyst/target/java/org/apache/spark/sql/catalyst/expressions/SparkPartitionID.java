package org.apache.spark.sql.catalyst.expressions;
/**
 * Expression that returns the current partition id of the Spark task.
 */
  class SparkPartitionID extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.Nondeterministic, scala.Product, scala.Serializable {
  public   SparkPartitionID () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  protected  void initInternal () { throw new RuntimeException(); }
  protected  int evalInternal (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
public  class If extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression predicate () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression trueValue () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression falseValue () { throw new RuntimeException(); }
  // not preceding
  public   If (org.apache.spark.sql.catalyst.expressions.Expression predicate, org.apache.spark.sql.catalyst.expressions.Expression trueValue, org.apache.spark.sql.catalyst.expressions.Expression falseValue) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

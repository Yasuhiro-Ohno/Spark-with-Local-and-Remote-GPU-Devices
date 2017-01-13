package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that returns the greatest value of all parameters, skipping null values.
 * It takes at least 2 parameters, and returns null iff all parameters are null.
 */
public  class Greatest extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   Greatest (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  private  scala.math.Ordering<java.lang.Object> ordering () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

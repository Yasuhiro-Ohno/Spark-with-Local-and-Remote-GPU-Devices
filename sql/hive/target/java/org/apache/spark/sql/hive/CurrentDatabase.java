package org.apache.spark.sql.hive;
/**
 * Returns the current database of metadataHive.
 */
  class CurrentDatabase extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.HiveContext ctx () { throw new RuntimeException(); }
  // not preceding
  public   CurrentDatabase (org.apache.spark.sql.hive.HiveContext ctx) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
}

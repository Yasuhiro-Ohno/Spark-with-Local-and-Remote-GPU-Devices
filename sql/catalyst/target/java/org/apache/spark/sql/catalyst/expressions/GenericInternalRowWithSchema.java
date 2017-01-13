package org.apache.spark.sql.catalyst.expressions;
/**
 * This is used for serialization of Python DataFrame
 */
public  class GenericInternalRowWithSchema extends org.apache.spark.sql.catalyst.expressions.GenericInternalRow {
  public  org.apache.spark.sql.types.StructType schema () { throw new RuntimeException(); }
  // not preceding
  public   GenericInternalRowWithSchema (java.lang.Object[] values, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  /** No-arg constructor for serialization. */
  protected   GenericInternalRowWithSchema () { throw new RuntimeException(); }
  public  int fieldIndex (java.lang.String name) { throw new RuntimeException(); }
}

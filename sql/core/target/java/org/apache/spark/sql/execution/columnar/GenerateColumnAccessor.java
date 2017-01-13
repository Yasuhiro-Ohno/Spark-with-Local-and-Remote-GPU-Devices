package org.apache.spark.sql.execution.columnar;
// no position
/**
 * Generates bytecode for an {@link ColumnarIterator} for columnar cache.
 */
public  class GenerateColumnAccessor extends org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator<scala.collection.Seq<org.apache.spark.sql.types.DataType>, org.apache.spark.sql.execution.columnar.ColumnarIterator> implements org.apache.spark.Logging {
  static protected  scala.collection.Seq<org.apache.spark.sql.types.DataType> canonicalize (scala.collection.Seq<org.apache.spark.sql.types.DataType> in) { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.types.DataType> bind (scala.collection.Seq<org.apache.spark.sql.types.DataType> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.columnar.ColumnarIterator create (scala.collection.Seq<org.apache.spark.sql.types.DataType> columnTypes) { throw new RuntimeException(); }
}

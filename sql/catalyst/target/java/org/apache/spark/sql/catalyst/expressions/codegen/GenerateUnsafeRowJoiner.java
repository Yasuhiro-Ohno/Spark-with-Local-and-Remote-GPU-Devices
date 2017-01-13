package org.apache.spark.sql.catalyst.expressions.codegen;
// no position
/**
 * A code generator for concatenating two {@link UnsafeRow}s into a single {@link UnsafeRow}.
 * <p>
 * The high level algorithm is:
 * <p>
 * 1. Concatenate the two bitsets together into a single one, taking padding into account.
 * 2. Move fixed-length data.
 * 3. Move variable-length data.
 * 4. Update the offset position (i.e. the upper 32 bits in the fixed length part) for all
 *    variable-length data.
 */
public  class GenerateUnsafeRowJoiner extends org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator<scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType>, org.apache.spark.sql.catalyst.expressions.codegen.UnsafeRowJoiner> {
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.UnsafeRowJoiner create (scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> in) { throw new RuntimeException(); }
  static protected  scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> canonicalize (scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> in) { throw new RuntimeException(); }
  static protected  scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> bind (scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.codegen.UnsafeRowJoiner create (org.apache.spark.sql.types.StructType schema1, org.apache.spark.sql.types.StructType schema2) { throw new RuntimeException(); }
}

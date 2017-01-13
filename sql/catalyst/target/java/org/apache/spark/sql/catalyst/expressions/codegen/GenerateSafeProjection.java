package org.apache.spark.sql.catalyst.expressions.codegen;
// no position
/**
 * Generates byte code that produces a {@link MutableRow} object (not an {@link UnsafeRow}) that can update
 * itself based on a new input {@link InternalRow} for a fixed set of {@link Expression Expressions}.
 */
public  class GenerateSafeProjection extends org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Projection> {
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> canonicalize (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in) { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> bind (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode createCodeForStruct (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, java.lang.String input, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode createCodeForArray (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType elementType) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode createCodeForMap (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode convertToSafe (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Projection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions) { throw new RuntimeException(); }
}

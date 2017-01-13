package org.apache.spark.sql.catalyst.expressions.codegen;
// no position
/**
 * Generates byte code that produces a {@link MutableRow} object that can update itself based on a new
 * input {@link InternalRow} for a fixed set of {@link Expression Expressions}.
 * It exposes a <code>target</code> method, which is used to set the row that will be updated.
 * The internal {@link MutableRow} object created internally is used only when <code>target</code> is not used.
 */
public  class GenerateMutableProjection extends org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Function0<org.apache.spark.sql.catalyst.expressions.MutableProjection>> {
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> canonicalize (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in) { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> bind (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  static protected  scala.Function0<org.apache.spark.sql.catalyst.expressions.MutableProjection> create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions) { throw new RuntimeException(); }
}

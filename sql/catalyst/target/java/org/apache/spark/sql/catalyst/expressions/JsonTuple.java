package org.apache.spark.sql.catalyst.expressions;
public  class JsonTuple extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Generator, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   JsonTuple (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> nullRow () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression jsonExpr () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> fieldExpressions () { throw new RuntimeException(); }
  private  scala.collection.IndexedSeq<java.lang.String> foldableFieldNames () { throw new RuntimeException(); }
  private  int constantFields () { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple3<org.apache.spark.sql.types.DataType, java.lang.Object, java.lang.String>> elementTypes () { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  public  scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow> eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> parseRow (com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  private  void copyCurrentStructure (com.fasterxml.jackson.core.JsonGenerator generator, com.fasterxml.jackson.core.JsonParser parser) { throw new RuntimeException(); }
}

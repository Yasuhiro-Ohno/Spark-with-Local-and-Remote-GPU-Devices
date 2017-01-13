package org.apache.spark.sql.catalyst.expressions;
/**
 * A generator that produces its output using the provided lambda function.
 */
public  class UserDefinedGenerator extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Generator, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  public  scala.collection.Seq<scala.Tuple3<org.apache.spark.sql.types.DataType, java.lang.Object, java.lang.String>> elementTypes () { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.sql.Row, scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow>> function () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   UserDefinedGenerator (scala.collection.Seq<scala.Tuple3<org.apache.spark.sql.types.DataType, java.lang.Object, java.lang.String>> elementTypes, scala.Function1<org.apache.spark.sql.Row, scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow>> function, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  private  void initializeConverters () { throw new RuntimeException(); }
  public  scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow> eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

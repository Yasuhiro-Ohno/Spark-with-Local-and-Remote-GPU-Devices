package org.apache.spark.sql.catalyst.expressions;
public  class NewInstance extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.NewInstance apply (java.lang.Class<?> cls, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments, boolean propagateNull, org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  public  Object cls () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments () { throw new RuntimeException(); }
  public  boolean propagateNull () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> outerPointer () { throw new RuntimeException(); }
  // not preceding
  public   NewInstance (java.lang.Class<?> cls, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments, boolean propagateNull, org.apache.spark.sql.types.DataType dataType, scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> outerPointer) { throw new RuntimeException(); }
  private  java.lang.String className () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

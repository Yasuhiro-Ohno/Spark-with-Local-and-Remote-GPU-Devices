package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class Count extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.Count apply (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   Count (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference count () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> initialValues () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.If> updateExpressions () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Cast evaluateExpression () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> defaultResult () { throw new RuntimeException(); }
}

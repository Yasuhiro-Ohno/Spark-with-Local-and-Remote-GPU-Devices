package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class Average extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  // not preceding
  public   Average (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.FractionalType resultType () { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.FractionalType sumDataType () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference sum () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference count () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback> initialValues () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression () { throw new RuntimeException(); }
}

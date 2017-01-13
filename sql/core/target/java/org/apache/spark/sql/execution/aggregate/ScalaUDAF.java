package org.apache.spark.sql.execution.aggregate;
/**
 * The internal wrapper used to hook a {@link UserDefinedAggregateFunction} <code>udaf</code> in the
 * internal aggregation code path.
 */
  class ScalaUDAF extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate implements org.apache.spark.Logging, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  org.apache.spark.sql.expressions.UserDefinedAggregateFunction udaf () { throw new RuntimeException(); }
  public  int mutableAggBufferOffset () { throw new RuntimeException(); }
  public  int inputAggBufferOffset () { throw new RuntimeException(); }
  // not preceding
  public   ScalaUDAF (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children, org.apache.spark.sql.expressions.UserDefinedAggregateFunction udaf, int mutableAggBufferOffset, int inputAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean deterministic () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType aggBufferSchema () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes () { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType childrenSchema () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.MutableProjection inputProjection () { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> inputToScalaConverters () { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object>[] bufferValuesToCatalystConverters () { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object>[] bufferValuesToScalaConverters () { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> outputToCatalystConverter () { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.aggregate.InputAggregationBuffer inputAggregateBuffer () { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.aggregate.MutableAggregationBufferImpl mutableAggregateBuffer () { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.aggregate.InputAggregationBuffer evalAggregateBuffer () { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.sql.catalyst.expressions.MutableRow buffer) { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.expressions.MutableRow buffer, org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  void merge (org.apache.spark.sql.catalyst.expressions.MutableRow buffer1, org.apache.spark.sql.catalyst.InternalRow buffer2) { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow buffer) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  java.lang.String nodeName () { throw new RuntimeException(); }
}

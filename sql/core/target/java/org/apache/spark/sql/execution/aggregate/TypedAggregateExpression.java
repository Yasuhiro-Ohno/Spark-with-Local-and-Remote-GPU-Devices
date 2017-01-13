package org.apache.spark.sql.execution.aggregate;
public  class TypedAggregateExpression extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate implements org.apache.spark.Logging, scala.Product, scala.Serializable {
  static public <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object> org.apache.spark.sql.execution.aggregate.TypedAggregateExpression apply (org.apache.spark.sql.expressions.Aggregator<A, B, C> aggregator, org.apache.spark.sql.Encoder<B> evidence$1, org.apache.spark.sql.Encoder<C> evidence$2) { throw new RuntimeException(); }
  public  org.apache.spark.sql.expressions.Aggregator<java.lang.Object, java.lang.Object, java.lang.Object> aggregator () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object>> aEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> unresolvedBEncoder () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> cEncoder () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> children () { throw new RuntimeException(); }
  public  int mutableAggBufferOffset () { throw new RuntimeException(); }
  public  int inputAggBufferOffset () { throw new RuntimeException(); }
  // not preceding
  public   TypedAggregateExpression (org.apache.spark.sql.expressions.Aggregator<java.lang.Object, java.lang.Object, java.lang.Object> aggregator, scala.Option<org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object>> aEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> unresolvedBEncoder, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> cEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> children, int mutableAggBufferOffset, int inputAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean deterministic () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType aggBufferSchema () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> bEncoder () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> boundA () { throw new RuntimeException(); }
  private  void updateBuffer (org.apache.spark.sql.catalyst.expressions.MutableRow buffer, org.apache.spark.sql.catalyst.InternalRow value) { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.sql.catalyst.expressions.MutableRow buffer) { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.expressions.MutableRow buffer, org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  void merge (org.apache.spark.sql.catalyst.expressions.MutableRow buffer1, org.apache.spark.sql.catalyst.InternalRow buffer2) { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow buffer) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  java.lang.String nodeName () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Compute Pearson correlation between two expressions.
 * When applied on empty data (i.e., count is zero), it returns NULL.
 * <p>
 * Definition of Pearson correlation can be found at
 * http://en.wikipedia.org/wiki/Pearson_product-moment_correlation_coefficient
 */
public  class Corr extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  int mutableAggBufferOffset () { throw new RuntimeException(); }
  public  int inputAggBufferOffset () { throw new RuntimeException(); }
  // not preceding
  public   Corr (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, int mutableAggBufferOffset, int inputAggBufferOffset) { throw new RuntimeException(); }
  public   Corr (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType aggBufferSchema () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset) { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.sql.catalyst.expressions.MutableRow buffer) { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.expressions.MutableRow buffer, org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  void merge (org.apache.spark.sql.catalyst.expressions.MutableRow buffer1, org.apache.spark.sql.catalyst.InternalRow buffer2) { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow buffer) { throw new RuntimeException(); }
}

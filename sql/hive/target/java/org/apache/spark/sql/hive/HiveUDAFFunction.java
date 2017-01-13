package org.apache.spark.sql.hive;
/**
 * Currently we don't support partial aggregation for queries using Hive UDAF, which may hurt
 * performance a lot.
 */
  class HiveUDAFFunction extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate implements org.apache.spark.sql.hive.HiveInspectors, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.HiveShim.HiveFunctionWrapper funcWrapper () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean isUDAFBridgeRequired () { throw new RuntimeException(); }
  public  int mutableAggBufferOffset () { throw new RuntimeException(); }
  public  int inputAggBufferOffset () { throw new RuntimeException(); }
  // not preceding
  public   HiveUDAFFunction (org.apache.spark.sql.hive.HiveShim.HiveFunctionWrapper funcWrapper, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children, boolean isUDAFBridgeRequired, int mutableAggBufferOffset, int inputAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset) { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver resolver () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector[] inspectors () { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector> functionAndInspector () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator function () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector returnInspector () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.InterpretedProjection inputProjection () { throw new RuntimeException(); }
  private  java.lang.Object[] cached () { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType[] inputDataTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType aggBufferSchema () { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.expressions.MutableRow _buffer, org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  void merge (org.apache.spark.sql.catalyst.expressions.MutableRow buffer1, org.apache.spark.sql.catalyst.InternalRow buffer2) { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.sql.catalyst.expressions.MutableRow _buffer) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean supportsPartial () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
}

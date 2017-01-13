package org.apache.spark.sql.hive;
/**
 * A {@link WindowFunction} implementation wrapping Hive's window function.
 * param:  funcWrapper The wrapper for the Hive Window Function.
 * param:  pivotResult If it is true, the Hive function will return a list of values representing
 *                    the values of the added columns. Otherwise, a single value is returned for
 *                    current row.
 * param:  isUDAFBridgeRequired If it is true, the function returned by functionWrapper's
 *                             createFunction is UDAF, we need to use GenericUDAFBridge to wrap
 *                             it as a GenericUDAFResolver2.
 * param:  children Input parameters.
 */
  class HiveWindowFunction extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.WindowFunction, org.apache.spark.sql.hive.HiveInspectors, org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.HiveShim.HiveFunctionWrapper funcWrapper () { throw new RuntimeException(); }
  public  boolean pivotResult () { throw new RuntimeException(); }
  public  boolean isUDAFBridgeRequired () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   HiveWindowFunction (org.apache.spark.sql.hive.HiveShim.HiveFunctionWrapper funcWrapper, boolean pivotResult, boolean isUDAFBridgeRequired, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  protected  org.apache.hadoop.hive.ql.udf.generic.GenericUDAFResolver2 resolver () { throw new RuntimeException(); }
  protected  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector[] inputInspectors () { throw new RuntimeException(); }
  protected  org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator evaluator () { throw new RuntimeException(); }
  protected  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector returnInspector () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.InterpretedProjection inputProjection () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.AggregationBuffer hiveEvaluatorBuffer () { throw new RuntimeException(); }
  private  Object outputBuffer () { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType[] inputDataTypes () { throw new RuntimeException(); }
  public  void init () { throw new RuntimeException(); }
  public  void reset () { throw new RuntimeException(); }
  public  java.lang.Object prepareInputParameters (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  void update (java.lang.Object input) { throw new RuntimeException(); }
  public  void batchUpdate (java.lang.Object[] inputs) { throw new RuntimeException(); }
  public  void evaluate () { throw new RuntimeException(); }
  public  Object get (int index) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.WindowFunction newInstance () { throw new RuntimeException(); }
}

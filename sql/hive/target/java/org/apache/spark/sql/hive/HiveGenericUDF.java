package org.apache.spark.sql.hive;
  class HiveGenericUDF extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.hive.HiveInspectors, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, org.apache.spark.Logging, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.HiveShim.HiveFunctionWrapper funcWrapper () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   HiveGenericUDF (org.apache.spark.sql.hive.HiveShim.HiveFunctionWrapper funcWrapper, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean deterministic () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.udf.generic.GenericUDF function () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector> argumentInspectors () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector returnInspector () { throw new RuntimeException(); }
  private  boolean isUDFDeterministic () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.udf.generic.GenericUDF.DeferredObject[] deferedObjects () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

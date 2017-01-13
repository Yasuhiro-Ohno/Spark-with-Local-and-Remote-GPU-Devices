package org.apache.spark.sql.hive;
  class HiveFunctionRegistry implements org.apache.spark.sql.catalyst.analysis.FunctionRegistry, org.apache.spark.sql.hive.HiveInspectors {
  public   HiveFunctionRegistry (org.apache.spark.sql.catalyst.analysis.FunctionRegistry underlying, org.apache.spark.sql.hive.client.ClientWrapper executionHive) { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.exec.FunctionInfo getFunctionInfo (java.lang.String name) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  void registerFunction (java.lang.String name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> builder) { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listFunction () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (java.lang.String name) { throw new RuntimeException(); }
}

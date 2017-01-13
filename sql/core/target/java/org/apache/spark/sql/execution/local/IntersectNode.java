package org.apache.spark.sql.execution.local;
public  class IntersectNode extends org.apache.spark.sql.execution.local.BinaryLocalNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode right () { throw new RuntimeException(); }
  // not preceding
  public   IntersectNode (org.apache.spark.sql.SQLConf conf, org.apache.spark.sql.execution.local.LocalNode left, org.apache.spark.sql.execution.local.LocalNode right) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  void open () { throw new RuntimeException(); }
  public  boolean next () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow fetch () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}

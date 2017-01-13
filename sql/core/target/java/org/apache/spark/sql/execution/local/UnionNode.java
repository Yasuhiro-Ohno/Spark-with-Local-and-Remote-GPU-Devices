package org.apache.spark.sql.execution.local;
public  class UnionNode extends org.apache.spark.sql.execution.local.LocalNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.local.LocalNode> children () { throw new RuntimeException(); }
  // not preceding
  public   UnionNode (org.apache.spark.sql.SQLConf conf, scala.collection.Seq<org.apache.spark.sql.execution.local.LocalNode> children) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  void open () { throw new RuntimeException(); }
  private  boolean advanceToNextChild () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow fetch () { throw new RuntimeException(); }
  public  boolean next () { throw new RuntimeException(); }
}

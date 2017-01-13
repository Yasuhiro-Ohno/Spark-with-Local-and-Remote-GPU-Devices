package org.apache.spark.sql.execution.local;
public  class ProjectNode extends org.apache.spark.sql.execution.local.UnaryLocalNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode child () { throw new RuntimeException(); }
  // not preceding
  public   ProjectNode (org.apache.spark.sql.SQLConf conf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, org.apache.spark.sql.execution.local.LocalNode child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  void open () { throw new RuntimeException(); }
  public  boolean next () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow fetch () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}

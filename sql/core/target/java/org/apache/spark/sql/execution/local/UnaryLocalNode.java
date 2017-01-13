package org.apache.spark.sql.execution.local;
public abstract class UnaryLocalNode extends org.apache.spark.sql.execution.local.LocalNode {
  public   UnaryLocalNode (org.apache.spark.sql.SQLConf conf) { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.execution.local.LocalNode child () ;
  public  scala.collection.Seq<org.apache.spark.sql.execution.local.LocalNode> children () { throw new RuntimeException(); }
}

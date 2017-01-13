package org.apache.spark.sql.execution.local;
public abstract class BinaryLocalNode extends org.apache.spark.sql.execution.local.LocalNode {
  public   BinaryLocalNode (org.apache.spark.sql.SQLConf conf) { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.execution.local.LocalNode left () ;
  public abstract  org.apache.spark.sql.execution.local.LocalNode right () ;
  public  scala.collection.Seq<org.apache.spark.sql.execution.local.LocalNode> children () { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.local;
public  class NestedLoopJoinNode extends org.apache.spark.sql.execution.local.BinaryLocalNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode right () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.BuildSide buildSide () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition () { throw new RuntimeException(); }
  // not preceding
  public   NestedLoopJoinNode (org.apache.spark.sql.SQLConf conf, org.apache.spark.sql.execution.local.LocalNode left, org.apache.spark.sql.execution.local.LocalNode right, org.apache.spark.sql.execution.joins.BuildSide buildSide, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  private  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> genResultProjection () { throw new RuntimeException(); }
  public  void open () { throw new RuntimeException(); }
  public  boolean next () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow fetch () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}

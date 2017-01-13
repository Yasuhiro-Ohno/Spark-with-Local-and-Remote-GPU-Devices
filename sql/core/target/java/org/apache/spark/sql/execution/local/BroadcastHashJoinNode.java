package org.apache.spark.sql.execution.local;
/**
 * A {@link HashJoinNode} for broadcast join. It takes a streamedNode and a broadcast
 * {@link HashedRelation}. The actual work of this node is defined in {@link HashJoinNode}.
 */
public  class BroadcastHashJoinNode extends org.apache.spark.sql.execution.local.UnaryLocalNode implements org.apache.spark.sql.execution.local.HashJoinNode, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> streamedKeys () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode streamedNode () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.BuildSide buildSide () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> buildOutput () { throw new RuntimeException(); }
  public  org.apache.spark.broadcast.Broadcast<org.apache.spark.sql.execution.joins.HashedRelation> hashedRelation () { throw new RuntimeException(); }
  // not preceding
  public   BroadcastHashJoinNode (org.apache.spark.sql.SQLConf conf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> streamedKeys, org.apache.spark.sql.execution.local.LocalNode streamedNode, org.apache.spark.sql.execution.joins.BuildSide buildSide, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> buildOutput, org.apache.spark.broadcast.Broadcast<org.apache.spark.sql.execution.joins.HashedRelation> hashedRelation) { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet inputSet () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  protected  void doOpen () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}

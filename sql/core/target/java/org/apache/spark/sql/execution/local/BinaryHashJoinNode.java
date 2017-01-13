package org.apache.spark.sql.execution.local;
/**
 * A {@link HashJoinNode} that builds the {@link HashedRelation} according to the value of
 * <code>buildSide</code>. The actual work of this node is defined in {@link HashJoinNode}.
 */
public  class BinaryHashJoinNode extends org.apache.spark.sql.execution.local.BinaryLocalNode implements org.apache.spark.sql.execution.local.HashJoinNode, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.BuildSide buildSide () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.local.LocalNode right () { throw new RuntimeException(); }
  // not preceding
  public   BinaryHashJoinNode (org.apache.spark.sql.SQLConf conf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, org.apache.spark.sql.execution.joins.BuildSide buildSide, org.apache.spark.sql.execution.local.LocalNode left, org.apache.spark.sql.execution.local.LocalNode right) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.local.LocalNode streamedNode () { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> streamedKeys () { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.local.LocalNode buildNode () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> buildKeys () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Projection buildSideKeyGenerator () { throw new RuntimeException(); }
  protected  void doOpen () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}

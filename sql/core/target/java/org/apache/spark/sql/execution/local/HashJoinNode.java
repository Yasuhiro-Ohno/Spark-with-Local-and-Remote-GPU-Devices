package org.apache.spark.sql.execution.local;
/**
 * An abstract node for sharing common functionality among different implementations of
 * inner hash equi-join, notably {@link BinaryHashJoinNode} and {@link BroadcastHashJoinNode}.
 * <p>
 * Much of this code is similar to {@link org.apache.spark.sql.execution.joins.HashJoin}.
 */
public  interface HashJoinNode {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> streamedKeys () ;
  public  org.apache.spark.sql.execution.local.LocalNode streamedNode () ;
  public  org.apache.spark.sql.execution.joins.BuildSide buildSide () ;
  public  org.apache.spark.sql.catalyst.expressions.Projection streamSideKeyGenerator () ;
  /**
   * Sets the HashedRelation used by this node. This method needs to be called after
   * before the first <code>next</code> gets called.
   * @param hashedRelation (undocumented)
   */
  public  void withHashedRelation (org.apache.spark.sql.execution.joins.HashedRelation hashedRelation) ;
  /**
   * Custom open implementation to be overridden by subclasses.
   */
  public  void doOpen () ;
  public  void open () ;
  public  boolean next () ;
  /**
   * Populate <code>currentHashMatches</code> with build-side rows matching the next streamed row.
   * @return whether matches are found such that subsequent calls to <code>fetch</code> are valid.
   */
  public  boolean fetchNextMatch () ;
  public  org.apache.spark.sql.catalyst.InternalRow fetch () ;
}

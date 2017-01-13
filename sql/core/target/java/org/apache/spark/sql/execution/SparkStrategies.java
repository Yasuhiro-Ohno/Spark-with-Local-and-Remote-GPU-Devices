package org.apache.spark.sql.execution;
 abstract class SparkStrategies extends org.apache.spark.sql.catalyst.planning.QueryPlanner<org.apache.spark.sql.execution.SparkPlan> {
  public   SparkStrategies () { throw new RuntimeException(); }
  // no position
  public  class LeftSemiJoin extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    public   LeftSemiJoin () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.LeftSemiJoin$ LeftSemiJoin () { throw new RuntimeException(); }
  // no position
  public  class CanBroadcast {
    /**
     * Matches a plan whose output should be small enough to be used in broadcast join.
     */
    public   CanBroadcast () { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.CanBroadcast$ CanBroadcast () { throw new RuntimeException(); }
  // no position
  public  class EquiJoinSelection extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    /**
     * Uses the {@link ExtractEquiJoinKeys} pattern to find joins where at least some of the predicates
     * can be evaluated by matching join keys.
     * <p>
     * Join implementations are chosen with the following precedence:
     * <p>
     * - Broadcast: if one side of the join has an estimated physical size that is smaller than the
     *     user-configurable {@link org.apache.spark.sql.SQLConf.AUTO_BROADCASTJOIN_THRESHOLD} threshold
     *     or if that side has an explicit broadcast hint (e.g. the user applied the
     *     {@link org.apache.spark.sql.functions.broadcast()} function to a DataFrame), then that side
     *     of the join will be broadcasted and the other side will be streamed, with no shuffling
     *     performed. If both sides of the join are eligible to be broadcasted then the
     * - Sort merge: if the matching join keys are sortable.
     */
    public   EquiJoinSelection () { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> makeBroadcastHashJoin (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, org.apache.spark.sql.execution.joins.BuildSide side) { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.EquiJoinSelection$ EquiJoinSelection () { throw new RuntimeException(); }
  // no position
  public  class Aggregation extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    /**
     * Used to plan the aggregate operator for expressions based on the AggregateFunction2 interface.
     */
    public   Aggregation () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.Aggregation$ Aggregation () { throw new RuntimeException(); }
  // no position
  public  class BroadcastNestedLoop extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   BroadcastNestedLoop () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.BroadcastNestedLoop$ BroadcastNestedLoop () { throw new RuntimeException(); }
  // no position
  public  class CartesianProduct extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   CartesianProduct () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.CartesianProduct$ CartesianProduct () { throw new RuntimeException(); }
  // no position
  public  class DefaultJoin extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   DefaultJoin () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.DefaultJoin$ DefaultJoin () { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> singleRowRdd () { throw new RuntimeException(); }
  // no position
  public  class TakeOrderedAndProject extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   TakeOrderedAndProject () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.TakeOrderedAndProject$ TakeOrderedAndProject () { throw new RuntimeException(); }
  // no position
  public  class InMemoryScans extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   InMemoryScans () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.InMemoryScans$ InMemoryScans () { throw new RuntimeException(); }
  // no position
  public  class BasicOperators extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   BasicOperators () { throw new RuntimeException(); }
    public  int numPartitions () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.BasicOperators$ BasicOperators () { throw new RuntimeException(); }
  // no position
  public  class DDLStrategy extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   DDLStrategy () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.DDLStrategy$ DDLStrategy () { throw new RuntimeException(); }
}

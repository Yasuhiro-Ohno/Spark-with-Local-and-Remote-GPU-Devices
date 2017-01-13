package org.apache.spark.sql.execution.aggregate;
/**
 * An iterator used to evaluate {@link AggregateFunction}. It assumes the input rows have been
 * sorted by values of {@link groupingKeyAttributes}.
 */
public  class SortBasedAggregationIterator extends org.apache.spark.sql.execution.aggregate.AggregationIterator {
  public   SortBasedAggregationIterator (scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> groupingKeyProjection, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingKeyAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> valueAttributes, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> inputIterator, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> nonCompleteAggregateExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> nonCompleteAggregateAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> completeAggregateExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> completeAggregateAttributes, int initialInputBufferOffset, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, scala.Function0<org.apache.spark.sql.catalyst.expressions.MutableProjection>> newMutableProjection, boolean outputsUnsafeRows, org.apache.spark.sql.execution.metric.LongSQLMetric numInputRows, org.apache.spark.sql.execution.metric.LongSQLMetric numOutputRows) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.MutableRow newBuffer () { throw new RuntimeException(); }
  protected  void initialize () { throw new RuntimeException(); }
  /** Processes rows in the current group. It will stop when it find a new group. */
  protected  void processCurrentSortedGroup () { throw new RuntimeException(); }
  public final  boolean hasNext () { throw new RuntimeException(); }
  public final  org.apache.spark.sql.catalyst.InternalRow next () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow outputForEmptyGroupingKeyWithoutInput () { throw new RuntimeException(); }
}

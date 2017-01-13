package org.apache.spark.sql.catalyst.expressions;
// no position
/**
 * RowFrame treats rows in a partition individually. When a {@link ValuePreceding}
 * or a {@link ValueFollowing} is used as its {@link FrameBoundary}, the value is considered
 * as a physical offset.
 * For example, <code>ROW BETWEEN 1 PRECEDING AND 1 FOLLOWING</code> represents a 3-row frame,
 * from the row precedes the current row to the row follows the current row.
 */
public  class RowFrame implements org.apache.spark.sql.catalyst.expressions.FrameType, scala.Product, scala.Serializable {
}

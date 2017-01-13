package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Returns the first value of <code>child</code> for a group of rows. If the first value of <code>child</code>
 * is <code>null</code>, it returns <code>null</code> (respecting nulls). Even if {@link First} is used on a already
 * sorted column, if we do partial aggregation and final aggregation (when mergeExpression
 * is used) its result will not be deterministic (unless the input table is sorted and has
 * a single partition, and we use a single reducer to do the aggregation.).
 */
public  class First extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression ignoreNullsExpr () { throw new RuntimeException(); }
  // not preceding
  public   First (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression ignoreNullsExpr) { throw new RuntimeException(); }
  public   First (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  private  boolean ignoreNulls () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean deterministic () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference first () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference valueSet () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> initialValues () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference evaluateExpression () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

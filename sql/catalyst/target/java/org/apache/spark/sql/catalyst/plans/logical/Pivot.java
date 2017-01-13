package org.apache.spark.sql.catalyst.plans.logical;
public  class Pivot extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupByExprs () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression pivotColumn () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> pivotValues () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> aggregates () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  // not preceding
  public   Pivot (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupByExprs, org.apache.spark.sql.catalyst.expressions.Expression pivotColumn, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> pivotValues, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> aggregates, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
}

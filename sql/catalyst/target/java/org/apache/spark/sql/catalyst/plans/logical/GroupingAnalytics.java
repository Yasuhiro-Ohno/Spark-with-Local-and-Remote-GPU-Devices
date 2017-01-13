package org.apache.spark.sql.catalyst.plans.logical;
public  interface GroupingAnalytics {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs () ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregations () ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () ;
  public  boolean resolved () ;
  public  org.apache.spark.sql.catalyst.plans.logical.GroupingAnalytics withNewAggs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggs) ;
}

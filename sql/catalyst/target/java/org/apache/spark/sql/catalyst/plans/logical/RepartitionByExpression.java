package org.apache.spark.sql.catalyst.plans.logical;
public  class RepartitionByExpression extends org.apache.spark.sql.catalyst.plans.logical.RedistributeData implements scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionExpressions () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numPartitions () { throw new RuntimeException(); }
  // not preceding
  public   RepartitionByExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionExpressions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.Option<java.lang.Object> numPartitions) { throw new RuntimeException(); }
}

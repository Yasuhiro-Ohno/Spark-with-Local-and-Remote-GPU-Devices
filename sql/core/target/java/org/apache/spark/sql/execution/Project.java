package org.apache.spark.sql.execution;
public  class Project extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  // not preceding
  public   Project (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, org.apache.spark.sql.execution.SparkPlan child) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.LongSQLMetric> metrics () { throw new RuntimeException(); }
  public  boolean outputsUnsafeRows () { throw new RuntimeException(); }
  public  boolean canProcessUnsafeRows () { throw new RuntimeException(); }
  public  boolean canProcessSafeRows () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering () { throw new RuntimeException(); }
}

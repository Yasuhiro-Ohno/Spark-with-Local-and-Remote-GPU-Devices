package org.apache.spark.sql.catalyst.plans.logical;
  class ShowFunctions extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  public  scala.Option<java.lang.String> db () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> pattern () { throw new RuntimeException(); }
  // not preceding
  public   ShowFunctions (scala.Option<java.lang.String> db, scala.Option<java.lang.String> pattern) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
}

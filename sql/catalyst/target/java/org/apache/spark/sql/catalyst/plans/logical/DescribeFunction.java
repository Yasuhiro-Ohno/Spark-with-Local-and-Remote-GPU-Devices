package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Returned for the "DESCRIBE [EXTENDED] FUNCTION functionName" command.
 * param:  functionName The function to be described.
 * param:  isExtended True if "DESCRIBE EXTENDED" is used. Otherwise, false.
 */
  class DescribeFunction extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  public  java.lang.String functionName () { throw new RuntimeException(); }
  public  boolean isExtended () { throw new RuntimeException(); }
  // not preceding
  public   DescribeFunction (java.lang.String functionName, boolean isExtended) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
}

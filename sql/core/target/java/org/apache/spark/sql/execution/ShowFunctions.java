package org.apache.spark.sql.execution;
/**
 * A command for users to list all of the registered functions.
 * The syntax of using this command in SQL is:
 * <pre><code>
 *    SHOW FUNCTIONS
 * </code></pre>
 * TODO currently we are simply ignore the db
 */
public  class ShowFunctions extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.RunnableCommand, scala.Product, scala.Serializable {
  public  scala.Option<java.lang.String> db () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> pattern () { throw new RuntimeException(); }
  // not preceding
  public   ShowFunctions (scala.Option<java.lang.String> db, scala.Option<java.lang.String> pattern) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
}

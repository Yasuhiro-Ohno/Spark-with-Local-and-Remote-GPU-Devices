package org.apache.spark.sql.hive;
  interface HiveStrategies {
  public  org.apache.spark.sql.hive.HiveContext hiveContext () ;
  // no position
  public  class Scripts extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   Scripts () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveStrategies.Scripts$ Scripts () ;
  // no position
  public  class DataSinks extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   DataSinks () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveStrategies.DataSinks$ DataSinks () ;
  // no position
  public  class HiveTableScans extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    /**
     * Retrieves data using a HiveTableScan.  Partition pruning predicates are also detected and
     * applied.
     */
    public   HiveTableScans () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveStrategies.HiveTableScans$ HiveTableScans () ;
  // no position
  public  class HiveDDLStrategy extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
    public   HiveDDLStrategy () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveStrategies.HiveDDLStrategy$ HiveDDLStrategy () ;
  public  class HiveCommandStrategy extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.hive.HiveContext context () { throw new RuntimeException(); }
    // not preceding
    public   HiveCommandStrategy (org.apache.spark.sql.hive.HiveContext context) { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  public  class HiveCommandStrategy extends scala.runtime.AbstractFunction1<org.apache.spark.sql.hive.HiveContext, org.apache.spark.sql.hive.HiveStrategies.HiveCommandStrategy> implements scala.Serializable {
    public   HiveCommandStrategy () { throw new RuntimeException(); }
  }
}

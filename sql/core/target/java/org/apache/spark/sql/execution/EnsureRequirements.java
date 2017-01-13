package org.apache.spark.sql.execution;
/**
 * Ensures that the {@link org.apache.spark.sql.catalyst.plans.physical.Partitioning Partitioning}
 * of input data meets the
 * {@link org.apache.spark.sql.catalyst.plans.physical.Distribution Distribution} requirements for
 * each operator by inserting {@link Exchange} Operators where required.  Also ensure that the
 * input partition ordering requirements are met.
 */
  class EnsureRequirements extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  // not preceding
  public   EnsureRequirements (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  private  int defaultNumPreShufflePartitions () { throw new RuntimeException(); }
  private  long targetPostShuffleInputSize () { throw new RuntimeException(); }
  private  boolean adaptiveExecutionEnabled () { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> minNumPostShufflePartitions () { throw new RuntimeException(); }
  /**
   * Given a required distribution, returns a partitioning that satisfies that distribution.
   * @param requiredDistribution (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (org.apache.spark.sql.catalyst.plans.physical.Distribution requiredDistribution, int numPartitions) { throw new RuntimeException(); }
  /**
   * Adds {@link ExchangeCoordinator} to {@link Exchange}s if adaptive query execution is enabled
   * and partitioning schemes of these {@link Exchange}s support {@link ExchangeCoordinator}.
   * @param children (undocumented)
   * @param requiredChildDistributions (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> withExchangeCoordinator (scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistributions) { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.SparkPlan ensureDistributionAndOrdering (org.apache.spark.sql.execution.SparkPlan operator) { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan) { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents a partitioning where rows are distributed evenly across output partitions
 * by starting from a random target partition number and distributing rows in a round-robin
 * fashion. This partitioning is used when implementing the DataFrame.repartition() operator.
 */
public  class RoundRobinPartitioning implements org.apache.spark.sql.catalyst.plans.physical.Partitioning, scala.Product, scala.Serializable {
  public  int numPartitions () { throw new RuntimeException(); }
  // not preceding
  public   RoundRobinPartitioning (int numPartitions) { throw new RuntimeException(); }
  public  boolean satisfies (org.apache.spark.sql.catalyst.plans.physical.Distribution required) { throw new RuntimeException(); }
  public  boolean compatibleWith (org.apache.spark.sql.catalyst.plans.physical.Partitioning other) { throw new RuntimeException(); }
  public  boolean guarantees (org.apache.spark.sql.catalyst.plans.physical.Partitioning other) { throw new RuntimeException(); }
}

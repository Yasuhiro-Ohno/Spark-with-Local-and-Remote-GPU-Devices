package org.apache.spark.sql.execution;
/**
 * This is a specialized version of {@link org.apache.spark.rdd.ShuffledRDD} that is optimized for
 * shuffling rows instead of Java key-value pairs. Note that something like this should eventually
 * be implemented in Spark core, but that is blocked by some more general refactorings to shuffle
 * interfaces / internals.
 * <p>
 * This RDD takes a {@link ShuffleDependency} (<code>dependency</code>),
 * and a optional array of partition start indices as input arguments
 * (<code>specifiedPartitionStartIndices</code>).
 * <p>
 * The <code>dependency</code> has the parent RDD of this RDD, which represents the dataset before shuffle
 * (i.e. map output). Elements of this RDD are (partitionId, Row) pairs.
 * Partition ids should be in the range [0, numPartitions - 1].
 * <code>dependency.partitioner</code> is the original partitioner used to partition
 * map output, and <code>dependency.partitioner.numPartitions</code> is the number of pre-shuffle partitions
 * (i.e. the number of partitions of the map output).
 * <p>
 * When <code>specifiedPartitionStartIndices</code> is defined, <code>specifiedPartitionStartIndices.length</code>
 * will be the number of post-shuffle partitions. For this case, the <code>i</code>th post-shuffle
 * partition includes <code>specifiedPartitionStartIndices[i]</code> to
 * <code>specifiedPartitionStartIndices[i+1] - 1</code> (inclusive).
 * <p>
 * When <code>specifiedPartitionStartIndices</code> is not defined, there will be
 * <code>dependency.partitioner.numPartitions</code> post-shuffle partitions. For this case,
 * a post-shuffle partition is created for every pre-shuffle partition.
 */
public  class ShuffledRowRDD extends org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> {
  public  org.apache.spark.ShuffleDependency<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> dependency () { throw new RuntimeException(); }
  // not preceding
  public   ShuffledRowRDD (org.apache.spark.ShuffleDependency<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> dependency, scala.Option<int[]> specifiedPartitionStartIndices) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner () { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition partition) { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  public  void clearDependencies () { throw new RuntimeException(); }
}

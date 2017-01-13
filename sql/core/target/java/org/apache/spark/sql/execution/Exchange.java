package org.apache.spark.sql.execution;
/**
 * Performs a shuffle that will result in the desired <code>newPartitioning</code>.
 */
public  class Exchange extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.Exchange apply (org.apache.spark.sql.catalyst.plans.physical.Partitioning newPartitioning, org.apache.spark.sql.execution.SparkPlan child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning newPartitioning () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.ExchangeCoordinator> coordinator () { throw new RuntimeException(); }
  // not preceding
  public   Exchange (org.apache.spark.sql.catalyst.plans.physical.Partitioning newPartitioning, org.apache.spark.sql.execution.SparkPlan child, scala.Option<org.apache.spark.sql.execution.ExchangeCoordinator> coordinator) { throw new RuntimeException(); }
  public  java.lang.String nodeName () { throw new RuntimeException(); }
  /**
   * Returns true iff we can support the data type, and we are not doing range partitioning.
   * @return (undocumented)
   */
  private  boolean tungstenMode () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  boolean outputsUnsafeRows () { throw new RuntimeException(); }
  public  boolean canProcessSafeRows () { throw new RuntimeException(); }
  public  boolean canProcessUnsafeRows () { throw new RuntimeException(); }
  /**
   * Determines whether records must be defensively copied before being sent to the shuffle.
   * Several of Spark's shuffle components will buffer deserialized Java objects in memory. The
   * shuffle code assumes that objects are immutable and hence does not perform its own defensive
   * copying. In Spark SQL, however, operators' iterators return the same mutable <code>Row</code> object. In
   * order to properly shuffle the output of these operators, we need to perform our own copying
   * prior to sending records to the shuffle. This copying is expensive, so we try to avoid it
   * whenever possible. This method encapsulates the logic for choosing when to copy.
   * <p>
   * In the long run, we might want to push this logic into core's shuffle APIs so that we don't
   * have to rely on knowledge of core internals here in SQL.
   * <p>
   * See SPARK-2967, SPARK-4479, and SPARK-7375 for more discussion of this issue.
   * <p>
   * @param partitioner the partitioner for the shuffle
   * @param serializer the serializer that will be used to write rows
   * @return true if rows should be copied before being shuffled, false otherwise
   */
  private  boolean needToCopyObjectsBeforeShuffle (org.apache.spark.Partitioner partitioner, org.apache.spark.serializer.Serializer serializer) { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf () { throw new RuntimeException(); }
  private  org.apache.spark.serializer.Serializer serializer () { throw new RuntimeException(); }
  protected  void doPrepare () { throw new RuntimeException(); }
  /**
   * Returns a {@link ShuffleDependency} that will partition rows of its child based on
   * the partitioning scheme defined in <code>newPartitioning</code>. Those partitions of
   * the returned ShuffleDependency will be the input of shuffle.
   * @return (undocumented)
   */
    org.apache.spark.ShuffleDependency<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> prepareShuffleDependency () { throw new RuntimeException(); }
  /**
   * Returns a {@link ShuffledRowRDD} that represents the post-shuffle dataset.
   * This {@link ShuffledRowRDD} is created based on a given {@link ShuffleDependency} and an optional
   * partition start indices array. If this optional array is defined, the returned
   * {@link ShuffledRowRDD} will fetch pre-shuffle partitions based on indices of this array.
   * @param shuffleDependency (undocumented)
   * @param specifiedPartitionStartIndices (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.execution.ShuffledRowRDD preparePostShuffleRDD (org.apache.spark.ShuffleDependency<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> shuffleDependency, scala.Option<int[]> specifiedPartitionStartIndices) { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute () { throw new RuntimeException(); }
}

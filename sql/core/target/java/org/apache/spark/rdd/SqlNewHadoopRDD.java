package org.apache.spark.rdd;
/**
 * An RDD that provides core functionality for reading data stored in Hadoop (e.g., files in HDFS,
 * sources in HBase, or S3), using the new MapReduce API (<code>org.apache.hadoop.mapreduce</code>).
 * It is based on {@link org.apache.spark.rdd.NewHadoopRDD}. It has three additions.
 * 1. A shared broadcast Hadoop Configuration.
 * 2. An optional closure <code>initDriverSideJobFuncOpt</code> that set configurations at the driver side
 *    to the shared Hadoop Configuration.
 * 3. An optional closure <code>initLocalJobFuncOpt</code> that set configurations at both the driver side
 *    and the executor side to the shared Hadoop Configuration.
 * <p>
 * Note: This is RDD is basically a cloned version of {@link org.apache.spark.rdd.NewHadoopRDD} with
 * changes based on {@link org.apache.spark.rdd.HadoopRDD}.
 */
  class SqlNewHadoopRDD<V extends java.lang.Object> extends org.apache.spark.rdd.RDD<V> implements org.apache.spark.mapreduce.SparkHadoopMapReduceUtil, org.apache.spark.Logging {
  private  scala.Option<scala.Function1<org.apache.hadoop.mapreduce.Job, scala.runtime.BoxedUnit>> initDriverSideJobFuncOpt () { throw new RuntimeException(); }
  // not preceding
  public   SqlNewHadoopRDD (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, scala.Option<scala.Function1<org.apache.hadoop.mapreduce.Job, scala.runtime.BoxedUnit>> initDriverSideJobFuncOpt, scala.Option<scala.Function1<org.apache.hadoop.mapreduce.Job, scala.runtime.BoxedUnit>> initLocalJobFuncOpt, java.lang.Class<? extends org.apache.hadoop.mapreduce.InputFormat<java.lang.Void, V>> inputFormatClass, java.lang.Class<V> valueClass, scala.reflect.ClassTag<V> evidence$1) { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.Job getJob () { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration getConf (boolean isDriverSide) { throw new RuntimeException(); }
  private  java.lang.String jobTrackerId () { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.JobID jobId () { throw new RuntimeException(); }
  protected  boolean enableUnsafeRowParquetReader () { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  public  scala.collection.Iterator<V> compute (org.apache.spark.Partition theSplit, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition hsplit) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.SqlNewHadoopRDD<V> persist (org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Analogous to {@link org.apache.spark.rdd.MapPartitionsRDD}, but passes in an InputSplit to
   * the given function rather than the index of the partition.
   */
    class NewHadoopMapPartitionsWithSplitRDD<U extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
    public   NewHadoopMapPartitionsWithSplitRDD (org.apache.spark.rdd.RDD<T> prev, scala.Function2<org.apache.hadoop.mapreduce.InputSplit, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$2, scala.reflect.ClassTag<T> evidence$3) { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.Partitioner> partitioner () { throw new RuntimeException(); }
    public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
    public  scala.collection.Iterator<U> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  }
  // no position
    class NewHadoopMapPartitionsWithSplitRDD implements scala.Serializable {
    public   NewHadoopMapPartitionsWithSplitRDD () { throw new RuntimeException(); }
  }
}

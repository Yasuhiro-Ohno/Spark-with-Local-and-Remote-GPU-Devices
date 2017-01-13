package org.apache.spark.sql.sources;
/**
 * ::Experimental::
 * A {@link BaseRelation} that provides much of the common code required for relations that store their
 * data to an HDFS compatible filesystem.
 * <p>
 * For the read path, similar to {@link PrunedFilteredScan}, it can eliminate unneeded columns and
 * filter using selected predicates before producing an RDD containing all matching tuples as
 * {@link Row} objects. In addition, when reading from Hive style partitioned tables stored in file
 * systems, it's able to discover partitioning information from the paths of input directories, and
 * perform partition pruning before start reading the data. Subclasses of {@link HadoopFsRelation()}
 * must override one of the three <code>buildScan</code> methods to implement the read path.
 * <p>
 * For the write path, it provides the ability to write to both non-partitioned and partitioned
 * tables.  Directory layout of the partitioned tables is compatible with Hive.
 * <p>
 * @constructor This constructor is for internal uses only. The {@link PartitionSpec} argument is for
 *              implementing metastore table conversion.
 * <p>
 * param:  maybePartitionSpec An {@link HadoopFsRelation} can be created with an optional
 *        {@link PartitionSpec}, so that partition discovery can be skipped.
 * <p>
 * @since 1.4.0
 */
public abstract class HadoopFsRelation extends org.apache.spark.sql.sources.BaseRelation implements org.apache.spark.sql.execution.FileRelation, org.apache.spark.Logging {
  static public  class FakeFileStatus implements scala.Product, scala.Serializable {
    public  java.lang.String path () { throw new RuntimeException(); }
    public  long length () { throw new RuntimeException(); }
    public  boolean isDir () { throw new RuntimeException(); }
    public  short blockReplication () { throw new RuntimeException(); }
    public  long blockSize () { throw new RuntimeException(); }
    public  long modificationTime () { throw new RuntimeException(); }
    public  long accessTime () { throw new RuntimeException(); }
    // not preceding
    public   FakeFileStatus (java.lang.String path, long length, boolean isDir, short blockReplication, long blockSize, long modificationTime, long accessTime) { throw new RuntimeException(); }
  }
  // no position
  static public  class FakeFileStatus$ extends scala.runtime.AbstractFunction7<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.sources.HadoopFsRelation.FakeFileStatus> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FakeFileStatus$ MODULE$ = null;
    public   FakeFileStatus$ () { throw new RuntimeException(); }
  }
  private  class FileStatusCache {
    public   FileStatusCache () { throw new RuntimeException(); }
    public  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> leafFiles () { throw new RuntimeException(); }
    public  scala.collection.mutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> leafDirToChildrenFiles () { throw new RuntimeException(); }
    private  scala.collection.mutable.LinkedHashSet<org.apache.hadoop.fs.FileStatus> listLeafFiles (java.lang.String[] paths) { throw new RuntimeException(); }
    public  void refresh () { throw new RuntimeException(); }
  }
  static public  org.apache.hadoop.fs.FileStatus[] listLeafFiles (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus status) { throw new RuntimeException(); }
  static public  scala.collection.mutable.LinkedHashSet<org.apache.hadoop.fs.FileStatus> listLeafFilesInParallel (java.lang.String[] paths, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkContext sparkContext) { throw new RuntimeException(); }
     HadoopFsRelation (scala.Option<org.apache.spark.sql.execution.datasources.PartitionSpec> maybePartitionSpec, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public   HadoopFsRelation () { throw new RuntimeException(); }
  public   HadoopFsRelation (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters) { throw new RuntimeException(); }
     HadoopFsRelation (scala.Option<org.apache.spark.sql.execution.datasources.PartitionSpec> maybePartitionSpec) { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf () { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.PartitionSpec _partitionSpec () { throw new RuntimeException(); }
  private  org.apache.spark.sql.sources.HadoopFsRelation.FileStatusCache fileStatusCache () { throw new RuntimeException(); }
  protected  scala.collection.mutable.LinkedHashSet<org.apache.hadoop.fs.FileStatus> cachedLeafStatuses () { throw new RuntimeException(); }
   final  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec () { throw new RuntimeException(); }
  /**
   * Paths of this relation.  For partitioned relations, it should be root directories
   * of all partition directories.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public abstract  java.lang.String[] paths () ;
  /**
   * Contains a set of paths that are considered as the base dirs of the input datasets.
   * The partitioning discovery logic will make sure it will stop when it reaches any
   * base path. By default, the paths of the dataset provided by users will be base paths.
   * For example, if a user uses <code>sqlContext.read.parquet("/path/something=true/")</code>, the base path
   * will be <code>/path/something=true/</code>, and the returned DataFrame will not contain a column of
   * <code>something</code>. If users want to override the basePath. They can set <code>basePath</code> in the options
   * to pass the new base path to the data source.
   * For the above example, if the user-provided base path is <code>/path/</code>, the returned
   * DataFrame will have the column of <code>something</code>.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<org.apache.hadoop.fs.Path> basePaths () { throw new RuntimeException(); }
  public  java.lang.String[] inputFiles () { throw new RuntimeException(); }
  public  long sizeInBytes () { throw new RuntimeException(); }
  /**
   * Partition columns.  Can be either defined by {@link userDefinedPartitionColumns} or automatically
   * discovered.  Note that they should always be nullable.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public final  org.apache.spark.sql.types.StructType partitionColumns () { throw new RuntimeException(); }
  /**
   * Optional user defined partition columns.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.types.StructType> userDefinedPartitionColumns () { throw new RuntimeException(); }
    void refresh () { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.PartitionSpec discoverPartitions () { throw new RuntimeException(); }
  /**
   * Schema of this relation.  It consists of columns appearing in {@link dataSchema} and all partition
   * columns not appearing in {@link dataSchema}.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType schema () { throw new RuntimeException(); }
   final  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> buildInternalScan (java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters, java.lang.String[] inputPaths, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf) { throw new RuntimeException(); }
  /**
   * Specifies schema of actual data files.  For partitioned relations, if one or more partitioned
   * columns are contained in the data files, they should also appear in <code>dataSchema</code>.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.types.StructType dataSchema () ;
  /**
   * For a non-partitioned relation, this method builds an <code>RDD[Row]</code> containing all rows within
   * this relation. For partitioned relations, this method is called for each selected partition,
   * and builds an <code>RDD[Row]</code> containing all rows within that single partition.
   * <p>
   * @param inputFiles For a non-partitioned relation, it contains paths of all data files in the
   *        relation. For a partitioned relation, it contains paths of all data files in a single
   *        selected partition.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan (org.apache.hadoop.fs.FileStatus[] inputFiles) { throw new RuntimeException(); }
  /**
   * For a non-partitioned relation, this method builds an <code>RDD[Row]</code> containing all rows within
   * this relation. For partitioned relations, this method is called for each selected partition,
   * and builds an <code>RDD[Row]</code> containing all rows within that single partition.
   * <p>
   * @param requiredColumns Required columns.
   * @param inputFiles For a non-partitioned relation, it contains paths of all data files in the
   *        relation. For a partitioned relation, it contains paths of all data files in a single
   *        selected partition.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan (java.lang.String[] requiredColumns, org.apache.hadoop.fs.FileStatus[] inputFiles) { throw new RuntimeException(); }
  /**
   * For a non-partitioned relation, this method builds an <code>RDD[Row]</code> containing all rows within
   * this relation. For partitioned relations, this method is called for each selected partition,
   * and builds an <code>RDD[Row]</code> containing all rows within that single partition.
   * <p>
   * @param requiredColumns Required columns.
   * @param filters Candidate filters to be pushed down. The actual filter should be the conjunction
   *        of all <code>filters</code>.  The pushed down filters are currently purely an optimization as they
   *        will all be evaluated again. This means it is safe to use them with methods that produce
   *        false positives such as filtering partitions based on a bloom filter.
   * @param inputFiles For a non-partitioned relation, it contains paths of all data files in the
   *        relation. For a partitioned relation, it contains paths of all data files in a single
   *        selected partition.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan (java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters, org.apache.hadoop.fs.FileStatus[] inputFiles) { throw new RuntimeException(); }
  /**
   * For a non-partitioned relation, this method builds an <code>RDD[Row]</code> containing all rows within
   * this relation. For partitioned relations, this method is called for each selected partition,
   * and builds an <code>RDD[Row]</code> containing all rows within that single partition.
   * <p>
   * Note: This interface is subject to change in future.
   * <p>
   * @param requiredColumns Required columns.
   * @param filters Candidate filters to be pushed down. The actual filter should be the conjunction
   *        of all <code>filters</code>.  The pushed down filters are currently purely an optimization as they
   *        will all be evaluated again. This means it is safe to use them with methods that produce
   *        false positives such as filtering partitions based on a bloom filter.
   * @param inputFiles For a non-partitioned relation, it contains paths of all data files in the
   *        relation. For a partitioned relation, it contains paths of all data files in a single
   *        selected partition.
   * @param broadcastedConf A shared broadcast Hadoop Configuration, which can be used to reduce the
   *                        overhead of broadcasting the Configuration for every Hadoop RDD.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
    org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan (java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters, org.apache.hadoop.fs.FileStatus[] inputFiles, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf) { throw new RuntimeException(); }
  /**
   * For a non-partitioned relation, this method builds an <code>RDD[InternalRow]</code> containing all rows
   * within this relation. For partitioned relations, this method is called for each selected
   * partition, and builds an <code>RDD[InternalRow]</code> containing all rows within that single partition.
   * <p>
   * Note:
   * <p>
   * 1. Rows contained in the returned <code>RDD[InternalRow]</code> are assumed to be <code>UnsafeRow</code>s.
   * 2. This interface is subject to change in future.
   * <p>
   * @param requiredColumns Required columns.
   * @param filters Candidate filters to be pushed down. The actual filter should be the conjunction
   *        of all <code>filters</code>.  The pushed down filters are currently purely an optimization as they
   *        will all be evaluated again. This means it is safe to use them with methods that produce
   *        false positives such as filtering partitions based on a bloom filter.
   * @param inputFiles For a non-partitioned relation, it contains paths of all data files in the
   *        relation. For a partitioned relation, it contains paths of all data files in a single
   *        selected partition.
   * @param broadcastedConf A shared broadcast Hadoop Configuration, which can be used to reduce the
   *        overhead of broadcasting the Configuration for every Hadoop RDD.
   * @return (undocumented)
   */
    org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> buildInternalScan (java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters, org.apache.hadoop.fs.FileStatus[] inputFiles, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf) { throw new RuntimeException(); }
  /**
   * Prepares a write job and returns an {@link OutputWriterFactory}.  Client side job preparation can
   * be put here.  For example, user defined output committer can be configured here
   * by setting the output committer class in the conf of spark.sql.sources.outputCommitterClass.
   * <p>
   * Note that the only side effect expected here is mutating <code>job</code> via its setters.  Especially,
   * Spark SQL caches {@link BaseRelation} instances for performance, mutating relation internal states
   * may cause unexpected behaviors.
   * <p>
   * @since 1.4.0
   * @param job (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.sources.OutputWriterFactory prepareJobForWrite (org.apache.hadoop.mapreduce.Job job) ;
}

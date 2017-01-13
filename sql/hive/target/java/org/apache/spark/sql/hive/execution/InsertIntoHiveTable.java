package org.apache.spark.sql.hive.execution;
  class InsertIntoHiveTable extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, org.apache.spark.sql.hive.HiveInspectors, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.hive.MetastoreRelation table () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  public  boolean overwrite () { throw new RuntimeException(); }
  public  boolean ifNotExists () { throw new RuntimeException(); }
  // not preceding
  public   InsertIntoHiveTable (org.apache.spark.sql.hive.MetastoreRelation table, scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition, org.apache.spark.sql.execution.SparkPlan child, boolean overwrite, boolean ifNotExists) { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.HiveContext sc () { throw new RuntimeException(); }
  public  java.lang.Class<? extends org.apache.hadoop.io.Writable> outputClass () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.Context hiveContext () { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.HiveMetastoreCatalog catalog () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.serde2.Serializer newSerializer (org.apache.hadoop.hive.ql.plan.TableDesc tableDesc) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  private  void saveAsHiveFile (org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> rdd, java.lang.Class<?> valueClass, org.apache.spark.sql.hive.HiveShim.ShimFileSinkDesc fileSinkConf, org.apache.spark.util.SerializableJobConf conf, org.apache.spark.sql.hive.SparkHiveWriterContainer writerContainer) { throw new RuntimeException(); }
  /**
   * Inserts all the rows in the table into Hive.  Row objects are properly serialized with the
   * <code>org.apache.hadoop.hive.serde2.SerDe</code> and the
   * <code>org.apache.hadoop.mapred.OutputFormat</code> provided by the table definition.
   * <p>
   * Note: this is run once and then kept to avoid double insertions.
   * @return (undocumented)
   */
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> sideEffectResult () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeCollect () { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute () { throw new RuntimeException(); }
}

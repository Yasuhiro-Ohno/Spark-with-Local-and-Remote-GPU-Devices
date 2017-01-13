package org.apache.spark.sql.execution;
/** Physical plan node for scanning data from an RDD. */
  class PhysicalRDD extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.LeafNode, scala.Product, scala.Serializable {
  static public  java.lang.String INPUT_PATHS () { throw new RuntimeException(); }
  static public  java.lang.String PUSHED_FILTERS () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.PhysicalRDD createFromDataSource (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> rdd, org.apache.spark.sql.sources.BaseRelation relation, scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> rdd () { throw new RuntimeException(); }
  public  java.lang.String nodeName () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata () { throw new RuntimeException(); }
  public  boolean outputsUnsafeRows () { throw new RuntimeException(); }
  // not preceding
  public   PhysicalRDD (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> rdd, java.lang.String nodeName, scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata, boolean outputsUnsafeRows) { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute () { throw new RuntimeException(); }
  public  java.lang.String simpleString () { throw new RuntimeException(); }
}

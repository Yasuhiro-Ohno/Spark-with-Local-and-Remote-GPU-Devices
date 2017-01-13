package org.apache.spark.sql.execution.local;
/**
 * An operator that scans some local data collection in the form of Scala Seq.
 */
public  class SeqScanNode extends org.apache.spark.sql.execution.local.LeafLocalNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> data () { throw new RuntimeException(); }
  // not preceding
  public   SeqScanNode (org.apache.spark.sql.SQLConf conf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> data) { throw new RuntimeException(); }
  public  void open () { throw new RuntimeException(); }
  public  boolean next () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow fetch () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}

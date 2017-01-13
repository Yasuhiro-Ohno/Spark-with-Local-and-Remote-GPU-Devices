package org.apache.spark.sql.catalyst;
/** A CatalystConf that can be used for local testing. */
public  class SimpleCatalystConf implements org.apache.spark.sql.catalyst.CatalystConf, scala.Product, scala.Serializable {
  public  boolean caseSensitiveAnalysis () { throw new RuntimeException(); }
  // not preceding
  public   SimpleCatalystConf (boolean caseSensitiveAnalysis) { throw new RuntimeException(); }
  protected  boolean specializeSingleDistinctAggPlanning () { throw new RuntimeException(); }
}

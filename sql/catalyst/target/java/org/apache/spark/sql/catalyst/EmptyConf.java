package org.apache.spark.sql.catalyst;
// no position
/**
 * A trivial conf that is empty.  Used for testing when all
 * relations are already filled in and the analyser needs only to resolve attribute references.
 */
public  class EmptyConf implements org.apache.spark.sql.catalyst.CatalystConf {
  static public  boolean caseSensitiveAnalysis () { throw new RuntimeException(); }
  static protected  boolean specializeSingleDistinctAggPlanning () { throw new RuntimeException(); }
}

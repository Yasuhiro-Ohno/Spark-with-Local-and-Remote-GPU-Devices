package org.apache.spark.mllib.fpm;
/**
 * Model fitted by {@link PrefixSpan}
 * param:  freqSequences frequent sequences
 * @tparam Item item type
 */
public  class PrefixSpanModel<Item extends java.lang.Object> implements scala.Serializable {
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.PrefixSpan.FreqSequence<Item>> freqSequences () { throw new RuntimeException(); }
  // not preceding
  public   PrefixSpanModel (org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.PrefixSpan.FreqSequence<Item>> freqSequences) { throw new RuntimeException(); }
}

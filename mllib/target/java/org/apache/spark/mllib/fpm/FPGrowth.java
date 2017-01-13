package org.apache.spark.mllib.fpm;
/**
 * A parallel FP-growth algorithm to mine frequent itemsets. The algorithm is described in
 * {@link http://dx.doi.org/10.1145/1454008.1454027 Li et al., PFP: Parallel FP-Growth for Query
 *  Recommendation}. PFP distributes computation in such a way that each worker executes an
 * independent group of mining tasks. The FP-Growth algorithm is described in
 * {@link http://dx.doi.org/10.1145/335191.335372 Han et al., Mining frequent patterns without candidate
 *  generation}.
 * <p>
 * param:  minSupport the minimal support level of the frequent pattern, any pattern appears
 *                   more than (minSupport * size-of-the-dataset) times will be output
 * param:  numPartitions number of partitions used by parallel FP-growth
 * <p>
 * @see {@link http://en.wikipedia.org/wiki/Association_rule_learning Association rule learning
 *       (Wikipedia)}
 * <p>
 */
public  class FPGrowth implements org.apache.spark.Logging, scala.Serializable {
  /**
   * Frequent itemset.
   * param:  items items in this itemset. Java users should call {@link FreqItemset#javaItems} instead.
   * param:  freq frequency
   * @tparam Item item type
   * <p>
   */
  static public  class FreqItemset<Item extends java.lang.Object> implements scala.Serializable {
    public  java.lang.Object items () { throw new RuntimeException(); }
    public  long freq () { throw new RuntimeException(); }
    // not preceding
    public   FreqItemset (java.lang.Object items, long freq) { throw new RuntimeException(); }
    /**
     * Returns items in a Java List.
     * <p>
     * @return (undocumented)
     */
    public  java.util.List<Item> javaItems () { throw new RuntimeException(); }
  }
  private  double minSupport () { throw new RuntimeException(); }
  private  int numPartitions () { throw new RuntimeException(); }
  // not preceding
  private   FPGrowth (double minSupport, int numPartitions) { throw new RuntimeException(); }
  /**
   * Constructs a default instance with default parameters {minSupport: <code>0.3</code>, numPartitions: same
   * as the input data}.
   * <p>
   */
  public   FPGrowth () { throw new RuntimeException(); }
  /**
   * Sets the minimal support level (default: <code>0.3</code>).
   * <p>
   * @param minSupport (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.FPGrowth setMinSupport (double minSupport) { throw new RuntimeException(); }
  /**
   * Sets the number of partitions used by parallel FP-growth (default: same as input data).
   * <p>
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.FPGrowth setNumPartitions (int numPartitions) { throw new RuntimeException(); }
  /**
   * Computes an FP-Growth model that contains frequent itemsets.
   * @param data input data set, each element contains a transaction
   * @return an {@link FPGrowthModel}
   * <p>
   * @param evidence$2 (undocumented)
   */
  public <Item extends java.lang.Object> org.apache.spark.mllib.fpm.FPGrowthModel<Item> run (org.apache.spark.rdd.RDD<java.lang.Object> data, scala.reflect.ClassTag<Item> evidence$2) { throw new RuntimeException(); }
  /** Java-friendly version of {@link run}. */
  public <Item extends java.lang.Object, Basket extends java.lang.Iterable<Item>> org.apache.spark.mllib.fpm.FPGrowthModel<Item> run (org.apache.spark.api.java.JavaRDD<Basket> data) { throw new RuntimeException(); }
  /**
   * Generates frequent items by filtering the input data using minimal support level.
   * @param minCount minimum count for frequent itemsets
   * @param partitioner partitioner used to distribute items
   * @return array of frequent pattern ordered by their frequencies
   * @param data (undocumented)
   * @param evidence$3 (undocumented)
   */
  private <Item extends java.lang.Object> java.lang.Object genFreqItems (org.apache.spark.rdd.RDD<java.lang.Object> data, long minCount, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<Item> evidence$3) { throw new RuntimeException(); }
  /**
   * Generate frequent itemsets by building FP-Trees, the extraction is done on each partition.
   * @param data transactions
   * @param minCount minimum count for frequent itemsets
   * @param freqItems frequent items
   * @param partitioner partitioner used to distribute transactions
   * @return an RDD of (frequent itemset, count)
   * @param evidence$4 (undocumented)
   */
  private <Item extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.FPGrowth.FreqItemset<Item>> genFreqItemsets (org.apache.spark.rdd.RDD<java.lang.Object> data, long minCount, java.lang.Object freqItems, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<Item> evidence$4) { throw new RuntimeException(); }
  /**
   * Generates conditional transactions.
   * @param transaction a transaction
   * @param itemToRank map from item to their rank
   * @param partitioner partitioner used to distribute transactions
   * @return a map of (target partition, conditional transaction)
   * @param evidence$5 (undocumented)
   */
  private <Item extends java.lang.Object> scala.collection.mutable.Map<java.lang.Object, int[]> genCondTransactions (java.lang.Object transaction, scala.collection.immutable.Map<Item, java.lang.Object> itemToRank, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<Item> evidence$5) { throw new RuntimeException(); }
}

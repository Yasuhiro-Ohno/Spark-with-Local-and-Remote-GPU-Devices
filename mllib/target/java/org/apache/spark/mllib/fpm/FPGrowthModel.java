package org.apache.spark.mllib.fpm;
/**
 * Model trained by {@link FPGrowth}, which holds frequent itemsets.
 * param:  freqItemsets frequent itemset, which is an RDD of {@link FreqItemset}
 * @tparam Item item type
 */
public  class FPGrowthModel<Item extends java.lang.Object> implements scala.Serializable {
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.FPGrowth.FreqItemset<Item>> freqItemsets () { throw new RuntimeException(); }
  // not preceding
  public   FPGrowthModel (org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.FPGrowth.FreqItemset<Item>> freqItemsets, scala.reflect.ClassTag<Item> evidence$1) { throw new RuntimeException(); }
  /**
   * Generates association rules for the {@link Item}s in {@link freqItemsets}.
   * @param confidence minimal confidence of the rules produced
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.AssociationRules.Rule<Item>> generateAssociationRules (double confidence) { throw new RuntimeException(); }
}

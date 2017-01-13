package org.apache.spark.examples.streaming;
// no position
/**
 * Illustrates the use of the HyperLogLog algorithm, from Twitter's Algebird library, to compute
 * a windowed and global estimate of the unique user IDs occurring in a Twitter stream.
 * <p>
 * <p>
 *   This <a href="http://highlyscalable.wordpress.com/2012/05/01/probabilistic-structures-web-analytics-data-mining/">
 *   blog post</a> and this
 *   <a href= "http://highscalability.com/blog/2012/4/5/big-data-counting-how-to-count-a-billion-distinct-objects-us.html">
 *     blog post</a>
 *   have good overviews of HyperLogLog (HLL). HLL is a memory-efficient datastructure for
 *   estimating the cardinality of a data stream, i.e. the number of unique elements.
 * <p><p>
 *   Algebird's implementation is a monoid, so we can succinctly merge two HLL instances in the
 *   reduce operation.
 */
public  class TwitterAlgebirdHLL$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TwitterAlgebirdHLL$ MODULE$ = null;
  public   TwitterAlgebirdHLL$ () { throw new RuntimeException(); }
  public  void main (java.lang.String[] args) { throw new RuntimeException(); }
}

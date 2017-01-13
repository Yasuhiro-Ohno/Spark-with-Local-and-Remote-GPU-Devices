package org.apache.spark.examples.streaming;
// no position
/**
 * Illustrates the use of the Count-Min Sketch, from Twitter's Algebird library, to compute
 * windowed and global Top-K estimates of user IDs occurring in a Twitter stream.
 * <br>
 *   <strong>Note</strong> that since Algebird's implementation currently only supports Long inputs,
 *   the example operates on Long IDs. Once the implementation supports other inputs (such as String),
 *   the same approach could be used for computing popular topics for example.
 * <p>
 * <p>
 *   <a href=
 *   "http://highlyscalable.wordpress.com/2012/05/01/probabilistic-structures-web-analytics-data-mining/">
 *   This blog post</a> has a good overview of the Count-Min Sketch (CMS). The CMS is a data
 *   structure for approximate frequency estimation in data streams (e.g. Top-K elements, frequency
 *   of any given element, etc), that uses space sub-linear in the number of elements in the
 *   stream. Once elements are added to the CMS, the estimated count of an element can be computed,
 *   as well as "heavy-hitters" that occur more than a threshold percentage of the overall total
 *   count.
 * <p><p>
 *   Algebird's implementation is a monoid, so we can succinctly merge two CMS instances in the
 *   reduce operation.
 */
public  class TwitterAlgebirdCMS {
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
}

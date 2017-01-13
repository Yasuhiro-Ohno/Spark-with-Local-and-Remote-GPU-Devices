package org.apache.spark.graphx.lib;
// no position
/** Implementation of SVD++ algorithm. */
public  class SVDPlusPlus$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SVDPlusPlus$ MODULE$ = null;
  public   SVDPlusPlus$ () { throw new RuntimeException(); }
  /**
   * This method is now replaced by the updated version of <code>run()</code> and returns exactly
   * the same result.
   * @param edges (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.graphx.Graph<scala.Tuple4<double[], double[], java.lang.Object, java.lang.Object>, java.lang.Object>, java.lang.Object> runSVDPlusPlus (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<java.lang.Object>> edges, org.apache.spark.graphx.lib.SVDPlusPlus.Conf conf) { throw new RuntimeException(); }
  /**
   * Implement SVD++ based on "Factorization Meets the Neighborhood:
   * a Multifaceted Collaborative Filtering Model",
   * available at {@link http://public.research.att.com/~volinsky/netflix/kdd08koren.pdf}.
   * <p>
   * The prediction rule is rui = u + bu + bi + qi*(pu + |N(u)|^^-0.5^^*sum(y)),
   * see the details on page 6.
   * <p>
   * @param edges edges for constructing the graph
   * <p>
   * @param conf SVDPlusPlus parameters
   * <p>
   * @return a graph with vertex attributes containing the trained model
   */
  public  scala.Tuple2<org.apache.spark.graphx.Graph<scala.Tuple4<double[], double[], java.lang.Object, java.lang.Object>, java.lang.Object>, java.lang.Object> run (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<java.lang.Object>> edges, org.apache.spark.graphx.lib.SVDPlusPlus.Conf conf) { throw new RuntimeException(); }
  /**
   * Forces materialization of a Graph by count()ing its RDDs.
   * @param g (undocumented)
   */
  private  void materialize (org.apache.spark.graphx.Graph<?, ?> g) { throw new RuntimeException(); }
}

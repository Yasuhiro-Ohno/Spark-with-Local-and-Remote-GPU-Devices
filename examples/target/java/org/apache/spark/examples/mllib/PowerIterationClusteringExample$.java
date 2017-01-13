package org.apache.spark.examples.mllib;
// no position
/**
 * An example Power Iteration Clustering http://www.icml2010.org/papers/387.pdf app.
 * Takes an input of K concentric circles and the number of points in the innermost circle.
 * The output should be K clusters - each cluster containing precisely the points associated
 * with each of the input circles.
 * <p>
 * Run with
 * <pre><code>
 * ./bin/run-example mllib.PowerIterationClusteringExample [options]
 *
 * Where options include:
 *   k:  Number of circles/clusters
 *   n:  Number of sampled points on innermost circle.. There are proportionally more points
 *      within the outer/larger circles
 *   maxIterations:   Number of Power Iterations
 *   outerRadius:  radius of the outermost of the concentric circles
 * </code></pre>
 * <p>
 * Here is a sample run and output:
 * <p>
 * ./bin/run-example mllib.PowerIterationClusteringExample -k 3 --n 30 --maxIterations 15
 * <p>
 * Cluster assignments: 1 -> [0,1,2,3,4],2 -> [5,6,7,8,9,10,11,12,13,14],
 * 0 -> [15,16,17,18,19,20,21,22,23,24,25,26,27,28,29]
 * <p>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class PowerIterationClusteringExample$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PowerIterationClusteringExample$ MODULE$ = null;
  public   PowerIterationClusteringExample$ () { throw new RuntimeException(); }
  public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  public  void run (org.apache.spark.examples.mllib.PowerIterationClusteringExample.Params params) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> generateCircle (double radius, int n) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> generateCirclesRdd (org.apache.spark.SparkContext sc, int nCircles, int nPoints, double outerRadius) { throw new RuntimeException(); }
  /**
   * Gaussian Similarity:  http://en.wikipedia.org/wiki/Radial_basis_function_kernel
   * @param p1 (undocumented)
   * @param p2 (undocumented)
   * @param sigma (undocumented)
   * @return (undocumented)
   */
  public  double gaussianSimilarity (scala.Tuple2<java.lang.Object, java.lang.Object> p1, scala.Tuple2<java.lang.Object, java.lang.Object> p2, double sigma) { throw new RuntimeException(); }
}

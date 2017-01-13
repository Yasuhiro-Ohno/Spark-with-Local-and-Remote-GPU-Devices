package org.apache.spark.mllib.clustering;
public  class PowerIterationClustering implements scala.Serializable {
  /**
   * Cluster assignment.
   * param:  id node id
   * param:  cluster assigned cluster id
   */
  static public  class Assignment implements scala.Product, scala.Serializable {
    public  long id () { throw new RuntimeException(); }
    public  int cluster () { throw new RuntimeException(); }
    // not preceding
    public   Assignment (long id, int cluster) { throw new RuntimeException(); }
  }
  // no position
  static public  class Assignment$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.mllib.clustering.PowerIterationClustering.Assignment> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Assignment$ MODULE$ = null;
    public   Assignment$ () { throw new RuntimeException(); }
  }
  static   org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> normalize (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> graph) { throw new RuntimeException(); }
  static   org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> normalize (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> similarities) { throw new RuntimeException(); }
  static   org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> randomInit (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g) { throw new RuntimeException(); }
  static   org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> initDegreeVector (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g) { throw new RuntimeException(); }
  static   org.apache.spark.graphx.VertexRDD<java.lang.Object> powerIter (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g, int maxIterations) { throw new RuntimeException(); }
  static   org.apache.spark.graphx.VertexRDD<java.lang.Object> kMeans (org.apache.spark.graphx.VertexRDD<java.lang.Object> v, int k) { throw new RuntimeException(); }
  private  int k () { throw new RuntimeException(); }
  private  int maxIterations () { throw new RuntimeException(); }
  private  java.lang.String initMode () { throw new RuntimeException(); }
     PowerIterationClustering (int k, int maxIterations, java.lang.String initMode) { throw new RuntimeException(); }
  public   PowerIterationClustering () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.PowerIterationClustering setK (int k) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.PowerIterationClustering setMaxIterations (int maxIterations) { throw new RuntimeException(); }
  /**
   * Set the initialization mode. This can be either "random" to use a random vector
   * as vertex properties, or "degree" to use normalized sum similarities. Default: random.
   * @param mode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.PowerIterationClustering setInitializationMode (java.lang.String mode) { throw new RuntimeException(); }
  /**
   * Run the PIC algorithm on Graph.
   * <p>
   * @param graph an affinity matrix represented as graph, which is the matrix A in the PIC paper.
   *              The similarity s,,ij,, represented as the edge between vertices (i, j) must
   *              be nonnegative. This is a symmetric matrix and hence s,,ij,, = s,,ji,,. For
   *              any (i, j) with nonzero similarity, there should be either (i, j, s,,ij,,)
   *              or (j, i, s,,ji,,) in the input. Tuples with i = j are ignored, because we
   *              assume s,,ij,, = 0.0.
   * <p>
   * @return a {@link PowerIterationClusteringModel} that contains the clustering result
   */
  public  org.apache.spark.mllib.clustering.PowerIterationClusteringModel run (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> graph) { throw new RuntimeException(); }
  /**
   * Run the PIC algorithm.
   * <p>
   * @param similarities an RDD of (i, j, s,,ij,,) tuples representing the affinity matrix, which is
   *                     the matrix A in the PIC paper. The similarity s,,ij,, must be nonnegative.
   *                     This is a symmetric matrix and hence s,,ij,, = s,,ji,,. For any (i, j) with
   *                     nonzero similarity, there should be either (i, j, s,,ij,,) or
   *                     (j, i, s,,ji,,) in the input. Tuples with i = j are ignored, because we
   *                     assume s,,ij,, = 0.0.
   * <p>
   * @return a {@link PowerIterationClusteringModel} that contains the clustering result
   */
  public  org.apache.spark.mllib.clustering.PowerIterationClusteringModel run (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> similarities) { throw new RuntimeException(); }
  /**
   * A Java-friendly version of {@link PowerIterationClustering.run}.
   * @param similarities (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.PowerIterationClusteringModel run (org.apache.spark.api.java.JavaRDD<scala.Tuple3<java.lang.Long, java.lang.Long, java.lang.Double>> similarities) { throw new RuntimeException(); }
  /**
   * Runs the PIC algorithm.
   * <p>
   * @param w The normalized affinity matrix, which is the matrix W in the PIC paper with
   *          w,,ij,, = a,,ij,, / d,,ii,, as its edge properties and the initial vector of the power
   *          iteration as its vertex properties.
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.clustering.PowerIterationClusteringModel pic (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> w) { throw new RuntimeException(); }
}

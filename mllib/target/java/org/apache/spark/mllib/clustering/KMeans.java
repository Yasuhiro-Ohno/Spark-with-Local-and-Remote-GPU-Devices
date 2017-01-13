package org.apache.spark.mllib.clustering;
/**
 * K-means clustering with support for multiple parallel runs and a k-means++ like initialization
 * mode (the k-means|| algorithm by Bahmani et al). When multiple concurrent runs are requested,
 * they are executed together with joint passes over the data for efficiency.
 * <p>
 * This is an iterative algorithm that will make multiple passes over the data, so any RDDs given
 * to it should be cached by the user.
 */
public  class KMeans implements scala.Serializable, org.apache.spark.Logging {
  static public  java.lang.String RANDOM () { throw new RuntimeException(); }
  static public  java.lang.String K_MEANS_PARALLEL () { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data training points stored as <code>RDD[Vector]</code>
   * @param k number of clusters
   * @param maxIterations max number of iterations
   * @param runs number of parallel runs, defaults to 1. The best model is returned.
   * @param initializationMode initialization model, either "random" or "k-means||" (default).
   * @param seed random seed value for cluster initialization
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs, java.lang.String initializationMode, long seed) { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data training points stored as <code>RDD[Vector]</code>
   * @param k number of clusters
   * @param maxIterations max number of iterations
   * @param runs number of parallel runs, defaults to 1. The best model is returned.
   * @param initializationMode initialization model, either "random" or "k-means||" (default).
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs, java.lang.String initializationMode) { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   * @param data (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations) { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   * @param data (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @param runs (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs) { throw new RuntimeException(); }
  /**
   * Returns the index of the closest center to the given point, as well as the squared distance.
   * @param centers (undocumented)
   * @param point (undocumented)
   * @return (undocumented)
   */
  static   scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point) { throw new RuntimeException(); }
  /**
   * Returns the K-means cost of a given point against the given cluster centers.
   * @param centers (undocumented)
   * @param point (undocumented)
   * @return (undocumented)
   */
  static   double pointCost (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point) { throw new RuntimeException(); }
  /**
   * Returns the squared Euclidean distance between two vectors computed by
   * {@link org.apache.spark.mllib.util.MLUtils#fastSquaredDistance}.
   * @param v1 (undocumented)
   * @param v2 (undocumented)
   * @return (undocumented)
   */
  static   double fastSquaredDistance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2) { throw new RuntimeException(); }
  static   boolean validateInitMode (java.lang.String initMode) { throw new RuntimeException(); }
  private  int k () { throw new RuntimeException(); }
  private  int maxIterations () { throw new RuntimeException(); }
  private  int runs () { throw new RuntimeException(); }
  private  java.lang.String initializationMode () { throw new RuntimeException(); }
  private  int initializationSteps () { throw new RuntimeException(); }
  private  double epsilon () { throw new RuntimeException(); }
  private  long seed () { throw new RuntimeException(); }
  // not preceding
  private   KMeans (int k, int maxIterations, int runs, java.lang.String initializationMode, int initializationSteps, double epsilon, long seed) { throw new RuntimeException(); }
  /**
   * Constructs a KMeans instance with default parameters: {k: 2, maxIterations: 20, runs: 1,
   * initializationMode: "k-means||", initializationSteps: 5, epsilon: 1e-4, seed: random}.
   */
  public   KMeans () { throw new RuntimeException(); }
  /**
   * Number of clusters to create (k).
   * @return (undocumented)
   */
  public  int getK () { throw new RuntimeException(); }
  /**
   * Set the number of clusters to create (k). Default: 2.
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeans setK (int k) { throw new RuntimeException(); }
  /**
   * Maximum number of iterations to run.
   * @return (undocumented)
   */
  public  int getMaxIterations () { throw new RuntimeException(); }
  /**
   * Set maximum number of iterations to run. Default: 20.
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeans setMaxIterations (int maxIterations) { throw new RuntimeException(); }
  /**
   * The initialization algorithm. This can be either "random" or "k-means||".
   * @return (undocumented)
   */
  public  java.lang.String getInitializationMode () { throw new RuntimeException(); }
  /**
   * Set the initialization algorithm. This can be either "random" to choose random points as
   * initial cluster centers, or "k-means||" to use a parallel variant of k-means++
   * (Bahmani et al., Scalable K-Means++, VLDB 2012). Default: k-means||.
   * @param initializationMode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeans setInitializationMode (java.lang.String initializationMode) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Number of runs of the algorithm to execute in parallel.
   * @return (undocumented)
   */
  public  int getRuns () { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Set the number of runs of the algorithm to execute in parallel. We initialize the algorithm
   * this many times with random starting conditions (configured by the initialization mode), then
   * return the best clustering found over any run. Default: 1.
   * @param runs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeans setRuns (int runs) { throw new RuntimeException(); }
  /**
   * Number of steps for the k-means|| initialization mode
   * @return (undocumented)
   */
  public  int getInitializationSteps () { throw new RuntimeException(); }
  /**
   * Set the number of steps for the k-means|| initialization mode. This is an advanced
   * setting -- the default of 5 is almost always enough. Default: 5.
   * @param initializationSteps (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeans setInitializationSteps (int initializationSteps) { throw new RuntimeException(); }
  /**
   * The distance threshold within which we've consider centers to have converged.
   * @return (undocumented)
   */
  public  double getEpsilon () { throw new RuntimeException(); }
  /**
   * Set the distance threshold within which we've consider centers to have converged.
   * If all centers move less than this Euclidean distance, we stop iterating one run.
   * @param epsilon (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeans setEpsilon (double epsilon) { throw new RuntimeException(); }
  /**
   * The random seed for cluster initialization.
   * @return (undocumented)
   */
  public  long getSeed () { throw new RuntimeException(); }
  /**
   * Set the random seed for cluster initialization.
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeans setSeed (long seed) { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.mllib.clustering.KMeansModel> initialModel () { throw new RuntimeException(); }
  /**
   * Set the initial starting point, bypassing the random initialization or k-means||
   * The condition model.k == this.k must be met, failure results
   * in an IllegalArgumentException.
   * @param model (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeans setInitialModel (org.apache.spark.mllib.clustering.KMeansModel model) { throw new RuntimeException(); }
  /**
   * Train a K-means model on the given set of points; <code>data</code> should be cached for high
   * performance, because this is an iterative algorithm.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeansModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data) { throw new RuntimeException(); }
  /**
   * Implementation of K-Means algorithm.
   * @param data (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.clustering.KMeansModel runAlgorithm (org.apache.spark.rdd.RDD<org.apache.spark.mllib.clustering.VectorWithNorm> data) { throw new RuntimeException(); }
  /**
   * Initialize <code>runs</code> sets of cluster centers at random.
   * @param data (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.clustering.VectorWithNorm[][] initRandom (org.apache.spark.rdd.RDD<org.apache.spark.mllib.clustering.VectorWithNorm> data) { throw new RuntimeException(); }
  /**
   * Initialize <code>runs</code> sets of cluster centers using the k-means|| algorithm by Bahmani et al.
   * (Bahmani et al., Scalable K-Means++, VLDB 2012). This is a variant of k-means++ that tries
   * to find with dissimilar cluster centers by starting with a random center and then doing
   * passes where more centers are chosen with probability proportional to their squared distance
   * to the current cluster set. It results in a provable approximation to an optimal clustering.
   * <p>
   * The original paper can be found at http://theory.stanford.edu/~sergei/papers/vldb12-kmpar.pdf.
   * @param data (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.clustering.VectorWithNorm[][] initKMeansParallel (org.apache.spark.rdd.RDD<org.apache.spark.mllib.clustering.VectorWithNorm> data) { throw new RuntimeException(); }
}

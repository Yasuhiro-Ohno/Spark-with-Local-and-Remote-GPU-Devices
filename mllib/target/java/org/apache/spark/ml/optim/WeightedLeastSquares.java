package org.apache.spark.ml.optim;
/**
 * Weighted least squares solver via normal equation.
 * Given weighted observations (w,,i,,, a,,i,,, b,,i,,), we use the following weighted least squares
 * formulation:
 * <p>
 * min,,x,z,, 1/2 sum,,i,, w,,i,, (a,,i,,^T^ x + z - b,,i,,)^2^ / sum,,i,, w_i
 *   + 1/2 lambda / delta sum,,j,, (sigma,,j,, x,,j,,)^2^,
 * <p>
 * where lambda is the regularization parameter, and delta and sigma,,j,, are controlled by
 * {@link standardizeLabel} and {@link standardizeFeatures}, respectively.
 * <p>
 * Set {@link regParam} to 0.0 and turn off both {@link standardizeFeatures} and {@link standardizeLabel} to
 * match R's <code>lm</code>.
 * Turn on {@link standardizeLabel} to match R's <code>glmnet</code>.
 * <p>
 * param:  fitIntercept whether to fit intercept. If false, z is 0.0.
 * param:  regParam L2 regularization parameter (lambda)
 * param:  standardizeFeatures whether to standardize features. If true, sigma_,,j,, is the
 *                            population standard deviation of the j-th column of A. Otherwise,
 *                            sigma,,j,, is 1.0.
 * param:  standardizeLabel whether to standardize label. If true, delta is the population standard
 *                         deviation of the label column b. Otherwise, delta is 1.0.
 */
  class WeightedLeastSquares implements org.apache.spark.Logging, scala.Serializable {
  /**
   * Aggregator to provide necessary summary statistics for solving {@link WeightedLeastSquares}.
   */
  static private  class Aggregator implements scala.Serializable {
    public   Aggregator () { throw new RuntimeException(); }
    public  boolean initialized () { throw new RuntimeException(); }
    public  int k () { throw new RuntimeException(); }
    public  long count () { throw new RuntimeException(); }
    public  int triK () { throw new RuntimeException(); }
    public  double wSum () { throw new RuntimeException(); }
    private  double wwSum () { throw new RuntimeException(); }
    private  double bSum () { throw new RuntimeException(); }
    private  double bbSum () { throw new RuntimeException(); }
    private  org.apache.spark.mllib.linalg.DenseVector aSum () { throw new RuntimeException(); }
    private  org.apache.spark.mllib.linalg.DenseVector abSum () { throw new RuntimeException(); }
    private  org.apache.spark.mllib.linalg.DenseVector aaSum () { throw new RuntimeException(); }
    private  void init (int k) { throw new RuntimeException(); }
    /**
     * Adds an instance.
     * @param instance (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.ml.optim.WeightedLeastSquares.Aggregator add (org.apache.spark.ml.feature.Instance instance) { throw new RuntimeException(); }
    /**
     * Merges another {@link Aggregator}.
     * @param other (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.ml.optim.WeightedLeastSquares.Aggregator merge (org.apache.spark.ml.optim.WeightedLeastSquares.Aggregator other) { throw new RuntimeException(); }
    /**
     * Validates that we have seen observations.
     */
    public  void validate () { throw new RuntimeException(); }
    /**
     * Weighted mean of features.
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.linalg.DenseVector aBar () { throw new RuntimeException(); }
    /**
     * Weighted mean of labels.
     * @return (undocumented)
     */
    public  double bBar () { throw new RuntimeException(); }
    /**
     * Weighted population standard deviation of labels.
     * @return (undocumented)
     */
    public  double bStd () { throw new RuntimeException(); }
    /**
     * Weighted mean of (label * features).
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.linalg.DenseVector abBar () { throw new RuntimeException(); }
    /**
     * Weighted mean of (features * features^T^).
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.linalg.DenseVector aaBar () { throw new RuntimeException(); }
    /**
     * Weighted population variance of features.
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.linalg.DenseVector aVar () { throw new RuntimeException(); }
  }
  public  boolean fitIntercept () { throw new RuntimeException(); }
  public  double regParam () { throw new RuntimeException(); }
  public  boolean standardizeFeatures () { throw new RuntimeException(); }
  public  boolean standardizeLabel () { throw new RuntimeException(); }
  // not preceding
  public   WeightedLeastSquares (boolean fitIntercept, double regParam, boolean standardizeFeatures, boolean standardizeLabel) { throw new RuntimeException(); }
  /**
   * Creates a {@link WeightedLeastSquaresModel} from an RDD of {@link Instance}s.
   * @param instances (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.optim.WeightedLeastSquaresModel fit (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances) { throw new RuntimeException(); }
}

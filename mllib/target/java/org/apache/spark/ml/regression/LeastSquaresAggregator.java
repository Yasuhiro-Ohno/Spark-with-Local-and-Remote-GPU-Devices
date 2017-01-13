package org.apache.spark.ml.regression;
/**
 * LeastSquaresAggregator computes the gradient and loss for a Least-squared loss function,
 * as used in linear regression for samples in sparse or dense vector in a online fashion.
 * <p>
 * Two LeastSquaresAggregator can be merged together to have a summary of loss and gradient of
 * the corresponding joint dataset.
 * <p>
 * For improving the convergence rate during the optimization process, and also preventing against
 * features with very large variances exerting an overly large influence during model training,
 * package like R's GLMNET performs the scaling to unit variance and removing the mean to reduce
 * the condition number, and then trains the model in scaled space but returns the coefficients in
 * the original scale. See page 9 in http://cran.r-project.org/web/packages/glmnet/glmnet.pdf
 * <p>
 * However, we don't want to apply the <code>StandardScaler</code> on the training dataset, and then cache
 * the standardized dataset since it will create a lot of overhead. As a result, we perform the
 * scaling implicitly when we compute the objective function. The following is the mathematical
 * derivation.
 * <p>
 * Note that we don't deal with intercept by adding bias here, because the intercept
 * can be computed using closed form after the coefficients are converged.
 * See this discussion for detail.
 * http://stats.stackexchange.com/questions/13617/how-is-the-intercept-computed-in-glmnet
 * <p>
 * When training with intercept enabled,
 * The objective function in the scaled space is given by
 * <pre><code>
 * L = 1/2n ||\sum_i w_i(x_i - \bar{x_i}) / \hat{x_i} - (y - \bar{y}) / \hat{y}||^2,
 * </code></pre>
 * where \bar{x_i} is the mean of x_i, \hat{x_i} is the standard deviation of x_i,
 * \bar{y} is the mean of label, and \hat{y} is the standard deviation of label.
 * <p>
 * If we fitting the intercept disabled (that is forced through 0.0),
 * we can use the same equation except we set \bar{y} and \bar{x_i} to 0 instead
 * of the respective means.
 * <p>
 * This can be rewritten as
 * <pre><code>
 * L = 1/2n ||\sum_i (w_i/\hat{x_i})x_i - \sum_i (w_i/\hat{x_i})\bar{x_i} - y / \hat{y}
 *     + \bar{y} / \hat{y}||^2
 *   = 1/2n ||\sum_i w_i^\prime x_i - y / \hat{y} + offset||^2 = 1/2n diff^2
 * </code></pre>
 * where w_i^\prime^ is the effective coefficients defined by w_i/\hat{x_i}, offset is
 * <pre><code>
 * - \sum_i (w_i/\hat{x_i})\bar{x_i} + \bar{y} / \hat{y}.
 * </code></pre>, and diff is
 * <pre><code>
 * \sum_i w_i^\prime x_i - y / \hat{y} + offset
 * </code></pre>
 * <p>
 * Note that the effective coefficients and offset don't depend on training dataset,
 * so they can be precomputed.
 * <p>
 * Now, the first derivative of the objective function in scaled space is
 * <pre><code>
 * \frac{\partial L}{\partial\w_i} = diff/N (x_i - \bar{x_i}) / \hat{x_i}
 * </code></pre>
 * However, ($x_i - \bar{x_i}$) will densify the computation, so it's not
 * an ideal formula when the training dataset is sparse format.
 * <p>
 * This can be addressed by adding the dense \bar{x_i} / \har{x_i} terms
 * in the end by keeping the sum of diff. The first derivative of total
 * objective function from all the samples is
 * <pre><code>
 * \frac{\partial L}{\partial\w_i} =
 *     1/N \sum_j diff_j (x_{ij} - \bar{x_i}) / \hat{x_i}
 *   = 1/N ((\sum_j diff_j x_{ij} / \hat{x_i}) - diffSum \bar{x_i}) / \hat{x_i})
 *   = 1/N ((\sum_j diff_j x_{ij} / \hat{x_i}) + correction_i)
 * </code></pre>,
 * where correction_i = - diffSum \bar{x_i}) / \hat{x_i}
 * <p>
 * A simple math can show that diffSum is actually zero, so we don't even
 * need to add the correction terms in the end. From the definition of diff,
 * <pre><code>
 * diffSum = \sum_j (\sum_i w_i(x_{ij} - \bar{x_i}) / \hat{x_i} - (y_j - \bar{y}) / \hat{y})
 *         = N * (\sum_i w_i(\bar{x_i} - \bar{x_i}) / \hat{x_i} - (\bar{y_j} - \bar{y}) / \hat{y})
 *         = 0
 * </code></pre>
 * <p>
 * As a result, the first derivative of the total objective function only depends on
 * the training dataset, which can be easily computed in distributed fashion, and is
 * sparse format friendly.
 * <pre><code>
 * \frac{\partial L}{\partial\w_i} = 1/N ((\sum_j diff_j x_{ij} / \hat{x_i})
 * </code></pre>,
 * <p>
 * param:  coefficients The coefficients corresponding to the features.
 * param:  labelStd The standard deviation value of the label.
 * param:  labelMean The mean value of the label.
 * param:  fitIntercept Whether to fit an intercept term.
 * param:  featuresStd The standard deviation values of the features.
 * param:  featuresMean The mean values of the features.
 */
public  class LeastSquaresAggregator implements scala.Serializable {
  public   LeastSquaresAggregator (org.apache.spark.mllib.linalg.Vector coefficients, double labelStd, double labelMean, boolean fitIntercept, double[] featuresStd, double[] featuresMean) { throw new RuntimeException(); }
  private  long totalCnt () { throw new RuntimeException(); }
  private  double weightSum () { throw new RuntimeException(); }
  private  double lossSum () { throw new RuntimeException(); }
  private  double[] effectiveCoefficientsArray () { throw new RuntimeException(); }
  private  double offset () { throw new RuntimeException(); }
  private  int dim () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.Vector effectiveCoefficientsVector () { throw new RuntimeException(); }
  private  double[] gradientSumArray () { throw new RuntimeException(); }
  /**
   * Add a new training instance to this LeastSquaresAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This LeastSquaresAggregator object.
   */
  public  org.apache.spark.ml.regression.LeastSquaresAggregator add (org.apache.spark.ml.feature.Instance instance) { throw new RuntimeException(); }
  /**
   * Merge another LeastSquaresAggregator, and update the loss and gradient
   * of the objective function.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other LeastSquaresAggregator to be merged.
   * @return This LeastSquaresAggregator object.
   */
  public  org.apache.spark.ml.regression.LeastSquaresAggregator merge (org.apache.spark.ml.regression.LeastSquaresAggregator other) { throw new RuntimeException(); }
  public  long count () { throw new RuntimeException(); }
  public  double loss () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector gradient () { throw new RuntimeException(); }
}

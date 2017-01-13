package org.apache.spark.ml.clustering;
/**
 * :: Experimental ::
 * <p>
 * Distributed model fitted by {@link LDA}.
 * This type of model is currently only produced by Expectation-Maximization (EM).
 * <p>
 * This model stores the inferred topics, the full training dataset, and the topic distribution
 * for each training document.
 * <p>
 * param:  oldLocalModelOption  Used to implement {@link oldLocalModel} as a lazy val, but keeping
 *                             {@link copy()} cheap.
 */
public  class DistributedLDAModel extends org.apache.spark.ml.clustering.LDAModel {
  static   class DistributedWriter extends org.apache.spark.ml.util.MLWriter {
    public   DistributedWriter (org.apache.spark.ml.clustering.DistributedLDAModel instance) { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class DistributedLDAModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.DistributedLDAModel> {
    public   DistributedLDAModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.DistributedLDAModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.DistributedLDAModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.DistributedLDAModel load (java.lang.String path) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.clustering.DistributedLDAModel oldDistributedModel () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.mllib.clustering.LocalLDAModel> oldLocalModelOption () { throw new RuntimeException(); }
  // not preceding
     DistributedLDAModel (java.lang.String uid, int vocabSize, org.apache.spark.mllib.clustering.DistributedLDAModel oldDistributedModel, org.apache.spark.sql.SQLContext sqlContext, scala.Option<org.apache.spark.mllib.clustering.LocalLDAModel> oldLocalModelOption) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel () { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.clustering.LDAModel getModel () { throw new RuntimeException(); }
  /**
   * Convert this distributed model to a local representation.  This discards info about the
   * training dataset.
   * <p>
   * WARNING: This involves collecting a large {@link topicsMatrix} to the driver.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.LocalLDAModel toLocal () { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.DistributedLDAModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  boolean isDistributed () { throw new RuntimeException(); }
  /**
   * Log likelihood of the observed tokens in the training set,
   * given the current parameter estimates:
   *  log P(docs | topics, topic distributions for docs, Dirichlet hyperparameters)
   * <p>
   * Notes:
   *  - This excludes the prior; for that, use {@link logPrior}.
   *  - Even with {@link logPrior}, this is NOT the same as the data log likelihood given the
   *    hyperparameters.
   *  - This is computed from the topic distributions computed during training. If you call
   *    {@link logLikelihood()} on the same training dataset, the topic distributions will be computed
   *    again, possibly giving different results.
   * @return (undocumented)
   */
  public  double trainingLogLikelihood () { throw new RuntimeException(); }
  /**
   * Log probability of the current parameter estimate:
   * log P(topics, topic distributions for docs | Dirichlet hyperparameters)
   * @return (undocumented)
   */
  public  double logPrior () { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

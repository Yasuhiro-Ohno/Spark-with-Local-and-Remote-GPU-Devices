package org.apache.spark.ml.tree;
/**
 * Parameters for Gradient-Boosted Tree algorithms.
 * <p>
 * Note: Marked as private and DeveloperApi since this may be made public in the future.
 */
  interface GBTParams extends org.apache.spark.ml.tree.TreeEnsembleParams, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasStepSize {
  /** @group setParam */
  public  org.apache.spark.ml.tree.GBTParams setMaxIter (int value) ;
  /**
   * Step size (a.k.a. learning rate) in interval (0, 1] for shrinking the contribution of each
   * estimator.
   * (default = 0.1)
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.GBTParams setStepSize (double value) ;
  public  void validateParams () ;
  /** (private[ml]) Create a BoostingStrategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.BoostingStrategy getOldBoostingStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, scala.Enumeration.Value oldAlgo) ;
  /** Get old Gradient Boosting Loss type */
    org.apache.spark.mllib.tree.loss.Loss getOldLossType () ;
}

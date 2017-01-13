package org.apache.spark.ml.classification;
/** Params for Multilayer Perceptron. */
  interface MultilayerPerceptronParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasTol {
  /**
   * Layer sizes including input size and output size.
   * Default: Array(1, 1)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntArrayParam layers () ;
  /** @group getParam */
  public  int[] getLayers () ;
  /**
   * Block size for stacking input data in matrices to speed up the computation.
   * Data is stacked within partitions. If block size is more than remaining data in
   * a partition then it is adjusted to the size of this data.
   * Recommended size is between 10 and 1000.
   * Default: 128
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam blockSize () ;
  /** @group getParam */
  public  int getBlockSize () ;
}

package org.apache.spark.ml.clustering;
  interface LDAParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.shared.HasCheckpointInterval {
  /**
   * Param for the number of topics (clusters) to infer. Must be > 1. Default: 10.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam k () ;
  /** @group getParam */
  public  int getK () ;
  /**
   * Concentration parameter (commonly named "alpha") for the prior placed on documents'
   * distributions over topics ("theta").
   * <p>
   * This is the parameter to a Dirichlet distribution, where larger values mean more smoothing
   * (more regularization).
   * <p>
   * If not set by the user, then docConcentration is set automatically. If set to
   * singleton vector [alpha], then alpha is replicated to a vector of length k in fitting.
   * Otherwise, the {@link docConcentration} vector must be length k.
   * (default = automatic)
   * <p>
   * Optimizer-specific parameter settings:
   *  - EM
   *     - Currently only supports symmetric distributions, so all values in the vector should be
   *       the same.
   *     - Values should be > 1.0
   *     - default = uniformly (50 / k) + 1, where 50/k is common in LDA libraries and +1 follows
   *       from Asuncion et al. (2009), who recommend a +1 adjustment for EM.
   *  - Online
   *     - Values should be >= 0
   *     - default = uniformly (1.0 / k), following the implementation from
   *       {@link https://github.com/Blei-Lab/onlineldavb}.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleArrayParam docConcentration () ;
  /** @group getParam */
  public  double[] getDocConcentration () ;
  /** Get docConcentration used by spark.mllib LDA */
  public  org.apache.spark.mllib.linalg.Vector getOldDocConcentration () ;
  /**
   * Concentration parameter (commonly named "beta" or "eta") for the prior placed on topics'
   * distributions over terms.
   * <p>
   * This is the parameter to a symmetric Dirichlet distribution.
   * <p>
   * Note: The topics' distributions over terms are called "beta" in the original LDA paper
   * by Blei et al., but are called "phi" in many later papers such as Asuncion et al., 2009.
   * <p>
   * If not set by the user, then topicConcentration is set automatically.
   *  (default = automatic)
   * <p>
   * Optimizer-specific parameter settings:
   *  - EM
   *     - Value should be > 1.0
   *     - default = 0.1 + 1, where 0.1 gives a small amount of smoothing and +1 follows
   *       Asuncion et al. (2009), who recommend a +1 adjustment for EM.
   *  - Online
   *     - Value should be >= 0
   *     - default = (1.0 / k), following the implementation from
   *       {@link https://github.com/Blei-Lab/onlineldavb}.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam topicConcentration () ;
  /** @group getParam */
  public  double getTopicConcentration () ;
  /** Get topicConcentration used by spark.mllib LDA */
  public  double getOldTopicConcentration () ;
  /** Supported values for Param {@link optimizer}. */
  public  java.lang.String[] supportedOptimizers () ;
  /**
   * Optimizer or inference algorithm used to estimate the LDA model.
   * Currently supported (case-insensitive):
   *  - "online": Online Variational Bayes (default)
   *  - "em": Expectation-Maximization
   * <p>
   * For details, see the following papers:
   *  - Online LDA:
   *     Hoffman, Blei and Bach.  "Online Learning for Latent Dirichlet Allocation."
   *     Neural Information Processing Systems, 2010.
   *     {@link http://www.cs.columbia.edu/~blei/papers/HoffmanBleiBach2010b.pdf}
   *  - EM:
   *     Asuncion et al.  "On Smoothing and Inference for Topic Models."
   *     Uncertainty in Artificial Intelligence, 2009.
   *     {@link http://arxiv.org/pdf/1205.2662.pdf}
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> optimizer () ;
  /** @group getParam */
  public  java.lang.String getOptimizer () ;
  /**
   * Output column with estimates of the topic mixture distribution for each document (often called
   * "theta" in the literature).  Returns a vector of zeros for an empty document.
   * <p>
   * This uses a variational approximation following Hoffman et al. (2010), where the approximate
   * distribution is called "gamma."  Technically, this method returns this approximation "gamma"
   * for each document.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> topicDistributionCol () ;
  /** @group getParam */
  public  java.lang.String getTopicDistributionCol () ;
  /**
   * A (positive) learning parameter that downweights early iterations. Larger values make early
   * iterations count less.
   * This is called "tau0" in the Online LDA paper (Hoffman et al., 2010)
   * Default: 1024, following Hoffman et al.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam learningOffset () ;
  /** @group expertGetParam */
  public  double getLearningOffset () ;
  /**
   * Learning rate, set as an exponential decay rate.
   * This should be between (0.5, 1.0] to guarantee asymptotic convergence.
   * This is called "kappa" in the Online LDA paper (Hoffman et al., 2010).
   * Default: 0.51, based on Hoffman et al.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam learningDecay () ;
  /** @group expertGetParam */
  public  double getLearningDecay () ;
  /**
   * Fraction of the corpus to be sampled and used in each iteration of mini-batch gradient descent,
   * in range (0, 1].
   * <p>
   * Note that this should be adjusted in synch with {@link LDA.maxIter}
   * so the entire corpus is used.  Specifically, set both so that
   * maxIterations * miniBatchFraction >= 1.
   * <p>
   * Note: This is the same as the <code>miniBatchFraction</code> parameter in
   *       {@link org.apache.spark.mllib.clustering.OnlineLDAOptimizer}.
   * <p>
   * Default: 0.05, i.e., 5% of total documents.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam subsamplingRate () ;
  /** @group getParam */
  public  double getSubsamplingRate () ;
  /**
   * Indicates whether the docConcentration (Dirichlet parameter for
   * document-topic distribution) will be optimized during training.
   * Setting this to true will make the model more expressive and fit the training data better.
   * Default: false
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam optimizeDocConcentration () ;
  /** @group expertGetParam */
  public  boolean getOptimizeDocConcentration () ;
  /**
   * Validates and transforms the input schema.
   * @param schema input schema
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema) ;
  public  void validateParams () ;
    org.apache.spark.mllib.clustering.LDAOptimizer getOldOptimizer () ;
}

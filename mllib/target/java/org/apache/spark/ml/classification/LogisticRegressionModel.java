package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Model produced by {@link LogisticRegression}.
 */
public  class LogisticRegressionModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.LogisticRegressionModel> implements org.apache.spark.ml.classification.LogisticRegressionParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link LogisticRegressionModel} */
  static   class LogisticRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.Logging {
    public   LogisticRegressionModelWriter (org.apache.spark.ml.classification.LogisticRegressionModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  int numClasses () { throw new RuntimeException(); }
      public  int numFeatures () { throw new RuntimeException(); }
      public  double intercept () { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Vector coefficients () { throw new RuntimeException(); }
      // not preceding
      public   Data (int numClasses, int numFeatures, double intercept, org.apache.spark.mllib.linalg.Vector coefficients) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.LogisticRegressionModel.LogisticRegressionModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class LogisticRegressionModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.LogisticRegressionModel> {
    public   LogisticRegressionModelReader () { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.classification.LogisticRegressionModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.LogisticRegressionModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.LogisticRegressionModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector coefficients () { throw new RuntimeException(); }
  public  double intercept () { throw new RuntimeException(); }
  // not preceding
     LogisticRegressionModel (java.lang.String uid, org.apache.spark.mllib.linalg.Vector coefficients, double intercept) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector weights () { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setThreshold (double value) { throw new RuntimeException(); }
  public  double getThreshold () { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setThresholds (double[] value) { throw new RuntimeException(); }
  public  double[] getThresholds () { throw new RuntimeException(); }
  /** Margin (rawPrediction) for class label 1.  For binary classification only. */
  private  scala.Function1<org.apache.spark.mllib.linalg.Vector, java.lang.Object> margin () { throw new RuntimeException(); }
  /** Score (probability) for class label 1.  For binary classification only. */
  private  scala.Function1<org.apache.spark.mllib.linalg.Vector, java.lang.Object> score () { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  public  int numClasses () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ml.classification.LogisticRegressionTrainingSummary> trainingSummary () { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is
   * thrown if <code>trainingSummary == None</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionTrainingSummary summary () { throw new RuntimeException(); }
    org.apache.spark.ml.classification.LogisticRegressionModel setSummary (org.apache.spark.ml.classification.LogisticRegressionTrainingSummary summary) { throw new RuntimeException(); }
  /** Indicates whether a training summary exists for this model instance. */
  public  boolean hasSummary () { throw new RuntimeException(); }
  /**
   * Evaluates the model on a testset.
   * @param dataset Test dataset to evaluate model on.
   * @return (undocumented)
   */
    org.apache.spark.ml.classification.LogisticRegressionSummary evaluate (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  /**
   * Predict label for the given feature vector.
   * The behavior of this can be adjusted using {@link thresholds}.
   * @param features (undocumented)
   * @return (undocumented)
   */
  protected  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.linalg.Vector raw2probabilityInPlace (org.apache.spark.mllib.linalg.Vector rawPrediction) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.linalg.Vector predictRaw (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  protected  double raw2prediction (org.apache.spark.mllib.linalg.Vector rawPrediction) { throw new RuntimeException(); }
  protected  double probability2prediction (org.apache.spark.mllib.linalg.Vector probability) { throw new RuntimeException(); }
  /**
   * Returns a {@link MLWriter} instance for this ML instance.
   * <p>
   * For {@link LogisticRegressionModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * This also does not save the {@link parent} currently.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * Model produced by {@link LinearRegression}.
 */
public  class LinearRegressionModel extends org.apache.spark.ml.regression.RegressionModel<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.LinearRegressionModel> implements org.apache.spark.ml.regression.LinearRegressionParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link LinearRegressionModel} */
  static   class LinearRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.Logging {
    public   LinearRegressionModelWriter (org.apache.spark.ml.regression.LinearRegressionModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  double intercept () { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Vector coefficients () { throw new RuntimeException(); }
      // not preceding
      public   Data (double intercept, org.apache.spark.mllib.linalg.Vector coefficients) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.regression.LinearRegressionModel.LinearRegressionModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class LinearRegressionModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.LinearRegressionModel> {
    public   LinearRegressionModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.LinearRegressionModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.LinearRegressionModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.LinearRegressionModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector coefficients () { throw new RuntimeException(); }
  public  double intercept () { throw new RuntimeException(); }
  // not preceding
     LinearRegressionModel (java.lang.String uid, org.apache.spark.mllib.linalg.Vector coefficients, double intercept) { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ml.regression.LinearRegressionTrainingSummary> trainingSummary () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector weights () { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  /**
   * Gets summary (e.g. residuals, mse, r-squared ) of model on training set. An exception is
   * thrown if <code>trainingSummary == None</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegressionTrainingSummary summary () { throw new RuntimeException(); }
    org.apache.spark.ml.regression.LinearRegressionModel setSummary (org.apache.spark.ml.regression.LinearRegressionTrainingSummary summary) { throw new RuntimeException(); }
  /** Indicates whether a training summary exists for this model instance. */
  public  boolean hasSummary () { throw new RuntimeException(); }
  /**
   * Evaluates the model on a testset.
   * @param dataset Test dataset to evaluate model on.
   * @return (undocumented)
   */
    org.apache.spark.ml.regression.LinearRegressionSummary evaluate (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  /**
   * If the prediction column is set returns the current model and prediction column,
   * otherwise generates a new column and sets it as the prediction column on a new copy
   * of the current model.
   * @return (undocumented)
   */
    scala.Tuple2<org.apache.spark.ml.regression.LinearRegressionModel, java.lang.String> findSummaryModelAndPredictionCol () { throw new RuntimeException(); }
  protected  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.LinearRegressionModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  /**
   * Returns a {@link MLWriter} instance for this ML instance.
   * <p>
   * For {@link LinearRegressionModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * This also does not save the {@link parent} currently.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

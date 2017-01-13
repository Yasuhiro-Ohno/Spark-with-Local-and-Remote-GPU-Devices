package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * Model produced by {@link AFTSurvivalRegression}.
 */
public  class AFTSurvivalRegressionModel extends org.apache.spark.ml.Model<org.apache.spark.ml.regression.AFTSurvivalRegressionModel> implements org.apache.spark.ml.regression.AFTSurvivalRegressionParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link AFTSurvivalRegressionModel} */
  static   class AFTSurvivalRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.Logging {
    public   AFTSurvivalRegressionModelWriter (org.apache.spark.ml.regression.AFTSurvivalRegressionModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector coefficients () { throw new RuntimeException(); }
      public  double intercept () { throw new RuntimeException(); }
      public  double scale () { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector coefficients, double intercept, double scale) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction3<org.apache.spark.mllib.linalg.Vector, java.lang.Object, java.lang.Object, org.apache.spark.ml.regression.AFTSurvivalRegressionModel.AFTSurvivalRegressionModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class AFTSurvivalRegressionModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.AFTSurvivalRegressionModel> {
    public   AFTSurvivalRegressionModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.AFTSurvivalRegressionModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector coefficients () { throw new RuntimeException(); }
  public  double intercept () { throw new RuntimeException(); }
  public  double scale () { throw new RuntimeException(); }
  // not preceding
     AFTSurvivalRegressionModel (java.lang.String uid, org.apache.spark.mllib.linalg.Vector coefficients, double intercept, double scale) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel setQuantileProbabilities (double[] value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel setQuantilesCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector predictQuantiles (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

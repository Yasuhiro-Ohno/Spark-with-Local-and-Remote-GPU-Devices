package org.apache.spark.ml.tuning;
/**
 * :: Experimental ::
 * Model from k-fold cross validation.
 * <p>
 * param:  bestModel The best model selected from k-fold cross validation.
 * param:  avgMetrics Average cross-validation metrics for each paramMap in
 *                   {@link CrossValidator.estimatorParamMaps}, in the corresponding order.
 */
public  class CrossValidatorModel extends org.apache.spark.ml.Model<org.apache.spark.ml.tuning.CrossValidatorModel> implements org.apache.spark.ml.tuning.CrossValidatorParams, org.apache.spark.ml.util.MLWritable {
  static   class CrossValidatorModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   CrossValidatorModelWriter (org.apache.spark.ml.tuning.CrossValidatorModel instance) { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class CrossValidatorModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.CrossValidatorModel> {
    public   CrossValidatorModelReader () { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.tuning.CrossValidatorModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.CrossValidatorModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.CrossValidatorModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  Object bestModel () { throw new RuntimeException(); }
  public  double[] avgMetrics () { throw new RuntimeException(); }
  // not preceding
     CrossValidatorModel (java.lang.String uid, org.apache.spark.ml.Model<?> bestModel, double[] avgMetrics) { throw new RuntimeException(); }
  public  void validateParams () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidatorModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

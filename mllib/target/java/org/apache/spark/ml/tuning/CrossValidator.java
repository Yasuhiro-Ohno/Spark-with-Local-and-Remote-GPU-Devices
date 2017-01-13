package org.apache.spark.ml.tuning;
/**
 * :: Experimental ::
 * K-fold cross validation.
 */
public  class CrossValidator extends org.apache.spark.ml.Estimator<org.apache.spark.ml.tuning.CrossValidatorModel> implements org.apache.spark.ml.tuning.CrossValidatorParams, org.apache.spark.ml.util.MLWritable, org.apache.spark.Logging {
  static private  class CrossValidatorReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.CrossValidator> {
    public   CrossValidatorReader () { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.tuning.CrossValidator load (java.lang.String path) { throw new RuntimeException(); }
  }
  // no position
  static private  class CrossValidatorReader$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CrossValidatorReader$ MODULE$ = null;
    public   CrossValidatorReader$ () { throw new RuntimeException(); }
    /**
     * Examine the given estimator (which may be a compound estimator) and extract a mapping
     * from UIDs to corresponding {@link Params} instances.
     * @param instance (undocumented)
     * @return (undocumented)
     */
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.ml.param.Params> getUidMap (org.apache.spark.ml.param.Params instance) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.apache.spark.ml.param.Params>> getUidMapImpl (org.apache.spark.ml.param.Params instance) { throw new RuntimeException(); }
  }
  // no position
  static   class SharedReadWrite$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SharedReadWrite$ MODULE$ = null;
    public   SharedReadWrite$ () { throw new RuntimeException(); }
    /**
     * Check that {@link CrossValidator.evaluator} and {@link CrossValidator.estimator} are Writable.
     * This does not check {@link CrossValidator.estimatorParamMaps}.
     * @param instance (undocumented)
     */
    public  void validateParams (org.apache.spark.ml.tuning.ValidatorParams instance) { throw new RuntimeException(); }
      void saveImpl (java.lang.String path, org.apache.spark.ml.tuning.CrossValidatorParams instance, org.apache.spark.SparkContext sc, scala.Option<org.json4s.JsonAST.JObject> extraMetadata) { throw new RuntimeException(); }
     <M extends org.apache.spark.ml.Model<M>> scala.Tuple5<org.apache.spark.ml.util.DefaultParamsReader.Metadata, org.apache.spark.ml.Estimator<M>, org.apache.spark.ml.evaluation.Evaluator, org.apache.spark.ml.param.ParamMap[], java.lang.Object> load (java.lang.String path, org.apache.spark.SparkContext sc, java.lang.String expectedClassName) { throw new RuntimeException(); }
  }
  static   class CrossValidatorWriter extends org.apache.spark.ml.util.MLWriter {
    public   CrossValidatorWriter (org.apache.spark.ml.tuning.CrossValidator instance) { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.CrossValidator> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.CrossValidator load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   CrossValidator (java.lang.String uid) { throw new RuntimeException(); }
  public   CrossValidator () { throw new RuntimeException(); }
  private  com.github.fommil.netlib.F2jBLAS f2jBLAS () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEstimator (org.apache.spark.ml.Estimator<?> value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEstimatorParamMaps (org.apache.spark.ml.param.ParamMap[] value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEvaluator (org.apache.spark.ml.evaluation.Evaluator value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setNumFolds (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidatorModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  void validateParams () { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidator copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

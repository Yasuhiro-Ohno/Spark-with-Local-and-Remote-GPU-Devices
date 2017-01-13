package org.apache.spark.ml.evaluation;
/**
 * :: Experimental ::
 * Evaluator for binary classification, which expects two input columns: rawPrediction and label.
 */
public  class BinaryClassificationEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasRawPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   BinaryClassificationEvaluator (java.lang.String uid) { throw new RuntimeException(); }
  public   BinaryClassificationEvaluator () { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation
   * Default: areaUnderROC
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName () { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setMetricName (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setRawPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  /**
   * @group setParam
   * @deprecated use {@link setRawPredictionCol()} instead
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setScoreCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  // not preceding
  public  boolean isLargerBetter () { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

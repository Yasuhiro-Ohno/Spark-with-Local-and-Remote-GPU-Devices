package org.apache.spark.ml.evaluation;
/**
 * :: Experimental ::
 * Evaluator for multiclass classification, which expects two input columns: score and label.
 */
public  class MulticlassClassificationEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   MulticlassClassificationEvaluator (java.lang.String uid) { throw new RuntimeException(); }
  public   MulticlassClassificationEvaluator () { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation (supports <code>"f1"</code> (default), <code>"precision"</code>, <code>"recall"</code>,
   * <code>"weightedPrecision"</code>, <code>"weightedRecall"</code>)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName () { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setMetricName (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  // not preceding
  public  boolean isLargerBetter () { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

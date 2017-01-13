package org.apache.spark.ml.evaluation;
/**
 * :: Experimental ::
 * Evaluator for regression, which expects two input columns: prediction and label.
 */
public final class RegressionEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.RegressionEvaluator load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   RegressionEvaluator (java.lang.String uid) { throw new RuntimeException(); }
  public   RegressionEvaluator () { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation (supports <code>"rmse"</code> (default), <code>"mse"</code>, <code>"r2"</code>, and <code>"mae"</code>)
   * <p>
   * Because we will maximize evaluation value (ref: <code>CrossValidator</code>),
   * when we evaluate a metric that is needed to minimize (e.g., <code>"rmse"</code>, <code>"mse"</code>, <code>"mae"</code>),
   * we take and output the negative of this metric.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName () { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setMetricName (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  // not preceding
  public  boolean isLargerBetter () { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.RegressionEvaluator copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

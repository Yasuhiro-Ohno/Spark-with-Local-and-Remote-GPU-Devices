package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Implements the transforms required for fitting a dataset against an R model formula. Currently
 * we support a limited subset of the R operators, including '~', '.', ':', '+', and '-'. Also see
 * the R formula docs here: http://stat.ethz.ch/R-manual/R-patched/library/stats/html/formula.html
 */
public  class RFormula extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.RFormulaModel> implements org.apache.spark.ml.feature.RFormulaBase {
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   RFormula (java.lang.String uid) { throw new RuntimeException(); }
  public   RFormula () { throw new RuntimeException(); }
  /**
   * R formula parameter. The formula is provided in string form.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> formula () { throw new RuntimeException(); }
  /**
   * Sets the formula to use for this transformer. Must be called before use.
   * @group setParam
   * @param value an R formula in string form (e.g. "y ~ x + z")
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.RFormula setFormula (java.lang.String value) { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getFormula () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  /** Whether the formula specifies fitting an intercept. */
    boolean hasIntercept () { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormulaModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormula copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}

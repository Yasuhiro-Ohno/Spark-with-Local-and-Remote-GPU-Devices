package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * A fitted RFormula. Fitting is required to determine the factor levels of formula terms.
 * param:  resolvedFormula the fitted R formula.
 * param:  pipelineModel the fitted feature model, including factor to index mappings.
 */
public  class RFormulaModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.RFormulaModel> implements org.apache.spark.ml.feature.RFormulaBase {
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
     RFormulaModel (java.lang.String uid, org.apache.spark.ml.feature.ResolvedRFormula resolvedFormula, org.apache.spark.ml.PipelineModel pipelineModel) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormulaModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  private  org.apache.spark.sql.DataFrame transformLabel (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  private  void checkCanTransform (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
}

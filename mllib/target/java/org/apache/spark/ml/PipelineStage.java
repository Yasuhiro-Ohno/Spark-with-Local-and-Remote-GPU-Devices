package org.apache.spark.ml;
/**
 * :: DeveloperApi ::
 * A stage in a pipeline, either an {@link Estimator} or a {@link Transformer}.
 */
public abstract class PipelineStage implements org.apache.spark.ml.param.Params, org.apache.spark.Logging {
  public   PipelineStage () { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * <p>
   * Derives the output schema from the input schema.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) ;
  /**
   * :: DeveloperApi ::
   * <p>
   * Derives the output schema from the input schema and parameters, optionally with logging.
   * <p>
   * This should be optimistic.  If it is unclear whether the schema will be valid, then it should
   * be assumed valid until proven otherwise.
   * @param schema (undocumented)
   * @param logging (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema, boolean logging) { throw new RuntimeException(); }
  public abstract  org.apache.spark.ml.PipelineStage copy (org.apache.spark.ml.param.ParamMap extra) ;
}

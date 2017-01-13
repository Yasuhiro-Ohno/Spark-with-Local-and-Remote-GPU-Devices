package org.apache.spark.ml;
/**
 * :: Experimental ::
 * Represents a fitted pipeline.
 */
public  class PipelineModel extends org.apache.spark.ml.Model<org.apache.spark.ml.PipelineModel> implements org.apache.spark.ml.util.MLWritable, org.apache.spark.Logging {
  static   class PipelineModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   PipelineModelWriter (org.apache.spark.ml.PipelineModel instance) { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class PipelineModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.PipelineModel> {
    public   PipelineModelReader () { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.PipelineModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.PipelineModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.PipelineModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.ml.Transformer[] stages () { throw new RuntimeException(); }
  // not preceding
     PipelineModel (java.lang.String uid, org.apache.spark.ml.Transformer[] stages) { throw new RuntimeException(); }
  /** A Java/Python-friendly auxiliary constructor. */
     PipelineModel (java.lang.String uid, java.util.List<org.apache.spark.ml.Transformer> stages) { throw new RuntimeException(); }
  public  void validateParams () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

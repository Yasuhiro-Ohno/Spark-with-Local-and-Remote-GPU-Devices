package org.apache.spark.ml.feature;
public final class ChiSqSelectorModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.ChiSqSelectorModel> implements org.apache.spark.ml.feature.ChiSqSelectorParams, org.apache.spark.ml.util.MLWritable {
  static   class ChiSqSelectorModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   ChiSqSelectorModelWriter (org.apache.spark.ml.feature.ChiSqSelectorModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  scala.collection.Seq<java.lang.Object> selectedFeatures () { throw new RuntimeException(); }
      // not preceding
      public   Data (scala.collection.Seq<java.lang.Object> selectedFeatures) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction1<scala.collection.Seq<java.lang.Object>, org.apache.spark.ml.feature.ChiSqSelectorModel.ChiSqSelectorModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class ChiSqSelectorModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.ChiSqSelectorModel> {
    public   ChiSqSelectorModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.ChiSqSelectorModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.ChiSqSelectorModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.ChiSqSelectorModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.feature.ChiSqSelectorModel chiSqSelector () { throw new RuntimeException(); }
     ChiSqSelectorModel (java.lang.String uid, org.apache.spark.mllib.feature.ChiSqSelectorModel chiSqSelector) { throw new RuntimeException(); }
  public  int[] selectedFeatures () { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelectorModel setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelectorModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelectorModel setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  /**
   * Prepare the output column field, including per-feature metadata.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.types.StructField prepOutputField (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelectorModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

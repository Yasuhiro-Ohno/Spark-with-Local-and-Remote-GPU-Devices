package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Model fitted by {@link StringIndexer}.
 * <p>
 * NOTE: During transformation, if the input column does not exist,
 * {@link StringIndexerModel.transform} would return the input dataset unmodified.
 * This is a temporary fix for the case when target labels do not exist during prediction.
 * <p>
 * param:  labels  Ordered list of labels, corresponding to indices to be assigned.
 */
public  class StringIndexerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.StringIndexerModel> implements org.apache.spark.ml.feature.StringIndexerBase, org.apache.spark.ml.util.MLWritable {
  static   class StringIndexModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   StringIndexModelWriter (org.apache.spark.ml.feature.StringIndexerModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  java.lang.String[] labels () { throw new RuntimeException(); }
      // not preceding
      public   Data (java.lang.String[] labels) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction1<java.lang.String[], org.apache.spark.ml.feature.StringIndexerModel.StringIndexModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class StringIndexerModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.StringIndexerModel> {
    public   StringIndexerModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.StringIndexerModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.StringIndexerModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.StringIndexerModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  java.lang.String[] labels () { throw new RuntimeException(); }
  // not preceding
  public   StringIndexerModel (java.lang.String uid, java.lang.String[] labels) { throw new RuntimeException(); }
  public   StringIndexerModel (java.lang.String[] labels) { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.OpenHashMap<java.lang.String, java.lang.Object> labelToIndex () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexerModel setHandleInvalid (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexerModel setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexerModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexerModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexerModel.StringIndexModelWriter write () { throw new RuntimeException(); }
}

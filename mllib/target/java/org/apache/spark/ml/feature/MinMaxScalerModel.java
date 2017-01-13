package org.apache.spark.ml.feature;
public  class MinMaxScalerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.MinMaxScalerModel> implements org.apache.spark.ml.feature.MinMaxScalerParams, org.apache.spark.ml.util.MLWritable {
  static   class MinMaxScalerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   MinMaxScalerModelWriter (org.apache.spark.ml.feature.MinMaxScalerModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector originalMin () { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Vector originalMax () { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector originalMin, org.apache.spark.mllib.linalg.Vector originalMax) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction2<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.feature.MinMaxScalerModel.MinMaxScalerModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class MinMaxScalerModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.MinMaxScalerModel> {
    public   MinMaxScalerModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.MinMaxScalerModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.MinMaxScalerModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.MinMaxScalerModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector originalMin () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector originalMax () { throw new RuntimeException(); }
  // not preceding
     MinMaxScalerModel (java.lang.String uid, org.apache.spark.mllib.linalg.Vector originalMin, org.apache.spark.mllib.linalg.Vector originalMax) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScalerModel setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScalerModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScalerModel setMin (double value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScalerModel setMax (double value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinMaxScalerModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

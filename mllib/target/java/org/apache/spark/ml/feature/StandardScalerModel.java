package org.apache.spark.ml.feature;
public  class StandardScalerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.StandardScalerModel> implements org.apache.spark.ml.feature.StandardScalerParams, org.apache.spark.ml.util.MLWritable {
  static   class StandardScalerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   StandardScalerModelWriter (org.apache.spark.ml.feature.StandardScalerModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector std () { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Vector mean () { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector std, org.apache.spark.mllib.linalg.Vector mean) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction2<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.feature.StandardScalerModel.StandardScalerModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class StandardScalerModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.StandardScalerModel> {
    public   StandardScalerModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.StandardScalerModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.StandardScalerModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.StandardScalerModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector std () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector mean () { throw new RuntimeException(); }
     StandardScalerModel (java.lang.String uid, org.apache.spark.mllib.linalg.Vector std, org.apache.spark.mllib.linalg.Vector mean) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel setInputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

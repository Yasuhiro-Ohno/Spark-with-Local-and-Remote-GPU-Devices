package org.apache.spark.ml.feature;
public  class IDFModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.IDFModel> implements org.apache.spark.ml.feature.IDFBase, org.apache.spark.ml.util.MLWritable {
  static   class IDFModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   IDFModelWriter (org.apache.spark.ml.feature.IDFModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector idf () { throw new RuntimeException(); }
      public   Data (org.apache.spark.mllib.linalg.Vector idf) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction1<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.feature.IDFModel.IDFModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class IDFModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.IDFModel> {
    public   IDFModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.IDFModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.IDFModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.IDFModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
     IDFModel (java.lang.String uid, org.apache.spark.mllib.feature.IDFModel idfModel) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IDFModel setInputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IDFModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IDFModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector idf () { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

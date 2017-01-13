package org.apache.spark.ml.feature;
public  class PCAModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.PCAModel> implements org.apache.spark.ml.feature.PCAParams, org.apache.spark.ml.util.MLWritable {
  static   class PCAModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   PCAModelWriter (org.apache.spark.ml.feature.PCAModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.DenseMatrix pc () { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.DenseMatrix pc) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction1<org.apache.spark.mllib.linalg.DenseMatrix, org.apache.spark.ml.feature.PCAModel.PCAModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class PCAModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.PCAModel> {
    public   PCAModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.PCAModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.PCAModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.PCAModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseMatrix pc () { throw new RuntimeException(); }
     PCAModel (java.lang.String uid, org.apache.spark.mllib.linalg.DenseMatrix pc) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PCAModel setInputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PCAModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PCAModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

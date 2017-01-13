package org.apache.spark.ml.recommendation;
/**
 * :: Experimental ::
 * Model fitted by ALS.
 * <p>
 * param:  rank rank of the matrix factorization model
 * param:  userFactors a DataFrame that stores user factors in two columns: <code>id</code> and <code>features</code>
 * param:  itemFactors a DataFrame that stores item factors in two columns: <code>id</code> and <code>features</code>
 */
public  class ALSModel extends org.apache.spark.ml.Model<org.apache.spark.ml.recommendation.ALSModel> implements org.apache.spark.ml.recommendation.ALSModelParams, org.apache.spark.ml.util.MLWritable {
  static   class ALSModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   ALSModelWriter (org.apache.spark.ml.recommendation.ALSModel instance) { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class ALSModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.recommendation.ALSModel> {
    public   ALSModelReader () { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.recommendation.ALSModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.recommendation.ALSModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.recommendation.ALSModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  int rank () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame userFactors () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame itemFactors () { throw new RuntimeException(); }
  // not preceding
     ALSModel (java.lang.String uid, int rank, org.apache.spark.sql.DataFrame userFactors, org.apache.spark.sql.DataFrame itemFactors) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setUserCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setItemCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALSModel setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALSModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

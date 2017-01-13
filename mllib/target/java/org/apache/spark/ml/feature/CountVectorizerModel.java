package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Converts a text document to a sparse vector of token counts.
 * param:  vocabulary An Array over terms. Only the terms in the vocabulary will be counted.
 */
public  class CountVectorizerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.CountVectorizerModel> implements org.apache.spark.ml.feature.CountVectorizerParams, org.apache.spark.ml.util.MLWritable {
  static   class CountVectorizerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   CountVectorizerModelWriter (org.apache.spark.ml.feature.CountVectorizerModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  scala.collection.Seq<java.lang.String> vocabulary () { throw new RuntimeException(); }
      // not preceding
      public   Data (scala.collection.Seq<java.lang.String> vocabulary) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction1<scala.collection.Seq<java.lang.String>, org.apache.spark.ml.feature.CountVectorizerModel.CountVectorizerModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class CountVectorizerModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.CountVectorizerModel> {
    public   CountVectorizerModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.CountVectorizerModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.CountVectorizerModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.CountVectorizerModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  java.lang.String[] vocabulary () { throw new RuntimeException(); }
  // not preceding
  public   CountVectorizerModel (java.lang.String uid, java.lang.String[] vocabulary) { throw new RuntimeException(); }
  public   CountVectorizerModel (java.lang.String[] vocabulary) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizerModel setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizerModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizerModel setMinTF (double value) { throw new RuntimeException(); }
  /** Dictionary created from {@link vocabulary} and its indices, broadcast once for {@link transform()} */
  private  scala.Option<org.apache.spark.broadcast.Broadcast<scala.collection.immutable.Map<java.lang.String, java.lang.Object>>> broadcastDict () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.CountVectorizerModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

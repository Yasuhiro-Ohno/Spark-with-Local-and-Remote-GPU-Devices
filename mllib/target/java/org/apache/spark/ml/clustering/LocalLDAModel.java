package org.apache.spark.ml.clustering;
/**
 * :: Experimental ::
 * <p>
 * Local (non-distributed) model fitted by {@link LDA}.
 * <p>
 * This model stores the inferred topics only; it does not store info about the training dataset.
 */
public  class LocalLDAModel extends org.apache.spark.ml.clustering.LDAModel {
  static   class LocalLDAModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   LocalLDAModelWriter (org.apache.spark.ml.clustering.LocalLDAModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  int vocabSize () { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Matrix topicsMatrix () { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Vector docConcentration () { throw new RuntimeException(); }
      public  double topicConcentration () { throw new RuntimeException(); }
      public  double gammaShape () { throw new RuntimeException(); }
      // not preceding
      public   Data (int vocabSize, org.apache.spark.mllib.linalg.Matrix topicsMatrix, org.apache.spark.mllib.linalg.Vector docConcentration, double topicConcentration, double gammaShape) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction5<java.lang.Object, org.apache.spark.mllib.linalg.Matrix, org.apache.spark.mllib.linalg.Vector, java.lang.Object, java.lang.Object, org.apache.spark.ml.clustering.LocalLDAModel.LocalLDAModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class LocalLDAModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LocalLDAModel> {
    public   LocalLDAModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.LocalLDAModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LocalLDAModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.LocalLDAModel load (java.lang.String path) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel () { throw new RuntimeException(); }
  // not preceding
     LocalLDAModel (java.lang.String uid, int vocabSize, org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.LocalLDAModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.clustering.LDAModel getModel () { throw new RuntimeException(); }
  public  boolean isDistributed () { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

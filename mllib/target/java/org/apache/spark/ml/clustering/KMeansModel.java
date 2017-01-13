package org.apache.spark.ml.clustering;
/**
 * :: Experimental ::
 * Model fitted by KMeans.
 * <p>
 * param:  parentModel a model trained by spark.mllib.clustering.KMeans.
 */
public  class KMeansModel extends org.apache.spark.ml.Model<org.apache.spark.ml.clustering.KMeansModel> implements org.apache.spark.ml.clustering.KMeansParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link KMeansModel} */
  static   class KMeansModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   KMeansModelWriter (org.apache.spark.ml.clustering.KMeansModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector[] clusterCenters () { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector[] clusterCenters) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction1<org.apache.spark.mllib.linalg.Vector[], org.apache.spark.ml.clustering.KMeansModel.KMeansModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class KMeansModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.KMeansModel> {
    public   KMeansModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.KMeansModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.KMeansModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.KMeansModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.clustering.KMeansModel parentModel () { throw new RuntimeException(); }
  // not preceding
     KMeansModel (java.lang.String uid, org.apache.spark.mllib.clustering.KMeansModel parentModel) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeansModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
    int predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector[] clusterCenters () { throw new RuntimeException(); }
  /**
   * Return the K-means cost (sum of squared distances of points to their nearest center) for this
   * model on the given data.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

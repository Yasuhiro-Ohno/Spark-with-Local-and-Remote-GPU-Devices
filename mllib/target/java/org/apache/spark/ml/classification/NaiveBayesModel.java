package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Model produced by {@link NaiveBayes}
 * param:  pi log of class priors, whose dimension is C (number of classes)
 * param:  theta log of class conditional probabilities, whose dimension is C (number of classes)
 *              by D (number of features)
 */
public  class NaiveBayesModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.NaiveBayesModel> implements org.apache.spark.ml.classification.NaiveBayesParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link NaiveBayesModel} */
  static   class NaiveBayesModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   NaiveBayesModelWriter (org.apache.spark.ml.classification.NaiveBayesModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector pi () { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Matrix theta () { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector pi, org.apache.spark.mllib.linalg.Matrix theta) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction2<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Matrix, org.apache.spark.ml.classification.NaiveBayesModel.NaiveBayesModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class NaiveBayesModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.NaiveBayesModel> {
    public   NaiveBayesModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.classification.NaiveBayesModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  /** Convert a model from the old API */
  static   org.apache.spark.ml.classification.NaiveBayesModel fromOld (org.apache.spark.mllib.classification.NaiveBayesModel oldModel, org.apache.spark.ml.classification.NaiveBayes parent) { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.NaiveBayesModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.NaiveBayesModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector pi () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Matrix theta () { throw new RuntimeException(); }
  // not preceding
     NaiveBayesModel (java.lang.String uid, org.apache.spark.mllib.linalg.Vector pi, org.apache.spark.mllib.linalg.Matrix theta) { throw new RuntimeException(); }
  // not preceding
  private  scala.Option<org.apache.spark.mllib.linalg.Matrix> thetaMinusNegTheta () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.mllib.linalg.DenseVector> negThetaSum () { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  public  int numClasses () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.DenseVector multinomialCalculation (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.DenseVector bernoulliCalculation (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.linalg.Vector predictRaw (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.linalg.Vector raw2probabilityInPlace (org.apache.spark.mllib.linalg.Vector rawPrediction) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.NaiveBayesModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

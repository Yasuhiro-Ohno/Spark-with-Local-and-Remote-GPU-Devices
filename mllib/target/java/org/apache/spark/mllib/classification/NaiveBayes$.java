package org.apache.spark.mllib.classification;
// no position
public  class NaiveBayes$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NaiveBayes$ MODULE$ = null;
  public   NaiveBayes$ () { throw new RuntimeException(); }
  public  java.lang.String Multinomial () { throw new RuntimeException(); }
  public  java.lang.String Bernoulli () { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> supportedModelTypes () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda, java.lang.String modelType) { throw new RuntimeException(); }
}

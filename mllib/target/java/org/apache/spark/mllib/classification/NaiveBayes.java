package org.apache.spark.mllib.classification;
public  class NaiveBayes implements scala.Serializable, org.apache.spark.Logging {
  static public  java.lang.String Multinomial () { throw new RuntimeException(); }
  static public  java.lang.String Bernoulli () { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.String> supportedModelTypes () { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda, java.lang.String modelType) { throw new RuntimeException(); }
  private  double lambda () { throw new RuntimeException(); }
  private  java.lang.String modelType () { throw new RuntimeException(); }
  private   NaiveBayes (double lambda, java.lang.String modelType) { throw new RuntimeException(); }
  public   NaiveBayes (double lambda) { throw new RuntimeException(); }
  public   NaiveBayes () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.classification.NaiveBayes setLambda (double lambda) { throw new RuntimeException(); }
  public  double getLambda () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.classification.NaiveBayes setModelType (java.lang.String modelType) { throw new RuntimeException(); }
  public  java.lang.String getModelType () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.classification.NaiveBayesModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data) { throw new RuntimeException(); }
}

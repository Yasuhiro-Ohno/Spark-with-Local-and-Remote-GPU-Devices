package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Naive Bayes Classifiers.
 * It supports both Multinomial NB
 * ({@link http://nlp.stanford.edu/IR-book/html/htmledition/naive-bayes-text-classification-1.html})
 * which can handle finitely supported discrete data. For example, by converting documents into
 * TF-IDF vectors, it can be used for document classification. By making every vector a
 * binary (0/1) data, it can also be used as Bernoulli NB
 * ({@link http://nlp.stanford.edu/IR-book/html/htmledition/the-bernoulli-model-1.html}).
 * The input feature values must be nonnegative.
 */
public  class NaiveBayes extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.NaiveBayes, org.apache.spark.ml.classification.NaiveBayesModel> implements org.apache.spark.ml.classification.NaiveBayesParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.classification.NaiveBayes load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   NaiveBayes (java.lang.String uid) { throw new RuntimeException(); }
  public   NaiveBayes () { throw new RuntimeException(); }
  /**
   * Set the smoothing parameter.
   * Default is 1.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setSmoothing (double value) { throw new RuntimeException(); }
  /**
   * Set the model type using a string (case-sensitive).
   * Supported options: "multinomial" and "bernoulli".
   * Default is "multinomial"
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setModelType (java.lang.String value) { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.NaiveBayesModel train (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.NaiveBayes copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

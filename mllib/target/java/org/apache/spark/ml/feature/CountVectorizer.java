package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Extracts a vocabulary from document collections and generates a {@link CountVectorizerModel}.
 */
public  class CountVectorizer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.CountVectorizerModel> implements org.apache.spark.ml.feature.CountVectorizerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.CountVectorizer load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   CountVectorizer (java.lang.String uid) { throw new RuntimeException(); }
  public   CountVectorizer () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setVocabSize (int value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setMinDF (double value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.CountVectorizer setMinTF (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.CountVectorizerModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.CountVectorizer copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

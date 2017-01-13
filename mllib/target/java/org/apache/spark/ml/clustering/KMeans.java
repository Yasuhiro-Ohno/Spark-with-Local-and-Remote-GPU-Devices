package org.apache.spark.ml.clustering;
public  class KMeans extends org.apache.spark.ml.Estimator<org.apache.spark.ml.clustering.KMeansModel> implements org.apache.spark.ml.clustering.KMeansParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.clustering.KMeans load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public   KMeans (java.lang.String uid) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeans copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public   KMeans () { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans setK (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans setInitMode (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans setInitSteps (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans setMaxIter (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans setTol (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeans setSeed (long value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeansModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
}

package org.apache.spark.mllib.recommendation;
public  class ALS implements scala.Serializable, org.apache.spark.Logging {
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, long seed) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha, long seed) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, double alpha) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations) { throw new RuntimeException(); }
  private  int numUserBlocks () { throw new RuntimeException(); }
  private  int numProductBlocks () { throw new RuntimeException(); }
  private  int rank () { throw new RuntimeException(); }
  private  int iterations () { throw new RuntimeException(); }
  private  double lambda () { throw new RuntimeException(); }
  private  boolean implicitPrefs () { throw new RuntimeException(); }
  private  double alpha () { throw new RuntimeException(); }
  private  long seed () { throw new RuntimeException(); }
  private   ALS (int numUserBlocks, int numProductBlocks, int rank, int iterations, double lambda, boolean implicitPrefs, double alpha, long seed) { throw new RuntimeException(); }
  public   ALS () { throw new RuntimeException(); }
  private  boolean nonnegative () { throw new RuntimeException(); }
  private  org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel () { throw new RuntimeException(); }
  private  org.apache.spark.storage.StorageLevel finalRDDStorageLevel () { throw new RuntimeException(); }
  private  int checkpointInterval () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setBlocks (int numBlocks) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setUserBlocks (int numUserBlocks) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setProductBlocks (int numProductBlocks) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setRank (int rank) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setIterations (int iterations) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setLambda (double lambda) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setImplicitPrefs (boolean implicitPrefs) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setAlpha (double alpha) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setSeed (long seed) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setNonnegative (boolean b) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setIntermediateRDDStorageLevel (org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setFinalRDDStorageLevel (org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.ALS setCheckpointInterval (int checkpointInterval) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> ratings) { throw new RuntimeException(); }
}

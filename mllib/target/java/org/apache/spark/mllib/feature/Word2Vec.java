package org.apache.spark.mllib.feature;
public  class Word2Vec implements scala.Serializable, org.apache.spark.Logging {
  public   Word2Vec () { throw new RuntimeException(); }
  private  int vectorSize () { throw new RuntimeException(); }
  private  double learningRate () { throw new RuntimeException(); }
  private  int numPartitions () { throw new RuntimeException(); }
  private  int numIterations () { throw new RuntimeException(); }
  private  long seed () { throw new RuntimeException(); }
  private  int minCount () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.Word2Vec setVectorSize (int vectorSize) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.Word2Vec setLearningRate (double learningRate) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.Word2Vec setNumPartitions (int numPartitions) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.Word2Vec setNumIterations (int numIterations) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.Word2Vec setSeed (long seed) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.Word2Vec setWindowSize (int window) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.Word2Vec setMinCount (int minCount) { throw new RuntimeException(); }
  private  int EXP_TABLE_SIZE () { throw new RuntimeException(); }
  private  int MAX_EXP () { throw new RuntimeException(); }
  private  int MAX_CODE_LENGTH () { throw new RuntimeException(); }
  private  int MAX_SENTENCE_LENGTH () { throw new RuntimeException(); }
  private  int window () { throw new RuntimeException(); }
  private  int trainWordsCount () { throw new RuntimeException(); }
  private  int vocabSize () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.feature.VocabWord[] vocab () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> vocabHash () { throw new RuntimeException(); }
  private  void learnVocab (org.apache.spark.rdd.RDD<java.lang.String> words) { throw new RuntimeException(); }
  private  float[] createExpTable () { throw new RuntimeException(); }
  private  void createBinaryTree () { throw new RuntimeException(); }
  public <S extends scala.collection.Iterable<java.lang.String>> org.apache.spark.mllib.feature.Word2VecModel fit (org.apache.spark.rdd.RDD<S> dataset) { throw new RuntimeException(); }
  public <S extends java.lang.Iterable<java.lang.String>> org.apache.spark.mllib.feature.Word2VecModel fit (org.apache.spark.api.java.JavaRDD<S> dataset) { throw new RuntimeException(); }
}

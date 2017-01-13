package org.apache.spark.mllib.feature;
public  class Word2VecModel implements scala.Serializable, org.apache.spark.mllib.util.Saveable {
  // no position
  static private  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ () { throw new RuntimeException(); }
    public  java.lang.String formatVersionV1_0 () { throw new RuntimeException(); }
    public  java.lang.String classNameV1_0 () { throw new RuntimeException(); }
    public  class Data implements scala.Product, scala.Serializable {
      public  java.lang.String word () { throw new RuntimeException(); }
      public  float[] vector () { throw new RuntimeException(); }
      public   Data (java.lang.String word, float[] vector) { throw new RuntimeException(); }
    }
    // no position
    public  class Data extends scala.runtime.AbstractFunction2<java.lang.String, float[], org.apache.spark.mllib.feature.Word2VecModel.SaveLoadV1_0.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    public  org.apache.spark.mllib.feature.Word2VecModel load (org.apache.spark.SparkContext sc, java.lang.String path) { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, scala.collection.immutable.Map<java.lang.String, float[]> model) { throw new RuntimeException(); }
  }
  static private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> buildWordIndex (scala.collection.immutable.Map<java.lang.String, float[]> model) { throw new RuntimeException(); }
  static private  float[] buildWordVectors (scala.collection.immutable.Map<java.lang.String, float[]> model) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.feature.Word2VecModel load (org.apache.spark.SparkContext sc, java.lang.String path) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> wordIndex () { throw new RuntimeException(); }
  public  float[] wordVectors () { throw new RuntimeException(); }
     Word2VecModel (scala.collection.immutable.Map<java.lang.String, java.lang.Object> wordIndex, float[] wordVectors) { throw new RuntimeException(); }
  private  int numWords () { throw new RuntimeException(); }
  private  int vectorSize () { throw new RuntimeException(); }
  private  java.lang.String[] wordList () { throw new RuntimeException(); }
  private  double[] wordVecNorms () { throw new RuntimeException(); }
  public   Word2VecModel (scala.collection.immutable.Map<java.lang.String, float[]> model) { throw new RuntimeException(); }
  private  double cosineSimilarity (float[] v1, float[] v2) { throw new RuntimeException(); }
  protected  java.lang.String formatVersion () { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector transform (java.lang.String word) { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonyms (java.lang.String word, int num) { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonyms (org.apache.spark.mllib.linalg.Vector vector, int num) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, float[]> getVectors () { throw new RuntimeException(); }
}

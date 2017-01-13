package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Model fitted by {@link Word2Vec}.
 */
public  class Word2VecModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.Word2VecModel> implements org.apache.spark.ml.feature.Word2VecBase, org.apache.spark.ml.util.MLWritable {
  static   class Word2VecModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   Word2VecModelWriter (org.apache.spark.ml.feature.Word2VecModel instance) { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> wordIndex () { throw new RuntimeException(); }
      public  scala.collection.Seq<java.lang.Object> wordVectors () { throw new RuntimeException(); }
      // not preceding
      public   Data (scala.collection.immutable.Map<java.lang.String, java.lang.Object> wordIndex, scala.collection.Seq<java.lang.Object> wordVectors) { throw new RuntimeException(); }
    }
    // no position
    private  class Data extends scala.runtime.AbstractFunction2<scala.collection.immutable.Map<java.lang.String, java.lang.Object>, scala.collection.Seq<java.lang.Object>, org.apache.spark.ml.feature.Word2VecModel.Word2VecModelWriter.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path) { throw new RuntimeException(); }
  }
  static private  class Word2VecModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.Word2VecModel> {
    public   Word2VecModelReader () { throw new RuntimeException(); }
    private  java.lang.String className () { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.Word2VecModel load (java.lang.String path) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.Word2VecModel> read () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Word2VecModel load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.feature.Word2VecModel wordVectors () { throw new RuntimeException(); }
  // not preceding
     Word2VecModel (java.lang.String uid, org.apache.spark.mllib.feature.Word2VecModel wordVectors) { throw new RuntimeException(); }
  /**
   * Returns a dataframe with two fields, "word" and "vector", with "word" being a String and
   * and the vector the DenseVector that it is mapped to.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame getVectors () { throw new RuntimeException(); }
  /**
   * Find "num" number of words closest in similarity to the given word.
   * Returns a dataframe with the words and the cosine similarities between the
   * synonyms and the given word.
   * @param word (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame findSynonyms (java.lang.String word, int num) { throw new RuntimeException(); }
  /**
   * Find "num" number of words closest to similarity to the given vector representation
   * of the word. Returns a dataframe with the words and the cosine similarities between the
   * synonyms and the given word vector.
   * @param word (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame findSynonyms (org.apache.spark.mllib.linalg.Vector word, int num) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2VecModel setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2VecModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /**
   * Transform a sentence column to a vector column to represent the whole sentence. The transform
   * is performed by averaging all word vectors it contains.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Word2VecModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write () { throw new RuntimeException(); }
}

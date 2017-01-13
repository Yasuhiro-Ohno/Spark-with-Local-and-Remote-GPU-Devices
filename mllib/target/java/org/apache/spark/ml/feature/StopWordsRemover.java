package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * A feature transformer that filters out stop words from input.
 * Note: null values from input array are preserved unless adding null to stopWords explicitly.
 * @see <a href="http://en.wikipedia.org/wiki/Stop_words"/>
 */
public  class StopWordsRemover extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.StopWordsRemover load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   StopWordsRemover (java.lang.String uid) { throw new RuntimeException(); }
  public   StopWordsRemover () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /**
   * the stop words set to be filtered out
   * Default: {@link StopWords.English}
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam stopWords () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setStopWords (java.lang.String[] value) { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String[] getStopWords () { throw new RuntimeException(); }
  /**
   * whether to do a case sensitive comparison over the stop words
   * Default: false
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam caseSensitive () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StopWordsRemover setCaseSensitive (boolean value) { throw new RuntimeException(); }
  /** @group getParam */
  public  boolean getCaseSensitive () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StopWordsRemover copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

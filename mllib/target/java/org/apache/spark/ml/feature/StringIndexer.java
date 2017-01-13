package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * A label indexer that maps a string column of labels to an ML column of label indices.
 * If the input column is numeric, we cast it to string and index the string values.
 * The indices are in [0, numLabels), ordered by label frequencies.
 * So the most frequent label gets index 0.
 * <p>
 * @see {@link IndexToString} for the inverse transformation
 */
public  class StringIndexer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.StringIndexerModel> implements org.apache.spark.ml.feature.StringIndexerBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.StringIndexer load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   StringIndexer (java.lang.String uid) { throw new RuntimeException(); }
  public   StringIndexer () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setHandleInvalid (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexerModel fit (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexer copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * This class takes a feature vector and outputs a new feature vector with a subarray of the
 * original features.
 * <p>
 * The subset of features can be specified with either indices ({@link setIndices()})
 * or names ({@link setNames()}).  At least one feature must be selected. Duplicate features
 * are not allowed, so there can be no overlap between selected indices and names.
 * <p>
 * The output vector will order features with the selected indices first (in the order given),
 * followed by the selected names (in the order given).
 */
public final class VectorSlicer extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  /** Return true if given feature indices are valid */
  static   boolean validIndices (int[] indices) { throw new RuntimeException(); }
  /** Return true if given feature names are valid */
  static   boolean validNames (java.lang.String[] names) { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorSlicer load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   VectorSlicer (java.lang.String uid) { throw new RuntimeException(); }
  public   VectorSlicer () { throw new RuntimeException(); }
  /**
   * An array of indices to select features from a vector column.
   * There can be no overlap with {@link names}.
   * Default: Empty array
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntArrayParam indices () { throw new RuntimeException(); }
  /** @group getParam */
  public  int[] getIndices () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSlicer setIndices (int[] value) { throw new RuntimeException(); }
  /**
   * An array of feature names to select features from a vector column.
   * These names must be specified by ML {@link org.apache.spark.ml.attribute.Attribute}s.
   * There can be no overlap with {@link indices}.
   * Default: Empty Array
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam names () { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String[] getNames () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSlicer setNames (java.lang.String[] value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSlicer setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSlicer setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  void validateParams () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  /** Get the feature indices in order: indices, names */
  private  int[] getSelectedFeatureIndices (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorSlicer copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * A one-hot encoder that maps a column of category indices to a column of binary vectors, with
 * at most a single one-value per row that indicates the input category index.
 * For example with 5 categories, an input value of 2.0 would map to an output vector of
 * <code>[0.0, 0.0, 1.0, 0.0]</code>.
 * The last category is not included by default (configurable via {@link OneHotEncoder!.dropLast}
 * because it makes the vector entries sum up to one, and hence linearly dependent.
 * So an input value of 4.0 maps to <code>[0.0, 0.0, 0.0, 0.0]</code>.
 * Note that this is different from scikit-learn's OneHotEncoder, which keeps all categories.
 * The output vectors are sparse.
 * <p>
 * @see {@link StringIndexer} for converting categorical values into category indices
 */
public  class OneHotEncoder extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.OneHotEncoder load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   OneHotEncoder (java.lang.String uid) { throw new RuntimeException(); }
  public   OneHotEncoder () { throw new RuntimeException(); }
  /**
   * Whether to drop the last category in the encoded vector (default: true)
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.BooleanParam dropLast () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setDropLast (boolean value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setInputCol (java.lang.String value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.OneHotEncoder setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.OneHotEncoder copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

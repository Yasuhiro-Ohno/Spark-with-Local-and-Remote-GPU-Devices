package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Normalize a vector to have unit norm using the given p-norm.
 */
public  class Normalizer extends org.apache.spark.ml.UnaryTransformer<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.feature.Normalizer> implements org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.Normalizer load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   Normalizer (java.lang.String uid) { throw new RuntimeException(); }
  public   Normalizer () { throw new RuntimeException(); }
  /**
   * Normalization in L^p^ space.  Must be >= 1.
   * (default: p = 2)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam p () { throw new RuntimeException(); }
  /** @group getParam */
  public  double getP () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Normalizer setP (double value) { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector> createTransformFunc () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType () { throw new RuntimeException(); }
}

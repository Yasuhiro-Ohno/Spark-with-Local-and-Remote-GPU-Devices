package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Perform feature expansion in a polynomial space. As said in wikipedia of Polynomial Expansion,
 * which is available at {@link http://en.wikipedia.org/wiki/Polynomial_expansion}, "In mathematics, an
 * expansion of a product of sums expresses it as a sum of products by using the fact that
 * multiplication distributes over addition". Take a 2-variable feature vector as an example:
 * <code>(x, y)</code>, if we want to expand it with degree 2, then we get <code>(x, x * x, y, x * y, y * y)</code>.
 */
public  class PolynomialExpansion extends org.apache.spark.ml.UnaryTransformer<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.feature.PolynomialExpansion> implements org.apache.spark.ml.util.DefaultParamsWritable {
  static private  int choose (int n, int k) { throw new RuntimeException(); }
  static private  int getPolySize (int numFeatures, int degree) { throw new RuntimeException(); }
  static private  int expandDense (double[] values, int lastIdx, int degree, double multiplier, double[] polyValues, int curPolyIdx) { throw new RuntimeException(); }
  static private  int expandSparse (int[] indices, double[] values, int lastIdx, int lastFeatureIdx, int degree, double multiplier, scala.collection.mutable.ArrayBuilder<java.lang.Object> polyIndices, scala.collection.mutable.ArrayBuilder<java.lang.Object> polyValues, int curPolyIdx) { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.linalg.DenseVector expand (org.apache.spark.mllib.linalg.DenseVector dv, int degree) { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.linalg.SparseVector expand (org.apache.spark.mllib.linalg.SparseVector sv, int degree) { throw new RuntimeException(); }
  static   org.apache.spark.mllib.linalg.Vector expand (org.apache.spark.mllib.linalg.Vector v, int degree) { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.PolynomialExpansion load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   PolynomialExpansion (java.lang.String uid) { throw new RuntimeException(); }
  public   PolynomialExpansion () { throw new RuntimeException(); }
  /**
   * The polynomial degree to expand, which should be >= 1.  A value of 1 means no expansion.
   * Default: 2
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam degree () { throw new RuntimeException(); }
  /** @group getParam */
  public  int getDegree () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.PolynomialExpansion setDegree (int value) { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector> createTransformFunc () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType () { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PolynomialExpansion copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

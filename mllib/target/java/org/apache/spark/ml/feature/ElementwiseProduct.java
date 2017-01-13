package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Outputs the Hadamard product (i.e., the element-wise product) of each input vector with a
 * provided "weight" vector.  In other words, it scales each column of the dataset by a scalar
 * multiplier.
 */
public  class ElementwiseProduct extends org.apache.spark.ml.UnaryTransformer<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.feature.ElementwiseProduct> {
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   ElementwiseProduct (java.lang.String uid) { throw new RuntimeException(); }
  public   ElementwiseProduct () { throw new RuntimeException(); }
  /**
   * the vector to multiply with input vectors
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.mllib.linalg.Vector> scalingVec () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ElementwiseProduct setScalingVec (org.apache.spark.mllib.linalg.Vector value) { throw new RuntimeException(); }
  /** @group getParam */
  public  org.apache.spark.mllib.linalg.Vector getScalingVec () { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Vector> createTransformFunc () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType () { throw new RuntimeException(); }
}

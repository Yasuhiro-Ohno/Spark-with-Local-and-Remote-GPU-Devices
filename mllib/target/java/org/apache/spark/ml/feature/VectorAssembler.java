package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * A feature transformer that merges multiple columns into a vector column.
 */
public  class VectorAssembler extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.VectorAssembler load (java.lang.String path) { throw new RuntimeException(); }
  static   org.apache.spark.mllib.linalg.Vector assemble (scala.collection.Seq<java.lang.Object> vv) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  // not preceding
  public   VectorAssembler (java.lang.String uid) { throw new RuntimeException(); }
  public   VectorAssembler () { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorAssembler setInputCols (java.lang.String[] value) { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorAssembler setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorAssembler copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/**
 * Utility transformer for removing temporary columns from a DataFrame.
 * TODO(ekl) make this a public transformer
 */
public  class ColumnPruner extends org.apache.spark.ml.Transformer {
  public   ColumnPruner (scala.collection.immutable.Set<java.lang.String> columnsToPrune) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ColumnPruner copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

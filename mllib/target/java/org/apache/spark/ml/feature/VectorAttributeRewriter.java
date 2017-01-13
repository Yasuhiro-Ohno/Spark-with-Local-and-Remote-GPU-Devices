package org.apache.spark.ml.feature;
/**
 * Utility transformer that rewrites Vector attribute names via prefix replacement. For example,
 * it can rewrite attribute names starting with 'foo_' to start with 'bar_' instead.
 * <p>
 * param:  vectorCol name of the vector column to rewrite.
 * param:  prefixesToRewrite the map of string prefixes to their replacement values. Each attribute
 *                          name defined in vectorCol will be checked against the keys of this
 *                          map. When a key prefixes a name, the matching prefix will be replaced
 *                          by the value in the map.
 */
public  class VectorAttributeRewriter extends org.apache.spark.ml.Transformer {
  public   VectorAttributeRewriter (java.lang.String vectorCol, scala.collection.immutable.Map<java.lang.String, java.lang.String> prefixesToRewrite) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorAttributeRewriter copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

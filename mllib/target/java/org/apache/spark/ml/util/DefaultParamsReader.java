package org.apache.spark.ml.util;
/**
 * Default {@link MLReader} implementation for transformers and estimators that contain basic
 * (json4s-serializable) params and no data. This will not handle more complex params or types with
 * data (e.g., models with coefficients).
 * @tparam T ML instance type
 * TODO: Consider adding check for correct class name.
 */
  class DefaultParamsReader<T extends java.lang.Object> extends org.apache.spark.ml.util.MLReader<T> {
  /**
   * All info from metadata file.
   * param:  params  paramMap, as a {@link JValue}
   * param:  metadata  All metadata, including the other fields
   * param:  metadataJson  Full metadata file String (for debugging)
   */
  static public  class Metadata implements scala.Product, scala.Serializable {
    public  java.lang.String className () { throw new RuntimeException(); }
    public  java.lang.String uid () { throw new RuntimeException(); }
    public  long timestamp () { throw new RuntimeException(); }
    public  java.lang.String sparkVersion () { throw new RuntimeException(); }
    public  org.json4s.JsonAST.JValue params () { throw new RuntimeException(); }
    public  org.json4s.JsonAST.JValue metadata () { throw new RuntimeException(); }
    public  java.lang.String metadataJson () { throw new RuntimeException(); }
    // not preceding
    public   Metadata (java.lang.String className, java.lang.String uid, long timestamp, java.lang.String sparkVersion, org.json4s.JsonAST.JValue params, org.json4s.JsonAST.JValue metadata, java.lang.String metadataJson) { throw new RuntimeException(); }
  }
  // no position
  static public  class Metadata$ extends scala.runtime.AbstractFunction7<java.lang.String, java.lang.String, java.lang.Object, java.lang.String, org.json4s.JsonAST.JValue, org.json4s.JsonAST.JValue, java.lang.String, org.apache.spark.ml.util.DefaultParamsReader.Metadata> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Metadata$ MODULE$ = null;
    public   Metadata$ () { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.DefaultParamsReader.Metadata loadMetadata (java.lang.String path, org.apache.spark.SparkContext sc, java.lang.String expectedClassName) { throw new RuntimeException(); }
  static public  void getAndSetParams (org.apache.spark.ml.param.Params instance, org.apache.spark.ml.util.DefaultParamsReader.Metadata metadata) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T loadParamsInstance (java.lang.String path, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   DefaultParamsReader () { throw new RuntimeException(); }
  public  T load (java.lang.String path) { throw new RuntimeException(); }
}

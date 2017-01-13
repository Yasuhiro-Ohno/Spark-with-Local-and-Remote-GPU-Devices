package org.apache.spark.ml.param.shared;
// no position
/**
 * Code generator for shared params (sharedParams.scala). Run under the Spark folder with
 * <pre><code>
 *   build/sbt "mllib/runMain org.apache.spark.ml.param.shared.SharedParamsCodeGen"
 * </code></pre>
 */
  class SharedParamsCodeGen {
  /** Description of a param. */
  static private  class ParamDesc<T extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  java.lang.String name () { throw new RuntimeException(); }
    public  java.lang.String doc () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> defaultValueStr () { throw new RuntimeException(); }
    public  java.lang.String isValid () { throw new RuntimeException(); }
    public  boolean finalMethods () { throw new RuntimeException(); }
    // not preceding
    public   ParamDesc (java.lang.String name, java.lang.String doc, scala.Option<java.lang.String> defaultValueStr, java.lang.String isValid, boolean finalMethods, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
    public  java.lang.String paramTypeName () { throw new RuntimeException(); }
    public  java.lang.String valueTypeName () { throw new RuntimeException(); }
    private  java.lang.String getTypeString (java.lang.Class<?> c) { throw new RuntimeException(); }
  }
  // no position
  static private  class ParamDesc$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ParamDesc$ MODULE$ = null;
    public   ParamDesc$ () { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static private  java.lang.String genHasParamTrait (org.apache.spark.ml.param.shared.SharedParamsCodeGen.ParamDesc<?> param) { throw new RuntimeException(); }
  static private  java.lang.String genSharedParams (scala.collection.Seq<org.apache.spark.ml.param.shared.SharedParamsCodeGen.ParamDesc<?>> params) { throw new RuntimeException(); }
}

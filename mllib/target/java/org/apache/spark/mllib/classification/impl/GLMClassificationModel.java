package org.apache.spark.mllib.classification.impl;
// no position
/**
 * Helper class for import/export of GLM classification models.
 */
  class GLMClassificationModel {
  // no position
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ () { throw new RuntimeException(); }
    public  java.lang.String thisFormatVersion () { throw new RuntimeException(); }
    /** Model data for import/export */
    public  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector weights () { throw new RuntimeException(); }
      public  double intercept () { throw new RuntimeException(); }
      public  scala.Option<java.lang.Object> threshold () { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector weights, double intercept, scala.Option<java.lang.Object> threshold) { throw new RuntimeException(); }
    }
    // no position
    public  class Data extends scala.runtime.AbstractFunction3<org.apache.spark.mllib.linalg.Vector, java.lang.Object, scala.Option<java.lang.Object>, org.apache.spark.mllib.classification.impl.GLMClassificationModel.SaveLoadV1_0.Data> implements scala.Serializable {
      public   Data () { throw new RuntimeException(); }
    }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, java.lang.String modelClass, int numFeatures, int numClasses, org.apache.spark.mllib.linalg.Vector weights, double intercept, scala.Option<java.lang.Object> threshold) { throw new RuntimeException(); }
    public  org.apache.spark.mllib.classification.impl.GLMClassificationModel.SaveLoadV1_0.Data loadData (org.apache.spark.SparkContext sc, java.lang.String path, java.lang.String modelClass) { throw new RuntimeException(); }
  }
}

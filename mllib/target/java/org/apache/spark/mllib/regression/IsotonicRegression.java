package org.apache.spark.mllib.regression;
public  class IsotonicRegression implements java.io.Serializable {
  private  boolean isotonic () { throw new RuntimeException(); }
  private   IsotonicRegression (boolean isotonic) { throw new RuntimeException(); }
  public   IsotonicRegression () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.IsotonicRegression setIsotonic (boolean isotonic) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.IsotonicRegressionModel run (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> input) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.IsotonicRegressionModel run (org.apache.spark.api.java.JavaRDD<scala.Tuple3<java.lang.Double, java.lang.Double, java.lang.Double>> input) { throw new RuntimeException(); }
  private  scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[] poolAdjacentViolators (scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[] input) { throw new RuntimeException(); }
  private  scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[] parallelPoolAdjacentViolators (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> input) { throw new RuntimeException(); }
}

package org.apache.spark.mllib.stat.test;
// no position
// not preceding
  class KolmogorovSmirnovTest$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KolmogorovSmirnovTest$ MODULE$ = null;
  /**
   * A convenience function that allows running the KS test for 1 set of sample data against
   * a named distribution
   * @param data the sample data that we wish to evaluate
   * @param distName the name of the theoretical distribution
   * @param params Variable length parameter for distribution's parameters
   * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the
   *        test results (p-value, statistic, and null hypothesis)
   */
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, java.lang.String distName, double... params) { throw new RuntimeException(); }
  public   KolmogorovSmirnovTest$ () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, scala.Function1<java.lang.Object, java.lang.Object> cdf) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, org.apache.commons.math3.distribution.RealDistribution distObj) { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> oneSampleDifferences (scala.collection.Iterator<java.lang.Object> partData, double n, scala.Function1<java.lang.Object, java.lang.Object> cdf) { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> searchOneSampleCandidates (scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> partDiffs) { throw new RuntimeException(); }
  private  double searchOneSampleStatistic (scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[] localData, double n) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, java.lang.String distName, scala.collection.Seq<java.lang.Object> params) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult evalOneSampleP (double ksStat, long n) { throw new RuntimeException(); }
}

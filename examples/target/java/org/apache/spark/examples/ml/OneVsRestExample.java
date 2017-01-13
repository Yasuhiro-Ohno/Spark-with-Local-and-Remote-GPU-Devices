package org.apache.spark.examples.ml;
// no position
/**
 * An example runner for Multiclass to Binary Reduction with One Vs Rest.
 * The example uses Logistic Regression as the base classifier. All parameters that
 * can be specified on the base classifier can be passed in to the runner options.
 * Run with
 * <pre><code>
 * ./bin/run-example ml.OneVsRestExample [options]
 * </code></pre>
 * For local mode, run
 * <pre><code>
 * ./bin/spark-submit --class org.apache.spark.examples.ml.OneVsRestExample --driver-memory 1g
 *   [examples JAR path] [options]
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class OneVsRestExample {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.ml.OneVsRestExample.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> testInput () { throw new RuntimeException(); }
    public  int maxIter () { throw new RuntimeException(); }
    public  double tol () { throw new RuntimeException(); }
    public  boolean fitIntercept () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> regParam () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> elasticNetParam () { throw new RuntimeException(); }
    public  double fracTest () { throw new RuntimeException(); }
    // not preceding
       Params (java.lang.String input, scala.Option<java.lang.String> testInput, int maxIter, double tol, boolean fitIntercept, scala.Option<java.lang.Object> regParam, scala.Option<java.lang.Object> elasticNetParam, double fracTest) { throw new RuntimeException(); }
  }
  // no position
  static public  class Params$ extends scala.runtime.AbstractFunction8<java.lang.String, scala.Option<java.lang.String>, java.lang.Object, java.lang.Object, java.lang.Object, scala.Option<java.lang.Object>, scala.Option<java.lang.Object>, java.lang.Object, org.apache.spark.examples.ml.OneVsRestExample.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ () { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static private  void run (org.apache.spark.examples.ml.OneVsRestExample.Params params) { throw new RuntimeException(); }
  static private <R extends java.lang.Object> scala.Tuple2<java.lang.Object, R> time (scala.Function0<R> block) { throw new RuntimeException(); }
}

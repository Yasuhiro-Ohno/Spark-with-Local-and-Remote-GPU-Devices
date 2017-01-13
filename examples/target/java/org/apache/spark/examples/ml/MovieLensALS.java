package org.apache.spark.examples.ml;
// no position
/**
 * An example app for ALS on MovieLens data (http://grouplens.org/datasets/movielens/).
 * Run with
 * <pre><code>
 * bin/run-example ml.MovieLensALS
 * </code></pre>
 */
public  class MovieLensALS {
  static public  class Rating implements scala.Product, scala.Serializable {
    public  int userId () { throw new RuntimeException(); }
    public  int movieId () { throw new RuntimeException(); }
    public  float rating () { throw new RuntimeException(); }
    public  long timestamp () { throw new RuntimeException(); }
    // not preceding
    public   Rating (int userId, int movieId, float rating, long timestamp) { throw new RuntimeException(); }
  }
  // no position
  static public  class Rating$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Rating$ MODULE$ = null;
    public   Rating$ () { throw new RuntimeException(); }
    public  org.apache.spark.examples.ml.MovieLensALS.Rating parseRating (java.lang.String str) { throw new RuntimeException(); }
  }
  static public  class Movie implements scala.Product, scala.Serializable {
    public  int movieId () { throw new RuntimeException(); }
    public  java.lang.String title () { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.String> genres () { throw new RuntimeException(); }
    // not preceding
    public   Movie (int movieId, java.lang.String title, scala.collection.Seq<java.lang.String> genres) { throw new RuntimeException(); }
  }
  // no position
  static public  class Movie$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Movie$ MODULE$ = null;
    public   Movie$ () { throw new RuntimeException(); }
    public  org.apache.spark.examples.ml.MovieLensALS.Movie parseMovie (java.lang.String str) { throw new RuntimeException(); }
  }
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.ml.MovieLensALS.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String ratings () { throw new RuntimeException(); }
    public  java.lang.String movies () { throw new RuntimeException(); }
    public  int maxIter () { throw new RuntimeException(); }
    public  double regParam () { throw new RuntimeException(); }
    public  int rank () { throw new RuntimeException(); }
    public  int numBlocks () { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String ratings, java.lang.String movies, int maxIter, double regParam, int rank, int numBlocks) { throw new RuntimeException(); }
  }
  // no position
  static public  class Params$ extends scala.runtime.AbstractFunction6<java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.examples.ml.MovieLensALS.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ () { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.ml.MovieLensALS.Params params) { throw new RuntimeException(); }
}

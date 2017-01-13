package org.apache.spark.ml.source.libsvm;
/**
 * <code>libsvm</code> package implements Spark SQL data source API for loading LIBSVM data as {@link DataFrame}.
 * The loaded {@link DataFrame} has two columns: <code>label</code> containing labels stored as doubles and
 * <code>features</code> containing feature vectors stored as {@link Vector}s.
 * <p>
 * To use LIBSVM data source, you need to set "libsvm" as the format in {@link DataFrameReader} and
 * optionally specify options, for example:
 * <pre><code>
 *   // Scala
 *   val df = sqlContext.read.format("libsvm")
 *     .option("numFeatures", "780")
 *     .load("data/mllib/sample_libsvm_data.txt")
 *
 *   // Java
 *   DataFrame df = sqlContext.read().format("libsvm")
 *     .option("numFeatures, "780")
 *     .load("data/mllib/sample_libsvm_data.txt");
 * </code></pre>
 * <p>
 * LIBSVM data source supports the following options:
 *  - "numFeatures": number of features.
 *    If unspecified or nonpositive, the number of features will be determined automatically at the
 *    cost of one additional pass.
 *    This is also useful when the dataset is already split into multiple files and you want to load
 *    them separately, because some features may not present in certain files, which leads to
 *    inconsistent feature dimensions.
 *  - "vectorType": feature vector type, "sparse" (default) or "dense".
 * <p>
 *  @see <a href="https://www.csie.ntu.edu.tw/~cjlin/libsvmtools/datasets/ LIBSVM datasets"/>
 */
public  class DefaultSource implements org.apache.spark.sql.sources.RelationProvider, org.apache.spark.sql.sources.DataSourceRegister {
  public   DefaultSource () { throw new RuntimeException(); }
  public  java.lang.String shortName () { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters) { throw new RuntimeException(); }
}

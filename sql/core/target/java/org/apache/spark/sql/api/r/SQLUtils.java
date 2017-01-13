package org.apache.spark.sql.api.r;
// no position
  class SQLUtils {
  static private  class RegexContext {
    public   RegexContext (scala.StringContext sc) { throw new RuntimeException(); }
    public  scala.util.matching.Regex r () { throw new RuntimeException(); }
  }
  static public  org.apache.spark.sql.SQLContext createSQLContext (org.apache.spark.api.java.JavaSparkContext jsc) { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaSparkContext getJavaSparkContext (org.apache.spark.sql.SQLContext sqlCtx) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType createStructType (scala.collection.Seq<org.apache.spark.sql.types.StructField> fields) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType getSQLDataType (java.lang.String dataType) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField createStructField (java.lang.String name, java.lang.String dataType, boolean nullable) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.DataFrame createDF (org.apache.spark.rdd.RDD<byte[]> rdd, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<byte[]> dfToRowRDD (org.apache.spark.sql.DataFrame df) { throw new RuntimeException(); }
  static private  java.lang.Object doConversion (java.lang.Object data, org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.Row bytesToRow (byte[] bytes, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  static private  byte[] rowToRBytes (org.apache.spark.sql.Row row) { throw new RuntimeException(); }
  static public  java.lang.Object[][] dfToCols (org.apache.spark.sql.DataFrame df) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SaveMode saveMode (java.lang.String mode) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.DataFrame loadDF (org.apache.spark.sql.SQLContext sqlContext, java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.DataFrame loadDF (org.apache.spark.sql.SQLContext sqlContext, java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  static public  java.lang.Object readSqlObject (java.io.DataInputStream dis, char dataType) { throw new RuntimeException(); }
  static public  boolean writeSqlObject (java.io.DataOutputStream dos, java.lang.Object obj) { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
public  class IndexToString extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.IndexToString load (java.lang.String path) { throw new RuntimeException(); }
  public  java.lang.String uid () { throw new RuntimeException(); }
     IndexToString (java.lang.String uid) { throw new RuntimeException(); }
  public   IndexToString () { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IndexToString setInputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IndexToString setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IndexToString setLabels (java.lang.String[] value) { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam labels () { throw new RuntimeException(); }
  /** @group getParam */
  public final  java.lang.String[] getLabels () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  public  org.apache.spark.sql.DataFrame transform (org.apache.spark.sql.DataFrame dataset) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IndexToString copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

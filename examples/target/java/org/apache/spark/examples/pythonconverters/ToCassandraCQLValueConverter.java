package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts a
 * List[String] to Cassandra value
 */
public  class ToCassandraCQLValueConverter implements org.apache.spark.api.python.Converter<java.lang.Object, java.util.List<java.nio.ByteBuffer>> {
  public   ToCassandraCQLValueConverter () { throw new RuntimeException(); }
  public  java.util.List<java.nio.ByteBuffer> convert (Object obj) { throw new RuntimeException(); }
}

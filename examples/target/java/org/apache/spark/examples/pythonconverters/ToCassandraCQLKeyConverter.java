package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts a
 * Map[String, Int] to Cassandra key
 */
public  class ToCassandraCQLKeyConverter implements org.apache.spark.api.python.Converter<java.lang.Object, java.util.Map<java.lang.String, java.nio.ByteBuffer>> {
  public   ToCassandraCQLKeyConverter () { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.nio.ByteBuffer> convert (Object obj) { throw new RuntimeException(); }
}

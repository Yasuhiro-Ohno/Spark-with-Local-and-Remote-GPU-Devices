package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts Cassandra
 * output to a Map[String, String]
 */
public  class CassandraCQLValueConverter implements org.apache.spark.api.python.Converter<java.lang.Object, java.util.Map<java.lang.String, java.lang.String>> {
  public   CassandraCQLValueConverter () { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> convert (Object obj) { throw new RuntimeException(); }
}

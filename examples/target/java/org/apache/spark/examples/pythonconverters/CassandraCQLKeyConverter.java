package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts Cassandra
 * output to a Map[String, Int]
 */
public  class CassandraCQLKeyConverter implements org.apache.spark.api.python.Converter<java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>> {
  public   CassandraCQLKeyConverter () { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> convert (Object obj) { throw new RuntimeException(); }
}

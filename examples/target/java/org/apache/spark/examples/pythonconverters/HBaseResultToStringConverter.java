package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts all
 * the records in an HBase Result to a String
 */
public  class HBaseResultToStringConverter implements org.apache.spark.api.python.Converter<java.lang.Object, java.lang.String> {
  public   HBaseResultToStringConverter () { throw new RuntimeException(); }
  public  java.lang.String convert (Object obj) { throw new RuntimeException(); }
}

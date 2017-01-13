package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts a
 * list of Strings to HBase Put
 */
public  class StringListToPutConverter implements org.apache.spark.api.python.Converter<java.lang.Object, org.apache.hadoop.hbase.client.Put> {
  public   StringListToPutConverter () { throw new RuntimeException(); }
  public  org.apache.hadoop.hbase.client.Put convert (Object obj) { throw new RuntimeException(); }
}

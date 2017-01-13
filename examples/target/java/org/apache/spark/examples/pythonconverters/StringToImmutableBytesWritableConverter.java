package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts a
 * String to an ImmutableBytesWritable
 */
public  class StringToImmutableBytesWritableConverter implements org.apache.spark.api.python.Converter<java.lang.Object, org.apache.hadoop.hbase.io.ImmutableBytesWritable> {
  public   StringToImmutableBytesWritableConverter () { throw new RuntimeException(); }
  public  org.apache.hadoop.hbase.io.ImmutableBytesWritable convert (Object obj) { throw new RuntimeException(); }
}

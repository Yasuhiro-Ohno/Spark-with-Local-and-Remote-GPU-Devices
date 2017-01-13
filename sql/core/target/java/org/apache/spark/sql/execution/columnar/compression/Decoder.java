package org.apache.spark.sql.execution.columnar.compression;
  interface Decoder<T extends org.apache.spark.sql.types.AtomicType> {
  public  void next (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal) ;
  public  boolean hasNext () ;
}

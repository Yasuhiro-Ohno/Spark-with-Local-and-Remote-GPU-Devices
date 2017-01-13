package org.apache.spark.sql.execution.columnar;
// no position
  class BINARY extends org.apache.spark.sql.execution.columnar.ByteArrayColumnType<byte[]> {
  static public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  static public  void setField (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal, byte[] value) { throw new RuntimeException(); }
  static public  byte[] getField (org.apache.spark.sql.catalyst.InternalRow row, int ordinal) { throw new RuntimeException(); }
  static public  int actualSize (org.apache.spark.sql.catalyst.InternalRow row, int ordinal) { throw new RuntimeException(); }
  static public  byte[] serialize (byte[] value) { throw new RuntimeException(); }
  static public  byte[] deserialize (byte[] bytes) { throw new RuntimeException(); }
}

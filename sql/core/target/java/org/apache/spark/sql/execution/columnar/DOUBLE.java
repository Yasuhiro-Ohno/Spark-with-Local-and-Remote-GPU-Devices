package org.apache.spark.sql.execution.columnar;
// no position
  class DOUBLE extends org.apache.spark.sql.execution.columnar.NativeColumnType<org.apache.spark.sql.types.DoubleType$> {
  static public  void append (double v, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  void append (org.apache.spark.sql.catalyst.InternalRow row, int ordinal, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  double extract (java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  void extract (java.nio.ByteBuffer buffer, org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal) { throw new RuntimeException(); }
  static public  void setField (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal, double value) { throw new RuntimeException(); }
  static public  double getField (org.apache.spark.sql.catalyst.InternalRow row, int ordinal) { throw new RuntimeException(); }
  static public  void copyField (org.apache.spark.sql.catalyst.InternalRow from, int fromOrdinal, org.apache.spark.sql.catalyst.expressions.MutableRow to, int toOrdinal) { throw new RuntimeException(); }
}

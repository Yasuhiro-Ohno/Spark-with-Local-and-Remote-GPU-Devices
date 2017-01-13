package org.apache.spark.sql.catalyst.util;
public abstract class ArrayData implements org.apache.spark.sql.catalyst.expressions.SpecializedGetters, scala.Serializable {
  public   ArrayData () { throw new RuntimeException(); }
  public abstract  int numElements () ;
  public abstract  org.apache.spark.sql.catalyst.util.ArrayData copy () ;
  public abstract  java.lang.Object[] array () ;
  public  boolean[] toBooleanArray () { throw new RuntimeException(); }
  public  byte[] toByteArray () { throw new RuntimeException(); }
  public  short[] toShortArray () { throw new RuntimeException(); }
  public  int[] toIntArray () { throw new RuntimeException(); }
  public  long[] toLongArray () { throw new RuntimeException(); }
  public  float[] toFloatArray () { throw new RuntimeException(); }
  public  double[] toDoubleArray () { throw new RuntimeException(); }
  public  java.lang.Object[] toObjectArray (org.apache.spark.sql.types.DataType elementType) { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.lang.Object toArray (org.apache.spark.sql.types.DataType elementType, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  void foreach (org.apache.spark.sql.types.DataType elementType, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
}

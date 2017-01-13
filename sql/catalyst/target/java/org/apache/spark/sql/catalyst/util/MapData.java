package org.apache.spark.sql.catalyst.util;
public abstract class MapData implements scala.Serializable {
  public   MapData () { throw new RuntimeException(); }
  public abstract  int numElements () ;
  public abstract  org.apache.spark.sql.catalyst.util.ArrayData keyArray () ;
  public abstract  org.apache.spark.sql.catalyst.util.ArrayData valueArray () ;
  public abstract  org.apache.spark.sql.catalyst.util.MapData copy () ;
  public  void foreach (org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
}

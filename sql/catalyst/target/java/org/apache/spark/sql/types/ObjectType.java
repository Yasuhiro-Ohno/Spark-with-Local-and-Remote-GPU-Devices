package org.apache.spark.sql.types;
  class ObjectType extends org.apache.spark.sql.types.DataType implements scala.Product, scala.Serializable {
  static   org.apache.spark.sql.types.DataType defaultConcreteType () { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other) { throw new RuntimeException(); }
  static   java.lang.String simpleString () { throw new RuntimeException(); }
  public  Object cls () { throw new RuntimeException(); }
  // not preceding
  public   ObjectType (java.lang.Class<?> cls) { throw new RuntimeException(); }
  public  int defaultSize () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType asNullable () { throw new RuntimeException(); }
}

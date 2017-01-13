package org.apache.spark.sql.types;
/**
 * An internal type used to represent everything that is not null, UDTs, arrays, structs, and maps.
 */
 abstract class AtomicType extends org.apache.spark.sql.types.DataType {
  public   AtomicType () { throw new RuntimeException(); }
  public abstract  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag () ;
  public abstract  scala.math.Ordering<java.lang.Object> ordering () ;
  public  scala.reflect.ClassTag<java.lang.Object> classTag () { throw new RuntimeException(); }
}

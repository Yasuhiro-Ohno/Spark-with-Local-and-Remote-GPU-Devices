package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>Byte</code> values. Please use the singleton {@link DataTypes.ByteType}.
 */
public  class ByteType extends org.apache.spark.sql.types.IntegralType {
  private   ByteType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag () { throw new RuntimeException(); }
  public  scala.math.Numeric<java.lang.Object> numeric () { throw new RuntimeException(); }
  public  scala.math.Integral<java.lang.Object> integral () { throw new RuntimeException(); }
  public  scala.math.Ordering<java.lang.Object> ordering () { throw new RuntimeException(); }
  /**
   * The default size of a value of the ByteType is 1 byte.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
  public  java.lang.String simpleString () { throw new RuntimeException(); }
    org.apache.spark.sql.types.ByteType asNullable () { throw new RuntimeException(); }
}

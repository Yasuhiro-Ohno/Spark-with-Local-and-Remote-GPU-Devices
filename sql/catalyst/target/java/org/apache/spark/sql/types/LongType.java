package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>Long</code> values. Please use the singleton {@link DataTypes.LongType}.
 */
public  class LongType extends org.apache.spark.sql.types.IntegralType {
  private   LongType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag () { throw new RuntimeException(); }
  public  scala.math.Numeric<java.lang.Object> numeric () { throw new RuntimeException(); }
  public  scala.math.Integral<java.lang.Object> integral () { throw new RuntimeException(); }
  public  scala.math.Ordering<java.lang.Object> ordering () { throw new RuntimeException(); }
  /**
   * The default size of a value of the LongType is 8 bytes.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
  public  java.lang.String simpleString () { throw new RuntimeException(); }
    org.apache.spark.sql.types.LongType asNullable () { throw new RuntimeException(); }
}

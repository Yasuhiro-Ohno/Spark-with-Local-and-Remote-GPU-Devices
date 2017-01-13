package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>Short</code> values. Please use the singleton {@link DataTypes.ShortType}.
 */
public  class ShortType extends org.apache.spark.sql.types.IntegralType {
  private   ShortType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag () { throw new RuntimeException(); }
  public  scala.math.Numeric<java.lang.Object> numeric () { throw new RuntimeException(); }
  public  scala.math.Integral<java.lang.Object> integral () { throw new RuntimeException(); }
  public  scala.math.Ordering<java.lang.Object> ordering () { throw new RuntimeException(); }
  /**
   * The default size of a value of the ShortType is 2 bytes.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
  public  java.lang.String simpleString () { throw new RuntimeException(); }
    org.apache.spark.sql.types.ShortType asNullable () { throw new RuntimeException(); }
}

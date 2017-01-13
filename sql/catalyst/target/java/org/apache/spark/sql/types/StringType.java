package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>String</code> values. Please use the singleton {@link DataTypes.StringType}.
 */
public  class StringType extends org.apache.spark.sql.types.AtomicType {
  private   StringType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<org.apache.spark.unsafe.types.UTF8String> tag () { throw new RuntimeException(); }
  public  scala.math.Ordering<org.apache.spark.unsafe.types.UTF8String> ordering () { throw new RuntimeException(); }
  /**
   * The default size of a value of the StringType is 4096 bytes.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
    org.apache.spark.sql.types.StringType asNullable () { throw new RuntimeException(); }
}

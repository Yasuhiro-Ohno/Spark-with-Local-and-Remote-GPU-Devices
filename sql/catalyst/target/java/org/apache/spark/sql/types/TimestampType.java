package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>java.sql.Timestamp</code> values.
 * Please use the singleton {@link DataTypes.TimestampType}.
 */
public  class TimestampType extends org.apache.spark.sql.types.AtomicType {
  private   TimestampType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag () { throw new RuntimeException(); }
  public  scala.math.Ordering<java.lang.Object> ordering () { throw new RuntimeException(); }
  /**
   * The default size of a value of the TimestampType is 8 bytes.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
    org.apache.spark.sql.types.TimestampType asNullable () { throw new RuntimeException(); }
}

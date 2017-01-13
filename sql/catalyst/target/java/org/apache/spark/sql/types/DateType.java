package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * A date type, supporting "0001-01-01" through "9999-12-31".
 * <p>
 * Please use the singleton {@link DataTypes.DateType}.
 * <p>
 * Internally, this is represented as the number of days from epoch (1970-01-01 00:00:00 UTC).
 */
public  class DateType extends org.apache.spark.sql.types.AtomicType {
  private   DateType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag () { throw new RuntimeException(); }
  public  scala.math.Ordering<java.lang.Object> ordering () { throw new RuntimeException(); }
  /**
   * The default size of a value of the DateType is 4 bytes.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
    org.apache.spark.sql.types.DateType asNullable () { throw new RuntimeException(); }
}

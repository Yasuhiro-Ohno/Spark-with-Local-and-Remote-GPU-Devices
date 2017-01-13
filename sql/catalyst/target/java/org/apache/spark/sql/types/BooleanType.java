package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>Boolean</code> values. Please use the singleton {@link DataTypes.BooleanType}.
 */
public  class BooleanType extends org.apache.spark.sql.types.AtomicType {
  private   BooleanType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag () { throw new RuntimeException(); }
  public  scala.math.Ordering<java.lang.Object> ordering () { throw new RuntimeException(); }
  /**
   * The default size of a value of the BooleanType is 1 byte.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
    org.apache.spark.sql.types.BooleanType asNullable () { throw new RuntimeException(); }
}

package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>Double</code> values. Please use the singleton {@link DataTypes.DoubleType}.
 */
public  class DoubleType extends org.apache.spark.sql.types.FractionalType {
  private   DoubleType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag () { throw new RuntimeException(); }
  public  scala.math.Numeric<java.lang.Object> numeric () { throw new RuntimeException(); }
  public  scala.math.Fractional<java.lang.Object> fractional () { throw new RuntimeException(); }
  public  java.lang.Object ordering () { throw new RuntimeException(); }
  public  scala.math.Numeric.DoubleAsIfIntegral$ asIntegral () { throw new RuntimeException(); }
  /**
   * The default size of a value of the DoubleType is 8 bytes.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
    org.apache.spark.sql.types.DoubleType asNullable () { throw new RuntimeException(); }
}

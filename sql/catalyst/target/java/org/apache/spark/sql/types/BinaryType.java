package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>Array[Byte]</code> values.
 * Please use the singleton {@link DataTypes.BinaryType}.
 */
public  class BinaryType extends org.apache.spark.sql.types.AtomicType {
  private   BinaryType () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<byte[]> tag () { throw new RuntimeException(); }
  public  java.lang.Object ordering () { throw new RuntimeException(); }
  /**
   * The default size of a value of the BinaryType is 4096 bytes.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
    org.apache.spark.sql.types.BinaryType asNullable () { throw new RuntimeException(); }
}

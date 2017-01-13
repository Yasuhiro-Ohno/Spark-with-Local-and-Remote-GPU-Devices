package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing <code>NULL</code> values. Please use the singleton {@link DataTypes.NullType}.
 */
public  class NullType extends org.apache.spark.sql.types.DataType {
  private   NullType () { throw new RuntimeException(); }
  public  int defaultSize () { throw new RuntimeException(); }
    org.apache.spark.sql.types.NullType asNullable () { throw new RuntimeException(); }
}

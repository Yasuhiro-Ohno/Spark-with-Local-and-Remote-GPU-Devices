package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The data type representing calendar time intervals. The calendar time interval is stored
 * internally in two components: number of months the number of microseconds.
 * <p>
 * Note that calendar intervals are not comparable.
 * <p>
 * Please use the singleton {@link DataTypes.CalendarIntervalType}.
 */
public  class CalendarIntervalType extends org.apache.spark.sql.types.DataType {
  private   CalendarIntervalType () { throw new RuntimeException(); }
  public  int defaultSize () { throw new RuntimeException(); }
    org.apache.spark.sql.types.CalendarIntervalType asNullable () { throw new RuntimeException(); }
}

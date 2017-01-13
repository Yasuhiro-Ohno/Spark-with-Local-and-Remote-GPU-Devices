package org.apache.spark.sql.catalyst.expressions;
/**
 * An extended interface to {@link InternalRow} that allows the values for each column to be updated.
 * Setting a value through a primitive function implicitly marks that column as not null.
 */
public abstract class MutableRow extends org.apache.spark.sql.catalyst.InternalRow {
  public   MutableRow () { throw new RuntimeException(); }
  public abstract  void setNullAt (int i) ;
  public abstract  void update (int i, Object value) ;
  public  void setBoolean (int i, boolean value) { throw new RuntimeException(); }
  public  void setByte (int i, byte value) { throw new RuntimeException(); }
  public  void setShort (int i, short value) { throw new RuntimeException(); }
  public  void setInt (int i, int value) { throw new RuntimeException(); }
  public  void setLong (int i, long value) { throw new RuntimeException(); }
  public  void setFloat (int i, float value) { throw new RuntimeException(); }
  public  void setDouble (int i, double value) { throw new RuntimeException(); }
  /**
   * Update the decimal column at <code>i</code>.
   * <p>
   * Note: In order to support update decimal with precision > 18 in UnsafeRow,
   * CAN NOT call setNullAt() for decimal column on UnsafeRow, call setDecimal(i, null, precision).
   * @param i (undocumented)
   * @param value (undocumented)
   * @param precision (undocumented)
   */
  public  void setDecimal (int i, org.apache.spark.sql.types.Decimal value, int precision) { throw new RuntimeException(); }
}

package org.apache.spark.sql.types;
public  class DecimalType extends org.apache.spark.sql.types.FractionalType implements scala.Product, scala.Serializable {
  // no position
  static   class Fixed$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Fixed$ MODULE$ = null;
    public   Fixed$ () { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> unapply (org.apache.spark.sql.types.DecimalType t) { throw new RuntimeException(); }
  }
  // no position
  static   class Expression$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Expression$ MODULE$ = null;
    public   Expression$ () { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> unapply (org.apache.spark.sql.catalyst.expressions.Expression e) { throw new RuntimeException(); }
  }
  static public  int MAX_PRECISION () { throw new RuntimeException(); }
  static public  int MAX_SCALE () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType SYSTEM_DEFAULT () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType USER_DEFAULT () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType Unlimited () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType ByteDecimal () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType ShortDecimal () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType IntDecimal () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType LongDecimal () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType FloatDecimal () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType DoubleDecimal () { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DecimalType forType (org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DecimalType apply () { throw new RuntimeException(); }
  static public  void apply (scala.Option<org.apache.spark.sql.types.PrecisionInfo> precisionInfo) { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DecimalType bounded (int precision, int scale) { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType () { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other) { throw new RuntimeException(); }
  static public  boolean unapply (org.apache.spark.sql.types.DataType t) { throw new RuntimeException(); }
  static public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e) { throw new RuntimeException(); }
  public  int precision () { throw new RuntimeException(); }
  public  int scale () { throw new RuntimeException(); }
  // not preceding
  public   DecimalType (int precision, int scale) { throw new RuntimeException(); }
  public   DecimalType (int precision) { throw new RuntimeException(); }
  public   DecimalType () { throw new RuntimeException(); }
  public   DecimalType (scala.Option<org.apache.spark.sql.types.PrecisionInfo> precisionInfo) { throw new RuntimeException(); }
  public  scala.Some<org.apache.spark.sql.types.PrecisionInfo> precisionInfo () { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<org.apache.spark.sql.types.Decimal> tag () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal.DecimalIsFractional$ numeric () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal.DecimalIsFractional$ fractional () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal.DecimalIsFractional$ ordering () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal.DecimalAsIfIntegral$ asIntegral () { throw new RuntimeException(); }
  public  java.lang.String typeName () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * Returns whether this DecimalType is wider than <code>other</code>. If yes, it means <code>other</code>
   * can be casted into <code>this</code> safely without losing any precision or range.
   * @param other (undocumented)
   * @return (undocumented)
   */
    boolean isWiderThan (org.apache.spark.sql.types.DataType other) { throw new RuntimeException(); }
  /**
   * Returns whether this DecimalType is tighter than <code>other</code>. If yes, it means <code>this</code>
   * can be casted into <code>other</code> safely without losing any precision or range.
   * @param other (undocumented)
   * @return (undocumented)
   */
    boolean isTighterThan (org.apache.spark.sql.types.DataType other) { throw new RuntimeException(); }
  /**
   * The default size of a value of the DecimalType is 4096 bytes.
   * @return (undocumented)
   */
  public  int defaultSize () { throw new RuntimeException(); }
  public  java.lang.String simpleString () { throw new RuntimeException(); }
    org.apache.spark.sql.types.DecimalType asNullable () { throw new RuntimeException(); }
}

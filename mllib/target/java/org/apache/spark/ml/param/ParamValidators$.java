package org.apache.spark.ml.param;
// no position
/**
 * :: DeveloperApi ::
 * Factory methods for common validation functions for {@link Param.isValid}.
 * The numerical methods only support Int, Long, Float, and Double.
 */
public  class ParamValidators$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParamValidators$ MODULE$ = null;
  public   ParamValidators$ () { throw new RuntimeException(); }
  /** (private[param]) Default validation always return true */
   <T extends java.lang.Object> scala.Function1<T, java.lang.Object> alwaysTrue () { throw new RuntimeException(); }
  /**
   * Private method for checking numerical types and converting to Double.
   * This is mainly for the sake of compilation; type checks are really handled
   * by {@link Params} setters and the {@link ParamPair} constructor.
   * @param value (undocumented)
   * @return (undocumented)
   */
  private <T extends java.lang.Object> double getDouble (T value) { throw new RuntimeException(); }
  /** Check if value > lowerBound */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> gt (double lowerBound) { throw new RuntimeException(); }
  /** Check if value >= lowerBound */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> gtEq (double lowerBound) { throw new RuntimeException(); }
  /** Check if value < upperBound */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> lt (double upperBound) { throw new RuntimeException(); }
  /** Check if value <= upperBound */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> ltEq (double upperBound) { throw new RuntimeException(); }
  /**
   * Check for value in range lowerBound to upperBound.
   * @param lowerInclusive  If true, check for value >= lowerBound.
   *                        If false, check for value > lowerBound.
   * @param upperInclusive  If true, check for value <= upperBound.
   *                        If false, check for value < upperBound.
   * @param lowerBound (undocumented)
   * @param upperBound (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inRange (double lowerBound, double upperBound, boolean lowerInclusive, boolean upperInclusive) { throw new RuntimeException(); }
  /** Version of {@link inRange()} which uses inclusive be default: [lowerBound, upperBound] */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inRange (double lowerBound, double upperBound) { throw new RuntimeException(); }
  /** Check for value in an allowed set of values. */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inArray (java.lang.Object allowed) { throw new RuntimeException(); }
  /** Check for value in an allowed set of values. */
  public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inArray (java.util.List<T> allowed) { throw new RuntimeException(); }
  /** Check that the array length is greater than lowerBound. */
  public <T extends java.lang.Object> scala.Function1<java.lang.Object, java.lang.Object> arrayLengthGt (double lowerBound) { throw new RuntimeException(); }
}

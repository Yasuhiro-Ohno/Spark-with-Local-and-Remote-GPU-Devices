package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * Numeric data types.
 */
public abstract class NumericType extends org.apache.spark.sql.types.AtomicType {
  /**
   * Enables matching against NumericType for expressions:
   * <pre><code>
   *   case Cast(child &#64; NumericType(), StringType) =&gt;
   *     ...
   * </code></pre>
   * @param e (undocumented)
   * @return (undocumented)
   */
  static public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e) { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType () { throw new RuntimeException(); }
  static   java.lang.String simpleString () { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other) { throw new RuntimeException(); }
  public   NumericType () { throw new RuntimeException(); }
  public abstract  scala.math.Numeric<java.lang.Object> numeric () ;
}

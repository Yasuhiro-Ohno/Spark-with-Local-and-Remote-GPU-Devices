package org.apache.spark.sql;
/**
 * Ensures that java functions signatures for methods that now return a {@link TypedColumn} still have
 * legacy equivalents in bytecode.  This compatibility is done by forcing the compiler to generate
 * "bridge" methods due to the use of covariant return types.
 * <p>
 * <pre><code>
 *   // In LegacyFunctions:
 *   public abstract org.apache.spark.sql.Column avg(java.lang.String);
 *
 *   // In functions:
 *   public static org.apache.spark.sql.TypedColumn&lt;java.lang.Object, java.lang.Object&gt; avg(...);
 * </code></pre>
 * <p>
 * This allows us to use the same functions both in typed {@link Dataset} operations and untyped
 * {@link DataFrame} operations when the return type for a given function is statically known.
 */
 abstract class LegacyFunctions {
  public   LegacyFunctions () { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.Column count (java.lang.String columnName) ;
}

package org.apache.spark.sql.catalyst.analysis;
// no position
/**
 * A collection of {@link Rule Rules} that can be used to coerce differing types that
 * participate in operations into compatible ones.  Most of these rules are based on Hive semantics,
 * but they do not introduce any dependencies on the hive codebase.  For this reason they remain in
 * Catalyst until we have a more standard set of coercions.
 */
public  class HiveTypeCoercion$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveTypeCoercion$ MODULE$ = null;
  public   HiveTypeCoercion$ () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules () { throw new RuntimeException(); }
  public  scala.collection.IndexedSeq<org.apache.spark.sql.types.NumericType> numericPrecedence () { throw new RuntimeException(); }
  /**
   * Find the tightest common type of two types that might be used in a binary expression.
   * This handles all numeric types except fixed-precision decimals interacting with each other or
   * with primitive types, because in that case the precision and scale of the result depends on
   * the operation. Those rules are implemented in {@link HiveTypeCoercion.DecimalPrecision}.
   * @return (undocumented)
   */
  public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonTypeOfTwo () { throw new RuntimeException(); }
  /** Similar to {@link findTightestCommonType}, but can promote all the way to StringType. */
  private  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonTypeToString (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right) { throw new RuntimeException(); }
  /**
   * Similar to {@link findTightestCommonType}, if can not find the TightestCommonType, try to use
   * {@link findTightestCommonTypeToString} to find the TightestCommonType.
   * @param types (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonTypeAndPromoteToString (scala.collection.Seq<org.apache.spark.sql.types.DataType> types) { throw new RuntimeException(); }
  /**
   * Find the tightest common type of a set of types by continuously applying
   * <code>findTightestCommonTypeOfTwo</code> on these types.
   * @param types (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types) { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2) { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.types.DataType> findWiderCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types) { throw new RuntimeException(); }
}

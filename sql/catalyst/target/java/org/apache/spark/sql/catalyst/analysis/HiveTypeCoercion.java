package org.apache.spark.sql.catalyst.analysis;
// no position
/**
 * A collection of {@link Rule Rules} that can be used to coerce differing types that
 * participate in operations into compatible ones.  Most of these rules are based on Hive semantics,
 * but they do not introduce any dependencies on the hive codebase.  For this reason they remain in
 * Catalyst until we have a more standard set of coercions.
 */
public  class HiveTypeCoercion {
  // no position
  /**
   * Applies any changes to {@link AttributeReference} data types that are made by other rules to
   * instances higher in the query tree.
   */
  static public  class PropagateTypes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PropagateTypes$ MODULE$ = null;
    public   PropagateTypes$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Widens numeric types and converts strings to numbers when appropriate.
   * <p>
   * Loosely based on rules from "Hadoop: The Definitive Guide" 2nd edition, by Tom White
   * <p>
   * The implicit conversion rules can be summarized as follows:
   *   - Any integral numeric type can be implicitly converted to a wider type.
   *   - All the integral numeric types, FLOAT, and (perhaps surprisingly) STRING can be implicitly
   *     converted to DOUBLE.
   *   - TINYINT, SMALLINT, and INT can all be converted to FLOAT.
   *   - BOOLEAN types cannot be converted to any other type.
   *   - Any integral numeric type can be implicitly converted to decimal type.
   *   - two different decimal types will be converted into a wider decimal type for both of them.
   *   - decimal type will be converted into double if there float or double together with it.
   * <p>
   * Additionally, all types when UNION-ed with strings will be promoted to strings.
   * Other string conversions are handled by PromoteStrings.
   * <p>
   * Widening types might result in loss of precision in the following cases:
   * - IntegerType to FloatType
   * - LongType to FloatType
   * - LongType to DoubleType
   * - DecimalType to Double
   * <p>
   * This rule is only applied to Union/Except/Intersect
   */
  static public  class WidenSetOperationTypes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WidenSetOperationTypes$ MODULE$ = null;
    public   WidenSetOperationTypes$ () { throw new RuntimeException(); }
    private  scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> widenOutputTypes (java.lang.String planName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Promotes strings that appear in arithmetic expressions.
   */
  static public  class PromoteStrings$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PromoteStrings$ MODULE$ = null;
    public   PromoteStrings$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Convert the value and in list expressions to the common operator type
   * by looking at all the argument types and finding the closest one that
   * all the arguments can be cast to. When no common operator type is found
   * the original expression will be returned and an Analysis Exception will
   * be raised at type checking phase.
   */
  static public  class InConversion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InConversion$ MODULE$ = null;
    public   InConversion$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Calculates and propagates precision for fixed-precision decimals. Hive has a number of
   * rules for this based on the SQL standard and MS SQL:
   * https://cwiki.apache.org/confluence/download/attachments/27362075/Hive_Decimal_Precision_Scale_Support.pdf
   * https://msdn.microsoft.com/en-us/library/ms190476.aspx
   * <p>
   * In particular, if we have expressions e1 and e2 with precision/scale p1/s2 and p2/s2
   * respectively, then the following operations have the following precision / scale:
   * <p>
   *   Operation    Result Precision                        Result Scale
   *   ------------------------------------------------------------------------
   *   e1 + e2      max(s1, s2) + max(p1-s1, p2-s2) + 1     max(s1, s2)
   *   e1 - e2      max(s1, s2) + max(p1-s1, p2-s2) + 1     max(s1, s2)
   *   e1 * e2      p1 + p2 + 1                             s1 + s2
   *   e1 / e2      p1 - s1 + s2 + max(6, s1 + p2 + 1)      max(6, s1 + p2 + 1)
   *   e1 % e2      min(p1-s1, p2-s2) + max(s1, s2)         max(s1, s2)
   *   e1 union e2  max(s1, s2) + max(p1-s1, p2-s2)         max(s1, s2)
   *   sum(e1)      p1 + 10                                 s1
   *   avg(e1)      p1 + 4                                  s1 + 4
   * <p>
   * Catalyst also has unlimited-precision decimals. For those, all ops return unlimited precision.
   * <p>
   * To implement the rules for fixed-precision types, we introduce casts to turn them to unlimited
   * precision, do the math on unlimited-precision numbers, then introduce casts back to the
   * required fixed precision. This allows us to do all rounding and overflow handling in the
   * cast-to-fixed-precision operator.
   * <p>
   * In addition, when mixing non-decimal types with decimals, we use the following rules:
   * - BYTE gets turned into DECIMAL(3, 0)
   * - SHORT gets turned into DECIMAL(5, 0)
   * - INT gets turned into DECIMAL(10, 0)
   * - LONG gets turned into DECIMAL(20, 0)
   * - FLOAT and DOUBLE cause fixed-length decimals to turn into DOUBLE
   * <p>
   * Note: Union/Except/Interact is handled by WidenTypes
   */
  static public  class DecimalPrecision$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DecimalPrecision$ MODULE$ = null;
    public   DecimalPrecision$ () { throw new RuntimeException(); }
    private  boolean isFloat (org.apache.spark.sql.types.DataType t) { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DecimalType widerDecimalType (org.apache.spark.sql.types.DecimalType d1, org.apache.spark.sql.types.DecimalType d2) { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DecimalType widerDecimalType (int p1, int s1, int p2, int s2) { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.Expression promotePrecision (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Changes numeric values to booleans so that expressions like true = 1 can be evaluated.
   */
  static public  class BooleanEquality$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BooleanEquality$ MODULE$ = null;
    public   BooleanEquality$ () { throw new RuntimeException(); }
    private  scala.collection.Seq<java.lang.Object> trueValues () { throw new RuntimeException(); }
    private  scala.collection.Seq<java.lang.Object> falseValues () { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.CaseKeyWhen buildCaseKeyWhen (org.apache.spark.sql.catalyst.expressions.Expression booleanExpr, org.apache.spark.sql.catalyst.expressions.Expression numericExpr) { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.If transform (org.apache.spark.sql.catalyst.expressions.Expression booleanExpr, org.apache.spark.sql.catalyst.expressions.Expression numericExpr) { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.CaseWhen transformNullSafe (org.apache.spark.sql.catalyst.expressions.Expression booleanExpr, org.apache.spark.sql.catalyst.expressions.Expression numericExpr) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * When encountering a cast from a string representing a valid fractional number to an integral
   * type the jvm will throw a <code>java.lang.NumberFormatException</code>.  Hive, in contrast, returns the
   * truncated version of this number.
   */
  static public  class StringToIntegralCasts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StringToIntegralCasts$ MODULE$ = null;
    public   StringToIntegralCasts$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * This ensure that the types for various functions are as expected.
   */
  static public  class FunctionArgumentConversion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FunctionArgumentConversion$ MODULE$ = null;
    public   FunctionArgumentConversion$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Hive only performs integral division with the DIV operator. The arguments to / are always
   * converted to fractional types.
   */
  static public  class Division$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Division$ MODULE$ = null;
    public   Division$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Coerces the type of different branches of a CASE WHEN statement to a common type.
   */
  static public  class CaseWhenCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CaseWhenCoercion$ MODULE$ = null;
    public   CaseWhenCoercion$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Coerces the type of different branches of If statement to a common type.
   */
  static public  class IfCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IfCoercion$ MODULE$ = null;
    public   IfCoercion$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Turns Add/Subtract of DateType/TimestampType/StringType and CalendarIntervalType
   * to TimeAdd/TimeSub
   */
  static public  class DateTimeOperations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DateTimeOperations$ MODULE$ = null;
    public   DateTimeOperations$ () { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.types.AtomicType> acceptedTypes () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Casts types according to the expected input types for {@link Expression}s.
   */
  static public  class ImplicitTypeCasts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ImplicitTypeCasts$ MODULE$ = null;
    public   ImplicitTypeCasts$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    /**
     * Given an expected data type, try to cast the expression and return the cast expression.
     * <p>
     * If the expression already fits the input type, we simply return the expression itself.
     * If the expression has an incompatible type that cannot be implicitly cast, return None.
     * @param e (undocumented)
     * @param expectedType (undocumented)
     * @return (undocumented)
     */
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> implicitCast (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.types.AbstractDataType expectedType) { throw new RuntimeException(); }
  }
  static public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules () { throw new RuntimeException(); }
  static public  scala.collection.IndexedSeq<org.apache.spark.sql.types.NumericType> numericPrecedence () { throw new RuntimeException(); }
  /**
   * Find the tightest common type of two types that might be used in a binary expression.
   * This handles all numeric types except fixed-precision decimals interacting with each other or
   * with primitive types, because in that case the precision and scale of the result depends on
   * the operation. Those rules are implemented in {@link HiveTypeCoercion.DecimalPrecision}.
   * @return (undocumented)
   */
  static public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonTypeOfTwo () { throw new RuntimeException(); }
  /** Similar to {@link findTightestCommonType}, but can promote all the way to StringType. */
  static private  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonTypeToString (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right) { throw new RuntimeException(); }
  /**
   * Similar to {@link findTightestCommonType}, if can not find the TightestCommonType, try to use
   * {@link findTightestCommonTypeToString} to find the TightestCommonType.
   * @param types (undocumented)
   * @return (undocumented)
   */
  static private  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonTypeAndPromoteToString (scala.collection.Seq<org.apache.spark.sql.types.DataType> types) { throw new RuntimeException(); }
  /**
   * Find the tightest common type of a set of types by continuously applying
   * <code>findTightestCommonTypeOfTwo</code> on these types.
   * @param types (undocumented)
   * @return (undocumented)
   */
  static private  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types) { throw new RuntimeException(); }
  static private  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2) { throw new RuntimeException(); }
  static private  scala.Option<org.apache.spark.sql.types.DataType> findWiderCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types) { throw new RuntimeException(); }
}

package org.apache.spark.sql.types;
/**
 * :: DeveloperApi ::
 * The base type of all Spark SQL data types.
 */
public abstract class DataType extends org.apache.spark.sql.types.AbstractDataType {
  // no position
  static private  class JSortedObject$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JSortedObject$ MODULE$ = null;
    public   JSortedObject$ () { throw new RuntimeException(); }
    public  scala.Option<scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>>> unapplySeq (org.json4s.JsonAST.JValue value) { throw new RuntimeException(); }
  }
  // no position
  static private  class CaseClassStringParser$ implements scala.util.parsing.combinator.RegexParsers {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CaseClassStringParser$ MODULE$ = null;
    public   CaseClassStringParser$ () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> primitiveType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> fixedDecimalType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> arrayType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> mapType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.StructField> structField () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> boolVal () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> structType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> dataType () { throw new RuntimeException(); }
    /**
     * Parses a string representation of a DataType.
     * <p>
     * TODO: Generate parser as pickler...
     * @param asString (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.types.DataType apply (java.lang.String asString) { throw new RuntimeException(); }
  }
  static   org.apache.spark.sql.types.DataType fromString (java.lang.String raw) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType fromJson (java.lang.String json) { throw new RuntimeException(); }
  /**
   * @deprecated As of 1.2.0, replaced by <code>DataType.fromJson()</code>
   * @param string (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.DataType fromCaseClassString (java.lang.String string) { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.DataType> nonDecimalNameToType () { throw new RuntimeException(); }
  /** Given the string representation of a type, return its DataType */
  static private  org.apache.spark.sql.types.DataType nameToType (java.lang.String name) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.types.DataType parseDataType (org.json4s.JsonAST.JValue json) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.types.StructField parseStructField (org.json4s.JsonAST.JValue json) { throw new RuntimeException(); }
  static protected  void buildFormattedString (org.apache.spark.sql.types.DataType dataType, java.lang.String prefix, scala.collection.mutable.StringBuilder builder) { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring nullability of ArrayType, MapType, StructType.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static   boolean equalsIgnoreNullability (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right) { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring compatible nullability of ArrayType, MapType, StructType.
   * <p>
   * Compatible nullability is defined as follows:
   *   - If <code>from</code> and <code>to</code> are ArrayTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if <code>to.containsNull</code> is true, or both of <code>from.containsNull</code> and
   *   <code>to.containsNull</code> are false.
   *   - If <code>from</code> and <code>to</code> are MapTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if <code>to.valueContainsNull</code> is true, or both of <code>from.valueContainsNull</code> and
   *   <code>to.valueContainsNull</code> are false.
   *   - If <code>from</code> and <code>to</code> are StructTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if for all every pair of fields, <code>to.nullable</code> is true, or both
   *   of <code>fromField.nullable</code> and <code>toField.nullable</code> are false.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  static   boolean equalsIgnoreCompatibleNullability (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to) { throw new RuntimeException(); }
  public   DataType () { throw new RuntimeException(); }
  /**
   * Enables matching against DataType for expressions:
   * <pre><code>
   *   case Cast(child &#64; BinaryType(), StringType) =&gt;
   *     ...
   * </code></pre>
   * @param e (undocumented)
   * @return (undocumented)
   */
    boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e) { throw new RuntimeException(); }
  /**
   * The default size of a value of this data type, used internally for size estimation.
   * @return (undocumented)
   */
  public abstract  int defaultSize () ;
  /** Name of the type used in JSON serialization. */
  public  java.lang.String typeName () { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue () { throw new RuntimeException(); }
  /** The compact JSON representation of this data type. */
  public  java.lang.String json () { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this data type. */
  public  java.lang.String prettyJson () { throw new RuntimeException(); }
  /** Readable string representation for the type. */
  public  java.lang.String simpleString () { throw new RuntimeException(); }
  /**
   * Check if <code>this</code> and <code>other</code> are the same data type when ignoring nullability
   * (<code>StructField.nullable</code>, <code>ArrayType.containsNull</code>, and <code>MapType.valueContainsNull</code>).
   * @param other (undocumented)
   * @return (undocumented)
   */
    boolean sameType (org.apache.spark.sql.types.DataType other) { throw new RuntimeException(); }
  /**
   * Returns the same data type but set all nullability fields are true
   * (<code>StructField.nullable</code>, <code>ArrayType.containsNull</code>, and <code>MapType.valueContainsNull</code>).
   * @return (undocumented)
   */
   abstract  org.apache.spark.sql.types.DataType asNullable () ;
  /**
   * Returns true if any <code>DataType</code> of this DataType tree satisfies the given function <code>f</code>.
   * @param f (undocumented)
   * @return (undocumented)
   */
    boolean existsRecursively (scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> f) { throw new RuntimeException(); }
    org.apache.spark.sql.types.DataType defaultConcreteType () { throw new RuntimeException(); }
    boolean acceptsType (org.apache.spark.sql.types.DataType other) { throw new RuntimeException(); }
}

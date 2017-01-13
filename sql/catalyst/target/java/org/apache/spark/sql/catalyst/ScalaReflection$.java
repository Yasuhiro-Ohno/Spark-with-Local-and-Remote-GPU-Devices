package org.apache.spark.sql.catalyst;
// no position
/**
 * A default version of ScalaReflection that uses the runtime universe.
 */
public  class ScalaReflection$ implements org.apache.spark.sql.catalyst.ScalaReflection {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ScalaReflection$ MODULE$ = null;
  public   ScalaReflection$ () { throw new RuntimeException(); }
  public  scala.reflect.api.JavaUniverse universe () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.ScalaReflection.universe mirror () { throw new RuntimeException(); }
  /**
   * Returns the Spark SQL DataType for a given scala type.  Where this is not an exact mapping
   * to a native type, an ObjectType is returned. Special handling is also used for Arrays including
   * those that hold primitive types.
   * <p>
   * Unlike <code>schemaFor</code>, this function doesn't do any massaging of types into the Spark SQL type
   * system.  As a result, ObjectType will be returned for things like boxed Integers
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.types.DataType dataTypeFor (scala.reflect.api.TypeTags.TypeTag<T> evidence$1) { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType dataTypeFor (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe) { throw new RuntimeException(); }
  /**
   * Given a type <code>T</code> this function constructs and ObjectType that holds a class of type
   * Array[T].  Special handling is performed for primitive types to map them back to their raw
   * JVM form instead of the Scala Array that handles auto boxing.
   * @param tpe (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.types.DataType arrayClassFor (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe) { throw new RuntimeException(); }
  /**
   * Returns true if the value of this data type is same between internal and external.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  public  boolean isNativeType (org.apache.spark.sql.types.DataType dt) { throw new RuntimeException(); }
  /**
   * Returns an expression that can be used to construct an object of type <code>T</code> given an input
   * row with a compatible schema.  Fields of the row will be extracted using UnresolvedAttributes
   * of the same name as the constructor arguments.  Nested classes will have their fields accessed
   * using UnresolvedExtractValue.
   * <p>
   * When used on a primitive type, the constructor will instead default to extracting the value
   * from ordinal 0 (since there are no names to map to).  The actual location can be moved by
   * calling resolve/bind with a new schema.
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.expressions.Expression constructorFor (scala.reflect.api.TypeTags.TypeTag<T> evidence$2) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression constructorFor (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> path, scala.collection.Seq<java.lang.String> walkedTypePath) { throw new RuntimeException(); }
  /**
   * Returns expressions for extracting all the fields from the given type.
   * <p>
   * If the given type is not supported, i.e. there is no encoder can be built for this type,
   * an {@link UnsupportedOperationException} will be thrown with detailed error message to explain
   * the type path walked so far and which class we are not supporting.
   * There are 4 kinds of type path:
   *  * the root type: <code>root class: "abc.xyz.MyClass"</code>
   *  * the value type of {@link Option}: <code>option value class: "abc.xyz.MyClass"</code>
   *  * the element type of {@link Array} or {@link Seq}: <code>array element class: "abc.xyz.MyClass"</code>
   *  * the field of {@link Product}: <code>field (class: "abc.xyz.MyClass", name: "myField")</code>
   * @param inputObject (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.expressions.CreateNamedStruct extractorsFor (org.apache.spark.sql.catalyst.expressions.Expression inputObject, scala.reflect.api.TypeTags.TypeTag<T> evidence$3) { throw new RuntimeException(); }
  /** Helper for extracting internal fields from a case class. */
  private  org.apache.spark.sql.catalyst.expressions.Expression extractorFor (org.apache.spark.sql.catalyst.expressions.Expression inputObject, org.apache.spark.sql.catalyst.ScalaReflection.universe tpe, scala.collection.Seq<java.lang.String> walkedTypePath) { throw new RuntimeException(); }
}

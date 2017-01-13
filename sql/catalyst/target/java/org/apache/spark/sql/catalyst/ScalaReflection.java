package org.apache.spark.sql.catalyst;
/**
 * Support for generating catalyst schemas for scala objects.  Note that unlike its companion
 * object, this trait able to work in both the runtime and the compile time (macro) universe.
 */
public  interface ScalaReflection {
  public  class Schema implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
    public  boolean nullable () { throw new RuntimeException(); }
    // not preceding
    public   Schema (org.apache.spark.sql.types.DataType dataType, boolean nullable) { throw new RuntimeException(); }
  }
  // no position
  public  class Schema$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.types.DataType, java.lang.Object, org.apache.spark.sql.catalyst.ScalaReflection.Schema> implements scala.Serializable {
    public   Schema$ () { throw new RuntimeException(); }
  }
  /** The universe we work in (runtime or macro) */
  public  scala.reflect.api.Universe universe () ;
  /** The mirror used to access types in the universe */
  public  org.apache.spark.sql.catalyst.ScalaReflection.universe mirror () ;
  /** Returns a Sequence of attributes for the given case class type. */
  public <T extends java.lang.Object> scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributesFor (scala.reflect.api.TypeTags.TypeTag<T> evidence$4) ;
  /** Returns a catalyst DataType and its nullability for the given Scala Type using reflection. */
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.ScalaReflection.Schema schemaFor (scala.reflect.api.TypeTags.TypeTag<T> evidence$5) ;
  /**
   * Return the Scala Type for <code>T</code> in the current classloader mirror.
   * <p>
   * Use this method instead of the convenience method <code>universe.typeOf</code>, which
   * assumes that all types can be found in the classloader that loaded scala-reflect classes.
   * That's not necessarily the case when running using Eclipse launchers or even
   * Sbt console or test (without <code>fork := true</code>).
   * <p>
   * @see SPARK-5281
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.ScalaReflection.universe localTypeOf (scala.reflect.api.TypeTags.TypeTag<T> evidence$6) ;
  /** Returns a catalyst DataType and its nullability for the given Scala Type using reflection. */
  public  org.apache.spark.sql.catalyst.ScalaReflection.Schema schemaFor (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe) ;
  /**
   * Returns a catalyst DataType and its nullability for the given Scala Type using reflection.
   * <p>
   * Unlike <code>schemaFor</code>, this method won't throw exception for un-supported type, it will return
   * <code>NullType</code> silently instead.
   * @param tpe (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.ScalaReflection.Schema silentSchemaFor (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe) ;
  /** Returns the full class name for a type. */
  public  java.lang.String getClassNameFromType (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe) ;
  /**
   * Returns classes of input parameters of scala function object.
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Class<?>> getParameterTypes (java.lang.Object func) ;
}

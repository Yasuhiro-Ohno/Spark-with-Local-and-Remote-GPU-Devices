package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A base class for generators of byte code to perform expression evaluation.  Includes a set of
 * helpers for referring to Catalyst types and building trees that perform evaluation of individual
 * expressions.
 */
public abstract class CodeGenerator<InType extends java.lang.Object, OutType extends java.lang.Object> implements org.apache.spark.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Ident(scala), newTypeName("AnyRef")))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Ident(scala), newTypeName("AnyRef")))))
  public   CodeGenerator () { throw new RuntimeException(); }
  protected  java.lang.String exprType () { throw new RuntimeException(); }
  protected  java.lang.String mutableRowType () { throw new RuntimeException(); }
  protected  java.lang.String genericMutableRowType () { throw new RuntimeException(); }
  protected  java.lang.String declareMutableStates (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx) { throw new RuntimeException(); }
  protected  java.lang.String initMutableStates (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx) { throw new RuntimeException(); }
  protected  java.lang.String declareAddedFunctions (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx) { throw new RuntimeException(); }
  /**
   * Generates a class for a given input expression.  Called when there is not cached code
   * already available.
   * @param in (undocumented)
   * @return (undocumented)
   */
  protected abstract  OutType create (InType in) ;
  /**
   * Canonicalizes an input expression. Used to avoid double caching expressions that differ only
   * cosmetically.
   * @param in (undocumented)
   * @return (undocumented)
   */
  protected abstract  InType canonicalize (InType in) ;
  /** Binds an input expression to a given input schema */
  protected abstract  InType bind (InType in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) ;
  /**
   * Compile the Java source code into a Java class, using Janino.
   * @param code (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass compile (java.lang.String code) { throw new RuntimeException(); }
  /**
   * Compile the Java source code into a Java class, using Janino.
   * @param code (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass doCompile (java.lang.String code) { throw new RuntimeException(); }
  /**
   * A cache of generated classes.
   * <p>
   * From the Guava Docs: A Cache is similar to ConcurrentMap, but not quite the same. The most
   * fundamental difference is that a ConcurrentMap persists all elements that are added to it until
   * they are explicitly removed. A Cache on the other hand is generally configured to evict entries
   * automatically, in order to constrain its memory footprint.  Note that this cache does not use
   * weak keys/values and thus does not respond to memory pressure.
   * @return (undocumented)
   */
  private  com.google.common.cache.LoadingCache<java.lang.String, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass> cache () { throw new RuntimeException(); }
  /** Generates the requested evaluator binding the given expression(s) to the inputSchema. */
  public  OutType generate (InType expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  /** Generates the requested evaluator given already bound expression(s). */
  public  OutType generate (InType expressions) { throw new RuntimeException(); }
  /**
   * Create a new codegen context for expression evaluator, used to store those
   * expressions that don't support codegen
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext newCodeGenContext () { throw new RuntimeException(); }
}

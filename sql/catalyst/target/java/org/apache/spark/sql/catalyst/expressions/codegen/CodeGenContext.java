package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A context for codegen, which is used to bookkeeping the expressions those are not supported
 * by codegen, then they are evaluated directly. The unsupported expression is appended at the
 * end of <code>references</code>, the position of it is kept in the code, used to access and evaluate it.
 */
public  class CodeGenContext {
  public   CodeGenContext () { throw new RuntimeException(); }
  /**
   * Holding all the expressions those do not support codegen, will be evaluated directly.
   * @return (undocumented)
   */
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.catalyst.expressions.Expression> references () { throw new RuntimeException(); }
  /**
   * Holding expressions' mutable states like <code>MonotonicallyIncreasingID.count</code> as a
   * 3-tuple: java type, variable name, code to init it.
   * As an example, ("int", "count", "count = 0;") will produce code:
   * <pre><code>
   *   private int count;
   * </code></pre>
   * as a member variable, and add
   * <pre><code>
   *   count = 0;
   * </code></pre>
   * to the constructor.
   * <p>
   * They will be kept as member variables in generated classes like <code>SpecificProjection</code>.
   * @return (undocumented)
   */
  public  scala.collection.mutable.ArrayBuffer<scala.Tuple3<java.lang.String, java.lang.String, java.lang.String>> mutableStates () { throw new RuntimeException(); }
  public  void addMutableState (java.lang.String javaType, java.lang.String variableName, java.lang.String initCode) { throw new RuntimeException(); }
  /**
   * Holding all the functions those will be added into generated class.
   * @return (undocumented)
   */
  public  scala.collection.mutable.Map<java.lang.String, java.lang.String> addedFunctions () { throw new RuntimeException(); }
  public  void addNewFunction (java.lang.String funcName, java.lang.String funcCode) { throw new RuntimeException(); }
  /**
   * Holds expressions that are equivalent. Used to perform subexpression elimination
   * during codegen.
   * <p>
   * For expressions that appear more than once, generate additional code to prevent
   * recomputing the value.
   * <p>
   * For example, consider two exprsesion generated from this SQL statement:
   *  SELECT (col1 + col2), (col1 + col2) / col3.
   * <p>
   *  equivalentExpressions will match the tree containing <code>col1 + col2</code> and it will only
   *  be evaluated once.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.EquivalentExpressions equivalentExpressions () { throw new RuntimeException(); }
  public  class SubExprEliminationState implements scala.Product, scala.Serializable {
    public  java.lang.String isNull () { throw new RuntimeException(); }
    public  java.lang.String value () { throw new RuntimeException(); }
    // not preceding
    public   SubExprEliminationState (java.lang.String isNull, java.lang.String value) { throw new RuntimeException(); }
  }
  // no position
  public  class SubExprEliminationState extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext.SubExprEliminationState> implements scala.Serializable {
    public   SubExprEliminationState () { throw new RuntimeException(); }
  }
  public  scala.collection.mutable.HashMap<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext.SubExprEliminationState> subExprEliminationExprs () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> subExprResetVariables () { throw new RuntimeException(); }
  public final  java.lang.String JAVA_BOOLEAN () { throw new RuntimeException(); }
  public final  java.lang.String JAVA_BYTE () { throw new RuntimeException(); }
  public final  java.lang.String JAVA_SHORT () { throw new RuntimeException(); }
  public final  java.lang.String JAVA_INT () { throw new RuntimeException(); }
  public final  java.lang.String JAVA_LONG () { throw new RuntimeException(); }
  public final  java.lang.String JAVA_FLOAT () { throw new RuntimeException(); }
  public final  java.lang.String JAVA_DOUBLE () { throw new RuntimeException(); }
  /** The variable name of the input row in generated code. */
  public final  java.lang.String INPUT_ROW () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger curId () { throw new RuntimeException(); }
  /**
   * Returns a term name that is unique within this instance of a <code>CodeGenerator</code>.
   * <p>
   * (Since we aren't in a macro context we do not seem to have access to the built in <code>freshName</code>
   * function.)
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String freshName (java.lang.String prefix) { throw new RuntimeException(); }
  /**
   * Returns the specialized code to access a value from <code>inputRow</code> at <code>ordinal</code>.
   * @param input (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getValue (java.lang.String input, org.apache.spark.sql.types.DataType dataType, java.lang.String ordinal) { throw new RuntimeException(); }
  /**
   * Returns the code to update a column in Row for a given DataType.
   * @param row (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String setColumn (java.lang.String row, org.apache.spark.sql.types.DataType dataType, int ordinal, java.lang.String value) { throw new RuntimeException(); }
  /**
   * Returns the name used in accessor and setter for a Java primitive type.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String primitiveTypeName (java.lang.String jt) { throw new RuntimeException(); }
  public  java.lang.String primitiveTypeName (org.apache.spark.sql.types.DataType dt) { throw new RuntimeException(); }
  /**
   * Returns the Java type for a DataType.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String javaType (org.apache.spark.sql.types.DataType dt) { throw new RuntimeException(); }
  /**
   * Returns the boxed type in Java.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String boxedType (java.lang.String jt) { throw new RuntimeException(); }
  public  java.lang.String boxedType (org.apache.spark.sql.types.DataType dt) { throw new RuntimeException(); }
  /**
   * Returns the representation of default value for a given Java Type.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String defaultValue (java.lang.String jt) { throw new RuntimeException(); }
  public  java.lang.String defaultValue (org.apache.spark.sql.types.DataType dt) { throw new RuntimeException(); }
  /**
   * Generates code for equal expression in Java.
   * @param dataType (undocumented)
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String genEqual (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2) { throw new RuntimeException(); }
  /**
   * Generates code for comparing two expressions.
   * <p>
   * @param dataType data type of the expressions
   * @param c1 name of the variable of expression 1's output
   * @param c2 name of the variable of expression 2's output
   * @return (undocumented)
   */
  public  java.lang.String genComp (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2) { throw new RuntimeException(); }
  /**
   * Generates code for greater of two expressions.
   * <p>
   * @param dataType data type of the expressions
   * @param c1 name of the variable of expression 1's output
   * @param c2 name of the variable of expression 2's output
   * @return (undocumented)
   */
  public  java.lang.String genGreater (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2) { throw new RuntimeException(); }
  /**
   * List of java data types that have special accessors and setters in {@link InternalRow}.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> primitiveTypes () { throw new RuntimeException(); }
  /**
   * Returns true if the Java type has a special accessor and setter in {@link InternalRow}.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  boolean isPrimitiveType (java.lang.String jt) { throw new RuntimeException(); }
  public  boolean isPrimitiveType (org.apache.spark.sql.types.DataType dt) { throw new RuntimeException(); }
  /**
   * Splits the generated code of expressions into multiple functions, because function has
   * 64kb code size limit in JVM
   * <p>
   * @param row the variable name of row that is used by expressions
   * @param expressions the codes to evaluate expressions.
   * @return (undocumented)
   */
  public  java.lang.String splitExpressions (java.lang.String row, scala.collection.Seq<java.lang.String> expressions) { throw new RuntimeException(); }
  /**
   * Checks and sets up the state and codegen for subexpression elimination. This finds the
   * common subexpresses, generates the functions that evaluate those expressions and populates
   * the mapping of common subexpressions to the generated functions.
   * @param expressions (undocumented)
   */
  private  void subexpressionElimination (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions) { throw new RuntimeException(); }
  /**
   * Generates code for expressions. If doSubexpressionElimination is true, subexpression
   * elimination will be performed. Subexpression elimination assumes that the code will for each
   * expression will be combined in the <code>expressions</code> order.
   * @param expressions (undocumented)
   * @param doSubexpressionElimination (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode> generateExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean doSubexpressionElimination) { throw new RuntimeException(); }
}

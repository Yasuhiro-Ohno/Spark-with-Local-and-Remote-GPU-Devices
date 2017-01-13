package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression in Catalyst.
 * <p>
 * If an expression wants to be exposed in the function registry (so users can call it with
 * "name(arguments...)", the concrete implementation must be a case class whose constructor
 * arguments are all Expressions types. See {@link Substring} for an example.
 * <p>
 * There are a few important traits:
 * <p>
 * - {@link Nondeterministic}: an expression that is not deterministic.
 * - {@link Unevaluable}: an expression that is not supposed to be evaluated.
 * - {@link CodegenFallback}: an expression that does not have code gen implemented and falls back to
 *                        interpreted mode.
 * <p>
 * - {@link LeafExpression}: an expression that has no child.
 * - {@link UnaryExpression}: an expression that has one child.
 * - {@link BinaryExpression}: an expression that has two children.
 * - {@link BinaryOperator}: a special case of {@link BinaryExpression} that requires two children to have
 *                       the same output data type.
 * <p>
 */
public abstract class Expression extends org.apache.spark.sql.catalyst.trees.TreeNode<org.apache.spark.sql.catalyst.expressions.Expression> {
  public   Expression () { throw new RuntimeException(); }
  /**
   * Returns true when an expression is a candidate for static evaluation before the query is
   * executed.
   * <p>
   * The following conditions are used to determine suitability for constant folding:
   *  - A {@link Coalesce} is foldable if all of its children are foldable
   *  - A {@link BinaryExpression} is foldable if its both left and right child are foldable
   *  - A {@link Not}, {@link IsNull}, or {@link IsNotNull} is foldable if its child is foldable
   *  - A {@link Literal} is foldable
   *  - A {@link Cast} or {@link UnaryMinus} is foldable if its child is foldable
   * @return (undocumented)
   */
  public  boolean foldable () { throw new RuntimeException(); }
  /**
   * Returns true when the current expression always return the same result for fixed inputs from
   * children.
   * <p>
   * Note that this means that an expression should be considered as non-deterministic if:
   * - if it relies on some mutable internal state, or
   * - if it relies on some implicit input that is not part of the children expression list.
   * - if it has non-deterministic child or children.
   * <p>
   * An example would be <code>SparkPartitionID</code> that relies on the partition id returned by TaskContext.
   * By default leaf expressions are deterministic as Nil.forall(_.deterministic) returns true.
   * @return (undocumented)
   */
  public  boolean deterministic () { throw new RuntimeException(); }
  public abstract  boolean nullable () ;
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references () { throw new RuntimeException(); }
  /** Returns the result of evaluating this expression on a given input Row */
  public abstract  Object eval (org.apache.spark.sql.catalyst.InternalRow input) ;
  /**
   * Returns an {@link GeneratedExpressionCode}, which contains Java source code that
   * can be used to generate the result of evaluating the expression on an input row.
   * <p>
   * @param ctx a {@link CodeGenContext}
   * @return {@link GeneratedExpressionCode}
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode gen (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx) { throw new RuntimeException(); }
  /**
   * Returns Java source code that can be compiled to evaluate this expression.
   * The default behavior is to call the eval method of the expression. Concrete expression
   * implementations should override this to do actual code generation.
   * <p>
   * @param ctx a {@link CodeGenContext}
   * @param ev an {@link GeneratedExpressionCode} with unique terms.
   * @return Java source code
   */
  protected abstract  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) ;
  /**
   * Returns <code>true</code> if this expression and all its children have been resolved to a specific schema
   * and input data types checking passed, and <code>false</code> if it still contains any unresolved
   * placeholders or has data types mismatch.
   * Implementations of expressions should override this if the resolution of this type of
   * expression involves more than just the resolution of its children and type checking.
   * @return (undocumented)
   */
  public  boolean resolved () { throw new RuntimeException(); }
  /**
   * Returns the {@link DataType} of the result of evaluating this expression.  It is
   * invalid to query the dataType of an unresolved expression (i.e., when <code>resolved</code> == false).
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.types.DataType dataType () ;
  /**
   * Returns true if  all the children of this expression have been resolved to a specific schema
   * and false if any still contains any unresolved placeholders.
   * @return (undocumented)
   */
  public  boolean childrenResolved () { throw new RuntimeException(); }
  /**
   * Returns true when two expressions will always compute the same result, even if they differ
   * cosmetically (i.e. capitalization of names in attributes may be different).
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  boolean semanticEquals (org.apache.spark.sql.catalyst.expressions.Expression other) { throw new RuntimeException(); }
  /**
   * Returns the hash for this expression. Expressions that compute the same result, even if
   * they differ cosmetically should return the same hash.
   * @return (undocumented)
   */
  public  int semanticHash () { throw new RuntimeException(); }
  /**
   * Checks the input data types, returns <code>TypeCheckResult.success</code> if it's valid,
   * or returns a <code>TypeCheckResult</code> with an error message if invalid.
   * Note: it's not valid to call this method until <code>childrenResolved == true</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  /**
   * Returns a user-facing string representation of this expression's name.
   * This should usually match the name of the function in SQL.
   * @return (undocumented)
   */
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  /**
   * Returns a user-facing string representation of this expression, i.e. does not have developer
   * centric debugging information like the expression id.
   * @return (undocumented)
   */
  public  java.lang.String prettyString () { throw new RuntimeException(); }
  private  scala.collection.Iterator<java.lang.Object> flatArguments () { throw new RuntimeException(); }
  public  java.lang.String simpleString () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * Returns the string representation of this expression that is safe to be put in
   * code comments of generated code.
   * @return (undocumented)
   */
  protected  java.lang.String toCommentSafeString () { throw new RuntimeException(); }
}

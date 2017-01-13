package org.apache.spark.sql.catalyst.expressions;
/**
 * An {@link Expression} that is named.
 */
public  interface NamedExpression {
  /** We should never fold named expressions in order to not remove the alias. */
  public  boolean foldable () ;
  public  java.lang.String name () ;
  public  org.apache.spark.sql.catalyst.expressions.ExprId exprId () ;
  /**
   * Returns a dot separated fully qualified name for this attribute.  Given that there can be
   * multiple qualifiers, it is possible that there are other possible way to refer to this
   * attribute.
   * @return (undocumented)
   */
  public  java.lang.String qualifiedName () ;
  /**
   * All possible qualifiers for the expression.
   * <p>
   * For now, since we do not allow using original table name to qualify a column name once the
   * table is aliased, this can only be:
   * <p>
   * 1. Empty Seq: when an attribute doesn't have a qualifier,
   *    e.g. top level attributes aliased in the SELECT clause, or column from a LocalRelation.
   * 2. Single element: either the table name or the alias name of the table.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> qualifiers () ;
  public  org.apache.spark.sql.catalyst.expressions.Attribute toAttribute () ;
  /** Returns the metadata when an expression is a reference to another expression with metadata. */
  public  org.apache.spark.sql.types.Metadata metadata () ;
  public  java.lang.String typeSuffix () ;
}

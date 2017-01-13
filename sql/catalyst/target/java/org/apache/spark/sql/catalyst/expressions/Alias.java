package org.apache.spark.sql.catalyst.expressions;
/**
 * Used to assign a new name to a computation.
 * For example the SQL expression "1 + 1 AS a" could be represented as follows:
 *  Alias(Add(Literal(1), Literal(1)), "a")()
 * <p>
 * Note that exprId and qualifiers are in a separate parameter list because
 * we only pattern match on child and name.
 * <p>
 * param:  child the computation being performed
 * param:  name the name to be associated with the result of computing {@link child}.
 * param:  exprId A globally unique id used to check if an {@link AttributeReference} refers to this
 *               alias. Auto-assigned if left blank.
 * param:  explicitMetadata Explicit metadata associated with this alias that overwrites child's.
 */
public  class Alias extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.NamedExpression, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExprId exprId () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> qualifiers () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.Metadata> explicitMetadata () { throw new RuntimeException(); }
  // not preceding
  public   Alias (org.apache.spark.sql.catalyst.expressions.Expression child, java.lang.String name, org.apache.spark.sql.catalyst.expressions.ExprId exprId, scala.collection.Seq<java.lang.String> qualifiers, scala.Option<org.apache.spark.sql.types.Metadata> explicitMetadata) { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  /** Just a simple passthrough for code generation. */
  public  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode gen (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx) { throw new RuntimeException(); }
  protected  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Metadata metadata () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute toAttribute () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  protected final  scala.collection.Seq<java.lang.Object> otherCopyArgs () { throw new RuntimeException(); }
  public  boolean equals (Object other) { throw new RuntimeException(); }
}

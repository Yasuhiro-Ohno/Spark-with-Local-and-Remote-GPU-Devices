package org.apache.spark.sql.catalyst.expressions;
/**
 * Calls the specified function on an object, optionally passing arguments.  If the <code>targetObject</code>
 * expression evaluates to null then null will be returned.
 * <p>
 * In some cases, due to erasure, the schema may expect a primitive type when in fact the method
 * is returning java.lang.Object.  In this case, we will generate code that attempts to unbox the
 * value automatically.
 * <p>
 * param:  targetObject An expression that will return the object to call the method on.
 * param:  functionName The name of the method to call.
 * param:  dataType The expected return type of the function.
 * param:  arguments An optional list of expressions, whos evaluation will be passed to the function.
 */
public  class Invoke extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression targetObject () { throw new RuntimeException(); }
  public  java.lang.String functionName () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments () { throw new RuntimeException(); }
  // not preceding
  public   Invoke (org.apache.spark.sql.catalyst.expressions.Expression targetObject, java.lang.String functionName, org.apache.spark.sql.types.DataType dataType, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String method () { throw new RuntimeException(); }
  public  scala.Function1<java.lang.String, java.lang.String> unboxer () { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

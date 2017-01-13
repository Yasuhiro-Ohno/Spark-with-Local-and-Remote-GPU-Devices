package org.apache.spark.sql.catalyst.expressions;
/**
 * Applies the given expression to every element of a collection of items, returning the result
 * as an ArrayType.  This is similar to a typical map operation, but where the lambda function
 * is expressed using catalyst expressions.
 * <p>
 * The following collection ObjectTypes are currently supported:
 *   Seq, Array, ArrayData, java.util.List
 * <p>
 * param:  function A function that returns an expression, given an attribute that can be used
 *                 to access the current value.  This is does as a lambda function so that
 *                 a unique attribute reference can be provided for each expression (thus allowing
 *                 us to nest multiple MapObject calls).
 * param:  inputData An expression that when evaluted returns a collection object.
 * param:  elementType The type of element in the collection, expressed as a DataType.
 */
public  class MapObjects extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  scala.Function1<org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.catalyst.expressions.Expression> function () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression inputData () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType elementType () { throw new RuntimeException(); }
  // not preceding
  public   MapObjects (scala.Function1<org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.catalyst.expressions.Expression> function, org.apache.spark.sql.catalyst.expressions.Expression inputData, org.apache.spark.sql.types.DataType elementType) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference loopAttribute () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression completeFunction () { throw new RuntimeException(); }
  private  scala.Function1<java.lang.String, java.lang.String> itemAccessorMethod (org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  // not preceding
  private  java.lang.String lengthFunction () { throw new RuntimeException(); }
  private  scala.Function1<java.lang.String, java.lang.String> itemAccessor () { throw new RuntimeException(); }
  private  boolean primitiveElement () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

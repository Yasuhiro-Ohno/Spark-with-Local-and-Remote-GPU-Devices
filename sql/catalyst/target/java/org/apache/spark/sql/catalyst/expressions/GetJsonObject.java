package org.apache.spark.sql.catalyst.expressions;
/**
 * Extracts json object from a json string based on json path specified, and returns json string
 * of the extracted json object. It will return null if the input json string is invalid.
 */
public  class GetJsonObject extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression json () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression path () { throw new RuntimeException(); }
  // not preceding
  public   GetJsonObject (org.apache.spark.sql.catalyst.expressions.Expression json, org.apache.spark.sql.catalyst.expressions.Expression path) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  private  scala.Option<scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.PathInstruction>> parsedPath () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  private  scala.Option<scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.PathInstruction>> parsePath (org.apache.spark.unsafe.types.UTF8String path) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> arrayIndex (com.fasterxml.jackson.core.JsonParser p, scala.Function0<java.lang.Object> f) { throw new RuntimeException(); }
  /**
   * Evaluate a list of JsonPath instructions, returning a bool that indicates if any leaf nodes
   * have been written to the generator
   * @param p (undocumented)
   * @param g (undocumented)
   * @param style (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  private  boolean evaluatePath (com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.core.JsonGenerator g, org.apache.spark.sql.catalyst.expressions.WriteStyle style, scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.PathInstruction> path) { throw new RuntimeException(); }
}

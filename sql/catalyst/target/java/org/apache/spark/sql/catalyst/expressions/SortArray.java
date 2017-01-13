package org.apache.spark.sql.catalyst.expressions;
/**
 * Sorts the input array in ascending / descending order according to the natural ordering of
 * the array elements and returns it.
 */
public  class SortArray extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression base () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression ascendingOrder () { throw new RuntimeException(); }
  // not preceding
  public   SortArray (org.apache.spark.sql.catalyst.expressions.Expression base, org.apache.spark.sql.catalyst.expressions.Expression ascendingOrder) { throw new RuntimeException(); }
  public   SortArray (org.apache.spark.sql.catalyst.expressions.Expression e) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () { throw new RuntimeException(); }
  private  java.util.Comparator<java.lang.Object> lt () { throw new RuntimeException(); }
  private  java.util.Comparator<java.lang.Object> gt () { throw new RuntimeException(); }
  public  Object nullSafeEval (Object array, Object ascending) { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
public  class Pmod extends org.apache.spark.sql.catalyst.expressions.BinaryArithmetic implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  // not preceding
  public   Pmod (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  java.lang.String symbol () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkTypesInternal (org.apache.spark.sql.types.DataType t) { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.AbstractDataType inputType () { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object left, Object right) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  private  int pmod (int a, int n) { throw new RuntimeException(); }
  private  long pmod (long a, long n) { throw new RuntimeException(); }
  private  byte pmod (byte a, byte n) { throw new RuntimeException(); }
  private  double pmod (double a, double n) { throw new RuntimeException(); }
  private  short pmod (short a, short n) { throw new RuntimeException(); }
  private  float pmod (float a, float n) { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.Decimal pmod (org.apache.spark.sql.types.Decimal a, org.apache.spark.sql.types.Decimal n) { throw new RuntimeException(); }
}

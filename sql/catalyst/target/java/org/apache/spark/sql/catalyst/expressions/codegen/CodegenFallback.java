package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A trait that can be used to provide a fallback mode for expression code generation.
 */
public  interface CodegenFallback {
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) ;
}

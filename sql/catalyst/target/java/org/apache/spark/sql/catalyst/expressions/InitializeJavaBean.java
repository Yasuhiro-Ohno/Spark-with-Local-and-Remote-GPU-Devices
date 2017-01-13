package org.apache.spark.sql.catalyst.expressions;
/**
 * Initialize a Java Bean instance by setting its field values via setters.
 */
public  class InitializeJavaBean extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression beanInstance () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.expressions.Expression> setters () { throw new RuntimeException(); }
  // not preceding
  public   InitializeJavaBean (org.apache.spark.sql.catalyst.expressions.Expression beanInstance, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.expressions.Expression> setters) { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
}

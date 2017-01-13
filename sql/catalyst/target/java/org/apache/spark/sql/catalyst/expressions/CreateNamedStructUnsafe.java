package org.apache.spark.sql.catalyst.expressions;
/**
 * Creates a struct with the given field names and values. This is a variant that returns
 * UnsafeRow directly. The unsafe projection operator replaces {@link CreateStruct} with
 * this expression automatically at runtime.
 * <p>
 * param:  children Seq(name1, val1, name2, val2, ...)
 */
public  class CreateNamedStructUnsafe extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   CreateNamedStructUnsafe (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  // not preceding
  private  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.Expression> nameExprs () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.Expression> valExprs () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.String> names () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodeGenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedExpressionCode ev) { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
}

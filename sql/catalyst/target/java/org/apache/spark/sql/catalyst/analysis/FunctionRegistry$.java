package org.apache.spark.sql.catalyst.analysis;
// no position
public  class FunctionRegistry$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FunctionRegistry$ MODULE$ = null;
  public   FunctionRegistry$ () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> expressions () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.SimpleFunctionRegistry builtin () { throw new RuntimeException(); }
  /** See usage above. */
  public <T extends org.apache.spark.sql.catalyst.expressions.Expression> scala.Tuple2<java.lang.String, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> expression (java.lang.String name, scala.reflect.ClassTag<T> tag) { throw new RuntimeException(); }
}

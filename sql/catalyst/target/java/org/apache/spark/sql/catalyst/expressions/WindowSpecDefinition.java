package org.apache.spark.sql.catalyst.expressions;
/**
 * The specification for a window function.
 * param:  partitionSpec It defines the way that input rows are partitioned.
 * param:  orderSpec It defines the ordering of rows in a partition.
 * param:  frameSpecification It defines the window frame in a partition.
 */
public  class WindowSpecDefinition extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.WindowSpec, org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionSpec () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> orderSpec () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.WindowFrame frameSpecification () { throw new RuntimeException(); }
  // not preceding
  public   WindowSpecDefinition (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionSpec, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> orderSpec, org.apache.spark.sql.catalyst.expressions.WindowFrame frameSpecification) { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> validate () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
public  interface CaseWhenLike {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> branches () ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> whenList () ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> thenList () ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> elseValue () ;
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> valueTypes () ;
  public  boolean valueTypesEqual () ;
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes () ;
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkTypesInternal () ;
  public  org.apache.spark.sql.types.DataType dataType () ;
  public  boolean nullable () ;
}

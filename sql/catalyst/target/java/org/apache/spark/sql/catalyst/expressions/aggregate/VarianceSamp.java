package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class VarianceSamp extends org.apache.spark.sql.catalyst.expressions.aggregate.CentralMomentAgg implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  int mutableAggBufferOffset () { throw new RuntimeException(); }
  public  int inputAggBufferOffset () { throw new RuntimeException(); }
  // not preceding
  public   VarianceSamp (org.apache.spark.sql.catalyst.expressions.Expression child, int mutableAggBufferOffset, int inputAggBufferOffset) { throw new RuntimeException(); }
  public   VarianceSamp (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset) { throw new RuntimeException(); }
  public  java.lang.String prettyName () { throw new RuntimeException(); }
  protected  int momentOrder () { throw new RuntimeException(); }
  public  Object getStatistic (double n, double mean, double[] moments) { throw new RuntimeException(); }
}

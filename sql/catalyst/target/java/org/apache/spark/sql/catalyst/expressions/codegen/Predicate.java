package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Interface for generated predicate
 */
public abstract class Predicate {
  public   Predicate () { throw new RuntimeException(); }
  public abstract  boolean eval (org.apache.spark.sql.catalyst.InternalRow r) ;
}

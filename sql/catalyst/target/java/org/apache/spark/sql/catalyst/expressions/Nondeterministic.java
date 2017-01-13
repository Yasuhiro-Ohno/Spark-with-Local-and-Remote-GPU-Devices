package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that is nondeterministic.
 */
public  interface Nondeterministic {
  public  boolean deterministic () ;
  public  boolean foldable () ;
  public  void setInitialValues () ;
  public  void initInternal () ;
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input) ;
  public  Object evalInternal (org.apache.spark.sql.catalyst.InternalRow input) ;
}

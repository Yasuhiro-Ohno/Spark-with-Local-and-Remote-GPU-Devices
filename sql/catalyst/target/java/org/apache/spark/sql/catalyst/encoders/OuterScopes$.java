package org.apache.spark.sql.catalyst.encoders;
// no position
public  class OuterScopes$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OuterScopes$ MODULE$ = null;
  public   OuterScopes$ () { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> outerScopes () { throw new RuntimeException(); }
  /**
   * Adds a new outer scope to this context that can be used when instantiating an <code>inner class</code>
   * during deserialialization. Inner classes are created when a case class is defined in the
   * Spark REPL and registering the outer scope that this class was defined in allows us to create
   * new instances on the spark executors.  In normal use, users should not need to call this
   * function.
   * <p>
   * Warning: this function operates on the assumption that there is only ever one instance of any
   * given wrapper class.
   * @param outer (undocumented)
   */
  public  void addOuterScope (java.lang.Object outer) { throw new RuntimeException(); }
}

package org.apache.spark.sql;
// no position
/**
 * This SQLContext object contains utility functions to create a singleton SQLContext instance,
 * or to get the created SQLContext instance.
 * <p>
 * It also provides utility functions to support preference for threads in multiple sessions
 * scenario, setActive could set a SQLContext for current thread, which will be returned by
 * getOrCreate instead of the global one.
 */
public  class SQLContext$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SQLContext$ MODULE$ = null;
  public   SQLContext$ () { throw new RuntimeException(); }
  /**
   * The active SQLContext for the current thread.
   * @return (undocumented)
   */
  private  java.lang.InheritableThreadLocal<org.apache.spark.sql.SQLContext> activeContext () { throw new RuntimeException(); }
  /**
   * Reference to the created SQLContext.
   * @return (undocumented)
   */
  private  java.util.concurrent.atomic.AtomicReference<org.apache.spark.sql.SQLContext> instantiatedContext () { throw new RuntimeException(); }
  /**
   * Get the singleton SQLContext if it exists or create a new one using the given SparkContext.
   * <p>
   * This function can be used to create a singleton SQLContext object that can be shared across
   * the JVM.
   * <p>
   * If there is an active SQLContext for current thread, it will be returned instead of the global
   * one.
   * <p>
   * @since 1.5.0
   * @param sparkContext (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext getOrCreate (org.apache.spark.SparkContext sparkContext) { throw new RuntimeException(); }
    void clearInstantiatedContext () { throw new RuntimeException(); }
    void setInstantiatedContext (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
    scala.Option<org.apache.spark.sql.SQLContext> getInstantiatedContextOption () { throw new RuntimeException(); }
  /**
   * Changes the SQLContext that will be returned in this thread and its children when
   * SQLContext.getOrCreate() is called. This can be used to ensure that a given thread receives
   * a SQLContext with an isolated session, instead of the global (first created) context.
   * <p>
   * @since 1.6.0
   * @param sqlContext (undocumented)
   */
  public  void setActive (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  /**
   * Clears the active SQLContext for current thread. Subsequent calls to getOrCreate will
   * return the first created context instead of a thread-local override.
   * <p>
   * @since 1.6.0
   */
  public  void clearActive () { throw new RuntimeException(); }
    scala.Option<org.apache.spark.sql.SQLContext> getActive () { throw new RuntimeException(); }
  /**
   * Converts an iterator of Java Beans to InternalRow using the provided
   * bean info &amp; schema. This is not related to the singleton, but is a static
   * method for internal use.
   * @param data (undocumented)
   * @param beanInfo (undocumented)
   * @param attrs (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> beansToRows (scala.collection.Iterator<java.lang.Object> data, java.beans.BeanInfo beanInfo, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attrs) { throw new RuntimeException(); }
  /**
   * Create a SQLListener then add it into SparkContext, and create an SQLTab if there is SparkUI.
   * @param sc (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.execution.ui.SQLListener createListenerAndUI (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
}

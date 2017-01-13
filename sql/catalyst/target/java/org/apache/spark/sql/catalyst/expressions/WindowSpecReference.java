package org.apache.spark.sql.catalyst.expressions;
/**
 * A Window specification reference that refers to the {@link WindowSpecDefinition} defined
 * under the name <code>name</code>.
 */
public  class WindowSpecReference implements org.apache.spark.sql.catalyst.expressions.WindowSpec, scala.Product, scala.Serializable {
  public  java.lang.String name () { throw new RuntimeException(); }
  // not preceding
  public   WindowSpecReference (java.lang.String name) { throw new RuntimeException(); }
}

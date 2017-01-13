package org.apache.spark.sql.execution.local;
/**
 * An thin wrapper around a {@link LocalNode} that provides an <code>Iterator</code> interface.
 */
public  class LocalNodeIterator implements scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> {
  public   LocalNodeIterator (org.apache.spark.sql.execution.local.LocalNode localNode) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.InternalRow nextRow () { throw new RuntimeException(); }
  public  boolean hasNext () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow next () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.analysis;
/**
 * Holds the name of a relation that has yet to be looked up in a {@link Catalog}.
 */
public  class UnresolvedRelation extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> alias () { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedRelation (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier, scala.Option<java.lang.String> alias) { throw new RuntimeException(); }
  /** Returns a `.` separated name for this relation. */
  public  java.lang.String tableName () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
}

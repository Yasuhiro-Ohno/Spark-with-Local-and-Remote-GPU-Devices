package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A container for holding named common table expressions (CTEs) and a query plan.
 * This operator will be removed during analysis and the relations will be substituted into child.
 * param:  child The final query of this CTE.
 * param:  cteRelations Queries that this CTE defined,
 *                     key is the alias of the CTE definition,
 *                     value is the CTE definition.
 */
public  class With extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.Subquery> cteRelations () { throw new RuntimeException(); }
  // not preceding
  public   With (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.Subquery> cteRelations) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
}

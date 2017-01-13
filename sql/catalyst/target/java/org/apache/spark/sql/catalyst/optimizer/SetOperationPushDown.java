package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Pushes certain operations to both sides of a Union, Intersect or Except operator.
 * Operations that are safe to pushdown are listed as follows.
 * Union:
 * Right now, Union means UNION ALL, which does not de-duplicate rows. So, it is
 * safe to pushdown Filters and Projections through it. Once we add UNION DISTINCT,
 * we will not be able to pushdown Projections.
 * <p>
 * Intersect:
 * It is not safe to pushdown Projections through it because we need to get the
 * intersect of rows by comparing the entire rows. It is fine to pushdown Filters
 * with deterministic condition.
 * <p>
 * Except:
 * It is not safe to pushdown Projections through it because we need to get the
 * intersect of rows by comparing the entire rows. It is fine to pushdown Filters
 * with deterministic condition.
 */
public  class SetOperationPushDown extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Maps Attributes from the left side to the corresponding Attribute on the right side.
   * @param bn (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Attribute> buildRewrites (org.apache.spark.sql.catalyst.plans.logical.BinaryNode bn) { throw new RuntimeException(); }
  /**
   * Rewrites an expression so that it can be pushed to the right side of a
   * Union, Intersect or Except operator. This method relies on the fact that the output attributes
   * of a union/intersect/except are always equal to the left child's output.
   * @param e (undocumented)
   * @param rewrites (undocumented)
   * @return (undocumented)
   */
  static private <A extends org.apache.spark.sql.catalyst.expressions.Expression> A pushToRight (A e, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Attribute> rewrites) { throw new RuntimeException(); }
  /**
   * Splits the condition expression into small conditions by <code>And</code>, and partition them by
   * deterministic, and finally recombine them by <code>And</code>. It returns an expression containing
   * all deterministic expressions (the first field of the returned Tuple2) and an expression
   * containing all non-deterministic expressions (the second field of the returned Tuple2).
   * @param condition (undocumented)
   * @return (undocumented)
   */
  static private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> partitionByDeterministic (org.apache.spark.sql.catalyst.expressions.Expression condition) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

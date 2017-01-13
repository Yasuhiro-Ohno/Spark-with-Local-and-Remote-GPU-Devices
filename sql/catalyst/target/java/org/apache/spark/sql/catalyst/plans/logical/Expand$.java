package org.apache.spark.sql.catalyst.plans.logical;
// no position
  class Expand$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Expand$ MODULE$ = null;
  public   Expand$ () { throw new RuntimeException(); }
  /**
   * Extract attribute set according to the grouping id.
   * <p>
   * @param bitmask bitmask to represent the selected of the attribute sequence
   * @param exprs the attributes in sequence
   * @return the attributes of non selected specified via bitmask (with the bit set to 1)
   */
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.catalyst.expressions.Expression> buildNonSelectExprSet (int bitmask, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs) { throw new RuntimeException(); }
  /**
   * Apply the all of the GroupExpressions to every input row, hence we will get
   * multiple output rows for a input row.
   * <p>
   * @param bitmasks The bitmask set represents the grouping sets
   * @param groupByExprs The grouping by expressions
   * @param gid Attribute of the grouping id
   * @param child Child operator
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.Expand apply (scala.collection.Seq<java.lang.Object> bitmasks, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, org.apache.spark.sql.catalyst.expressions.Attribute gid, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
}

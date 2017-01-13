package org.apache.spark.sql.execution.datasources;
// no position
/**
 * A Strategy for planning scans over data sources defined using the sources API.
 */
  class DataSourceStrategy extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> implements org.apache.spark.Logging {
  static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.execution.SparkPlan buildPartitionedTableScan (org.apache.spark.sql.execution.datasources.LogicalRelation logicalRelation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projections, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters, org.apache.spark.sql.types.StructType partitionColumns, org.apache.spark.sql.execution.datasources.Partition[] partitions) { throw new RuntimeException(); }
  static private  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> mergeWithPartitionValues (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> requiredColumns, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataColumns, org.apache.spark.sql.types.StructType partitionColumnSchema, org.apache.spark.sql.catalyst.InternalRow partitionValues, org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> dataRows) { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.execution.datasources.Partition> prunePartitions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates, org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec) { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.SparkPlan pruneFilterProject (org.apache.spark.sql.execution.datasources.LogicalRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filterPredicates, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.sources.Filter[], org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> scanBuilder) { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.SparkPlan pruneFilterProjectRaw (org.apache.spark.sql.execution.datasources.LogicalRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filterPredicates, scala.Function3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.sources.Filter>, org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> scanBuilder) { throw new RuntimeException(); }
  /**
   * Convert RDD of Row into RDD of InternalRow with objects in catalyst types
   * @param relation (undocumented)
   * @param output (undocumented)
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toCatalystRDD (org.apache.spark.sql.execution.datasources.LogicalRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rdd) { throw new RuntimeException(); }
  /**
   * Convert RDD of Row into RDD of InternalRow with objects in catalyst types
   * @param relation (undocumented)
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toCatalystRDD (org.apache.spark.sql.execution.datasources.LogicalRelation relation, org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rdd) { throw new RuntimeException(); }
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   * @param predicate (undocumented)
   */
  static protected  scala.Option<org.apache.spark.sql.sources.Filter> translateFilter (org.apache.spark.sql.catalyst.expressions.Expression predicate) { throw new RuntimeException(); }
  /**
   * Selects Catalyst predicate {@link Expression}s which are convertible into data source {@link Filter}s
   * and can be handled by <code>relation</code>.
   * <p>
   * @return A pair of <code>Seq[Expression]</code> and <code>Seq[Filter]</code>. The first element contains all Catalyst
   *         predicate {@link Expression}s that are either not convertible or cannot be handled by
   *         <code>relation</code>. The second element contains all converted data source {@link Filter}s that
   *         will be pushed down to the data source.
   * @param relation (undocumented)
   * @param predicates (undocumented)
   */
  static protected  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.sources.Filter>> selectFilters (org.apache.spark.sql.sources.BaseRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates) { throw new RuntimeException(); }
}

package org.apache.spark.sql;
/**
 * :: Experimental ::
 * A {@link Dataset} has been logically grouped by a user specified grouping key.  Users should not
 * construct a {@link GroupedDataset} directly, but should instead call <code>groupBy</code> on an existing
 * {@link Dataset}.
 * <p>
 * COMPATIBILITY NOTE: Long term we plan to make {@link GroupedDataset)} extend <code>GroupedData</code>.  However,
 * making this change to the class hierarchy would break some function signatures. As such, this
 * class should be considered a preview of the final API.  Changes will be made to the interface
 * after Spark 1.6.
 * <p>
 * @since 1.6.0
 */
public  class GroupedDataset<K extends java.lang.Object, V extends java.lang.Object> implements scala.Serializable {
  /**
   * Reduces the elements of each group of data using the specified binary function.
   * The given function must be commutative and associative or the result may be non-deterministic.
   * <p>
   * @since 1.6.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.DataFrame agg (org.apache.spark.sql.Column... exprs) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.QueryExecution queryExecution () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes () { throw new RuntimeException(); }
  // not preceding
     GroupedDataset (org.apache.spark.sql.Encoder<K> kEncoder, org.apache.spark.sql.Encoder<V> vEncoder, org.apache.spark.sql.execution.QueryExecution queryExecution, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<K> unresolvedKEncoder () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<V> unresolvedVEncoder () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<K> resolvedKEncoder () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<V> resolvedVEncoder () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan () { throw new RuntimeException(); }
  private  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  private  org.apache.spark.sql.GroupedData groupedData () { throw new RuntimeException(); }
  /**
   * Returns a new {@link GroupedDataset} where the type of the key has been mapped to the specified
   * type. The mapping of key columns to the type follows the same rules as <code>as</code> on {@link Dataset}.
   * <p>
   * @since 1.6.0
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <L extends java.lang.Object> org.apache.spark.sql.GroupedDataset<L, V> keyAs (org.apache.spark.sql.Encoder<L> evidence$1) { throw new RuntimeException(); }
  /**
   * Returns a {@link Dataset} that contains each unique key.
   * <p>
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<K> keys () { throw new RuntimeException(); }
  /**
   * Applies the given function to each group of data.  For each unique group, the function will
   * be passed the group key and an iterator that contains all of the elements in the group. The
   * function can return an iterator containing elements of an arbitrary type which will be returned
   * as a new {@link Dataset}.
   * <p>
   * This function does not support partial aggregation, and as a result requires shuffling all
   * the data in the {@link Dataset}. If an application intends to perform an aggregation over each
   * key, it is best to use the reduce function or an {@link Aggregator}.
   * <p>
   * Internally, the implementation will spill to disk if any given group is too large to fit into
   * memory.  However, users must take care to avoid materializing the whole iterator for a group
   * (for example, by calling <code>toList</code>) unless they are sure that this is possible given the memory
   * constraints of their cluster.
   * <p>
   * @since 1.6.0
   * @param f (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> flatMapGroups (scala.Function2<K, scala.collection.Iterator<V>, scala.collection.TraversableOnce<U>> f, org.apache.spark.sql.Encoder<U> evidence$2) { throw new RuntimeException(); }
  /**
   * Applies the given function to each group of data.  For each unique group, the function will
   * be passed the group key and an iterator that contains all of the elements in the group. The
   * function can return an iterator containing elements of an arbitrary type which will be returned
   * as a new {@link Dataset}.
   * <p>
   * This function does not support partial aggregation, and as a result requires shuffling all
   * the data in the {@link Dataset}. If an application intends to perform an aggregation over each
   * key, it is best to use the reduce function or an {@link Aggregator}.
   * <p>
   * Internally, the implementation will spill to disk if any given group is too large to fit into
   * memory.  However, users must take care to avoid materializing the whole iterator for a group
   * (for example, by calling <code>toList</code>) unless they are sure that this is possible given the memory
   * constraints of their cluster.
   * <p>
   * @since 1.6.0
   * @param f (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> flatMapGroups (org.apache.spark.api.java.function.FlatMapGroupsFunction<K, V, U> f, org.apache.spark.sql.Encoder<U> encoder) { throw new RuntimeException(); }
  /**
   * Applies the given function to each group of data.  For each unique group, the function will
   * be passed the group key and an iterator that contains all of the elements in the group. The
   * function can return an element of arbitrary type which will be returned as a new {@link Dataset}.
   * <p>
   * This function does not support partial aggregation, and as a result requires shuffling all
   * the data in the {@link Dataset}. If an application intends to perform an aggregation over each
   * key, it is best to use the reduce function or an {@link Aggregator}.
   * <p>
   * Internally, the implementation will spill to disk if any given group is too large to fit into
   * memory.  However, users must take care to avoid materializing the whole iterator for a group
   * (for example, by calling <code>toList</code>) unless they are sure that this is possible given the memory
   * constraints of their cluster.
   * <p>
   * @since 1.6.0
   * @param f (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> mapGroups (scala.Function2<K, scala.collection.Iterator<V>, U> f, org.apache.spark.sql.Encoder<U> evidence$3) { throw new RuntimeException(); }
  /**
   * Applies the given function to each group of data.  For each unique group, the function will
   * be passed the group key and an iterator that contains all of the elements in the group. The
   * function can return an element of arbitrary type which will be returned as a new {@link Dataset}.
   * <p>
   * This function does not support partial aggregation, and as a result requires shuffling all
   * the data in the {@link Dataset}. If an application intends to perform an aggregation over each
   * key, it is best to use the reduce function or an {@link Aggregator}.
   * <p>
   * Internally, the implementation will spill to disk if any given group is too large to fit into
   * memory.  However, users must take care to avoid materializing the whole iterator for a group
   * (for example, by calling <code>toList</code>) unless they are sure that this is possible given the memory
   * constraints of their cluster.
   * <p>
   * @since 1.6.0
   * @param f (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> mapGroups (org.apache.spark.api.java.function.MapGroupsFunction<K, V, U> f, org.apache.spark.sql.Encoder<U> encoder) { throw new RuntimeException(); }
  /**
   * Reduces the elements of each group of data using the specified binary function.
   * The given function must be commutative and associative or the result may be non-deterministic.
   * <p>
   * @since 1.6.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<scala.Tuple2<K, V>> reduce (scala.Function2<V, V, V> f) { throw new RuntimeException(); }
  /**
   * Reduces the elements of each group of data using the specified binary function.
   * The given function must be commutative and associative or the result may be non-deterministic.
   * <p>
   * @since 1.6.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<scala.Tuple2<K, V>> reduce (org.apache.spark.api.java.function.ReduceFunction<V> f) { throw new RuntimeException(); }
  private  org.apache.spark.sql.DataFrame agg (scala.collection.Seq<org.apache.spark.sql.Column> exprs) { throw new RuntimeException(); }
  private  org.apache.spark.sql.Column withEncoder (org.apache.spark.sql.Column c) { throw new RuntimeException(); }
  /**
   * Internal helper function for building typed aggregations that return tuples.  For simplicity
   * and code reuse, we do this without the help of the type system and then use helper functions
   * that cast appropriately for the user facing interface.
   * TODO: does not handle aggrecations that return nonflat results,
   * @param columns (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.Dataset<?> aggUntyped (scala.collection.Seq<org.apache.spark.sql.TypedColumn<?, ?>> columns) { throw new RuntimeException(); }
  /**
   * Computes the given aggregation, returning a {@link Dataset} of tuples for each unique key
   * and the result of computing this aggregation over all elements in the group.
   * <p>
   * @since 1.6.0
   * @param col1 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple2<K, U1>> agg (org.apache.spark.sql.TypedColumn<V, U1> col1) { throw new RuntimeException(); }
  /**
   * Computes the given aggregations, returning a {@link Dataset} of tuples for each unique key
   * and the result of computing these aggregations over all elements in the group.
   * <p>
   * @since 1.6.0
   * @param col1 (undocumented)
   * @param col2 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple3<K, U1, U2>> agg (org.apache.spark.sql.TypedColumn<V, U1> col1, org.apache.spark.sql.TypedColumn<V, U2> col2) { throw new RuntimeException(); }
  /**
   * Computes the given aggregations, returning a {@link Dataset} of tuples for each unique key
   * and the result of computing these aggregations over all elements in the group.
   * <p>
   * @since 1.6.0
   * @param col1 (undocumented)
   * @param col2 (undocumented)
   * @param col3 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object, U3 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple4<K, U1, U2, U3>> agg (org.apache.spark.sql.TypedColumn<V, U1> col1, org.apache.spark.sql.TypedColumn<V, U2> col2, org.apache.spark.sql.TypedColumn<V, U3> col3) { throw new RuntimeException(); }
  /**
   * Computes the given aggregations, returning a {@link Dataset} of tuples for each unique key
   * and the result of computing these aggregations over all elements in the group.
   * <p>
   * @since 1.6.0
   * @param col1 (undocumented)
   * @param col2 (undocumented)
   * @param col3 (undocumented)
   * @param col4 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object, U3 extends java.lang.Object, U4 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple5<K, U1, U2, U3, U4>> agg (org.apache.spark.sql.TypedColumn<V, U1> col1, org.apache.spark.sql.TypedColumn<V, U2> col2, org.apache.spark.sql.TypedColumn<V, U3> col3, org.apache.spark.sql.TypedColumn<V, U4> col4) { throw new RuntimeException(); }
  /**
   * Returns a {@link Dataset} that contains a tuple with each key and the number of items present
   * for that key.
   * <p>
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<scala.Tuple2<K, java.lang.Object>> count () { throw new RuntimeException(); }
  /**
   * Applies the given function to each cogrouped data.  For each unique group, the function will
   * be passed the grouping key and 2 iterators containing all elements in the group from
   * {@link Dataset} <code>this</code> and <code>other</code>.  The function can return an iterator containing elements of an
   * arbitrary type which will be returned as a new {@link Dataset}.
   * <p>
   * @since 1.6.0
   * @param other (undocumented)
   * @param f (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object, R extends java.lang.Object> org.apache.spark.sql.Dataset<R> cogroup (org.apache.spark.sql.GroupedDataset<K, U> other, scala.Function3<K, scala.collection.Iterator<V>, scala.collection.Iterator<U>, scala.collection.TraversableOnce<R>> f, org.apache.spark.sql.Encoder<R> evidence$4) { throw new RuntimeException(); }
  /**
   * Applies the given function to each cogrouped data.  For each unique group, the function will
   * be passed the grouping key and 2 iterators containing all elements in the group from
   * {@link Dataset} <code>this</code> and <code>other</code>.  The function can return an iterator containing elements of an
   * arbitrary type which will be returned as a new {@link Dataset}.
   * <p>
   * @since 1.6.0
   * @param other (undocumented)
   * @param f (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object, R extends java.lang.Object> org.apache.spark.sql.Dataset<R> cogroup (org.apache.spark.sql.GroupedDataset<K, U> other, org.apache.spark.api.java.function.CoGroupFunction<K, V, U, R> f, org.apache.spark.sql.Encoder<R> encoder) { throw new RuntimeException(); }
}

package org.apache.spark.sql;
/**
 * :: Experimental ::
 * A {@link Dataset} is a strongly typed collection of objects that can be transformed in parallel
 * using functional or relational operations.
 * <p>
 * A {@link Dataset} differs from an {@link RDD} in the following ways:
 *  - Internally, a {@link Dataset} is represented by a Catalyst logical plan and the data is stored
 *    in the encoded form.  This representation allows for additional logical operations and
 *    enables many operations (sorting, shuffling, etc.) to be performed without deserializing to
 *    an object.
 *  - The creation of a {@link Dataset} requires the presence of an explicit {@link Encoder} that can be
 *    used to serialize the object into a binary format.  Encoders are also capable of mapping the
 *    schema of a given object to the Spark SQL type system.  In contrast, RDDs rely on runtime
 *    reflection based serialization. Operations that change the type of object stored in the
 *    dataset also need an encoder for the new type.
 * <p>
 * A {@link Dataset} can be thought of as a specialized DataFrame, where the elements map to a specific
 * JVM object type, instead of to a generic {@link Row} container. A DataFrame can be transformed into
 * specific Dataset by calling <code>df.as[ElementType]</code>.  Similarly you can transform a strongly-typed
 * {@link Dataset} to a generic DataFrame by calling <code>ds.toDF()</code>.
 * <p>
 * COMPATIBILITY NOTE: Long term we plan to make {@link DataFrame} extend <code>Dataset[Row]</code>.  However,
 * making this change to the class hierarchy would break the function signatures for the existing
 * functional operations (map, flatMap, etc).  As such, this class should be considered a preview
 * of the final API.  Changes will be made to the interface after Spark 1.6.
 * <p>
 * @since 1.6.0
 */
public  class Dataset<T extends java.lang.Object> implements org.apache.spark.sql.execution.Queryable, scala.Serializable {
  /**
   * Returns a {@link GroupedDataset} where the data is grouped by the given {@link Column} expressions.
   * @since 1.6.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.GroupedDataset<org.apache.spark.sql.Row, T> groupBy (org.apache.spark.sql.Column... cols) { throw new RuntimeException(); }
  /**
   * Returns a new {@link DataFrame} by selecting a set of column based expressions.
   * <pre><code>
   *   df.select($"colA", $"colB" + 1)
   * </code></pre>
   * @since 1.6.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.DataFrame select (org.apache.spark.sql.Column... cols) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.QueryExecution queryExecution () { throw new RuntimeException(); }
  // not preceding
     Dataset (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.execution.QueryExecution queryExecution, org.apache.spark.sql.Encoder<T> tEncoder) { throw new RuntimeException(); }
  /**
   * An unresolved version of the internal encoder for the type of this {@link Dataset}.  This one is
   * marked implicit so that we can use it when constructing new {@link Dataset} objects that have the
   * same object type (that will be possibly resolved to a different schema).
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> unresolvedTEncoder () { throw new RuntimeException(); }
  /** The encoder for this {@link Dataset} that has been resolved to its output schema. */
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> resolvedTEncoder () { throw new RuntimeException(); }
  /**
   * The encoder where the expressions used to construct an object from an input row have been
   * bound to the ordinals of the given schema.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> boundTEncoder () { throw new RuntimeException(); }
  private  scala.reflect.ClassTag<T> classTag () { throw new RuntimeException(); }
     Dataset (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.Encoder<T> encoder) { throw new RuntimeException(); }
  /**
   * Returns the schema of the encoded form of the objects in this {@link Dataset}.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType schema () { throw new RuntimeException(); }
  /**
   * Prints the schema of the underlying {@link Dataset} to the console in a nice tree format.
   * @since 1.6.0
   */
  public  void printSchema () { throw new RuntimeException(); }
  /**
   * Prints the plans (logical and physical) to the console for debugging purposes.
   * @since 1.6.0
   * @param extended (undocumented)
   */
  public  void explain (boolean extended) { throw new RuntimeException(); }
  /**
   * Prints the physical plan to the console for debugging purposes.
   * @since 1.6.0
   */
  public  void explain () { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} where each record has been mapped on to the specified type.  The
   * method used to map columns depend on the type of <code>U</code>:
   *  - When <code>U</code> is a class, fields for the class will be mapped to columns of the same name
   *    (case sensitivity is determined by <code>spark.sql.caseSensitive</code>)
   *  - When <code>U</code> is a tuple, the columns will be be mapped by ordinal (i.e. the first column will
   *    be assigned to <code>_1</code>).
   *  - When <code>U</code> is a primitive type (i.e. String, Int, etc). then the first column of the
   *    {@link DataFrame} will be used.
   * <p>
   * If the schema of the {@link DataFrame} does not match the desired <code>U</code> type, you can use <code>select</code>
   * along with <code>alias</code> or <code>as</code> to rearrange or rename as required.
   * @since 1.6.0
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> as (org.apache.spark.sql.Encoder<U> evidence$1) { throw new RuntimeException(); }
  /**
   * Applies a logical alias to this {@link Dataset} that can be used to disambiguate columns that have
   * the same name after two Datasets have been joined.
   * @since 1.6.0
   * @param alias (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> as (java.lang.String alias) { throw new RuntimeException(); }
  /**
   * Converts this strongly typed collection of data to generic Dataframe.  In contrast to the
   * strongly typed objects that Dataset operations work on, a Dataframe returns generic {@link Row}
   * objects that allow fields to be accessed by ordinal or name.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrame toDF () { throw new RuntimeException(); }
  /**
   * Returns this {@link Dataset}.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> toDS () { throw new RuntimeException(); }
  /**
   * Converts this {@link Dataset} to an {@link RDD}.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> rdd () { throw new RuntimeException(); }
  /**
   * Returns the number of elements in the {@link Dataset}.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  long count () { throw new RuntimeException(); }
  /**
   * Displays the content of this {@link Dataset} in a tabular form. Strings more than 20 characters
   * will be truncated, and all cells will be aligned right. For example:
   * <pre><code>
   *   year  month AVG('Adj Close) MAX('Adj Close)
   *   1980  12    0.503218        0.595103
   *   1981  01    0.523289        0.570307
   *   1982  02    0.436504        0.475256
   *   1983  03    0.410516        0.442194
   *   1984  04    0.450090        0.483521
   * </code></pre>
   * @param numRows Number of rows to show
   * <p>
   * @since 1.6.0
   */
  public  void show (int numRows) { throw new RuntimeException(); }
  /**
   * Displays the top 20 rows of {@link Dataset} in a tabular form. Strings more than 20 characters
   * will be truncated, and all cells will be aligned right.
   * <p>
   * @since 1.6.0
   */
  public  void show () { throw new RuntimeException(); }
  /**
   * Displays the top 20 rows of {@link Dataset} in a tabular form.
   * <p>
   * @param truncate Whether truncate long strings. If true, strings more than 20 characters will
   *              be truncated and all cells will be aligned right
   * <p>
   * @since 1.6.0
   */
  public  void show (boolean truncate) { throw new RuntimeException(); }
  /**
   * Displays the {@link Dataset} in a tabular form. For example:
   * <pre><code>
   *   year  month AVG('Adj Close) MAX('Adj Close)
   *   1980  12    0.503218        0.595103
   *   1981  01    0.523289        0.570307
   *   1982  02    0.436504        0.475256
   *   1983  03    0.410516        0.442194
   *   1984  04    0.450090        0.483521
   * </code></pre>
   * @param numRows Number of rows to show
   * @param truncate Whether truncate long strings. If true, strings more than 20 characters will
   *              be truncated and all cells will be aligned right
   * <p>
   * @since 1.6.0
   */
  public  void show (int numRows, boolean truncate) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} that has exactly <code>numPartitions</code> partitions.
   * @since 1.6.0
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> repartition (int numPartitions) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} that has exactly <code>numPartitions</code> partitions.
   * Similar to coalesce defined on an {@link RDD}, this operation results in a narrow dependency, e.g.
   * if you go from 1000 partitions to 100 partitions, there will not be a shuffle, instead each of
   * the 100 new partitions will claim 10 of the current partitions.
   * @since 1.6.0
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> coalesce (int numPartitions) { throw new RuntimeException(); }
  /**
   * Concise syntax for chaining custom transformations.
   * <pre><code>
   *   def featurize(ds: Dataset[T]) = ...
   *
   *   dataset
   *     .transform(featurize)
   *     .transform(...)
   * </code></pre>
   * @since 1.6.0
   * @param t (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> transform (scala.Function1<org.apache.spark.sql.Dataset<T>, org.apache.spark.sql.Dataset<U>> t) { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Returns a new {@link Dataset} that only contains elements where <code>func</code> returns <code>true</code>.
   * @since 1.6.0
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> filter (scala.Function1<T, java.lang.Object> func) { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Returns a new {@link Dataset} that only contains elements where <code>func</code> returns <code>true</code>.
   * @since 1.6.0
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> filter (org.apache.spark.api.java.function.FilterFunction<T> func) { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Returns a new {@link Dataset} that contains the result of applying <code>func</code> to each element.
   * @since 1.6.0
   * @param func (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> map (scala.Function1<T, U> func, org.apache.spark.sql.Encoder<U> evidence$2) { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Returns a new {@link Dataset} that contains the result of applying <code>func</code> to each element.
   * @since 1.6.0
   * @param func (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> map (org.apache.spark.api.java.function.MapFunction<T, U> func, org.apache.spark.sql.Encoder<U> encoder) { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Returns a new {@link Dataset} that contains the result of applying <code>func</code> to each partition.
   * @since 1.6.0
   * @param func (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> func, org.apache.spark.sql.Encoder<U> evidence$3) { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Returns a new {@link Dataset} that contains the result of applying <code>func</code> to each partition.
   * @since 1.6.0
   * @param f (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> mapPartitions (org.apache.spark.api.java.function.MapPartitionsFunction<T, U> f, org.apache.spark.sql.Encoder<U> encoder) { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Returns a new {@link Dataset} by first applying a function to all elements of this {@link Dataset},
   * and then flattening the results.
   * @since 1.6.0
   * @param func (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> flatMap (scala.Function1<T, scala.collection.TraversableOnce<U>> func, org.apache.spark.sql.Encoder<U> evidence$4) { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Returns a new {@link Dataset} by first applying a function to all elements of this {@link Dataset},
   * and then flattening the results.
   * @since 1.6.0
   * @param f (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> flatMap (org.apache.spark.api.java.function.FlatMapFunction<T, U> f, org.apache.spark.sql.Encoder<U> encoder) { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Runs <code>func</code> on each element of this {@link Dataset}.
   * @since 1.6.0
   * @param func (undocumented)
   */
  public  void foreach (scala.Function1<T, scala.runtime.BoxedUnit> func) { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Runs <code>func</code> on each element of this {@link Dataset}.
   * @since 1.6.0
   * @param func (undocumented)
   */
  public  void foreach (org.apache.spark.api.java.function.ForeachFunction<T> func) { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Runs <code>func</code> on each partition of this {@link Dataset}.
   * @since 1.6.0
   * @param func (undocumented)
   */
  public  void foreachPartition (scala.Function1<scala.collection.Iterator<T>, scala.runtime.BoxedUnit> func) { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Runs <code>func</code> on each partition of this {@link Dataset}.
   * @since 1.6.0
   * @param func (undocumented)
   */
  public  void foreachPartition (org.apache.spark.api.java.function.ForeachPartitionFunction<T> func) { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Reduces the elements of this {@link Dataset} using the specified binary function. The given <code>func</code>
   * must be commutative and associative or the result may be non-deterministic.
   * @since 1.6.0
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  T reduce (scala.Function2<T, T, T> func) { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Reduces the elements of this Dataset using the specified binary function.  The given <code>func</code>
   * must be commutative and associative or the result may be non-deterministic.
   * @since 1.6.0
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  T reduce (org.apache.spark.api.java.function.ReduceFunction<T> func) { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Returns a {@link GroupedDataset} where the data is grouped by the given key <code>func</code>.
   * @since 1.6.0
   * @param func (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.sql.GroupedDataset<K, T> groupBy (scala.Function1<T, K> func, org.apache.spark.sql.Encoder<K> evidence$5) { throw new RuntimeException(); }
  /**
   * Returns a {@link GroupedDataset} where the data is grouped by the given {@link Column} expressions.
   * @since 1.6.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.GroupedDataset<org.apache.spark.sql.Row, T> groupBy (scala.collection.Seq<org.apache.spark.sql.Column> cols) { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Returns a {@link GroupedDataset} where the data is grouped by the given key <code>func</code>.
   * @since 1.6.0
   * @param func (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.sql.GroupedDataset<K, T> groupBy (org.apache.spark.api.java.function.MapFunction<T, K> func, org.apache.spark.sql.Encoder<K> encoder) { throw new RuntimeException(); }
  /**
   * Returns a new {@link DataFrame} by selecting a set of column based expressions.
   * <pre><code>
   *   df.select($"colA", $"colB" + 1)
   * </code></pre>
   * @since 1.6.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.DataFrame select (scala.collection.Seq<org.apache.spark.sql.Column> cols) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by computing the given {@link Column} expression for each element.
   * <p>
   * <pre><code>
   *   val ds = Seq(1, 2, 3).toDS()
   *   val newDS = ds.select(expr("value + 1").as[Int])
   * </code></pre>
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object> org.apache.spark.sql.Dataset<U1> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.Encoder<U1> evidence$6) { throw new RuntimeException(); }
  /**
   * Internal helper function for building typed selects that return tuples.  For simplicity and
   * code reuse, we do this without the help of the type system and then use helper functions
   * that cast appropriately for the user facing interface.
   * @param columns (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.Dataset<?> selectUntyped (scala.collection.Seq<org.apache.spark.sql.TypedColumn<?, ?>> columns) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by computing the given {@link Column} expressions for each element.
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple2<U1, U2>> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.TypedColumn<T, U2> c2) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by computing the given {@link Column} expressions for each element.
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @param c3 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object, U3 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple3<U1, U2, U3>> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.TypedColumn<T, U2> c2, org.apache.spark.sql.TypedColumn<T, U3> c3) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by computing the given {@link Column} expressions for each element.
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @param c3 (undocumented)
   * @param c4 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object, U3 extends java.lang.Object, U4 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple4<U1, U2, U3, U4>> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.TypedColumn<T, U2> c2, org.apache.spark.sql.TypedColumn<T, U3> c3, org.apache.spark.sql.TypedColumn<T, U4> c4) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by computing the given {@link Column} expressions for each element.
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @param c3 (undocumented)
   * @param c4 (undocumented)
   * @param c5 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object, U3 extends java.lang.Object, U4 extends java.lang.Object, U5 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple5<U1, U2, U3, U4, U5>> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.TypedColumn<T, U2> c2, org.apache.spark.sql.TypedColumn<T, U3> c3, org.apache.spark.sql.TypedColumn<T, U4> c4, org.apache.spark.sql.TypedColumn<T, U5> c5) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by sampling a fraction of records.
   * @since 1.6.0
   * @param withReplacement (undocumented)
   * @param fraction (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sample (boolean withReplacement, double fraction, long seed) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by sampling a fraction of records, using a random seed.
   * @since 1.6.0
   * @param withReplacement (undocumented)
   * @param fraction (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sample (boolean withReplacement, double fraction) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} that contains only the unique elements of this {@link Dataset}.
   * <p>
   * Note that, equality checking is performed directly on the encoded representation of the data
   * and thus is not affected by a custom <code>equals</code> function defined on <code>T</code>.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> distinct () { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} that contains only the elements of this {@link Dataset} that are also
   * present in <code>other</code>.
   * <p>
   * Note that, equality checking is performed directly on the encoded representation of the data
   * and thus is not affected by a custom <code>equals</code> function defined on <code>T</code>.
   * @since 1.6.0
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> intersect (org.apache.spark.sql.Dataset<T> other) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} that contains the elements of both this and the <code>other</code> {@link Dataset}
   * combined.
   * <p>
   * Note that, this function is not a typical set union operation, in that it does not eliminate
   * duplicate items.  As such, it is analogous to <code>UNION ALL</code> in SQL.
   * @since 1.6.0
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> union (org.apache.spark.sql.Dataset<T> other) { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} where any elements present in <code>other</code> have been removed.
   * <p>
   * Note that, equality checking is performed directly on the encoded representation of the data
   * and thus is not affected by a custom <code>equals</code> function defined on <code>T</code>.
   * @since 1.6.0
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> subtract (org.apache.spark.sql.Dataset<T> other) { throw new RuntimeException(); }
  /**
   * Joins this {@link Dataset} returning a {@link Tuple2} for each pair where <code>condition</code> evaluates to
   * true.
   * <p>
   * This is similar to the relation <code>join</code> function with one important difference in the
   * result schema. Since <code>joinWith</code> preserves objects present on either side of the join, the
   * result schema is similarly nested into a tuple under the column names <code>_1</code> and <code>_2</code>.
   * <p>
   * This type of join can be useful both for preserving type-safety with the original object
   * types as well as working with relational data where either side of the join has column
   * names in common.
   * <p>
   * @param other Right side of the join.
   * @param condition Join expression.
   * @param joinType One of: <code>inner</code>, <code>outer</code>, <code>left_outer</code>, <code>right_outer</code>, <code>leftsemi</code>.
   * @since 1.6.0
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple2<T, U>> joinWith (org.apache.spark.sql.Dataset<U> other, org.apache.spark.sql.Column condition, java.lang.String joinType) { throw new RuntimeException(); }
  /**
   * Using inner equi-join to join this {@link Dataset} returning a {@link Tuple2} for each pair
   * where <code>condition</code> evaluates to true.
   * <p>
   * @param other Right side of the join.
   * @param condition Join expression.
   * @since 1.6.0
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple2<T, U>> joinWith (org.apache.spark.sql.Dataset<U> other, org.apache.spark.sql.Column condition) { throw new RuntimeException(); }
  /**
   * Returns the first element in this {@link Dataset}.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  T first () { throw new RuntimeException(); }
  /**
   * Returns an array that contains all the elements in this {@link Dataset}.
   * <p>
   * Running collect requires moving all the data into the application's driver process, and
   * doing so on a very large {@link Dataset} can crash the driver process with OutOfMemoryError.
   * <p>
   * For Java API, use {@link collectAsList}.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  java.lang.Object collect () { throw new RuntimeException(); }
  /**
   * Returns an array that contains all the elements in this {@link Dataset}.
   * <p>
   * Running collect requires moving all the data into the application's driver process, and
   * doing so on a very large {@link Dataset} can crash the driver process with OutOfMemoryError.
   * <p>
   * For Java API, use {@link collectAsList}.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  java.util.List<T> collectAsList () { throw new RuntimeException(); }
  /**
   * Returns the first <code>num</code> elements of this {@link Dataset} as an array.
   * <p>
   * Running take requires moving data into the application's driver process, and doing so with
   * a very large <code>num</code> can crash the driver process with OutOfMemoryError.
   * @since 1.6.0
   * @param num (undocumented)
   * @return (undocumented)
   */
  public  java.lang.Object take (int num) { throw new RuntimeException(); }
  /**
   * Returns the first <code>num</code> elements of this {@link Dataset} as an array.
   * <p>
   * Running take requires moving data into the application's driver process, and doing so with
   * a very large <code>num</code> can crash the driver process with OutOfMemoryError.
   * @since 1.6.0
   * @param num (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<T> takeAsList (int num) { throw new RuntimeException(); }
  /**
   * Persist this {@link Dataset} with the default storage level (<code>MEMORY_AND_DISK</code>).
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> persist () { throw new RuntimeException(); }
  /**
   * Persist this {@link Dataset} with the default storage level (<code>MEMORY_AND_DISK</code>).
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> cache () { throw new RuntimeException(); }
  /**
   * Persist this {@link Dataset} with the given storage level.
   * @param newLevel One of: <code>MEMORY_ONLY</code>, <code>MEMORY_AND_DISK</code>, <code>MEMORY_ONLY_SER</code>,
   *                 <code>MEMORY_AND_DISK_SER</code>, <code>DISK_ONLY</code>, <code>MEMORY_ONLY_2</code>,
   *                 <code>MEMORY_AND_DISK_2</code>, etc.
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> persist (org.apache.spark.storage.StorageLevel newLevel) { throw new RuntimeException(); }
  /**
   * Mark the {@link Dataset} as non-persistent, and remove all blocks for it from memory and disk.
   * @param blocking Whether to block until all blocks are deleted.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> unpersist (boolean blocking) { throw new RuntimeException(); }
  /**
   * Mark the {@link Dataset} as non-persistent, and remove all blocks for it from memory and disk.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> unpersist () { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan () { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<T> withPlan (scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> f) { throw new RuntimeException(); }
   <R extends java.lang.Object> org.apache.spark.sql.Dataset<R> withPlan (org.apache.spark.sql.Dataset<?> other, scala.Function2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> f, org.apache.spark.sql.Encoder<R> evidence$7) { throw new RuntimeException(); }
}

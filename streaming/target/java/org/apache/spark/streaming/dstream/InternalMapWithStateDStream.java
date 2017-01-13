package org.apache.spark.streaming.dstream;
/**
 * A DStream that allows per-key state to be maintains, and arbitrary records to be generated
 * based on updates to the state. This is the main DStream that implements the <code>mapWithState</code>
 * operation on DStreams.
 * <p>
 * param:  parent Parent (key, value) stream that is the source
 * param:  spec Specifications of the mapWithState operation
 * @tparam K   Key type
 * @tparam V   Value type
 * @tparam S   Type of the state maintained
 * @tparam E   Type of the mapped data
 */
  class InternalMapWithStateDStream<K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E>> {
  static private  int DEFAULT_CHECKPOINT_DURATION_MULTIPLIER () { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   InternalMapWithStateDStream (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> parent, org.apache.spark.streaming.StateSpecImpl<K, V, S, E> spec, scala.reflect.ClassTag<K> evidence$6, scala.reflect.ClassTag<V> evidence$7, scala.reflect.ClassTag<S> evidence$8, scala.reflect.ClassTag<E> evidence$9) { throw new RuntimeException(); }
  private  org.apache.spark.Partitioner partitioner () { throw new RuntimeException(); }
  private  scala.Function4<org.apache.spark.streaming.Time, K, scala.Option<V>, org.apache.spark.streaming.State<S>, scala.Option<E>> mappingFunction () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies () { throw new RuntimeException(); }
  /** Enable automatic checkpointing */
  public  boolean mustCheckpoint () { throw new RuntimeException(); }
  /** Override the default checkpoint duration */
  public  void initialize (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /** Method that generates a RDD for the given time */
  public  scala.Option<org.apache.spark.rdd.RDD<org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E>>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
}

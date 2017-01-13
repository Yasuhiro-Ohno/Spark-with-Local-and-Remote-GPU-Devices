package org.apache.spark.sql.execution.local;
/**
 * A local physical operator, in the form of an iterator.
 * <p>
 * Before consuming the iterator, open function must be called.
 * After consuming the iterator, close function must be called.
 */
public abstract class LocalNode extends org.apache.spark.sql.catalyst.plans.QueryPlan<org.apache.spark.sql.execution.local.LocalNode> implements org.apache.spark.Logging {
  public   LocalNode (org.apache.spark.sql.SQLConf conf) { throw new RuntimeException(); }
  private  boolean isTesting () { throw new RuntimeException(); }
  /**
   * Called before open(). Prepare can be used to reserve memory needed. It must NOT consume
   * any input data.
   * <p>
   * Implementations of this must also call the <code>prepare()</code> function of its children.
   */
  public  void prepare () { throw new RuntimeException(); }
  /**
   * Initializes the iterator state. Must be called before calling <code>next()</code>.
   * <p>
   * Implementations of this must also call the <code>open()</code> function of its children.
   */
  public abstract  void open () ;
  /**
   * Advances the iterator to the next tuple. Returns true if there is at least one more tuple.
   * @return (undocumented)
   */
  public abstract  boolean next () ;
  /**
   * Returns the current tuple.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.InternalRow fetch () ;
  /**
   * Closes the iterator and releases all resources. It should be idempotent.
   * <p>
   * Implementations of this must also call the <code>close()</code> function of its children.
   */
  public abstract  void close () ;
  /** Specifies whether this operator outputs UnsafeRows */
  public  boolean outputsUnsafeRows () { throw new RuntimeException(); }
  /** Specifies whether this operator is capable of processing UnsafeRows */
  public  boolean canProcessUnsafeRows () { throw new RuntimeException(); }
  /**
   * Specifies whether this operator is capable of processing Java-object-based Rows (i.e. rows
   * that are not UnsafeRows).
   * @return (undocumented)
   */
  public  boolean canProcessSafeRows () { throw new RuntimeException(); }
  /**
   * Returns the content through the {@link Iterator} interface.
   * @return (undocumented)
   */
  public final  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> asIterator () { throw new RuntimeException(); }
  /**
   * Returns the content of the iterator from the beginning to the end in the form of a Scala Seq.
   * @return (undocumented)
   */
  public final  scala.collection.Seq<org.apache.spark.sql.Row> collect () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Projection newProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  protected  scala.Function0<org.apache.spark.sql.catalyst.expressions.MutableProjection> newMutableProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object> newPredicate (org.apache.spark.sql.catalyst.expressions.Expression expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
}

package org.apache.spark.sql.expressions;
/**
 * A base class for user-defined aggregations, which can be used in {@link DataFrame} and {@link Dataset}
 * operations to take all of the elements of a group and reduce them to a single value.
 * <p>
 * For example, the following aggregator extracts an <code>int</code> from a specific class and adds them up:
 * <pre><code>
 *   case class Data(i: Int)
 *
 *   val customSummer =  new Aggregator[Data, Int, Int] {
 *     def zero: Int = 0
 *     def reduce(b: Int, a: Data): Int = b + a.i
 *     def merge(b1: Int, b2: Int): Int = b1 + b2
 *     def finish(r: Int): Int = r
 *   }.toColumn()
 *
 *   val ds: Dataset[Data] = ...
 *   val aggregated = ds.select(customSummer)
 * </code></pre>
 * <p>
 * Based loosely on Aggregator from Algebird: https://github.com/twitter/algebird
 * <p>
 * @tparam I The input type for the aggregation.
 * @tparam B The type of the intermediate value of the reduction.
 * @tparam O The type of the final output result.
 * <p>
 * @since 1.6.0
 */
public abstract class Aggregator<I extends java.lang.Object, B extends java.lang.Object, O extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   Aggregator () { throw new RuntimeException(); }
  /**
   * A zero value for this aggregation. Should satisfy the property that any b + zero = b.
   * @since 1.6.0
   * @return (undocumented)
   */
  public abstract  B zero () ;
  /**
   * Combine two values to produce a new value.  For performance, the function may modify <code>b</code> and
   * return it instead of constructing new object for b.
   * @since 1.6.0
   * @param b (undocumented)
   * @param a (undocumented)
   * @return (undocumented)
   */
  public abstract  B reduce (B b, I a) ;
  /**
   * Merge two intermediate values.
   * @since 1.6.0
   * @param b1 (undocumented)
   * @param b2 (undocumented)
   * @return (undocumented)
   */
  public abstract  B merge (B b1, B b2) ;
  /**
   * Transform the output of the reduction.
   * @since 1.6.0
   * @param reduction (undocumented)
   * @return (undocumented)
   */
  public abstract  O finish (B reduction) ;
  /**
   * Returns this <code>Aggregator</code> as a {@link TypedColumn} that can be used in {@link Dataset} or {@link DataFrame}
   * operations.
   * @since 1.6.0
   * @param bEncoder (undocumented)
   * @param cEncoder (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.TypedColumn<I, O> toColumn (org.apache.spark.sql.Encoder<B> bEncoder, org.apache.spark.sql.Encoder<O> cEncoder) { throw new RuntimeException(); }
}

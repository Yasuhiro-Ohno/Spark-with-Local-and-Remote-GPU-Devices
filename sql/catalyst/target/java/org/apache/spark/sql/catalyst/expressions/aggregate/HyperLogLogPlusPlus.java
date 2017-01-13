package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * HyperLogLog++ (HLL++) is a state of the art cardinality estimation algorithm. This class
 * implements the dense version of the HLL++ algorithm as an Aggregate Function.
 * <p>
 * This implementation has been based on the following papers:
 * HyperLogLog: the analysis of a near-optimal cardinality estimation algorithm
 * http://algo.inria.fr/flajolet/Publications/FlFuGaMe07.pdf
 * <p>
 * HyperLogLog in Practice: Algorithmic Engineering of a State of The Art Cardinality Estimation
 * Algorithm
 * http://static.googleusercontent.com/external_content/untrusted_dlcp/research.google.com/en/us/pubs/archive/40671.pdf
 * <p>
 * Appendix to HyperLogLog in Practice: Algorithmic Engineering of a State of the Art Cardinality
 * Estimation Algorithm
 * https://docs.google.com/document/d/1gyjfMHy43U9OWBXxfaeG-3MjGzejW1dlpyMwEYAAWEI/view?fullscreen#
 * <p>
 * param:  child to estimate the cardinality of.
 * param:  relativeSD the maximum estimation error allowed.
 */
public  class HyperLogLogPlusPlus extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate implements scala.Product, scala.Serializable {
  /**
   * The size of a word used for storing registers: 64 Bits.
   * @return (undocumented)
   */
  static public  int WORD_SIZE () { throw new RuntimeException(); }
  /**
   * The number of bits that is required per register.
   * <p>
   * This number is determined by the maximum number of leading binary zeros a hashcode can
   * produce. This is equal to the number of bits the hashcode returns. The current
   * implementation uses a 64-bit hashcode, this means 6-bits are (at most) needed to store the
   * number of leading zeros.
   * @return (undocumented)
   */
  static public  int REGISTER_SIZE () { throw new RuntimeException(); }
  /**
   * Value used to mask a register stored in a word.
   * @return (undocumented)
   */
  static public  long REGISTER_WORD_MASK () { throw new RuntimeException(); }
  /**
   * The number of registers which can be stored in one word.
   * @return (undocumented)
   */
  static public  int REGISTERS_PER_WORD () { throw new RuntimeException(); }
  /**
   * Number of points used for interpolating the bias value.
   * @return (undocumented)
   */
  static public  int K () { throw new RuntimeException(); }
  /**
   * Thresholds which decide if the linear counting or the regular algorithm is used.
   * @return (undocumented)
   */
  static public  double[] THRESHOLDS () { throw new RuntimeException(); }
  /**
   * Lookup table used to find the (index of the) bias correction for a given precision (exact)
   * and estimate (nearest).
   * @return (undocumented)
   */
  static public  double[][] RAW_ESTIMATE_DATA () { throw new RuntimeException(); }
  /**
   * Bias corrections given a precision and the index of the raw estimate table.
   * @return (undocumented)
   */
  static public  double[][] BIAS_DATA () { throw new RuntimeException(); }
  static private  double validateDoubleLiteral (org.apache.spark.sql.catalyst.expressions.Expression exp) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  double relativeSD () { throw new RuntimeException(); }
  public  int mutableAggBufferOffset () { throw new RuntimeException(); }
  public  int inputAggBufferOffset () { throw new RuntimeException(); }
  // not preceding
  public   HyperLogLogPlusPlus (org.apache.spark.sql.catalyst.expressions.Expression child, double relativeSD, int mutableAggBufferOffset, int inputAggBufferOffset) { throw new RuntimeException(); }
  public   HyperLogLogPlusPlus (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public   HyperLogLogPlusPlus (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression relativeSD) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset) { throw new RuntimeException(); }
  /**
   * The number of words used to store the registers. We use Longs for storage because this is the
   * most compact way of storage; Spark aligns to 8-byte words or uses Long wrappers.
   * <p>
   * We only store whole registers per word in order to prevent overly complex bitwise operations.
   * In practice this means we only use 60 out of 64 bits.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType aggBufferSchema () { throw new RuntimeException(); }
  /** Allocate enough words to store all registers. */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes () { throw new RuntimeException(); }
  /** Fill all words with zeros. */
  public  void initialize (org.apache.spark.sql.catalyst.expressions.MutableRow buffer) { throw new RuntimeException(); }
  /**
   * Update the HLL++ buffer.
   * <p>
   * Variable names in the HLL++ paper match variable names in the code.
   * @param buffer (undocumented)
   * @param input (undocumented)
   */
  public  void update (org.apache.spark.sql.catalyst.expressions.MutableRow buffer, org.apache.spark.sql.catalyst.InternalRow input) { throw new RuntimeException(); }
  /**
   * Merge the HLL buffers by iterating through the registers in both buffers and select the
   * maximum number of leading zeros for each register.
   * @param buffer1 (undocumented)
   * @param buffer2 (undocumented)
   */
  public  void merge (org.apache.spark.sql.catalyst.expressions.MutableRow buffer1, org.apache.spark.sql.catalyst.InternalRow buffer2) { throw new RuntimeException(); }
  /**
   * Estimate the bias using the raw estimates with their respective biases from the HLL++
   * appendix. We currently use KNN interpolation to determine the bias (as suggested in the
   * paper).
   * @param e (undocumented)
   * @return (undocumented)
   */
  public  double estimateBias (double e) { throw new RuntimeException(); }
  /**
   * Compute the HyperLogLog estimate.
   * <p>
   * Variable names in the HLL++ paper match variable names in the code.
   * @param buffer (undocumented)
   * @return (undocumented)
   */
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow buffer) { throw new RuntimeException(); }
  /**
   * The <code>rsd</code> of HLL++ is always equal to or better than the <code>rsd</code> requested.
   * This method returns the <code>rsd</code> this instance actually guarantees.
   * <p>
   * @return the actual <code>rsd</code>.
   */
  public  double trueRsd () { throw new RuntimeException(); }
}

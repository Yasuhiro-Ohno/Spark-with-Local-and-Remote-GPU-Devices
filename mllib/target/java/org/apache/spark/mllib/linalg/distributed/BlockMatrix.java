package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents a distributed matrix in blocks of local matrices.
 * <p>
 * param:  blocks The RDD of sub-matrix blocks ((blockRowIndex, blockColIndex), sub-matrix) that
 *               form this distributed matrix. If multiple blocks with the same index exist, the
 *               results for operations like add and multiply will be unpredictable.
 * param:  rowsPerBlock Number of rows that make up each block. The blocks forming the final
 *                     rows are not required to have the given number of rows
 * param:  colsPerBlock Number of columns that make up each block. The blocks forming the final
 *                     columns are not required to have the given number of columns
 * param:  nRows Number of rows of this matrix. If the supplied value is less than or equal to zero,
 *              the number of rows will be calculated when <code>numRows</code> is invoked.
 * param:  nCols Number of columns of this matrix. If the supplied value is less than or equal to
 *              zero, the number of columns will be calculated when <code>numCols</code> is invoked.
 */
public  class BlockMatrix implements org.apache.spark.mllib.linalg.distributed.DistributedMatrix, org.apache.spark.Logging {
  public  org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.mllib.linalg.Matrix>> blocks () { throw new RuntimeException(); }
  public  int rowsPerBlock () { throw new RuntimeException(); }
  public  int colsPerBlock () { throw new RuntimeException(); }
  private  long nRows () { throw new RuntimeException(); }
  private  long nCols () { throw new RuntimeException(); }
  // not preceding
  public   BlockMatrix (org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.mllib.linalg.Matrix>> blocks, int rowsPerBlock, int colsPerBlock, long nRows, long nCols) { throw new RuntimeException(); }
  /**
   * Alternate constructor for BlockMatrix without the input of the number of rows and columns.
   * <p>
   * @param blocks The RDD of sub-matrix blocks ((blockRowIndex, blockColIndex), sub-matrix) that
   *               form this distributed matrix. If multiple blocks with the same index exist, the
   *               results for operations like add and multiply will be unpredictable.
   * @param rowsPerBlock Number of rows that make up each block. The blocks forming the final
   *                     rows are not required to have the given number of rows
   * @param colsPerBlock Number of columns that make up each block. The blocks forming the final
   *                     columns are not required to have the given number of columns
   */
  public   BlockMatrix (org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.mllib.linalg.Matrix>> blocks, int rowsPerBlock, int colsPerBlock) { throw new RuntimeException(); }
  public  long numRows () { throw new RuntimeException(); }
  public  long numCols () { throw new RuntimeException(); }
  public  int numRowBlocks () { throw new RuntimeException(); }
  public  int numColBlocks () { throw new RuntimeException(); }
    org.apache.spark.mllib.linalg.distributed.GridPartitioner createPartitioner () { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.Tuple2<java.lang.Object, java.lang.Object>>> blockInfo () { throw new RuntimeException(); }
  /** Estimates the dimensions of the matrix. */
  private  void estimateDim () { throw new RuntimeException(); }
  /**
   * Validates the block matrix info against the matrix data (<code>blocks</code>) and throws an exception if
   * any error is found.
   */
  public  void validate () { throw new RuntimeException(); }
  /** Caches the underlying RDD. */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix cache () { throw new RuntimeException(); }
  /** Persists the underlying RDD with the specified storage level. */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix persist (org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /** Converts to CoordinateMatrix. */
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix toCoordinateMatrix () { throw new RuntimeException(); }
  /** Converts to IndexedRowMatrix. The number of columns must be within the integer range. */
  public  org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix toIndexedRowMatrix () { throw new RuntimeException(); }
  /** Collect the distributed matrix on the driver as a `DenseMatrix`. */
  public  org.apache.spark.mllib.linalg.Matrix toLocalMatrix () { throw new RuntimeException(); }
  /**
   * Transpose this <code>BlockMatrix</code>. Returns a new <code>BlockMatrix</code> instance sharing the
   * same underlying data. Is a lazy operation.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix transpose () { throw new RuntimeException(); }
  /** Collects data and assembles a local dense breeze matrix (for test only). */
    breeze.linalg.DenseMatrix<java.lang.Object> toBreeze () { throw new RuntimeException(); }
  /**
   * Adds two block matrices together. The matrices must have the same size and matching
   * <code>rowsPerBlock</code> and <code>colsPerBlock</code> values. If one of the blocks that are being added are
   * instances of {@link SparseMatrix}, the resulting sub matrix will also be a {@link SparseMatrix}, even
   * if it is being added to a {@link DenseMatrix}. If two dense matrices are added, the output will
   * also be a {@link DenseMatrix}.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix add (org.apache.spark.mllib.linalg.distributed.BlockMatrix other) { throw new RuntimeException(); }
  /**
   * Simulate the multiplication with just block indices in order to cut costs on communication,
   * when we are actually shuffling the matrices.
   * The <code>colsPerBlock</code> of this matrix must equal the <code>rowsPerBlock</code> of <code>other</code>.
   * Exposed for tests.
   * <p>
   * @param other The BlockMatrix to multiply
   * @param partitioner The partitioner that will be used for the resulting matrix <code>C = A * B</code>
   * @return A tuple of {@link BlockDestinations}. The first element is the Map of the set of partitions
   *         that we need to shuffle each blocks of <code>this</code>, and the second element is the Map for
   *         <code>other</code>.
   */
    scala.Tuple2<scala.collection.immutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.collection.immutable.Set<java.lang.Object>>, scala.collection.immutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.collection.immutable.Set<java.lang.Object>>> simulateMultiply (org.apache.spark.mllib.linalg.distributed.BlockMatrix other, org.apache.spark.mllib.linalg.distributed.GridPartitioner partitioner) { throw new RuntimeException(); }
  /**
   * Left multiplies this {@link BlockMatrix} to <code>other</code>, another {@link BlockMatrix}. The <code>colsPerBlock</code>
   * of this matrix must equal the <code>rowsPerBlock</code> of <code>other</code>. If <code>other</code> contains
   * {@link SparseMatrix}, they will have to be converted to a {@link DenseMatrix}. The output
   * {@link BlockMatrix} will only consist of blocks of {@link DenseMatrix}. This may cause
   * some performance issues until support for multiplying two sparse matrices is added.
   * <p>
   * Note: The behavior of multiply has changed in 1.6.0. <code>multiply</code> used to throw an error when
   * there were blocks with duplicate indices. Now, the blocks with duplicate indices will be added
   * with each other.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix multiply (org.apache.spark.mllib.linalg.distributed.BlockMatrix other) { throw new RuntimeException(); }
}

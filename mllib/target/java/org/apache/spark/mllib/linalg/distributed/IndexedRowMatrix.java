package org.apache.spark.mllib.linalg.distributed;
public  class IndexedRowMatrix implements org.apache.spark.mllib.linalg.distributed.DistributedMatrix {
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.IndexedRow> rows () { throw new RuntimeException(); }
  private  long nRows () { throw new RuntimeException(); }
  private  int nCols () { throw new RuntimeException(); }
  public   IndexedRowMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.IndexedRow> rows, long nRows, int nCols) { throw new RuntimeException(); }
  public   IndexedRowMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.IndexedRow> rows) { throw new RuntimeException(); }
  public  long numCols () { throw new RuntimeException(); }
  public  long numRows () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix columnSimilarities () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.RowMatrix toRowMatrix () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix toBlockMatrix () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix toBlockMatrix (int rowsPerBlock, int colsPerBlock) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix toCoordinateMatrix () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.SingularValueDecomposition<org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix, org.apache.spark.mllib.linalg.Matrix> computeSVD (int k, boolean computeU, double rCond) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix multiply (org.apache.spark.mllib.linalg.Matrix B) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Matrix computeGramianMatrix () { throw new RuntimeException(); }
    breeze.linalg.DenseMatrix<java.lang.Object> toBreeze () { throw new RuntimeException(); }
}

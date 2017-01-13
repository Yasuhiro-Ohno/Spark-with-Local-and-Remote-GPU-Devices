package org.apache.spark.mllib.linalg.distributed;
public  class CoordinateMatrix implements org.apache.spark.mllib.linalg.distributed.DistributedMatrix {
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.MatrixEntry> entries () { throw new RuntimeException(); }
  private  long nRows () { throw new RuntimeException(); }
  private  long nCols () { throw new RuntimeException(); }
  public   CoordinateMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.MatrixEntry> entries, long nRows, long nCols) { throw new RuntimeException(); }
  public   CoordinateMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.MatrixEntry> entries) { throw new RuntimeException(); }
  public  long numCols () { throw new RuntimeException(); }
  public  long numRows () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix transpose () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix toIndexedRowMatrix () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.RowMatrix toRowMatrix () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix toBlockMatrix () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix toBlockMatrix (int rowsPerBlock, int colsPerBlock) { throw new RuntimeException(); }
  private  void computeSize () { throw new RuntimeException(); }
    breeze.linalg.DenseMatrix<java.lang.Object> toBreeze () { throw new RuntimeException(); }
}

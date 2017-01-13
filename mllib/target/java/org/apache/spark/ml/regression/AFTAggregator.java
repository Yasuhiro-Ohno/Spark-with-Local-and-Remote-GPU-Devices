package org.apache.spark.ml.regression;
public  class AFTAggregator implements scala.Serializable {
  public   AFTAggregator (breeze.linalg.DenseVector<java.lang.Object> parameters, boolean fitIntercept) { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> beta () { throw new RuntimeException(); }
  private  double sigma () { throw new RuntimeException(); }
  private  long totalCnt () { throw new RuntimeException(); }
  private  double lossSum () { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> gradientBetaSum () { throw new RuntimeException(); }
  private  double gradientLogSigmaSum () { throw new RuntimeException(); }
  public  long count () { throw new RuntimeException(); }
  public  double loss () { throw new RuntimeException(); }
  public  breeze.linalg.DenseVector<java.lang.Object> gradient () { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.AFTAggregator add (org.apache.spark.ml.regression.AFTPoint data) { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.AFTAggregator merge (org.apache.spark.ml.regression.AFTAggregator other) { throw new RuntimeException(); }
}

package org.apache.spark.streaming.ui;
/**
 * Spark Web UI tab that shows statistics of a streaming job.
 * This assumes the given SparkContext has enabled its SparkUI.
 */
  class StreamingTab extends org.apache.spark.ui.SparkUITab implements org.apache.spark.Logging {
  static public  org.apache.spark.ui.SparkUI getSparkUI (org.apache.spark.streaming.StreamingContext ssc) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc () { throw new RuntimeException(); }
  // not preceding
  public   StreamingTab (org.apache.spark.streaming.StreamingContext ssc) { throw new RuntimeException(); }
  private  java.lang.String STATIC_RESOURCE_DIR () { throw new RuntimeException(); }
  public  org.apache.spark.ui.SparkUI parent () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.ui.StreamingJobProgressListener listener () { throw new RuntimeException(); }
  public  void attach () { throw new RuntimeException(); }
  public  void detach () { throw new RuntimeException(); }
}

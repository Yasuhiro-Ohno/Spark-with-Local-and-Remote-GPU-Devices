package org.apache.spark.streaming.ui;
  class SparkJobIdWithUIData implements scala.Product, scala.Serializable {
  public  int sparkJobId () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.jobs.UIData.JobUIData> jobUIData () { throw new RuntimeException(); }
  // not preceding
  public   SparkJobIdWithUIData (int sparkJobId, scala.Option<org.apache.spark.ui.jobs.UIData.JobUIData> jobUIData) { throw new RuntimeException(); }
}

package org.apache.spark.mllib.stat.test;
public  class StreamingTest implements org.apache.spark.Logging, scala.Serializable {
  public   StreamingTest () { throw new RuntimeException(); }
  private  int peacePeriod () { throw new RuntimeException(); }
  private  int windowSize () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.stat.test.StreamingTestMethod testMethod () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.StreamingTest setPeacePeriod (int peacePeriod) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.StreamingTest setWindowSize (int windowSize) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.StreamingTest setTestMethod (java.lang.String method) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.StreamingTestResult> registerStream (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.stat.test.StreamingTestResult> registerStream (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.stat.test.BinarySample> data) { throw new RuntimeException(); }
    org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> dropPeacePeriod (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data) { throw new RuntimeException(); }
    org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, org.apache.spark.util.StatCounter>> summarizeByKeyAndWindow (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data) { throw new RuntimeException(); }
    org.apache.spark.streaming.dstream.DStream<scala.Tuple2<org.apache.spark.util.StatCounter, org.apache.spark.util.StatCounter>> pairSummaries (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, org.apache.spark.util.StatCounter>> summarizedData) { throw new RuntimeException(); }
}

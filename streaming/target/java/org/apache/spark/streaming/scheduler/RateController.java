package org.apache.spark.streaming.scheduler;
/**
 * A StreamingListener that receives batch completion updates, and maintains
 * an estimate of the speed at which this stream should ingest messages,
 * given an estimate computation from a <code>RateEstimator</code>
 */
 abstract class RateController implements org.apache.spark.streaming.scheduler.StreamingListener, scala.Serializable {
  static public  boolean isBackPressureEnabled (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  int streamUID () { throw new RuntimeException(); }
  // not preceding
  public   RateController (int streamUID, org.apache.spark.streaming.scheduler.rate.RateEstimator rateEstimator) { throw new RuntimeException(); }
  protected abstract  void publish (long rate) ;
  private  scala.concurrent.ExecutionContext executionContext () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicLong rateLimit () { throw new RuntimeException(); }
  /**
   * An initialization method called both from the constructor and Serialization code.
   */
  private  void init () { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream ois) { throw new RuntimeException(); }
  /**
   * Compute the new rate limit and publish it asynchronously.
   * @param time (undocumented)
   * @param elems (undocumented)
   * @param workDelay (undocumented)
   * @param waitDelay (undocumented)
   */
  private  void computeAndPublish (long time, long elems, long workDelay, long waitDelay) { throw new RuntimeException(); }
  public  long getLatestRate () { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted) { throw new RuntimeException(); }
}

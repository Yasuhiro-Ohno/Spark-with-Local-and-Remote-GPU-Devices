package org.apache.spark.streaming.ui;
  class StreamingJobProgressListener implements org.apache.spark.streaming.scheduler.StreamingListener, org.apache.spark.scheduler.SparkListener {
  public   StreamingJobProgressListener (org.apache.spark.streaming.StreamingContext ssc) { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, org.apache.spark.streaming.ui.BatchUIData> waitingBatchUIData () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, org.apache.spark.streaming.ui.BatchUIData> runningBatchUIData () { throw new RuntimeException(); }
  private  scala.collection.mutable.Queue<org.apache.spark.streaming.ui.BatchUIData> completedBatchUIData () { throw new RuntimeException(); }
  private  int batchUIDataLimit () { throw new RuntimeException(); }
  private  long totalCompletedBatches () { throw new RuntimeException(); }
  private  long totalReceivedRecords () { throw new RuntimeException(); }
  private  long totalProcessedRecords () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.streaming.scheduler.ReceiverInfo> receiverInfos () { throw new RuntimeException(); }
  public  java.util.LinkedHashMap<org.apache.spark.streaming.Time, scala.collection.mutable.SynchronizedBuffer<org.apache.spark.streaming.ui.OutputOpIdAndSparkJobId>> batchTimeToOutputOpIdSparkJobIdPair () { throw new RuntimeException(); }
  public  long batchDuration () { throw new RuntimeException(); }
  public  void onReceiverStarted (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStarted receiverStarted) { throw new RuntimeException(); }
  public  void onReceiverError (org.apache.spark.streaming.scheduler.StreamingListenerReceiverError receiverError) { throw new RuntimeException(); }
  public  void onReceiverStopped (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStopped receiverStopped) { throw new RuntimeException(); }
  public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted) { throw new RuntimeException(); }
  public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted) { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted) { throw new RuntimeException(); }
  public  void onOutputOperationStarted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationStarted outputOperationStarted) { throw new RuntimeException(); }
  public  void onOutputOperationCompleted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationCompleted outputOperationCompleted) { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart) { throw new RuntimeException(); }
  private  scala.Option<scala.Tuple2<org.apache.spark.streaming.Time, java.lang.Object>> getBatchTimeAndOutputOpId (java.util.Properties properties) { throw new RuntimeException(); }
  public  int numReceivers () { throw new RuntimeException(); }
  public  int numActiveReceivers () { throw new RuntimeException(); }
  public  int numInactiveReceivers () { throw new RuntimeException(); }
  public  long numTotalCompletedBatches () { throw new RuntimeException(); }
  public  long numTotalReceivedRecords () { throw new RuntimeException(); }
  public  long numTotalProcessedRecords () { throw new RuntimeException(); }
  public  long numUnprocessedBatches () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> waitingBatches () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> runningBatches () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> retainedCompletedBatches () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> streamName (int streamId) { throw new RuntimeException(); }
  /**
   * Return all InputDStream Ids
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> streamIds () { throw new RuntimeException(); }
  /**
   * Return all of the event rates for each InputDStream in each batch. The key of the return value
   * is the stream id, and the value is a sequence of batch time with its event rate.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>>> receivedEventRateWithBatchTime () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> lastReceivedBatchRecords () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.ReceiverInfo> receiverInfo (int receiverId) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.ui.BatchUIData> lastCompletedBatch () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.ui.BatchUIData> lastReceivedBatch () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> retainedBatches () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.ui.BatchUIData> getBatchUIData (org.apache.spark.streaming.Time batchTime) { throw new RuntimeException(); }
}

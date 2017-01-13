package org.apache.spark.streaming.scheduler.rate;
/**
 * A component that estimates the rate at wich an InputDStream should ingest
 * elements, based on updates at every batch completion.
 */
  interface RateEstimator extends scala.Serializable {
  /**
   * Computes the number of elements the stream attached to this <code>RateEstimator</code>
   * should ingest per second, given an update on the size and completion
   * times of the latest batch.
   * <p>
   * @param time The timetamp of the current batch interval that just finished
   * @param elements The number of elements that were processed in this batch
   * @param processingDelay The time in ms that took for the job to complete
   * @param schedulingDelay The time in ms that the job spent in the scheduling queue
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> compute (long time, long elements, long processingDelay, long schedulingDelay) ;
}

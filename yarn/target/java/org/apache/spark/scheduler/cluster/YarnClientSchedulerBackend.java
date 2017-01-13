package org.apache.spark.scheduler.cluster;
  class YarnClientSchedulerBackend extends org.apache.spark.scheduler.cluster.YarnSchedulerBackend implements org.apache.spark.Logging {
  // not preceding
  public   YarnClientSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.Client client () { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.api.records.ApplicationId appId () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.YarnClientSchedulerBackend.MonitorThread monitorThread () { throw new RuntimeException(); }
  /**
   * Create a Yarn client to submit an application to the ResourceManager.
   * This waits until the application is running.
   */
  public  void start () { throw new RuntimeException(); }
  /**
   * Return any extra command line arguments to be passed to Client provided in the form of
   * environment variables or Spark properties.
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.String> getExtraClientArguments () { throw new RuntimeException(); }
  /**
   * Report the state of the application until it is running.
   * If the application has finished, failed or been killed in the process, throw an exception.
   * This assumes both <code>client</code> and <code>appId</code> have already been set.
   */
  private  void waitForApplication () { throw new RuntimeException(); }
  /**
   * We create this class for SPARK-9519. Basically when we interrupt the monitor thread it's
   * because the SparkContext is being shut down(sc.stop() called by user code), but if
   * monitorApplication return, it means the Yarn application finished before sc.stop() was called,
   * which means we should call sc.stop() here, and we don't allow the monitor to be interrupted
   * before SparkContext stops successfully.
   */
  private  class MonitorThread extends java.lang.Thread {
    public   MonitorThread () { throw new RuntimeException(); }
    private  boolean allowInterrupt () { throw new RuntimeException(); }
    public  void run () { throw new RuntimeException(); }
    public  void stopMonitor () { throw new RuntimeException(); }
  }
  private  org.apache.spark.scheduler.cluster.YarnClientSchedulerBackend.MonitorThread asyncMonitorApplication () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  java.lang.String applicationId () { throw new RuntimeException(); }
}

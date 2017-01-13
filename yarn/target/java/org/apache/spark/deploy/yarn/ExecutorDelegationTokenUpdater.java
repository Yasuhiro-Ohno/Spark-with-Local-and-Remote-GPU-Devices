package org.apache.spark.deploy.yarn;
  class ExecutorDelegationTokenUpdater implements org.apache.spark.Logging {
  public   ExecutorDelegationTokenUpdater (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  private  int lastCredentialsFileSuffix () { throw new RuntimeException(); }
  private  java.lang.String credentialsFile () { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration freshHadoopConf () { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService delegationTokenRenewer () { throw new RuntimeException(); }
  private  java.lang.Object executorUpdaterRunnable () { throw new RuntimeException(); }
  public  void updateCredentialsIfRequired () { throw new RuntimeException(); }
  private  org.apache.hadoop.security.Credentials getCredentialsFromHDFSFile (org.apache.hadoop.fs.FileSystem remoteFs, org.apache.hadoop.fs.Path tokenPath) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}

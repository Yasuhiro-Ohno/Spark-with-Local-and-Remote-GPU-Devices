package org.apache.spark.deploy.yarn;
  class AMDelegationTokenRenewer implements org.apache.spark.Logging {
  public   AMDelegationTokenRenewer (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  private  int lastCredentialsFileSuffix () { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService delegationTokenRenewer () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.YarnSparkHadoopUtil hadoopUtil () { throw new RuntimeException(); }
  private  java.lang.String credentialsFile () { throw new RuntimeException(); }
  private  int daysToKeepFiles () { throw new RuntimeException(); }
  private  int numFilesToKeep () { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration freshHadoopConf () { throw new RuntimeException(); }
  /**
   * Schedule a login from the keytab and principal set using the --principal and --keytab
   * arguments to spark-submit. This login happens only when the credentials of the current user
   * are about to expire. This method reads spark.yarn.principal and spark.yarn.keytab from
   * SparkConf to do the login. This method is a no-op in non-YARN mode.
   * <p>
   */
    void scheduleLoginFromKeytab () { throw new RuntimeException(); }
  private  void cleanupOldFiles () { throw new RuntimeException(); }
  private  void writeNewTokensToHDFS (java.lang.String principal, java.lang.String keytab) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}

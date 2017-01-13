package org.apache.spark.deploy.yarn;
/**
 * Contains util methods to interact with Hadoop from spark.
 */
public  class YarnSparkHadoopUtil extends org.apache.spark.deploy.SparkHadoopUtil {
  static public  double MEMORY_OVERHEAD_FACTOR () { throw new RuntimeException(); }
  static public  int MEMORY_OVERHEAD_MIN () { throw new RuntimeException(); }
  static public  java.lang.String ANY_HOST () { throw new RuntimeException(); }
  static public  int DEFAULT_NUMBER_EXECUTORS () { throw new RuntimeException(); }
  static public  org.apache.hadoop.yarn.api.records.Priority RM_REQUEST_PRIORITY () { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.yarn.YarnSparkHadoopUtil get () { throw new RuntimeException(); }
  /**
   * Add a path variable to the given environment map.
   * If the map already contains this key, append the value to the existing value instead.
   * @param env (undocumented)
   * @param key (undocumented)
   * @param value (undocumented)
   */
  static public  void addPathToEnvironment (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String key, java.lang.String value) { throw new RuntimeException(); }
  /**
   * Set zero or more environment variables specified by the given input string.
   * The input string is expected to take the form "KEY1=VAL1,KEY2=VAL2,KEY3=VAL3".
   * @param env (undocumented)
   * @param inputString (undocumented)
   */
  static public  void setEnvFromInputString (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String inputString) { throw new RuntimeException(); }
  static private  java.lang.String environmentVariableRegex () { throw new RuntimeException(); }
  /**
   * The handler if an OOM Exception is thrown by the JVM must be configured on Windows
   * differently: the 'taskkill' command should be used, whereas Unix-based systems use 'kill'.
   * <p>
   * As the JVM interprets both %p and %%p as the same, we can use either of them. However,
   * some tests on Windows computers suggest, that the JVM only accepts '%%p'.
   * <p>
   * Furthermore, the behavior of the character '%' on the Windows command line differs from
   * the behavior of '%' in a .cmd file: it gets interpreted as an incomplete environment
   * variable. Windows .cmd files escape a '%' by '%%'. Thus, the correct way of writing
   * '%%p' in an escaped way is '%%%%p'.
   * <p>
   * @return The correct OOM Error handler JVM option, platform dependent.
   */
  static public  java.lang.String getOutOfMemoryErrorArgument () { throw new RuntimeException(); }
  /**
   * Escapes a string for inclusion in a command line executed by Yarn. Yarn executes commands
   * using either
   * <p>
   * (Unix-based) <code>bash -c "command arg1 arg2"</code> and that means plain quoting doesn't really work.
   * The argument is enclosed in single quotes and some key characters are escaped.
   * <p>
   * (Windows-based) part of a .cmd file in which case windows escaping for each argument must be
   * applied. Windows is quite lenient, however it is usually Java that causes trouble, needing to
   * distinguish between arguments starting with '-' and class names. If arguments are surrounded
   * by ' java takes the following string as is, hence an argument is mistakenly taken as a class
   * name which happens to start with a '-'. The way to avoid this, is to surround nothing with
   * a ', but instead with a ".
   * <p>
   * @param arg A single argument.
   * @return Argument quoted for execution via Yarn's generated shell script.
   */
  static public  java.lang.String escapeForShell (java.lang.String arg) { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<org.apache.hadoop.yarn.api.records.ApplicationAccessType, java.lang.String> getApplicationAclsForYarn (org.apache.spark.SecurityManager securityMgr) { throw new RuntimeException(); }
  /**
   * Expand environment variable using Yarn API.
   * If environment.$$() is implemented, return the result of it.
   * Otherwise, return the result of environment.$()
   * Note: $$() is added in Hadoop 2.4.
   * @return (undocumented)
   */
  static private  java.lang.reflect.Method expandMethod () { throw new RuntimeException(); }
  static public  java.lang.String expandEnvironment (org.apache.hadoop.yarn.api.ApplicationConstants.Environment environment) { throw new RuntimeException(); }
  /**
   * Get class path separator using Yarn API.
   * If ApplicationConstants.CLASS_PATH_SEPARATOR is implemented, return it.
   * Otherwise, return File.pathSeparator
   * Note: CLASS_PATH_SEPARATOR is added in Hadoop 2.4.
   * @return (undocumented)
   */
  static private  java.lang.reflect.Field classPathSeparatorField () { throw new RuntimeException(); }
  static public  java.lang.String getClassPathSeparator () { throw new RuntimeException(); }
  /**
   * Getting the initial target number of executors depends on whether dynamic allocation is
   * enabled.
   * If not using dynamic allocation it gets the number of executors reqeusted by the user.
   * @param conf (undocumented)
   * @param numExecutors (undocumented)
   * @return (undocumented)
   */
  static public  int getInitialTargetExecutorNumber (org.apache.spark.SparkConf conf, int numExecutors) { throw new RuntimeException(); }
  public   YarnSparkHadoopUtil () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.deploy.yarn.ExecutorDelegationTokenUpdater> tokenRenewer () { throw new RuntimeException(); }
  public  void transferCredentials (org.apache.hadoop.security.UserGroupInformation source, org.apache.hadoop.security.UserGroupInformation dest) { throw new RuntimeException(); }
  public  boolean isYarnMode () { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newConfiguration (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void addCredentials (org.apache.hadoop.mapred.JobConf conf) { throw new RuntimeException(); }
  public  org.apache.hadoop.security.Credentials getCurrentUserCredentials () { throw new RuntimeException(); }
  public  void addCurrentUserCredentials (org.apache.hadoop.security.Credentials creds) { throw new RuntimeException(); }
  public  void addSecretKeyToUserCredentials (java.lang.String key, java.lang.String secret) { throw new RuntimeException(); }
  public  byte[] getSecretKeyFromUserCredentials (java.lang.String key) { throw new RuntimeException(); }
  /**
   * Get the list of namenodes the user may access.
   * @param sparkConf (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Set<org.apache.hadoop.fs.Path> getNameNodesToAccess (org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public  java.lang.String getTokenRenewer (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  /**
   * Obtains tokens for the namenodes passed in and adds them to the credentials.
   * @param paths (undocumented)
   * @param conf (undocumented)
   * @param creds (undocumented)
   * @param renewer (undocumented)
   */
  public  void obtainTokensForNamenodes (scala.collection.immutable.Set<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.security.Credentials creds, scala.Option<java.lang.String> renewer) { throw new RuntimeException(); }
    void startExecutorDelegationTokenRenewer (org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
    void stopExecutorDelegationTokenRenewer () { throw new RuntimeException(); }
    org.apache.hadoop.yarn.api.records.ContainerId getContainerId () { throw new RuntimeException(); }
  /**
   * Obtains token for the Hive metastore, using the current user as the principal.
   * Some exceptions are caught and downgraded to a log message.
   * @param conf hadoop configuration; the Hive configuration will be based on this
   * @return a token, or <code>None</code> if there's no need for a token (no metastore URI or principal
   *         in the config), or if a binding exception was caught and downgraded.
   */
  public  scala.Option<org.apache.hadoop.security.token.Token<org.apache.hadoop.hdfs.security.token.delegation.DelegationTokenIdentifier>> obtainTokenForHiveMetastore (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  /**
   * Inner routine to obtains token for the Hive metastore; exceptions are raised on any problem.
   * @param conf hadoop configuration; the Hive configuration will be based on this.
   * @param username the username of the principal requesting the delegating token.
   * @return a delegation token
   */
    scala.Option<org.apache.hadoop.security.token.Token<org.apache.hadoop.hdfs.security.token.delegation.DelegationTokenIdentifier>> obtainTokenForHiveMetastoreInner (org.apache.hadoop.conf.Configuration conf, java.lang.String username) { throw new RuntimeException(); }
}

package org.apache.spark.deploy.yarn;
// no position
public  class Client$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Client$ MODULE$ = null;
  public   Client$ () { throw new RuntimeException(); }
  public  void main (java.lang.String[] argStrings) { throw new RuntimeException(); }
  public  java.lang.String SPARK_JAR () { throw new RuntimeException(); }
  public  java.lang.String APP_JAR () { throw new RuntimeException(); }
  public  java.lang.String LOCAL_SCHEME () { throw new RuntimeException(); }
  public  java.lang.String SPARK_STAGING () { throw new RuntimeException(); }
  public  java.lang.String CONF_SPARK_JAR () { throw new RuntimeException(); }
  public  java.lang.String ENV_SPARK_JAR () { throw new RuntimeException(); }
  public  java.lang.String CONF_SPARK_USER_JAR () { throw new RuntimeException(); }
  public  java.lang.String CONF_SPARK_YARN_SECONDARY_JARS () { throw new RuntimeException(); }
  public  java.lang.String CONF_SPARK_YARN_APPLICATION_TAGS () { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.permission.FsPermission STAGING_DIR_PERMISSION () { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.permission.FsPermission APP_FILE_PERMISSION () { throw new RuntimeException(); }
  public  java.lang.String ENV_DIST_CLASSPATH () { throw new RuntimeException(); }
  public  java.lang.String LOCALIZED_CONF_DIR () { throw new RuntimeException(); }
  public  java.lang.String SPARK_CONF_FILE () { throw new RuntimeException(); }
  public  java.lang.String LOCALIZED_PYTHON_DIR () { throw new RuntimeException(); }
  /**
   * Find the user-defined Spark jar if configured, or return the jar containing this
   * class if not.
   * <p>
   * This method first looks in the SparkConf object for the CONF_SPARK_JAR key, and in the
   * user environment if that is not found (for backwards compatibility).
   * @param conf (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String sparkJar (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Return the path to the given application's staging directory.
   * @param appId (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String getAppStagingDir (org.apache.hadoop.yarn.api.records.ApplicationId appId) { throw new RuntimeException(); }
  /**
   * Populate the classpath entry in the given environment map with any application
   * classpath specified through the Hadoop and Yarn configurations.
   * @param conf (undocumented)
   * @param env (undocumented)
   */
    void populateHadoopClasspath (org.apache.hadoop.conf.Configuration conf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  private  scala.Option<scala.collection.Seq<java.lang.String>> getYarnAppClasspath (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  private  scala.Option<scala.collection.Seq<java.lang.String>> getMRAppClasspath (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
    scala.Option<scala.collection.Seq<java.lang.String>> getDefaultYarnApplicationClasspath () { throw new RuntimeException(); }
    scala.Option<scala.collection.Seq<java.lang.String>> getDefaultMRApplicationClasspath () { throw new RuntimeException(); }
  /**
   * Populate the classpath entry in the given environment map.
   * <p>
   * User jars are generally not added to the JVM's system classpath; those are handled by the AM
   * and executor backend. When the deprecated <code>spark.yarn.user.classpath.first</code> is used, user jars
   * are included in the system classpath, though. The extra class path and other uploaded files are
   * always made available through the system class path.
   * <p>
   * @param args Client arguments (when starting the AM) or null (when starting executors).
   * @param conf (undocumented)
   * @param sparkConf (undocumented)
   * @param env (undocumented)
   * @param isAM (undocumented)
   * @param extraClassPath (undocumented)
   */
    void populateClasspath (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, boolean isAM, scala.Option<java.lang.String> extraClassPath) { throw new RuntimeException(); }
  /**
   * Returns a list of URIs representing the user classpath.
   * <p>
   * @param conf Spark configuration.
   * @return (undocumented)
   */
  public  java.net.URI[] getUserClasspath (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  scala.Option<java.net.URI> getMainJarUri (scala.Option<java.lang.String> mainJar) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.net.URI> getSecondaryJarUris (scala.Option<java.lang.String> secondaryJars) { throw new RuntimeException(); }
  /**
   * Adds the given path to the classpath, handling "local:" URIs correctly.
   * <p>
   * If an alternate name for the file is given, and it's not a "local:" file, the alternate
   * name will be added to the classpath (relative to the job's work directory).
   * <p>
   * If not a "local:" file and no alternate name, the linkName will be added to the classpath.
   * <p>
   * @param conf        Spark configuration.
   * @param hadoopConf  Hadoop configuration.
   * @param uri         URI to add to classpath (optional).
   * @param fileName    Alternate name for the file (optional).
   * @param env         Map holding the environment variables.
   */
  private  void addFileToClasspath (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, java.net.URI uri, java.lang.String fileName, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Add the given path to the classpath entry of the given environment map.
   * If the classpath is already set, this appends the new path to the existing classpath.
   * @param path (undocumented)
   * @param env (undocumented)
   */
  private  void addClasspathEntry (java.lang.String path, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Returns the path to be sent to the NM for a path that is valid on the gateway.
   * <p>
   * This method uses two configuration values:
   * <p>
   *  - spark.yarn.config.gatewayPath: a string that identifies a portion of the input path that may
   *    only be valid in the gateway node.
   *  - spark.yarn.config.replacementPath: a string with which to replace the gateway path. This may
   *    contain, for example, env variable references, which will be expanded by the NMs when
   *    starting containers.
   * <p>
   * If either config is not available, the input path is returned.
   * @param conf (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getClusterPath (org.apache.spark.SparkConf conf, java.lang.String path) { throw new RuntimeException(); }
  /**
   * Obtains token for the Hive metastore and adds them to the credentials.
   * @param sparkConf (undocumented)
   * @param conf (undocumented)
   * @param credentials (undocumented)
   */
  private  void obtainTokenForHiveMetastore (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.security.Credentials credentials) { throw new RuntimeException(); }
  /**
   * Obtain security token for HBase.
   * @param sparkConf (undocumented)
   * @param conf (undocumented)
   * @param credentials (undocumented)
   */
  public  void obtainTokenForHBase (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.security.Credentials credentials) { throw new RuntimeException(); }
  /**
   * Return whether the two file systems are the same.
   * @param srcFs (undocumented)
   * @param destFs (undocumented)
   * @return (undocumented)
   */
  private  boolean compareFs (org.apache.hadoop.fs.FileSystem srcFs, org.apache.hadoop.fs.FileSystem destFs) { throw new RuntimeException(); }
  /**
   * Given a local URI, resolve it and return a qualified local path that corresponds to the URI.
   * This is used for preparing local resources to be included in the container launch context.
   * @param localURI (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  private  org.apache.hadoop.fs.Path getQualifiedLocalPath (java.net.URI localURI, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  /**
   * Whether to consider jars provided by the user to have precedence over the Spark jars when
   * loading user classes.
   * @param conf (undocumented)
   * @param isDriver (undocumented)
   * @return (undocumented)
   */
  public  boolean isUserClassPathFirst (org.apache.spark.SparkConf conf, boolean isDriver) { throw new RuntimeException(); }
  /**
   * Joins all the path components using Path.SEPARATOR.
   * @param components (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String buildPath (scala.collection.Seq<java.lang.String> components) { throw new RuntimeException(); }
  /**
   * Return whether delegation tokens should be retrieved for the given service when security is
   * enabled. By default, tokens are retrieved, but that behavior can be changed by setting
   * a service-specific configuration.
   * @param conf (undocumented)
   * @param service (undocumented)
   * @return (undocumented)
   */
  public  boolean shouldGetTokens (org.apache.spark.SparkConf conf, java.lang.String service) { throw new RuntimeException(); }
}

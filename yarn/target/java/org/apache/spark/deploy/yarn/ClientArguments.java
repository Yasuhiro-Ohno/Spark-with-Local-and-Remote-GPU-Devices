package org.apache.spark.deploy.yarn;
  class ClientArguments {
  public   ClientArguments (java.lang.String[] args, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public  java.lang.String addJars () { throw new RuntimeException(); }
  public  java.lang.String files () { throw new RuntimeException(); }
  public  java.lang.String archives () { throw new RuntimeException(); }
  public  java.lang.String userJar () { throw new RuntimeException(); }
  public  java.lang.String userClass () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> pyFiles () { throw new RuntimeException(); }
  public  java.lang.String primaryPyFile () { throw new RuntimeException(); }
  public  java.lang.String primaryRFile () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> userArgs () { throw new RuntimeException(); }
  public  int executorMemory () { throw new RuntimeException(); }
  public  int executorCores () { throw new RuntimeException(); }
  public  int numExecutors () { throw new RuntimeException(); }
  public  java.lang.String amQueue () { throw new RuntimeException(); }
  public  int amMemory () { throw new RuntimeException(); }
  public  int amCores () { throw new RuntimeException(); }
  public  java.lang.String appName () { throw new RuntimeException(); }
  public  int priority () { throw new RuntimeException(); }
  public  java.lang.String principal () { throw new RuntimeException(); }
  public  java.lang.String keytab () { throw new RuntimeException(); }
  public  boolean isClusterMode () { throw new RuntimeException(); }
  private  int driverMemory () { throw new RuntimeException(); }
  private  int driverCores () { throw new RuntimeException(); }
  private  java.lang.String driverMemOverheadKey () { throw new RuntimeException(); }
  private  java.lang.String amMemKey () { throw new RuntimeException(); }
  private  java.lang.String amMemOverheadKey () { throw new RuntimeException(); }
  private  java.lang.String driverCoresKey () { throw new RuntimeException(); }
  private  java.lang.String amCoresKey () { throw new RuntimeException(); }
  private  boolean isDynamicAllocationEnabled () { throw new RuntimeException(); }
  public  java.lang.String amMemoryOverheadConf () { throw new RuntimeException(); }
  public  int amMemoryOverhead () { throw new RuntimeException(); }
  public  int executorMemoryOverhead () { throw new RuntimeException(); }
  /** Load any default arguments provided through environment variables and Spark properties. */
  private  void loadEnvironmentArgs () { throw new RuntimeException(); }
  /**
   * Fail fast if any arguments provided are invalid.
   * This is intended to be called only after the provided arguments have been parsed.
   */
  private  void validateArgs () { throw new RuntimeException(); }
  private  void parseArgs (scala.collection.immutable.List<java.lang.String> inputArgs) { throw new RuntimeException(); }
  private  java.lang.String getUsageMessage (scala.collection.immutable.List<java.lang.String> unknownParam) { throw new RuntimeException(); }
}

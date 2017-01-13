package org.apache.spark.sql.hive.test;
/**
 * A locally running test instance of Spark's Hive execution engine.
 * <p>
 * Data from {@link testTables} will be automatically loaded whenever a query is run over those tables.
 * Calling {@link reset} will delete all tables and other state in the database, leaving the database
 * in a "clean" state.
 * <p>
 * TestHive is singleton object version of this class because instantiating multiple copies of the
 * hive metastore seems to lead to weird non-deterministic failures.  Therefore, the execution of
 * test cases that rely on TestHive must be serialized.
 */
public  class TestHiveContext extends org.apache.spark.sql.hive.HiveContext {
  public  class TestTable implements scala.Product, scala.Serializable {
    public  java.lang.String name () { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>> commands () { throw new RuntimeException(); }
    public   TestTable (java.lang.String name, scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>> commands) { throw new RuntimeException(); }
  }
  // no position
  public  class TestTable$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>>, org.apache.spark.sql.hive.test.TestHiveContext.TestTable> implements scala.Serializable {
    public   TestTable$ () { throw new RuntimeException(); }
  }
  /**
   * Override QueryExecution with special debug workflow.
   */
  public  class QueryExecution extends org.apache.spark.sql.hive.HiveContext.QueryExecution {
    public   QueryExecution (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan) { throw new RuntimeException(); }
    public   QueryExecution (java.lang.String sql) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzed () { throw new RuntimeException(); }
  }
  protected  class SqlCmd {
    public   SqlCmd (java.lang.String sql) { throw new RuntimeException(); }
    public  scala.Function0<scala.runtime.BoxedUnit> cmd () { throw new RuntimeException(); }
  }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> overrideConfs () { throw new RuntimeException(); }
  public   TestHiveContext (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  java.io.File warehousePath () { throw new RuntimeException(); }
  public  java.io.File scratchDirPath () { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> temporaryConfig () { throw new RuntimeException(); }
  /** Sets up the system initially or after a RESET command */
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> configure () { throw new RuntimeException(); }
  public  java.io.File testTempDir () { throw new RuntimeException(); }
  /** The location of the compiled hive distribution */
  public  scala.Option<java.io.File> hiveHome () { throw new RuntimeException(); }
  /** The location of the hive source code. */
  public  scala.Option<java.io.File> hiveDevHome () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> runSqlHive (java.lang.String sql) { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.test.TestHiveContext.QueryExecution executePlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.SQLConf conf () { throw new RuntimeException(); }
  /**
   * Returns the value of specified environmental variable as a {@link java.io.File} after checking
   * to ensure it exists
   * @param envVar (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<java.io.File> envVarToFile (java.lang.String envVar) { throw new RuntimeException(); }
  /**
   * Replaces relative paths to the parent directory "../" with hiveDevHome since this is how the
   * hive test cases assume the system is set up.
   * @param cmd (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String rewritePaths (java.lang.String cmd) { throw new RuntimeException(); }
  public  java.io.File hiveFilesTemp () { throw new RuntimeException(); }
  public  java.io.File inRepoTests () { throw new RuntimeException(); }
  public  java.io.File getHiveFile (java.lang.String path) { throw new RuntimeException(); }
  public  scala.util.matching.Regex describedTable () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.sql.hive.test.TestHiveContext.TestTable> testTables () { throw new RuntimeException(); }
  public  void registerTestTable (org.apache.spark.sql.hive.test.TestHiveContext.TestTable testTable) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.test.TestHiveContext.TestTable> hiveQTestUtilTables () { throw new RuntimeException(); }
  /**
   * A map used to store all confs that need to be overridden in sql/hive unit tests.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashSet<java.lang.String> loadedTables () { throw new RuntimeException(); }
  public  boolean cacheTables () { throw new RuntimeException(); }
  public  void loadTestTable (java.lang.String name) { throw new RuntimeException(); }
  protected  java.util.Set<java.lang.String> originalUDFs () { throw new RuntimeException(); }
  public  void reset () { throw new RuntimeException(); }
}

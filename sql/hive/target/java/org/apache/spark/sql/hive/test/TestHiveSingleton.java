package org.apache.spark.sql.hive.test;
public  interface TestHiveSingleton {
  public  org.apache.spark.sql.SQLContext sqlContext () ;
  public  org.apache.spark.sql.hive.test.TestHiveContext hiveContext () ;
}

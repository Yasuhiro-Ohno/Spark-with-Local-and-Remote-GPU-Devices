package org.apache.spark.sql.hive.client;
 abstract class TableType {
  public   TableType () { throw new RuntimeException(); }
  public abstract  java.lang.String name () ;
}

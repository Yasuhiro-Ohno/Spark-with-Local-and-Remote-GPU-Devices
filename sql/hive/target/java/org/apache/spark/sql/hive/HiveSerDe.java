package org.apache.spark.sql.hive;
  class HiveSerDe implements scala.Product, scala.Serializable {
  static public  scala.Option<org.apache.spark.sql.hive.HiveSerDe> sourceToSerDe (java.lang.String source, org.apache.hadoop.hive.conf.HiveConf hiveConf) { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> inputFormat () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputFormat () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> serde () { throw new RuntimeException(); }
  // not preceding
  public   HiveSerDe (scala.Option<java.lang.String> inputFormat, scala.Option<java.lang.String> outputFormat, scala.Option<java.lang.String> serde) { throw new RuntimeException(); }
}

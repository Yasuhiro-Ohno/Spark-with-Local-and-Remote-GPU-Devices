package org.apache.spark.sql.catalyst.expressions;
/**
 * Converts time string with given pattern.
 * (see [http://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html])
 * to Unix time stamp (in seconds), returns null if fail.
 * Note that hive Language Manual says it returns 0 if fail, but in fact it returns null.
 * If the second parameter is missing, use "yyyy-MM-dd HH:mm:ss".
 * If no parameters provided, the first parameter will be current_timestamp.
 * If the first parameter is a Date or Timestamp instead of String, we will ignore the
 * second parameter.
 */
public  class UnixTimestamp extends org.apache.spark.sql.catalyst.expressions.UnixTime implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression timeExp () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression format () { throw new RuntimeException(); }
  // not preceding
  public   UnixTimestamp (org.apache.spark.sql.catalyst.expressions.Expression timeExp, org.apache.spark.sql.catalyst.expressions.Expression format) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right () { throw new RuntimeException(); }
  public   UnixTimestamp (org.apache.spark.sql.catalyst.expressions.Expression time) { throw new RuntimeException(); }
  public   UnixTimestamp () { throw new RuntimeException(); }
}

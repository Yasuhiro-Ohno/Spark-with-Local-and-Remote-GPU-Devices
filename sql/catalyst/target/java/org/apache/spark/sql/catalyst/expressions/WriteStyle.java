package org.apache.spark.sql.catalyst.expressions;
public  interface WriteStyle {
  // no position
  static   class RawStyle$ implements org.apache.spark.sql.catalyst.expressions.WriteStyle, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RawStyle$ MODULE$ = null;
    public   RawStyle$ () { throw new RuntimeException(); }
  }
  // no position
  static   class QuotedStyle$ implements org.apache.spark.sql.catalyst.expressions.WriteStyle, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final QuotedStyle$ MODULE$ = null;
    public   QuotedStyle$ () { throw new RuntimeException(); }
  }
  // no position
  static   class FlattenStyle$ implements org.apache.spark.sql.catalyst.expressions.WriteStyle, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FlattenStyle$ MODULE$ = null;
    public   FlattenStyle$ () { throw new RuntimeException(); }
  }
}

package org.apache.spark.mllib.tree.configuration;
// no position
/**
 * Enum for selecting the quantile calculation strategy
 */
public  class QuantileStrategy extends scala.Enumeration {
  static public  scala.Enumeration.Value Sort () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value MinMax () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value ApproxHist () { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
// no position
  class RFormulaParser implements scala.util.parsing.combinator.RegexParsers {
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.Intercept> intercept () { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ColumnRef> columnRef () { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.InteractableTerm> dot () { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<org.apache.spark.ml.feature.InteractableTerm>> interaction () { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.Term> term () { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<org.apache.spark.ml.feature.Term>> terms () { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ParsedRFormula> formula () { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.ParsedRFormula parse (java.lang.String value) { throw new RuntimeException(); }
}

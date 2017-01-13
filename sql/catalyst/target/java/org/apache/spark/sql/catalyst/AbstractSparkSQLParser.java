package org.apache.spark.sql.catalyst;
 abstract class AbstractSparkSQLParser extends scala.util.parsing.combinator.syntactical.StandardTokenParsers implements scala.util.parsing.combinator.PackratParsers {
  public   AbstractSparkSQLParser () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parse (java.lang.String input) { throw new RuntimeException(); }
  protected  void initLexical () { throw new RuntimeException(); }
  protected  class Keyword implements scala.Product, scala.Serializable {
    public  java.lang.String str () { throw new RuntimeException(); }
    // not preceding
    public   Keyword (java.lang.String str) { throw new RuntimeException(); }
    public  java.lang.String normalize () { throw new RuntimeException(); }
    public  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> parser () { throw new RuntimeException(); }
  }
  // no position
  protected  class Keyword extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword> implements scala.Serializable {
    public   Keyword () { throw new RuntimeException(); }
  }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> asParser (org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword k) { throw new RuntimeException(); }
  protected  scala.collection.Seq<java.lang.String> reservedWords () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.SqlLexical lexical () { throw new RuntimeException(); }
  protected abstract  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> start () ;
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> wholeInput () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> restInput () { throw new RuntimeException(); }
}

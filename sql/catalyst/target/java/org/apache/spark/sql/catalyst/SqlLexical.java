package org.apache.spark.sql.catalyst;
public  class SqlLexical extends scala.util.parsing.combinator.lexical.StdLexical {
  public   SqlLexical () { throw new RuntimeException(); }
  public  class DecimalLit extends scala.util.parsing.combinator.token.Tokens.Token implements scala.Product, scala.Serializable {
    public  java.lang.String chars () { throw new RuntimeException(); }
    // not preceding
    public   DecimalLit (java.lang.String chars) { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  // no position
  public  class DecimalLit extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.catalyst.SqlLexical.DecimalLit> implements scala.Serializable {
    public   DecimalLit () { throw new RuntimeException(); }
  }
  public  void initialize (scala.collection.Seq<java.lang.String> keywords) { throw new RuntimeException(); }
  public  java.lang.String normalizeKeyword (java.lang.String str) { throw new RuntimeException(); }
  protected  scala.Product processIdent (java.lang.String name) { throw new RuntimeException(); }
  public  scala.util.parsing.combinator.Parsers.Parser<scala.util.parsing.combinator.token.Tokens.Token> token () { throw new RuntimeException(); }
  public  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> identChar () { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> scientificNotation () { throw new RuntimeException(); }
  public  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> whitespace () { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst;
// no position
/**
 * A very simple SQL parser.  Based loosely on:
 * https://github.com/stephentu/scala-sql-parser/blob/master/src/main/scala/parser.scala
 * <p>
 * Limitations:
 *  - Only supports a very limited subset of SQL.
 * <p>
 * This is currently included mostly for illustrative purposes.  Users wanting more complete support
 * for a SQL like language should checkout the HiveQL support in the sql/hive sub-project.
 */
public  class SqlParser extends org.apache.spark.sql.catalyst.AbstractSparkSQLParser implements org.apache.spark.sql.catalyst.util.DataTypeParser {
  static public  org.apache.spark.sql.catalyst.expressions.Expression parseExpression (java.lang.String input) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.TableIdentifier parseTableIdentifier (java.lang.String input) { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ALL () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword AND () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword APPROXIMATE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword AS () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ASC () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword BETWEEN () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword BY () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword CASE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword CAST () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword DESC () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword DISTINCT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ELSE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword END () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword EXCEPT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword FALSE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword FROM () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword FULL () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword GROUP () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword HAVING () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword IN () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INNER () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INSERT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INTERSECT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INTERVAL () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INTO () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword IS () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword JOIN () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LEFT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LIKE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LIMIT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword NOT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword NULL () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ON () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword OR () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ORDER () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SORT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword OUTER () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword OVERWRITE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword REGEXP () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword RIGHT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword RLIKE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SELECT () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SEMI () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword TABLE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword THEN () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword TRUE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword UNION () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword WHEN () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword WHERE () { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword WITH () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> start () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> start1 () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> select () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> insert () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> cte () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> projection () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> relations () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> relation () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> relationFactor () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> joinedRelation () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> joinConditions () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.JoinType> joinType () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> sortType () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> ordering () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.SortDirection> direction () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> expression () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> orExpression () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> andExpression () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> notExpression () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> comparisonExpression () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> termExpression () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> productExpression () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> function () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.Expression>> whenThenElse () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> cast () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> literal () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> booleanLiteral () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> numericLiteral () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> unsignedFloat () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> sign () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> integral () { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<scala.util.parsing.combinator.token.Tokens.Token> intervalUnit (java.lang.String unitName) { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> month () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> year () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> microsecond () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> millisecond () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> second () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> minute () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> hour () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> day () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> week () { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<scala.util.parsing.combinator.token.Tokens.Token> intervalKeyword (java.lang.String keyword) { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> intervalLiteral () { throw new RuntimeException(); }
  static private  Object toNarrowestIntegerType (java.lang.String value) { throw new RuntimeException(); }
  static private  Object toDecimalOrDouble (java.lang.String value) { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> baseExpression () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> signedPrimary () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> attributeName () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.PackratParsers.PackratParser<org.apache.spark.sql.catalyst.expressions.Expression> primary () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> dotExpressionHeader () { throw new RuntimeException(); }
  static protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.TableIdentifier> tableIdentifier () { throw new RuntimeException(); }
}

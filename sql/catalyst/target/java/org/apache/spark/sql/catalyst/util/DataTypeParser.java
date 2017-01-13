package org.apache.spark.sql.catalyst.util;
/**
 * This is a data type parser that can be used to parse string representations of data types
 * provided in SQL queries. This parser is mixed in with DDLParser and SqlParser.
 */
  interface DataTypeParser {
  public  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> regexToParser (scala.util.matching.Regex regex) ;
  public  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> primitiveType () ;
  public  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> fixedDecimalType () ;
  public  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> varchar () ;
  public  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> arrayType () ;
  public  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> mapType () ;
  public  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.StructField> structField () ;
  public  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> structType () ;
  public  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.types.DataType> dataType () ;
  public  org.apache.spark.sql.types.DataType toDataType (java.lang.String dataTypeString) ;
  public  java.lang.String failMessage (java.lang.String dataTypeString) ;
}

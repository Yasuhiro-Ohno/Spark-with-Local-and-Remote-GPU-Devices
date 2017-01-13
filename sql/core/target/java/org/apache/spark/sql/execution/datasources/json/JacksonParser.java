package org.apache.spark.sql.execution.datasources.json;
// no position
public  class JacksonParser {
  static public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> parse (org.apache.spark.rdd.RDD<java.lang.String> input, org.apache.spark.sql.types.StructType schema, java.lang.String columnNameOfCorruptRecords, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions) { throw new RuntimeException(); }
  /**
   * Parse the current token (and related children) according to a desired schema
   * @param factory (undocumented)
   * @param parser (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static public  Object convertField (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType schema) { throw new RuntimeException(); }
  /**
   * Parse an object from the token stream into a new Row representing the schema.
   * <p>
   * Fields in the json that are not defined in the requested schema will be dropped.
   * @param factory (undocumented)
   * @param parser (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.catalyst.InternalRow convertObject (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  /**
   * Parse an object as a Map, preserving all fields
   * @param factory (undocumented)
   * @param parser (undocumented)
   * @param valueType (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.catalyst.util.MapData convertMap (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType valueType) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.util.ArrayData convertArray (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType elementType) { throw new RuntimeException(); }
  static private  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> parseJson (scala.collection.Iterator<java.lang.String> input, org.apache.spark.sql.types.StructType schema, java.lang.String columnNameOfCorruptRecords, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions) { throw new RuntimeException(); }
}

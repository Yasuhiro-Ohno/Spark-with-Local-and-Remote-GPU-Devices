package org.apache.spark.ml.util;
// no position
/**
 * Utils for handling schemas.
 */
  class SchemaUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SchemaUtils$ MODULE$ = null;
  public   SchemaUtils$ () { throw new RuntimeException(); }
  /**
   * Check whether the given schema contains a column of the required data type.
   * @param colName  column name
   * @param dataType  required column data type
   * @param schema (undocumented)
   * @param msg (undocumented)
   */
  public  void checkColumnType (org.apache.spark.sql.types.StructType schema, java.lang.String colName, org.apache.spark.sql.types.DataType dataType, java.lang.String msg) { throw new RuntimeException(); }
  /**
   * Appends a new column to the input schema. This fails if the given output column already exists.
   * @param schema input schema
   * @param colName new column name. If this column name is an empty string "", this method returns
   *                the input schema unchanged. This allows users to disable output columns.
   * @param dataType new column data type
   * @return new schema with the input column appended
   */
  public  org.apache.spark.sql.types.StructType appendColumn (org.apache.spark.sql.types.StructType schema, java.lang.String colName, org.apache.spark.sql.types.DataType dataType) { throw new RuntimeException(); }
  /**
   * Appends a new column to the input schema. This fails if the given output column already exists.
   * @param schema input schema
   * @param col New column schema
   * @return new schema with the input column appended
   */
  public  org.apache.spark.sql.types.StructType appendColumn (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.types.StructField col) { throw new RuntimeException(); }
}

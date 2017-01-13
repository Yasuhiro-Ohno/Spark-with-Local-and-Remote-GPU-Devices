package org.apache.spark.sql.catalyst.encoders;
// no position
/**
 * A factory for constructing encoders that convert external row to/from the Spark SQL
 * internal binary representation.
 */
public  class RowEncoder {
  static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<org.apache.spark.sql.Row> apply (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression extractorsFor (org.apache.spark.sql.catalyst.expressions.Expression inputObject, org.apache.spark.sql.types.DataType inputType) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.types.DataType externalDataTypeFor (org.apache.spark.sql.types.DataType dt) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression constructorFor (org.apache.spark.sql.types.StructType schema) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression constructorFor (org.apache.spark.sql.catalyst.expressions.Expression input) { throw new RuntimeException(); }
}

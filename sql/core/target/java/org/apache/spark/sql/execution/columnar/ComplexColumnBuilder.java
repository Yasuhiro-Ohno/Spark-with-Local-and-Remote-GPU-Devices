package org.apache.spark.sql.execution.columnar;
 abstract class ComplexColumnBuilder<JvmType extends java.lang.Object> extends org.apache.spark.sql.execution.columnar.BasicColumnBuilder<JvmType> implements org.apache.spark.sql.execution.columnar.NullableColumnBuilder {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   ComplexColumnBuilder (org.apache.spark.sql.execution.columnar.ColumnStats columnStats, org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType) { throw new RuntimeException(); }
}

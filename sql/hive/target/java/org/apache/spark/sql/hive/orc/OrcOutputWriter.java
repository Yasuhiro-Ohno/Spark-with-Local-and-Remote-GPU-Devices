package org.apache.spark.sql.hive.orc;
  class OrcOutputWriter extends org.apache.spark.sql.sources.OutputWriter implements org.apache.spark.mapred.SparkHadoopMapRedUtil, org.apache.spark.sql.hive.HiveInspectors {
  public   OrcOutputWriter (java.lang.String path, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.mapreduce.TaskAttemptContext context) { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.io.orc.OrcSerde serializer () { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.serde2.objectinspector.SettableStructObjectInspector structOI () { throw new RuntimeException(); }
  private  boolean recordWriterInstantiated () { throw new RuntimeException(); }
  private  org.apache.hadoop.mapred.RecordWriter<org.apache.hadoop.io.NullWritable, org.apache.hadoop.io.Writable> recordWriter () { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.Row row) { throw new RuntimeException(); }
  private  void wrapOrcStruct (org.apache.hadoop.hive.ql.io.orc.OrcStruct struct, org.apache.hadoop.hive.serde2.objectinspector.SettableStructObjectInspector oi, org.apache.spark.sql.catalyst.InternalRow row) { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.io.orc.OrcStruct cachedOrcStruct () { throw new RuntimeException(); }
  protected  void writeInternal (org.apache.spark.sql.catalyst.InternalRow row) { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}

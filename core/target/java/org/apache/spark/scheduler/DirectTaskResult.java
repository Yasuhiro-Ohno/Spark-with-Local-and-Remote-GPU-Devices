package org.apache.spark.scheduler;
/** A TaskResult that contains the task's return value and accumulator updates. */
  class DirectTaskResult<T extends java.lang.Object> implements org.apache.spark.scheduler.TaskResult<T>, java.io.Externalizable {
  public  java.nio.ByteBuffer valueBytes () { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.Object, java.lang.Object> accumUpdates () { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics metrics () { throw new RuntimeException(); }
  // not preceding
  public   DirectTaskResult (java.nio.ByteBuffer valueBytes, scala.collection.Map<java.lang.Object, java.lang.Object> accumUpdates, org.apache.spark.executor.TaskMetrics metrics) { throw new RuntimeException(); }
  private  boolean valueObjectDeserialized () { throw new RuntimeException(); }
  private  T valueObject () { throw new RuntimeException(); }
  public   DirectTaskResult () { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out) { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in) { throw new RuntimeException(); }
  /**
   * When <code>value()</code> is called at the first time, it needs to deserialize <code>valueObject</code> from
   * <code>valueBytes</code>. It may cost dozens of seconds for a large instance. So when calling <code>value</code> at
   * the first time, the caller should avoid to block other threads.
   * <p>
   * After the first time, <code>value()</code> is trivial and just returns the deserialized <code>valueObject</code>.
   * @return (undocumented)
   */
  public  T value () { throw new RuntimeException(); }
}

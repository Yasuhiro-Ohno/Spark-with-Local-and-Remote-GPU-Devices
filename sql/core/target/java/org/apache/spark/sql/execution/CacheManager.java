package org.apache.spark.sql.execution;
/**
 * Provides support in a SQLContext for caching query results and automatically using these cached
 * results when subsequent queries are executed.  Data is cached using byte buffers stored in an
 * InMemoryRelation.  This relation is automatically substituted query plans that return the
 * <code>sameResult</code> as the originally cached query.
 * <p>
 * Internal to Spark SQL.
 */
  class CacheManager implements org.apache.spark.Logging {
  public   CacheManager () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.execution.CachedData> cachedData () { throw new RuntimeException(); }
  private  java.util.concurrent.locks.ReentrantReadWriteLock cacheLock () { throw new RuntimeException(); }
  /** Acquires a read lock on the cache for the duration of `f`. */
  private <A extends java.lang.Object> A readLock (scala.Function0<A> f) { throw new RuntimeException(); }
  /** Acquires a write lock on the cache for the duration of `f`. */
  private <A extends java.lang.Object> A writeLock (scala.Function0<A> f) { throw new RuntimeException(); }
  /** Clears all cached tables. */
    void clearCache () { throw new RuntimeException(); }
  /** Checks if the cache is empty. */
    boolean isEmpty () { throw new RuntimeException(); }
  /**
   * Caches the data produced by the logical representation of the given {@link Queryable}.
   * Unlike <code>RDD.cache()</code>, the default storage level is set to be <code>MEMORY_AND_DISK</code> because
   * recomputing the in-memory columnar representation of the underlying table is expensive.
   * @param query (undocumented)
   * @param tableName (undocumented)
   * @param storageLevel (undocumented)
   */
    void cacheQuery (org.apache.spark.sql.execution.Queryable query, scala.Option<java.lang.String> tableName, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /** Removes the data for the given {@link Queryable} from the cache */
    void uncacheQuery (org.apache.spark.sql.execution.Queryable query, boolean blocking) { throw new RuntimeException(); }
  /** Tries to remove the data for the given {@link Queryable} from the cache
   * if it's cached
   * @param query (undocumented)
   * @param blocking (undocumented)
   * @return (undocumented)
   */
    boolean tryUncacheQuery (org.apache.spark.sql.execution.Queryable query, boolean blocking) { throw new RuntimeException(); }
  /** Optionally returns cached data for the given {@link Queryable} */
    scala.Option<org.apache.spark.sql.execution.CachedData> lookupCachedData (org.apache.spark.sql.execution.Queryable query) { throw new RuntimeException(); }
  /** Optionally returns cached data for the given {@link LogicalPlan}. */
    scala.Option<org.apache.spark.sql.execution.CachedData> lookupCachedData (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  /** Replaces segments of the given logical plan with cached versions where possible. */
    org.apache.spark.sql.catalyst.plans.logical.LogicalPlan useCachedData (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  /**
   * Invalidates the cache of any data that contains <code>plan</code>. Note that it is possible that this
   * function will over invalidate.
   * @param plan (undocumented)
   */
    void invalidateCache (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}

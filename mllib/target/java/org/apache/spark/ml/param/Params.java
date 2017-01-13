package org.apache.spark.ml.param;
public  interface Params extends org.apache.spark.ml.util.Identifiable, scala.Serializable {
  public  org.apache.spark.ml.param.Param<?>[] params () ;
  public  void validateParams () ;
  public  java.lang.String explainParam (org.apache.spark.ml.param.Param<?> param) ;
  public  java.lang.String explainParams () ;
  public  boolean isSet (org.apache.spark.ml.param.Param<?> param) ;
  public  boolean isDefined (org.apache.spark.ml.param.Param<?> param) ;
  public  boolean hasParam (java.lang.String paramName) ;
  public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName) ;
  public <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value) ;
  public  org.apache.spark.ml.param.Params set (java.lang.String param, Object value) ;
  public  org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.ParamPair<?> paramPair) ;
  public <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param) ;
  public  org.apache.spark.ml.param.Params clear (org.apache.spark.ml.param.Param<?> param) ;
  /**
   * Gets the value of a param in the embedded param map or its default value. Throws an exception
   * if neither is set.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T getOrDefault (org.apache.spark.ml.param.Param<T> param) ;
  /**
   * Sets a default value for a param.
   * @param param  param to set the default value. Make sure that this param is initialized before
   *               this method gets called.
   * @param value  the default value
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.ml.param.Params setDefault (org.apache.spark.ml.param.Param<T> param, T value) ;
  /**
   * Sets default values for a list of params.
   * <p>
   * Note: Java developers should use the single-parameter {@link setDefault()}.
   *       Annotating this with varargs can cause compilation failures due to a Scala compiler bug.
   *       See SPARK-9268.
   * <p>
   * @param paramPairs  a list of param pairs that specify params and their default values to set
   *                    respectively. Make sure that the params are initialized before this method
   *                    gets called.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Params setDefault (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs) ;
  /**
   * Gets the default value of a parameter.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> getDefault (org.apache.spark.ml.param.Param<T> param) ;
  /**
   * Tests whether the input param has a default value set.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> boolean hasDefault (org.apache.spark.ml.param.Param<T> param) ;
  /**
   * Creates a copy of this instance with the same UID and some extra params.
   * Subclasses should implement this method and set the return type properly.
   * <p>
   * @see defaultCopy()
   * @param extra (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Params copy (org.apache.spark.ml.param.ParamMap extra) ;
  /**
   * Default implementation of copy with extra params.
   * It tries to create a new instance with the same UID.
   * Then it copies the embedded and extra parameters over and returns the new instance.
   * @param extra (undocumented)
   * @return (undocumented)
   */
  public <T extends org.apache.spark.ml.param.Params> T defaultCopy (org.apache.spark.ml.param.ParamMap extra) ;
  /**
   * Extracts the embedded default param values and user-supplied values, and then merges them with
   * extra values from input into a flat param map, where the latter value is used if there exist
   * conflicts, i.e., with ordering: default param values < user-supplied values < extra.
   * @param extra (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.ParamMap extractParamMap (org.apache.spark.ml.param.ParamMap extra) ;
  /**
   * {@link extractParamMap} with no extra values.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.ParamMap extractParamMap () ;
  /** Internal param map for user-supplied values. */
  public  org.apache.spark.ml.param.ParamMap paramMap () ;
  /** Internal param map for default values. */
  public  org.apache.spark.ml.param.ParamMap defaultParamMap () ;
  /** Validates that the input param belongs to this instance. */
  public  void shouldOwn (org.apache.spark.ml.param.Param<?> param) ;
  /**
   * Copies param values from this instance to another instance for params shared by them.
   * <p>
   * This handles default Params and explicitly set Params separately.
   * Default Params are copied from and to {@link defaultParamMap}, and explicitly set Params are
   * copied from and to {@link paramMap}.
   * Warning: This implicitly assumes that this {@link Params} instance and the target instance
   *          share the same set of default Params.
   * <p>
   * @param to the target instance, which should work with the same set of default Params as this
   *           source instance
   * @param extra extra params to be copied to the target's {@link paramMap}
   * @return the target instance with param values copied
   */
  public <T extends org.apache.spark.ml.param.Params> T copyValues (T to, org.apache.spark.ml.param.ParamMap extra) ;
}

package org.apache.spark.sql.execution.datasources.json;
/**
 * Options for the JSON data source.
 * <p>
 * Most of these map directly to Jackson's internal options, specified in {@link JsonParser.Feature}.
 */
public  class JSONOptions implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.datasources.json.JSONOptions createFromConfigMap (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters) { throw new RuntimeException(); }
  public  double samplingRatio () { throw new RuntimeException(); }
  public  boolean primitivesAsString () { throw new RuntimeException(); }
  public  boolean allowComments () { throw new RuntimeException(); }
  public  boolean allowUnquotedFieldNames () { throw new RuntimeException(); }
  public  boolean allowSingleQuotes () { throw new RuntimeException(); }
  public  boolean allowNumericLeadingZeros () { throw new RuntimeException(); }
  public  boolean allowNonNumericNumbers () { throw new RuntimeException(); }
  // not preceding
  public   JSONOptions (double samplingRatio, boolean primitivesAsString, boolean allowComments, boolean allowUnquotedFieldNames, boolean allowSingleQuotes, boolean allowNumericLeadingZeros, boolean allowNonNumericNumbers) { throw new RuntimeException(); }
  /** Sets config options on a Jackson {@link JsonFactory}. */
  public  void setJacksonOptions (com.fasterxml.jackson.core.JsonFactory factory) { throw new RuntimeException(); }
}

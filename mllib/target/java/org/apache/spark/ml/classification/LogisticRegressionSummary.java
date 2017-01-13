package org.apache.spark.ml.classification;
/**
 * Abstraction for Logistic Regression Results for a given model.
 */
public  interface LogisticRegressionSummary extends scala.Serializable {
  /** Dataframe outputted by the model's `transform` method. */
  public  org.apache.spark.sql.DataFrame predictions () ;
  /** Field in "predictions" which gives the calibrated probability of each instance as a vector. */
  public  java.lang.String probabilityCol () ;
  /** Field in "predictions" which gives the true label of each instance. */
  public  java.lang.String labelCol () ;
  /** Field in "predictions" which gives the features of each instance as a vector. */
  public  java.lang.String featuresCol () ;
}

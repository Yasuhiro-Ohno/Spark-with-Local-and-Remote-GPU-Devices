package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Classification model based on the Multilayer Perceptron.
 * Each layer has sigmoid activation function, output layer has softmax.
 * param:  uid uid
 * param:  layers array of layer sizes including input and output layers
 * param:  weights vector of initial weights for the model that consists of the weights of layers
 * @return prediction model
 */
public  class MultilayerPerceptronClassificationModel extends org.apache.spark.ml.PredictionModel<org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel> implements scala.Serializable {
  public  java.lang.String uid () { throw new RuntimeException(); }
  public  int[] layers () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector weights () { throw new RuntimeException(); }
  // not preceding
     MultilayerPerceptronClassificationModel (java.lang.String uid, int[] layers, org.apache.spark.mllib.linalg.Vector weights) { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  private  org.apache.spark.ml.ann.TopologyModel mlpModel () { throw new RuntimeException(); }
  /**
   * Returns layers in a Java List.
   * @return (undocumented)
   */
    java.util.List<java.lang.Object> javaLayers () { throw new RuntimeException(); }
  /**
   * Predict label for the given features.
   * This internal method is used to implement {@link transform()} and output {@link predictionCol}.
   * @param features (undocumented)
   * @return (undocumented)
   */
  protected  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel copy (org.apache.spark.ml.param.ParamMap extra) { throw new RuntimeException(); }
}

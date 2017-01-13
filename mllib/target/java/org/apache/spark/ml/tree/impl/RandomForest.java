package org.apache.spark.ml.tree.impl;
// no position
  class RandomForest implements org.apache.spark.Logging {
  static   class NodeIndexInfo implements scala.Serializable {
    public  int nodeIndexInGroup () { throw new RuntimeException(); }
    public  scala.Option<int[]> featureSubset () { throw new RuntimeException(); }
    // not preceding
    public   NodeIndexInfo (int nodeIndexInGroup, scala.Option<int[]> featureSubset) { throw new RuntimeException(); }
  }
  /**
   * Train a random forest.
   * @param input Training data: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}
   * @return an unweighted set of trees
   * @param strategy (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param seed (undocumented)
   * @param parentUID (undocumented)
   */
  static public  org.apache.spark.ml.tree.DecisionTreeModel[] run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, long seed, scala.Option<java.lang.String> parentUID) { throw new RuntimeException(); }
  /**
   * Helper for binSeqOp, for data which can contain a mix of ordered and unordered features.
   * <p>
   * For ordered features, a single bin is updated.
   * For unordered features, bins correspond to subsets of categories; either the left or right bin
   * for each subset is updated.
   * <p>
   * @param agg  Array storing aggregate calculation, with a set of sufficient statistics for
   *             each (feature, bin).
   * @param treePoint  Data point being aggregated.
   * @param splits possible splits indexed (numFeatures)(numSplits)
   * @param unorderedFeatures  Set of indices of unordered features.
   * @param instanceWeight  Weight (importance) of instance in dataset.
   * @param featuresForNode (undocumented)
   */
  static private  void mixedBinSeqOp (org.apache.spark.mllib.tree.impl.DTStatsAggregator agg, org.apache.spark.ml.tree.impl.TreePoint treePoint, org.apache.spark.ml.tree.Split[][] splits, scala.collection.immutable.Set<java.lang.Object> unorderedFeatures, double instanceWeight, scala.Option<int[]> featuresForNode) { throw new RuntimeException(); }
  /**
   * Helper for binSeqOp, for regression and for classification with only ordered features.
   * <p>
   * For each feature, the sufficient statistics of one bin are updated.
   * <p>
   * @param agg  Array storing aggregate calculation, with a set of sufficient statistics for
   *             each (feature, bin).
   * @param treePoint  Data point being aggregated.
   * @param instanceWeight  Weight (importance) of instance in dataset.
   * @param featuresForNode (undocumented)
   */
  static private  void orderedBinSeqOp (org.apache.spark.mllib.tree.impl.DTStatsAggregator agg, org.apache.spark.ml.tree.impl.TreePoint treePoint, double instanceWeight, scala.Option<int[]> featuresForNode) { throw new RuntimeException(); }
  /**
   * Given a group of nodes, this finds the best split for each node.
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.tree.impl.TreePoint}
   * @param metadata Learning and dataset metadata
   * @param topNodes Root node for each tree.  Used for matching instances with nodes.
   * @param nodesForGroup Mapping: treeIndex --> nodes to be split in tree
   * @param treeToNodeToIndexInfo Mapping: treeIndex --> nodeIndex --> nodeIndexInfo,
   *                              where nodeIndexInfo stores the index in the group and the
   *                              feature subsets (if using feature subsets).
   * @param splits possible splits for all features, indexed (numFeatures)(numSplits)
   * @param nodeQueue  Queue of nodes to split, with values (treeIndex, node).
   *                   Updated with new non-leaf nodes which are created.
   * @param nodeIdCache Node Id cache containing an RDD of Array[Int] where
   *                    each value in the array is the data point's node Id
   *                    for a corresponding tree. This is used to prevent the need
   *                    to pass the entire tree to the executors during
   *                    the node stat aggregation phase.
   * @param timer (undocumented)
   */
  static   void findBestSplits (org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> input, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, org.apache.spark.ml.tree.LearningNode[] topNodes, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.LearningNode[]> nodesForGroup, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.impl.RandomForest.NodeIndexInfo>> treeToNodeToIndexInfo, org.apache.spark.ml.tree.Split[][] splits, scala.collection.mutable.Queue<scala.Tuple2<java.lang.Object, org.apache.spark.ml.tree.LearningNode>> nodeQueue, org.apache.spark.mllib.tree.impl.TimeTracker timer, scala.Option<org.apache.spark.ml.tree.impl.NodeIdCache> nodeIdCache) { throw new RuntimeException(); }
  /**
   * Calculate the impurity statistics for a give (feature, split) based upon left/right aggregates.
   * @param stats the recycle impurity statistics for this feature's all splits,
   *              only 'impurity' and 'impurityCalculator' are valid between each iteration
   * @param leftImpurityCalculator left node aggregates for this (feature, split)
   * @param rightImpurityCalculator right node aggregate for this (feature, split)
   * @param metadata learning and dataset metadata for DecisionTree
   * @return Impurity statistics for this (feature, split)
   */
  static private  org.apache.spark.mllib.tree.model.ImpurityStats calculateImpurityStats (org.apache.spark.mllib.tree.model.ImpurityStats stats, org.apache.spark.mllib.tree.impurity.ImpurityCalculator leftImpurityCalculator, org.apache.spark.mllib.tree.impurity.ImpurityCalculator rightImpurityCalculator, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata) { throw new RuntimeException(); }
  /**
   * Find the best split for a node.
   * @param binAggregates Bin statistics.
   * @return tuple for best split: (Split, information gain, prediction at node)
   * @param splits (undocumented)
   * @param featuresForNode (undocumented)
   * @param node (undocumented)
   */
  static private  scala.Tuple2<org.apache.spark.ml.tree.Split, org.apache.spark.mllib.tree.model.ImpurityStats> binsToBestSplit (org.apache.spark.mllib.tree.impl.DTStatsAggregator binAggregates, org.apache.spark.ml.tree.Split[][] splits, scala.Option<int[]> featuresForNode, org.apache.spark.ml.tree.LearningNode node) { throw new RuntimeException(); }
  /**
   * Returns splits and bins for decision tree calculation.
   * Continuous and categorical features are handled differently.
   * <p>
   * Continuous features:
   *   For each feature, there are numBins - 1 possible splits representing the possible binary
   *   decisions at each node in the tree.
   *   This finds locations (feature values) for splits using a subsample of the data.
   * <p>
   * Categorical features:
   *   For each feature, there is 1 bin per split.
   *   Splits and bins are handled in 2 ways:
   *   (a) "unordered features"
   *       For multiclass classification with a low-arity feature
   *       (i.e., if isMulticlass &amp;&amp; isSpaceSufficientForAllCategoricalSplits),
   *       the feature is split based on subsets of categories.
   *   (b) "ordered features"
   *       For regression and binary classification,
   *       and for multiclass classification with a high-arity feature,
   *       there is one bin per category.
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}
   * @param metadata Learning and dataset metadata
   * @param seed random seed
   * @return A tuple of (splits, bins).
   *         Splits is an Array of {@link org.apache.spark.mllib.tree.model.Split}
   *          of size (numFeatures, numSplits).
   *         Bins is an Array of {@link org.apache.spark.mllib.tree.model.Bin}
   *          of size (numFeatures, numBins).
   */
  static protected  org.apache.spark.ml.tree.Split[][] findSplits (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, long seed) { throw new RuntimeException(); }
  /**
   * Nested method to extract list of eligible categories given an index. It extracts the
   * position of ones in a binary representation of the input. If binary
   * representation of an number is 01101 (13), the output list should (3.0, 2.0,
   * 0.0). The maxFeatureValue depict the number of rightmost digits that will be tested for ones.
   * @param input (undocumented)
   * @param maxFeatureValue (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.immutable.List<java.lang.Object> extractMultiClassCategories (int input, int maxFeatureValue) { throw new RuntimeException(); }
  /**
   * Find splits for a continuous feature
   * NOTE: Returned number of splits is set based on <code>featureSamples</code> and
   *       could be different from the specified <code>numSplits</code>.
   *       The <code>numSplits</code> attribute in the <code>DecisionTreeMetadata</code> class will be set accordingly.
   * @param featureSamples feature values of each sample
   * @param metadata decision tree metadata
   *                 NOTE: <code>metadata.numbins</code> will be changed accordingly
   *                       if there are not enough splits to be found
   * @param featureIndex feature index to find splits
   * @return array of splits
   */
  static   double[] findSplitsForContinuousFeature (double[] featureSamples, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, int featureIndex) { throw new RuntimeException(); }
  /**
   * Pull nodes off of the queue, and collect a group of nodes to be split on this iteration.
   * This tracks the memory usage for aggregates and stops adding nodes when too much memory
   * will be needed; this allows an adaptive number of nodes since different nodes may require
   * different amounts of memory (if featureSubsetStrategy is not "all").
   * <p>
   * @param nodeQueue  Queue of nodes to split.
   * @param maxMemoryUsage  Bound on size of aggregate statistics.
   * @return  (nodesForGroup, treeToNodeToIndexInfo).
   *          nodesForGroup holds the nodes to split: treeIndex --> nodes in tree.
   * <p>
   *          treeToNodeToIndexInfo holds indices selected features for each node:
   *            treeIndex --> (global) node index --> (node index in group, feature indices).
   *          The (global) node index is the index in the tree; the node index in group is the
   *           index in [0, numNodesInGroup) of the node in this group.
   *          The feature indices are None if not subsampling features.
   * @param metadata (undocumented)
   * @param rng (undocumented)
   */
  static   scala.Tuple2<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.LearningNode[]>, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.impl.RandomForest.NodeIndexInfo>>> selectNodesToSplit (scala.collection.mutable.Queue<scala.Tuple2<java.lang.Object, org.apache.spark.ml.tree.LearningNode>> nodeQueue, long maxMemoryUsage, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, scala.util.Random rng) { throw new RuntimeException(); }
  /**
   * Get the number of values to be stored for this node in the bin aggregates.
   * @param featureSubset  Indices of features which may be split at this node.
   *                       If None, then use all features.
   * @param metadata (undocumented)
   * @return (undocumented)
   */
  static private  long aggregateSizeForNode (org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, scala.Option<int[]> featureSubset) { throw new RuntimeException(); }
  /**
   * Given a Random Forest model, compute the importance of each feature.
   * This generalizes the idea of "Gini" importance to other losses,
   * following the explanation of Gini importance from "Random Forests" documentation
   * by Leo Breiman and Adele Cutler, and following the implementation from scikit-learn.
   * <p>
   * This feature importance is calculated as follows:
   *  - Average over trees:
   *     - importance(feature j) = sum (over nodes which split on feature j) of the gain,
   *       where gain is scaled by the number of instances passing through node
   *     - Normalize importances for tree based on total number of training instances used
   *       to build tree.
   *  - Normalize feature importance vector to sum to 1.
   * <p>
   * Note: This should not be used with Gradient-Boosted Trees.  It only makes sense for
   *       independently trained trees.
   * @param trees  Unweighted forest of trees
   * @param numFeatures  Number of features in model (even if not all are explicitly used by
   *                     the model).
   *                     If -1, then numFeatures is set based on the max feature index in all trees.
   * @return  Feature importance values, of length numFeatures.
   */
  static   org.apache.spark.mllib.linalg.Vector featureImportances (org.apache.spark.ml.tree.DecisionTreeModel[] trees, int numFeatures) { throw new RuntimeException(); }
  /**
   * Recursive method for computing feature importances for one tree.
   * This walks down the tree, adding to the importance of 1 feature at each node.
   * @param node  Current node in recursion
   * @param importances  Aggregate feature importances, modified by this method
   */
  static   void computeFeatureImportance (org.apache.spark.ml.tree.Node node, org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> importances) { throw new RuntimeException(); }
  /**
   * Normalize the values of this map to sum to 1, in place.
   * If all values are 0, this method does nothing.
   * @param map  Map with non-negative values.
   */
  static   void normalizeMapValues (org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> map) { throw new RuntimeException(); }
}

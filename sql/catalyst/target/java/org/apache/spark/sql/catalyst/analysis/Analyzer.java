package org.apache.spark.sql.catalyst.analysis;
/**
 * Provides a logical query plan analyzer, which translates {@link UnresolvedAttribute}s and
 * {@link UnresolvedRelation}s into fully typed objects using information in a schema {@link Catalog} and
 * a {@link FunctionRegistry}.
 */
public  class Analyzer extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.CheckAnalysis {
  // no position
  /**
   * Substitute child plan with cte definitions
   */
  public  class CTESubstitution$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   CTESubstitution$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan substituteCTE (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> cteRelations) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Substitute child plan with WindowSpecDefinitions.
   */
  public  class WindowsSubstitution$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   WindowsSubstitution$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Replaces {@link UnresolvedAlias}s with concrete aliases.
   */
  public  class ResolveAliases$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveAliases$ () { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> assignAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs) { throw new RuntimeException(); }
    private  boolean hasUnresolvedAlias (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  public  class ResolveGroupingAnalytics$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveGroupingAnalytics$ () { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> bitmasks (org.apache.spark.sql.catalyst.plans.logical.Rollup r) { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> bitmasks (org.apache.spark.sql.catalyst.plans.logical.Cube c) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  public  class ResolvePivot$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolvePivot$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Replaces {@link UnresolvedRelation}s with concrete relations from the catalog.
   */
  public  class ResolveRelations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveRelations$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan getTable (org.apache.spark.sql.catalyst.analysis.UnresolvedRelation u) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Replaces {@link UnresolvedAttribute}s with concrete {@link AttributeReference}s from
   * a logical plan node's children.
   */
  public  class ResolveReferences$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveReferences$ () { throw new RuntimeException(); }
    /**
     * Foreach expression, expands the matching attribute.*'s in <code>child</code>'s input for the subtree
     * rooted at each expression.
     * @param exprs (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expandStarExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> newAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.AttributeSet findAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList) { throw new RuntimeException(); }
    /**
     * Returns true if <code>exprs</code> contains a {@link Star}.
     * @param exprs (undocumented)
     * @return (undocumented)
     */
    public  boolean containsStar (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs) { throw new RuntimeException(); }
  }
  // no position
  /**
   * In many dialects of SQL it is valid to sort by attributes that are not present in the SELECT
   * clause.  This rule detects such queries and adds the required attributes to the original
   * projection, so that they will be available during sorting. Another projection is added to
   * remove these attributes after sorting.
   */
  public  class ResolveSortReferences$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveSortReferences$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    /**
     * Given a child and a grandchild that are present beneath a sort operator, try to resolve
     * the sort ordering and returns it with a list of attributes that are missing from the
     * child but are present in the grandchild.
     * @param ordering (undocumented)
     * @param child (undocumented)
     * @param grandchild (undocumented)
     * @return (undocumented)
     */
    public  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>> resolveAndFindMissing (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> ordering, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan grandchild) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Replaces {@link UnresolvedFunction}s with concrete {@link Expression}s.
   */
  public  class ResolveFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveFunctions$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Turns projections that contain aggregate expressions into aggregations.
   */
  public  class GlobalAggregates$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   GlobalAggregates$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    public  boolean containsAggregates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs) { throw new RuntimeException(); }
  }
  // no position
  /**
   * This rule finds aggregate expressions that are not in an aggregate operator.  For example,
   * those in a HAVING clause or ORDER BY clause.  These expressions are pushed down to the
   * underlying aggregate operator and then projected away after the original operator.
   */
  public  class ResolveAggregateFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveAggregateFunctions$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    protected  boolean containsAggregate (org.apache.spark.sql.catalyst.expressions.Expression condition) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Rewrites table generating expressions that either need one or more of the following in order
   * to be resolved:
   *  - concrete attribute references for their output.
   *  - to be relocated from a SELECT clause (i.e. from  a {@link Project}) into a {@link Generate}).
   * <p>
   * Names for the output {@link Attribute}s are extracted from {@link Alias} or {@link MultiAlias} expressions
   * that wrap the {@link Generator}. If more than one {@link Generator} is found in a Project, an
   * {@link AnalysisException} is throw.
   */
  public  class ResolveGenerate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveGenerate$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    // no position
    private  class AliasedGenerator {
      /** Extracts a {@link Generator} expression and any names assigned by aliases to their output. */
      public   AliasedGenerator () { throw new RuntimeException(); }
      public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Generator, scala.collection.Seq<java.lang.String>>> unapply (org.apache.spark.sql.catalyst.expressions.Expression e) { throw new RuntimeException(); }
    }
    private  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGenerate.AliasedGenerator$ AliasedGenerator () { throw new RuntimeException(); }
    /**
     * Construct the output attributes for a {@link Generator}, given a list of names.  If the list of
     * names is empty names are assigned from field names in generator.
     * @param generator (undocumented)
     * @param names (undocumented)
     * @return (undocumented)
     */
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> makeGeneratorOutput (org.apache.spark.sql.catalyst.expressions.Generator generator, scala.collection.Seq<java.lang.String> names) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Extracts {@link WindowExpression}s from the projectList of a {@link Project} operator and
   * aggregateExpressions of an {@link Aggregate} operator and creates individual {@link Window}
   * operators for every distinct {@link WindowSpecDefinition}.
   * <p>
   * This rule handles three cases:
   *  - A {@link Project} having {@link WindowExpression}s in its projectList;
   *  - An {@link Aggregate} having {@link WindowExpression}s in its aggregateExpressions.
   *  - An {@link Filter}->{@link Aggregate} pattern representing GROUP BY with a HAVING
   *    clause and the {@link Aggregate} has {@link WindowExpression}s in its aggregateExpressions.
   * Note: If there is a GROUP BY clause in the query, aggregations and corresponding
   * filters (expressions in the HAVING clause) should be evaluated before any
   * {@link WindowExpression}. If a query has SELECT DISTINCT, the DISTINCT part should be
   * evaluated after all {@link WindowExpression}s.
   * <p>
   * For every case, the transformation works as follows:
   * 1. For a list of {@link Expression}s (a projectList or an aggregateExpressions), partitions
   *    it two lists of {@link Expression}s, one for all {@link WindowExpression}s and another for
   *    all regular expressions.
   * 2. For all {@link WindowExpression}s, groups them based on their {@link WindowSpecDefinition}s.
   * 3. For every distinct {@link WindowSpecDefinition}, creates a {@link Window} operator and inserts
   *    it into the plan tree.
   */
  public  class ExtractWindowExpressions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ExtractWindowExpressions$ () { throw new RuntimeException(); }
    private  boolean hasWindowFunction (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList) { throw new RuntimeException(); }
    private  boolean hasWindowFunction (org.apache.spark.sql.catalyst.expressions.NamedExpression expr) { throw new RuntimeException(); }
    /**
     * From a Seq of {@link NamedExpression}s, extract expressions containing window expressions and
     * other regular expressions that do not contain any window expression. For example, for
     * <code>col1, Sum(col2 + col3) OVER (PARTITION BY col4 ORDER BY col5)</code>, we will extract
     * <code>col1</code>, <code>col2 + col3</code>, <code>col4</code>, and <code>col5</code> out and replace their appearances in
     * the window expression as attribute references. So, the first returned value will be
     * <code>[Sum(_w0) OVER (PARTITION BY _w1 ORDER BY _w2)]</code> and the second returned value will be
     * [col1, col2 + col3 as _w0, col4 as _w1, col5 as _w2].
     * <p>
     * @return (seq of expressions containing at lease one window expressions,
     *          seq of non-window expressions)
     * @param expressions (undocumented)
     */
    private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>> extract (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions) { throw new RuntimeException(); }
    /**
     * Adds operators for Window Expressions. Every Window operator handles a single Window Spec.
     * @param expressionsWithWindowFunctions (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan addWindow (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressionsWithWindowFunctions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Pulls out nondeterministic expressions from LogicalPlan which is not Project or Filter,
   * put them into an inner Project and finally project them away at the outer Project.
   */
  public  class PullOutNondeterministic$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   PullOutNondeterministic$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Correctly handle null primitive inputs for UDF by adding extra {@link If} expression to do the
   * null check.  When user defines a UDF with primitive parameters, there is no way to tell if the
   * primitive parameter is null or not, so here we assume the primitive input is null-propagatable
   * and we should return null if the input is null.
   */
  public  class HandleNullInputsForUDF$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   HandleNullInputsForUDF$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public   Analyzer (org.apache.spark.sql.catalyst.analysis.Catalog catalog, org.apache.spark.sql.catalyst.analysis.FunctionRegistry registry, org.apache.spark.sql.catalyst.CatalystConf conf, int maxIterations) { throw new RuntimeException(); }
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.FixedPoint fixedPoint () { throw new RuntimeException(); }
  /**
   * Override to provide additional rules for the "Resolution" batch.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> extendedResolutionRules () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.CTESubstitution$ CTESubstitution () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.WindowsSubstitution$ WindowsSubstitution () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAliases$ ResolveAliases () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGroupingAnalytics$ ResolveGroupingAnalytics () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolvePivot$ ResolvePivot () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveRelations$ ResolveRelations () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveReferences$ ResolveReferences () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> resolveSortOrders (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> ordering, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, boolean throws_) { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveSortReferences$ ResolveSortReferences () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveFunctions$ ResolveFunctions () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.GlobalAggregates$ GlobalAggregates () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAggregateFunctions$ ResolveAggregateFunctions () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGenerate$ ResolveGenerate () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractWindowExpressions$ ExtractWindowExpressions () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.PullOutNondeterministic$ PullOutNondeterministic () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.HandleNullInputsForUDF$ HandleNullInputsForUDF () { throw new RuntimeException(); }
}

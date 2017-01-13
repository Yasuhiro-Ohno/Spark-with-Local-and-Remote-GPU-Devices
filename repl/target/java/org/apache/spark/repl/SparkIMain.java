package org.apache.spark.repl;
/** An interpreter for Scala code.
 * <p>
 *  The main public entry points are compile(), interpret(), and bind().
 *  The compile() method loads a complete Scala file.  The interpret() method
 *  executes one line of Scala code at the request of the user.  The bind()
 *  method binds an object to a variable that can then be used by later
 *  interpreted code.
 * <p>
 *  The overall approach is based on compiling the requested code and then
 *  using a Java classloader and Java reflection to run the code
 *  and access its results.
 * <p>
 *  In more detail, a single compiler instance is used
 *  to accumulate all successfully compiled or interpreted Scala code.  To
 *  "interpret" a line of code, the compiler generates a fresh object that
 *  includes the line of code and which has public member(s) to export
 *  all variables defined by that code.  To extract the result of an
 *  interpreted line to show the user, a second "result object" is created
 *  which imports the variables exported by the above object and then
 *  exports members called "$eval" and "$print". To accomodate user expressions
 *  that read from variables or methods defined in previous statements, "import"
 *  statements are used.
 * <p>
 *  This interpreter shares the strengths and weaknesses of using the
 *  full compiler-to-Java.  The main strength is that interpreted code
 *  behaves exactly as does compiled code, including running at full speed.
 *  The main weakness is that redefining classes and methods is not handled
 *  properly, because rebinding at the Java level is technically difficult.
 * <p>
 *  @author Moez A. Abdel-Gawad
 *  @author Lex Spoon
 */
public  class SparkIMain implements org.apache.spark.repl.SparkImports, org.apache.spark.Logging {
  // no position
  // not preceding
    class naming$ implements scala.tools.nsc.interpreter.Naming {
    public  scala.tools.nsc.Global global () { throw new RuntimeException(); }
    public   naming$ () { throw new RuntimeException(); }
    public  scala.reflect.internal.Names.TermName freshUserTermName () { throw new RuntimeException(); }
    public  boolean isUserTermName (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
    public  boolean isInternalTermName (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
  }
  // no position
  // not preceding
    class deconstruct$ implements scala.tools.nsc.interpreter.StructuredTypeStrings {
    public  scala.tools.nsc.Global global () { throw new RuntimeException(); }
    public   deconstruct$ () { throw new RuntimeException(); }
  }
  // no position
  /**
   * Captures the session names (which are set by system properties) once, instead of for each line.
   */
  public  class FixedSessionNames$ {
    public   FixedSessionNames$ () { throw new RuntimeException(); }
    public  java.lang.String lineName () { throw new RuntimeException(); }
    public  java.lang.String readName () { throw new RuntimeException(); }
    public  java.lang.String evalName () { throw new RuntimeException(); }
    public  java.lang.String printName () { throw new RuntimeException(); }
    public  java.lang.String resultName () { throw new RuntimeException(); }
  }
  // no position
  // not preceding
  private  class exprTyper$ implements org.apache.spark.repl.SparkExprTyper {
    public  org.apache.spark.repl.SparkIMain repl () { throw new RuntimeException(); }
    public   exprTyper$ () { throw new RuntimeException(); }
  }
  private  interface ExposeAddUrl {
    public  void addNewUrl (java.net.URL url) ;
  }
  private  class ReplTypeOps {
    public   ReplTypeOps (scala.reflect.internal.Types.Type tp) { throw new RuntimeException(); }
    public  scala.reflect.internal.Types.Type orElse (scala.Function0<scala.reflect.internal.Types.Type> other) { throw new RuntimeException(); }
    public  scala.reflect.internal.Types.Type andAlso (scala.Function1<scala.reflect.internal.Types.Type, scala.reflect.internal.Types.Type> fn) { throw new RuntimeException(); }
  }
  private  class TranslatingClassLoader extends scala.tools.nsc.interpreter.AbstractFileClassLoader {
    // not preceding
    public   TranslatingClassLoader (java.lang.ClassLoader parent) { throw new RuntimeException(); }
    /** Overridden here to try translating a simple name to the generated
     *  class name if the original attempt fails.  This method is used by
     *  getResourceAsStream as well as findClass.
     * @param name (undocumented)
     * @return (undocumented)
     */
    protected  scala.reflect.io.AbstractFile findAbstractFile (java.lang.String name) { throw new RuntimeException(); }
  }
  /** Here is where we:
   * <p>
   *  1) Read some source code, and put it in the "read" object.
   *  2) Evaluate the read object, and put the result in the "eval" object.
   *  3) Create a String for human consumption, and put it in the "print" object.
   * <p>
   *  Read! Eval! Print! Some of that not yet centralized here.
   */
  public  class ReadEvalPrint {
    public  int lineId () { throw new RuntimeException(); }
    // not preceding
    public   ReadEvalPrint (int lineId) { throw new RuntimeException(); }
    public   ReadEvalPrint () { throw new RuntimeException(); }
    private  scala.tools.nsc.Global.Run lastRun () { throw new RuntimeException(); }
    private  scala.Option<java.lang.Throwable> evalCaught () { throw new RuntimeException(); }
    private  scala.collection.immutable.List<scala.tools.nsc.Global.ConditionalWarning> conditionalWarnings () { throw new RuntimeException(); }
    public  java.lang.String packageName () { throw new RuntimeException(); }
    public  java.lang.String readName () { throw new RuntimeException(); }
    public  java.lang.String evalName () { throw new RuntimeException(); }
    public  java.lang.String printName () { throw new RuntimeException(); }
    public  java.lang.String resultName () { throw new RuntimeException(); }
    public  java.lang.String bindError (java.lang.Throwable t) { throw new RuntimeException(); }
    public  java.lang.String packageDecl () { throw new RuntimeException(); }
    public  java.lang.String pathTo (java.lang.String name) { throw new RuntimeException(); }
    public  java.lang.String packaged (java.lang.String code) { throw new RuntimeException(); }
    public  java.lang.String readPath () { throw new RuntimeException(); }
    public  java.lang.String evalPath () { throw new RuntimeException(); }
    public  java.lang.String printPath () { throw new RuntimeException(); }
    public  java.lang.Object call (java.lang.String name, scala.collection.Seq<java.lang.Object> args) { throw new RuntimeException(); }
    public  scala.util.Either<java.lang.Throwable, java.lang.Object> callEither (java.lang.String name, scala.collection.Seq<java.lang.Object> args) { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> callOpt (java.lang.String name, scala.collection.Seq<java.lang.Object> args) { throw new RuntimeException(); }
    public  class EvalException extends java.lang.RuntimeException {
      public   EvalException (java.lang.String msg, java.lang.Throwable cause) { throw new RuntimeException(); }
    }
    private  scala.runtime.Nothing$ evalError (java.lang.String path, java.lang.Throwable ex) { throw new RuntimeException(); }
    private  java.lang.Class<?> load (java.lang.String path) { throw new RuntimeException(); }
    public  java.lang.Class<?> evalClass () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> evalValue () { throw new RuntimeException(); }
    public  boolean compile (java.lang.String source) { throw new RuntimeException(); }
    /** The innermost object inside the wrapper, found by
     * following accessPath into the outer one.
     * @param accessPath (undocumented)
     * @return (undocumented)
     */
    public  scala.reflect.internal.Symbols.Symbol resolvePathToSymbol (java.lang.String accessPath) { throw new RuntimeException(); }
    /** We get a bunch of repeated warnings for reasons I haven't
     *  entirely figured out yet.  For now, squash.
     * @param run (undocumented)
     */
    private  void updateRecentWarnings (scala.tools.nsc.Global.Run run) { throw new RuntimeException(); }
    private  java.lang.reflect.Method evalMethod (java.lang.String name) { throw new RuntimeException(); }
    private  boolean compileAndSaveRun (java.lang.String label, java.lang.String code) { throw new RuntimeException(); }
  }
  /** One line of code submitted by the user for interpretation */
  public  class Request {
    public  java.lang.String line () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Trees.Tree> trees () { throw new RuntimeException(); }
    // not preceding
    public   Request (java.lang.String line, scala.collection.immutable.List<scala.reflect.internal.Trees.Tree> trees) { throw new RuntimeException(); }
    public  int reqId () { throw new RuntimeException(); }
    public  org.apache.spark.repl.SparkIMain.ReadEvalPrint lineRep () { throw new RuntimeException(); }
    private  java.lang.String _originalLine () { throw new RuntimeException(); }
    public  org.apache.spark.repl.SparkIMain.Request withOriginalLine (java.lang.String s) { throw new RuntimeException(); }
    public  java.lang.String originalLine () { throw new RuntimeException(); }
    /** handlers for each tree in this request */
    public  scala.collection.immutable.List<org.apache.spark.repl.SparkMemberHandlers.MemberHandler> handlers () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<org.apache.spark.repl.SparkMemberHandlers.MemberDefHandler> defHandlers () { throw new RuntimeException(); }
    /** all (public) names defined by these statements */
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> definedNames () { throw new RuntimeException(); }
    /** list of names used by this expression */
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> referencedNames () { throw new RuntimeException(); }
    /** def and val names */
    public  scala.collection.immutable.List<scala.reflect.internal.Names.TermName> termNames () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Names.TypeName> typeNames () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> definedOrImported () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> definedSymbolList () { throw new RuntimeException(); }
    public  scala.reflect.internal.Symbols.Symbol definedTypeSymbol (java.lang.String name) { throw new RuntimeException(); }
    public  scala.reflect.internal.Symbols.Symbol definedTermSymbol (java.lang.String name) { throw new RuntimeException(); }
    public  boolean definedClasses () { throw new RuntimeException(); }
    /** Code to import bound names from previous lines - accessPath is code to
     * append to objectName to access anything bound by request.
     * @return (undocumented)
     */
    public  java.lang.String importsPreamble () { throw new RuntimeException(); }
    public  java.lang.String importsTrailer () { throw new RuntimeException(); }
    public  java.lang.String accessPath () { throw new RuntimeException(); }
    /** Code to access a variable with the specified name */
    public  java.lang.String fullPath (java.lang.String vname) { throw new RuntimeException(); }
    /** Same as fullpath, but after it has been flattened, so:
     *  $line5.$iw.$iw.$iw.Bippy      // fullPath
     *  $line5.$iw$$iw$$iw$Bippy      // fullFlatName
     * @param name (undocumented)
     * @return (undocumented)
     */
    public  java.lang.String fullFlatName (java.lang.String name) { throw new RuntimeException(); }
    /** The unmangled symbol name, but supplemented with line info. */
    public  java.lang.String disambiguated (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
    /** Code to access a variable with the specified name */
    public  java.lang.String fullPath (scala.reflect.internal.Names.Name vname) { throw new RuntimeException(); }
    /** the line of code to compute */
    public  java.lang.String toCompute () { throw new RuntimeException(); }
    // no position
    private  class ObjectSourceCode implements org.apache.spark.repl.SparkIMain.CodeAssembler<org.apache.spark.repl.SparkMemberHandlers.MemberHandler> {
      /** generate the source code for the object that computes this request */
      public   ObjectSourceCode () { throw new RuntimeException(); }
      public  java.lang.String path () { throw new RuntimeException(); }
      public  scala.collection.immutable.List<java.lang.String> envLines () { throw new RuntimeException(); }
      public  java.lang.String preamble () { throw new RuntimeException(); }
      public  java.lang.String postamble () { throw new RuntimeException(); }
      public  scala.Function1<org.apache.spark.repl.SparkMemberHandlers.MemberHandler, java.lang.String> generate () { throw new RuntimeException(); }
    }
    private  org.apache.spark.repl.SparkIMain.Request.ObjectSourceCode$ ObjectSourceCode () { throw new RuntimeException(); }
    // no position
    private  class ResultObjectSourceCode implements org.apache.spark.repl.SparkIMain.CodeAssembler<org.apache.spark.repl.SparkMemberHandlers.MemberHandler> {
      public   ResultObjectSourceCode () { throw new RuntimeException(); }
      /** We only want to generate this code when the result
       *  is a value which can be referred to as-is.
       * @return (undocumented)
       */
      public  java.lang.String evalResult () { throw new RuntimeException(); }
      public  java.lang.String preamble () { throw new RuntimeException(); }
      public  java.lang.String postamble () { throw new RuntimeException(); }
      public  scala.Function1<org.apache.spark.repl.SparkMemberHandlers.MemberHandler, java.lang.String> generate () { throw new RuntimeException(); }
    }
    private  org.apache.spark.repl.SparkIMain.Request.ResultObjectSourceCode$ ResultObjectSourceCode () { throw new RuntimeException(); }
    public <T extends java.lang.Object> scala.Option<T> getEvalTyped () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> getEval () { throw new RuntimeException(); }
    /** Compile the object file.  Returns whether the compilation succeeded.
     * @return (undocumented)
     *  If all goes well, the "types" map is computed. */
    public  boolean compile () { throw new RuntimeException(); }
    public  scala.reflect.internal.Symbols.Symbol resultSymbol () { throw new RuntimeException(); }
    public <T extends java.lang.Object> T applyToResultMember (scala.reflect.internal.Names.Name name, scala.Function1<scala.reflect.internal.Symbols.Symbol, T> f) { throw new RuntimeException(); }
    public  java.lang.String lookupTypeOf (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
    public  scala.Option<scala.reflect.internal.Names.Name> simpleNameOfType (scala.reflect.internal.Names.TypeName name) { throw new RuntimeException(); }
    private <T extends java.lang.Object> scala.collection.immutable.Map<scala.reflect.internal.Names.Name, T> typeMap (scala.Function1<scala.reflect.internal.Types.Type, T> f) { throw new RuntimeException(); }
    /** Types of variables defined by this request. */
    public  scala.collection.immutable.Map<scala.reflect.internal.Names.Name, scala.reflect.internal.Types.Type> compilerTypeOf () { throw new RuntimeException(); }
    /** String representations of same. */
    public  scala.collection.immutable.Map<scala.reflect.internal.Names.Name, java.lang.String> typeOf () { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<scala.reflect.internal.Names.Name, scala.reflect.internal.Symbols.Symbol> definedSymbols () { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<scala.reflect.internal.Names.Name, scala.reflect.internal.Types.Type> typesOfDefinedTerms () { throw new RuntimeException(); }
    /** load and run the code using reflection */
    public  scala.Tuple2<java.lang.String, java.lang.Object> loadAndRun () { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  static public  interface CodeAssembler<T extends java.lang.Object> {
    public  java.lang.String preamble () ;
    public  scala.Function1<T, java.lang.String> generate () ;
    public  java.lang.String postamble () ;
    public  java.lang.String apply (scala.collection.immutable.List<T> contributors) ;
  }
  static public  interface StrippingWriter {
    public  boolean isStripping () ;
    public  java.lang.String stripImpl (java.lang.String str) ;
    public  java.lang.String strip (java.lang.String str) ;
  }
  static public  interface TruncatingWriter {
    public  int maxStringLength () ;
    public  boolean isTruncating () ;
    public  java.lang.String truncate (java.lang.String str) ;
  }
  static public abstract class StrippingTruncatingWriter extends java.io.PrintWriter implements org.apache.spark.repl.SparkIMain.StrippingWriter, org.apache.spark.repl.SparkIMain.TruncatingWriter {
    public   StrippingTruncatingWriter (java.io.PrintWriter out) { throw new RuntimeException(); }
    public  java.lang.String clean (java.lang.String str) { throw new RuntimeException(); }
    public  void write (java.lang.String str) { throw new RuntimeException(); }
  }
  static public  class ReplStrippingWriter extends org.apache.spark.repl.SparkIMain.StrippingTruncatingWriter {
    public   ReplStrippingWriter (org.apache.spark.repl.SparkIMain intp) { throw new RuntimeException(); }
    public  int maxStringLength () { throw new RuntimeException(); }
    public  boolean isStripping () { throw new RuntimeException(); }
    public  boolean isTruncating () { throw new RuntimeException(); }
    public  java.lang.String stripImpl (java.lang.String str) { throw new RuntimeException(); }
  }
  static public  class ReplReporter extends scala.tools.nsc.reporters.ConsoleReporter {
    public   ReplReporter (org.apache.spark.repl.SparkIMain intp) { throw new RuntimeException(); }
    public  void printMessage (java.lang.String msg) { throw new RuntimeException(); }
  }
  static private  java.lang.String removeLineWrapper (java.lang.String s) { throw new RuntimeException(); }
  static private  java.lang.String removeIWPackages (java.lang.String s) { throw new RuntimeException(); }
  static private  java.lang.String removeSparkVals (java.lang.String s) { throw new RuntimeException(); }
  static public  java.lang.String stripString (java.lang.String s) { throw new RuntimeException(); }
  public  java.io.PrintWriter out () { throw new RuntimeException(); }
  // not preceding
  public   SparkIMain (scala.tools.nsc.Settings initialSettings, java.io.PrintWriter out, boolean propagateExceptions) { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  private  boolean SPARK_DEBUG_REPL () { throw new RuntimeException(); }
  /** Local directory to save .class files too */
  private  java.io.File outputDir () { throw new RuntimeException(); }
  /**
   * Returns the path to the output directory containing all generated
   * class files that will be served by the REPL class server.
   * @return (undocumented)
   */
  public  java.io.File getClassOutputDirectory () { throw new RuntimeException(); }
  private  scala.reflect.io.PlainFile virtualDirectory () { throw new RuntimeException(); }
  /** Jetty server that will serve our classes to worker nodes */
  private  int classServerPort () { throw new RuntimeException(); }
  private  org.apache.spark.HttpServer classServer () { throw new RuntimeException(); }
  private  scala.tools.nsc.Settings currentSettings () { throw new RuntimeException(); }
  private  boolean printResults () { throw new RuntimeException(); }
  private  boolean totalSilence () { throw new RuntimeException(); }
  private  boolean _initializeComplete () { throw new RuntimeException(); }
  private  java.util.concurrent.Future<java.lang.Object> _isInitialized () { throw new RuntimeException(); }
  private  boolean bindExceptions () { throw new RuntimeException(); }
  private  java.lang.String _executionWrapper () { throw new RuntimeException(); }
  /**
   * URI of the class server used to feed REPL compiled classes.
   * <p>
   * @return The string representing the class server uri
   */
  public  java.lang.String classServerUri () { throw new RuntimeException(); }
  /** We're going to go to some trouble to initialize the compiler asynchronously.
   *  It's critical that nothing call into it until it's been initialized or we will
   *  run into unrecoverable issues, but the perceived repl startup time goes
   *  through the roof if we wait for it.  So we initialize it with a future and
   *  use a lazy val to ensure that any attempt to use the compiler object waits
   *  on the future.
   * @return (undocumented)
   */
  private  scala.tools.nsc.interpreter.AbstractFileClassLoader _classLoader () { throw new RuntimeException(); }
  private  scala.tools.nsc.Global _compiler () { throw new RuntimeException(); }
  private  scala.tools.nsc.util.ScalaClassLoader.URLClassLoader _runtimeClassLoader () { throw new RuntimeException(); }
  private  scala.Function0<java.lang.Object> nextReqId () { throw new RuntimeException(); }
  private  scala.collection.Seq<java.net.URL> compilerClasspath () { throw new RuntimeException(); }
    scala.tools.nsc.Settings settings () { throw new RuntimeException(); }
  private  java.lang.String mostRecentLine () { throw new RuntimeException(); }
  private <T extends java.lang.Object> T withoutWarnings (scala.Function0<T> body) { throw new RuntimeException(); }
  /** construct an interpreter that reports to Console */
  public   SparkIMain (scala.tools.nsc.Settings settings) { throw new RuntimeException(); }
  public   SparkIMain () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.Logger repllog () { throw new RuntimeException(); }
  public  scala.tools.nsc.interpreter.Formatting formatting () { throw new RuntimeException(); }
  public  scala.tools.nsc.reporters.ConsoleReporter reporter () { throw new RuntimeException(); }
  /**
   * Determines if errors were reported (typically during compilation).
   * <p>
   * @note This is not for runtime errors
   * <p>
   * @return True if had errors, otherwise false
   */
  public  boolean isReportingErrors () { throw new RuntimeException(); }
  private  void echo (java.lang.String msg) { throw new RuntimeException(); }
  private  scala.collection.immutable.List<scala.reflect.internal.util.BatchSourceFile> _initSources () { throw new RuntimeException(); }
  private  boolean _initialize () { throw new RuntimeException(); }
  private  java.lang.String tquoted (java.lang.String s) { throw new RuntimeException(); }
    void initialize (scala.Function0<scala.runtime.BoxedUnit> postInitSignal) { throw new RuntimeException(); }
  /**
   * Initializes the underlying compiler/interpreter in a blocking fashion.
   * <p>
   * @note Must be executed before using SparkIMain!
   */
  public  void initializeSynchronous () { throw new RuntimeException(); }
  private  boolean isInitializeComplete () { throw new RuntimeException(); }
  /**
   * The underlying compiler used to generate ASTs and execute code.
   * @return (undocumented)
   */
  public  scala.tools.nsc.Global global () { throw new RuntimeException(); }
  private  scala.tools.nsc.Global compiler () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.repl.SparkIMain.naming$ naming () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.repl.SparkIMain.deconstruct$ deconstruct () { throw new RuntimeException(); }
  public  java.lang.Object memberHandlers () { throw new RuntimeException(); }
  /**
   * Suppresses overwriting print results during the operation.
   * <p>
   * @param body The block to execute
   * @tparam T The return type of the block
   * <p>
   * @return The result from executing the block
   */
  public <T extends java.lang.Object> T beQuietDuring (scala.Function0<T> body) { throw new RuntimeException(); }
  /**
   * Completely masks all output during the operation (minus JVM standard
   * out and error).
   * <p>
   * @param operation The block to execute
   * @tparam T The return type of the block
   * <p>
   * @return The result from executing the block
   */
  public <T extends java.lang.Object> T beSilentDuring (scala.Function0<T> operation) { throw new RuntimeException(); }
   <T extends java.lang.Object> scala.tools.nsc.interpreter.Results.Result quietRun (java.lang.String code) { throw new RuntimeException(); }
  private <T extends java.lang.Object> scala.PartialFunction<java.lang.Throwable, T> logAndDiscard (java.lang.String label, scala.Function0<T> alt) { throw new RuntimeException(); }
  /** takes AnyRef because it may be binding a Throwable or an Exceptional */
  private <T extends java.lang.Object> T withLastExceptionLock (scala.Function0<T> body, scala.Function0<T> alt) { throw new RuntimeException(); }
  /**
   * Contains the code (in string form) representing a wrapper around all
   * code executed by this instance.
   * <p>
   * @return The wrapper code as a string
   */
  public  java.lang.String executionWrapper () { throw new RuntimeException(); }
  /**
   * Sets the code to use as a wrapper around all code executed by this
   * instance.
   * <p>
   * @param code The wrapper code as a string
   */
  public  void setExecutionWrapper (java.lang.String code) { throw new RuntimeException(); }
  /**
   * Clears the code used as a wrapper around all code executed by
   * this instance.
   */
  public  void clearExecutionWrapper () { throw new RuntimeException(); }
  /** interpreter settings */
  private  org.apache.spark.repl.SparkISettings isettings () { throw new RuntimeException(); }
  /**
   * Instantiates a new compiler used by SparkIMain. Overridable to provide
   * own instance of a compiler.
   * <p>
   * @param settings The settings to provide the compiler
   * @param reporter The reporter to use for compiler output
   * <p>
   * @return The compiler as a Global
   */
  protected  scala.tools.nsc.interpreter.ReplGlobal newCompiler (scala.tools.nsc.Settings settings, scala.tools.nsc.reporters.Reporter reporter) { throw new RuntimeException(); }
  /**
   * Adds any specified jars to the compile and runtime classpaths.
   * <p>
   * @note Currently only supports jars, not directories
   * @param urls The list of items to add to the compile and runtime classpaths
   */
  public  void addUrlsToClassPath (scala.collection.Seq<java.net.URL> urls) { throw new RuntimeException(); }
  private  void updateCompilerClassPath (scala.collection.Seq<java.net.URL> urls) { throw new RuntimeException(); }
  private  scala.tools.nsc.util.MergedClassPath<scala.reflect.io.AbstractFile> mergeUrlsIntoClassPath (scala.tools.nsc.backend.JavaPlatform platform, scala.collection.Seq<java.net.URL> urls) { throw new RuntimeException(); }
  /**
   * Represents the parent classloader used by this instance. Can be
   * overridden to provide alternative classloader.
   * <p>
   * @return The classloader used as the parent loader of this instance
   */
  protected  java.lang.ClassLoader parentClassLoader () { throw new RuntimeException(); }
  private  void resetClassLoader () { throw new RuntimeException(); }
  private final  void ensureClassLoader () { throw new RuntimeException(); }
    scala.tools.nsc.interpreter.AbstractFileClassLoader classLoader () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.AbstractFileClassLoader makeClassLoader () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.AbstractFileClassLoader getInterpreterClassLoader () { throw new RuntimeException(); }
    void setContextClassLoader () { throw new RuntimeException(); }
  /**
   * Returns the real name of a class based on its repl-defined name.
   * <p>
   * ==Example==
   * Given a simple repl-defined name, returns the real name of
   * the class representing it, e.g. for "Bippy" it may return
   * <pre><code>
   *     $line19.$read$$iw$$iw$$iw$$iw$$iw$$iw$$iw$$iw$Bippy
   * </code></pre>
   * <p>
   * @param simpleName The repl-defined name whose real name to retrieve
   * <p>
   * @return Some real name if the simple name exists, else None
   */
  public  scala.Option<java.lang.String> generatedName (java.lang.String simpleName) { throw new RuntimeException(); }
    java.lang.String flatName (java.lang.String id) { throw new RuntimeException(); }
    scala.Option<java.lang.String> optFlatName (java.lang.String id) { throw new RuntimeException(); }
  /**
   * Retrieves all simple names contained in the current instance.
   * <p>
   * @return A list of sorted names
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> allDefinedNames () { throw new RuntimeException(); }
  private  java.lang.String pathToType (java.lang.String id) { throw new RuntimeException(); }
    java.lang.String pathToTerm (java.lang.String id) { throw new RuntimeException(); }
  /**
   * Retrieves the full code path to access the specified simple name
   * content.
   * <p>
   * @param name The simple name of the target whose path to determine
   * <p>
   * @return The full path used to access the specified target (name)
   */
  public  java.lang.String pathToName (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
  /** Most recent tree handled which wasn't wholly synthetic. */
  private  scala.Option<scala.reflect.internal.Trees.Tree> mostRecentlyHandledTree () { throw new RuntimeException(); }
  /** Stubs for work in progress. */
  private  void handleTypeRedefinition (scala.reflect.internal.Names.TypeName name, org.apache.spark.repl.SparkIMain.Request old, org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  private  void handleTermRedefinition (scala.reflect.internal.Names.TermName name, org.apache.spark.repl.SparkIMain.Request old, org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  private  void recordRequest (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  private  void replwarn (scala.Function0<java.lang.String> msg) { throw new RuntimeException(); }
  private  boolean isParseable (java.lang.String line) { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.Object, scala.tools.nsc.Global.Run> compileSourcesKeepingRun (scala.collection.Seq<scala.reflect.internal.util.SourceFile> sources) { throw new RuntimeException(); }
  /**
   * Compiles specified source files.
   * <p>
   * @param sources The sequence of source files to compile
   * <p>
   * @return True if successful, otherwise false
   */
  public  boolean compileSources (scala.collection.Seq<scala.reflect.internal.util.SourceFile> sources) { throw new RuntimeException(); }
  /**
   * Compiles a string of code.
   * <p>
   * @param code The string of code to compile
   * <p>
   * @return True if successful, otherwise false
   */
  public  boolean compileString (java.lang.String code) { throw new RuntimeException(); }
  /** Build a request from the user. <code>trees</code> is <code>line</code> after being parsed.
   * @param line (undocumented)
   * @param trees (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.repl.SparkIMain.Request buildRequest (java.lang.String line, scala.collection.immutable.List<scala.reflect.internal.Trees.Tree> trees) { throw new RuntimeException(); }
  private  java.lang.String removeComments (java.lang.String line) { throw new RuntimeException(); }
  private  int safePos (scala.reflect.internal.Trees.Tree t, int alt) { throw new RuntimeException(); }
  private  int earliestPosition (scala.reflect.internal.Trees.Tree tree) { throw new RuntimeException(); }
  private  scala.util.Either<scala.tools.nsc.interpreter.Results.Result, org.apache.spark.repl.SparkIMain.Request> requestFromLine (java.lang.String line, boolean synthetic) { throw new RuntimeException(); }
  private  scala.reflect.internal.Types.Type normalizeNonPublic (scala.reflect.internal.Types.Type tp) { throw new RuntimeException(); }
  /**
   * Interpret one line of input. All feedback, including parse errors
   * and evaluation results, are printed via the supplied compiler's
   * reporter. Values defined are available for future interpreted strings.
   * <p>
   * @note This assigns variables with user name structure like "res0"
   * <p>
   * @param line The line representing the code to interpret
   * <p>
   * @return Whether the line was interpreted successfully, or failed due to
   *         incomplete code, compilation error, or runtime error
   */
  public  scala.tools.nsc.interpreter.Results.Result interpret (java.lang.String line) { throw new RuntimeException(); }
  /**
   * Interpret one line of input. All feedback, including parse errors
   * and evaluation results, are printed via the supplied compiler's
   * reporter. Values defined are available for future interpreted strings.
   * <p>
   * @note This assigns variables with synthetic (generated) name structure
   *       like "$ires0"
   * <p>
   * @param line The line representing the code to interpret
   * <p>
   * @return Whether the line was interpreted successfully, or failed due to
   *         incomplete code, compilation error, or runtime error
   */
  public  scala.tools.nsc.interpreter.Results.Result interpretSynthetic (java.lang.String line) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.Results.Result interpret (java.lang.String line, boolean synthetic) { throw new RuntimeException(); }
  /**
   * Bind a specified name to a specified value.  The name may
   * later be used by expressions passed to interpret.
   * <p>
   * @note This binds via compilation and interpretation
   * <p>
   * @param name The variable name to bind
   * @param boundType The type of the variable, as a string
   * @param value The object value to bind to it
   * <p>
   * @return An indication of whether the binding succeeded or failed
   *         using interpreter results
   * @param modifiers (undocumented)
   */
  public  scala.tools.nsc.interpreter.Results.Result bind (java.lang.String name, java.lang.String boundType, Object value, scala.collection.immutable.List<java.lang.String> modifiers) { throw new RuntimeException(); }
  /**
   * Bind a specified name to a specified value directly.
   * <p>
   * @note This updates internal bound names directly
   * <p>
   * @param name The variable name to bind
   * @param boundType The type of the variable, as a string
   * @param value The object value to bind to it
   * <p>
   * @return An indication of whether the binding succeeded or failed
   *         using interpreter results
   */
  public  scala.tools.nsc.interpreter.Results.Result directBind (java.lang.String name, java.lang.String boundType, Object value) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.Results.Result directBind (scala.tools.nsc.interpreter.NamedParam p) { throw new RuntimeException(); }
  private <T extends java.lang.Object> scala.tools.nsc.interpreter.Results.Result directBind (java.lang.String name, T value, scala.reflect.api.TypeTags.TypeTag<T> evidence$1, scala.reflect.ClassTag<T> evidence$2) { throw new RuntimeException(); }
  /**
   * Overwrites previously-bound val with a new instance.
   * <p>
   * @param p The named parameters used to provide the name, value, and type
   * <p>
   * @return The results of rebinding the named val
   */
  public  scala.tools.nsc.interpreter.Results.Result rebind (scala.tools.nsc.interpreter.NamedParam p) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.Results.Result quietImport (scala.collection.Seq<java.lang.String> ids) { throw new RuntimeException(); }
  /**
   * Executes an import statement per "id" provided
   * <p>
   * @example addImports("org.apache.spark.SparkContext")
   * <p>
   * @param ids The series of "id" strings used for import statements
   * <p>
   * @return The results of importing the series of "id" strings
   */
  public  scala.tools.nsc.interpreter.Results.Result addImports (scala.collection.Seq<java.lang.String> ids) { throw new RuntimeException(); }
    scala.tools.nsc.interpreter.Results.Result quietBind (scala.tools.nsc.interpreter.NamedParam p) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.Results.Result bind (scala.tools.nsc.interpreter.NamedParam p) { throw new RuntimeException(); }
  private <T extends java.lang.Object> scala.tools.nsc.interpreter.Results.Result bind (java.lang.String name, T value, scala.reflect.api.TypeTags.TypeTag<T> evidence$3, scala.reflect.ClassTag<T> evidence$4) { throw new RuntimeException(); }
  /**
   * Executes an import statement per "id" provided
   * <p>
   * @example addImports("org.apache.spark.SparkContext")
   * <p>
   * @param ids The series of "id" strings used for import statements
   * <p>
   * @return The results of importing the series of "id" strings
   * @param x (undocumented)
   */
  private  scala.tools.nsc.interpreter.Results.Result bindSyntheticValue (Object x) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.Results.Result bindValue (Object x) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.Results.Result bindValue (java.lang.String name, Object x) { throw new RuntimeException(); }
  /**
   * Reset this interpreter, forgetting all user-specified requests.
   */
  public  void reset () { throw new RuntimeException(); }
  /**
   * Stops the underlying REPL class server and flushes the reporter used
   * for compiler output.
   */
  public  void close () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.repl.SparkIMain.FixedSessionNames$ FixedSessionNames () { throw new RuntimeException(); }
  /**
   * Returns the name of the most recent interpreter result. Useful for
   * for extracting information regarding the previous result.
   * <p>
   * @return The simple name of the result (such as res0)
   */
  public  java.lang.String mostRecentVar () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<scala.Tuple2<scala.reflect.internal.util.Position, java.lang.String>> mostRecentWarnings () { throw new RuntimeException(); }
  /**
   * Returns a list of recent warnings from compiler execution.
   * <p>
   * @return The list of tuples (compiler position, warning)
   */
  public  scala.collection.immutable.List<scala.Tuple2<scala.reflect.internal.util.Position, java.lang.String>> lastWarnings () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<scala.reflect.internal.Trees.Tree> treesForRequestId (int id) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.repl.SparkIMain.Request> requestForReqId (int id) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.repl.SparkIMain.Request> requestForName (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.repl.SparkIMain.Request> requestForIdent (java.lang.String line) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.repl.SparkIMain.Request> requestHistoryForName (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.repl.SparkMemberHandlers.MemberHandler> definitionForName (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
  /**
   * Retrieves the object representing the id (variable name, method name,
   * class name, etc) provided.
   * <p>
   * @param id The id (variable name, method name, class name, etc) whose
   *           associated content to retrieve
   * <p>
   * @return Some containing term name (id) representation if exists, else None
   */
  public  scala.Option<java.lang.Object> valueOfTerm (java.lang.String id) { throw new RuntimeException(); }
  /**
   * Retrieves the class representing the id (variable name, method name,
   * class name, etc) provided.
   * <p>
   * @param id The id (variable name, method name, class name, etc) whose
   *           associated class to retrieve
   * <p>
   * @return Some containing term name (id) class if exists, else None
   */
  public  scala.Option<java.lang.Class<?>> classOfTerm (java.lang.String id) { throw new RuntimeException(); }
  /**
   * Retrieves the type representing the id (variable name, method name,
   * class name, etc) provided.
   * <p>
   * @param id The id (variable name, method name, class name, etc) whose
   *           associated type to retrieve
   * <p>
   * @return The Type information about the term name (id) provided
   */
  public  scala.reflect.internal.Types.Type typeOfTerm (java.lang.String id) { throw new RuntimeException(); }
  /**
   * Retrieves the symbol representing the id (variable name, method name,
   * class name, etc) provided.
   * <p>
   * @param id The id (variable name, method name, class name, etc) whose
   *           associated symbol to retrieve
   * <p>
   * @return The Symbol information about the term name (id) provided
   */
  public  scala.reflect.internal.Symbols.Symbol symbolOfTerm (java.lang.String id) { throw new RuntimeException(); }
  private  scala.reflect.internal.Symbols.Symbol symbolOfType (java.lang.String id) { throw new RuntimeException(); }
  /**
   * Retrieves the runtime class and type representing the id (variable name,
   * method name, class name, etc) provided.
   * <p>
   * @param id The id (variable name, method name, class name, etc) whose
   *           associated runtime class and type to retrieve
   * <p>
   * @return Some runtime class and Type information as a tuple for the
   *         provided term name if it exists, else None
   */
  public  scala.Option<scala.Tuple2<java.lang.Class<?>, scala.reflect.internal.Types.Type>> runtimeClassAndTypeOfTerm (java.lang.String id) { throw new RuntimeException(); }
  /**
   * Retrieves the runtime type representing the id (variable name,
   * method name, class name, etc) provided.
   * <p>
   * @param id The id (variable name, method name, class name, etc) whose
   *           associated runtime type to retrieve
   * <p>
   * @return The runtime Type information about the term name (id) provided
   */
  public  scala.reflect.internal.Types.Type runtimeTypeOfTerm (java.lang.String id) { throw new RuntimeException(); }
  private  scala.reflect.internal.Types.Type cleanMemberDecl (scala.reflect.internal.Symbols.Symbol owner, scala.reflect.internal.Names.Name member) { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  private  org.apache.spark.repl.SparkIMain.exprTyper$ exprTyper () { throw new RuntimeException(); }
  /**
   * Constructs a list of abstract syntax trees representing the provided code.
   * <p>
   * @param line The line of code to parse and construct into ASTs
   * <p>
   * @return Some list of ASTs if the line is valid, else None
   */
  public  scala.Option<scala.collection.immutable.List<scala.reflect.internal.Trees.Tree>> parse (java.lang.String line) { throw new RuntimeException(); }
  /**
   * Constructs a Symbol representing the final result of the expression
   * provided or representing the definition provided.
   * <p>
   * @param code The line of code
   * <p>
   * @return The Symbol or NoSymbol (found under scala.reflect.internal)
   */
  public  scala.reflect.internal.Symbols.Symbol symbolOfLine (java.lang.String code) { throw new RuntimeException(); }
  /**
   * Constucts type information based on the provided expression's final
   * result or the definition provided.
   * <p>
   * @param expr The expression or definition
   * <p>
   * @param silent Whether to output information while constructing the type
   * <p>
   * @return The type information or an error
   */
  public  scala.reflect.internal.Types.Type typeOfExpression (java.lang.String expr, boolean silent) { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<scala.reflect.internal.Names.TermName> onlyTerms (scala.collection.immutable.List<scala.reflect.internal.Names.Name> xs) { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<scala.reflect.internal.Names.TypeName> onlyTypes (scala.collection.immutable.List<scala.reflect.internal.Names.Name> xs) { throw new RuntimeException(); }
  /**
   * Retrieves the defined, public names in the compiler.
   * <p>
   * @return The list of matching "term" names
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Names.TermName> definedTerms () { throw new RuntimeException(); }
  /**
   * Retrieves the defined type names in the compiler.
   * <p>
   * @return The list of matching type names
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Names.TypeName> definedTypes () { throw new RuntimeException(); }
  /**
   * Retrieves the defined symbols in the compiler.
   * <p>
   * @return The set of matching Symbol instances
   */
  public  scala.collection.immutable.Set<scala.reflect.internal.Symbols.Symbol> definedSymbols () { throw new RuntimeException(); }
  /**
   * Retrieves the list of public symbols in the compiler.
   * <p>
   * @return The list of public Symbol instances
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> definedSymbolList () { throw new RuntimeException(); }
  /**
   * Retrieves defined, public names that are not res0 or the result of a direct bind.
   * <p>
   * @return The list of matching "term" names
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Names.TermName> namedDefinedTerms () { throw new RuntimeException(); }
  private  scala.reflect.internal.Symbols.Symbol findName (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
  /** Translate a repl-defined identifier into a Symbol.
   * @param name (undocumented)
   * @return (undocumented)
   */
  private  scala.reflect.internal.Symbols.Symbol apply (java.lang.String name) { throw new RuntimeException(); }
  private  scala.reflect.internal.Symbols.Symbol types (java.lang.String name) { throw new RuntimeException(); }
  private  scala.reflect.internal.Symbols.Symbol terms (java.lang.String name) { throw new RuntimeException(); }
  private <T extends java.lang.Object> scala.reflect.internal.Symbols.Symbol types (scala.reflect.ClassTag<T> evidence$5) { throw new RuntimeException(); }
  private <T extends java.lang.Object> scala.reflect.internal.Symbols.Symbol terms (scala.reflect.ClassTag<T> evidence$6) { throw new RuntimeException(); }
  private <T extends java.lang.Object> scala.reflect.internal.Symbols.Symbol apply (scala.reflect.ClassTag<T> evidence$7) { throw new RuntimeException(); }
  /**
   * Retrieves the Symbols representing classes in the compiler.
   * <p>
   * @return The list of matching ClassSymbol instances
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.ClassSymbol> classSymbols () { throw new RuntimeException(); }
  /**
   * Retrieves the Symbols representing methods in the compiler.
   * <p>
   * @return The list of matching MethodSymbol instances
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.MethodSymbol> methodSymbols () { throw new RuntimeException(); }
  /** the previous requests this interpreter has processed */
  private  org.apache.spark.repl.SparkIMain.Request executingRequest () { throw new RuntimeException(); }
  private  scala.collection.mutable.ListBuffer<org.apache.spark.repl.SparkIMain.Request> prevRequests () { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<scala.reflect.internal.Names.Name, org.apache.spark.repl.SparkIMain.Request> referencedNameMap () { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<scala.reflect.internal.Names.Name, org.apache.spark.repl.SparkIMain.Request> definedNameMap () { throw new RuntimeException(); }
  private  scala.collection.mutable.Set<scala.reflect.internal.Names.Name> directlyBoundNames () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<org.apache.spark.repl.SparkMemberHandlers.MemberHandler> allHandlers () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<org.apache.spark.repl.SparkMemberHandlers.MemberDefHandler> allDefHandlers () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> allDefSymbols () { throw new RuntimeException(); }
  private  org.apache.spark.repl.SparkIMain.Request lastRequest () { throw new RuntimeException(); }
    scala.collection.immutable.List<org.apache.spark.repl.SparkIMain.Request> prevRequestList () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.String> allSeenTypes () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<scala.reflect.internal.Names.Name> allImplicits () { throw new RuntimeException(); }
    scala.collection.immutable.List<org.apache.spark.repl.SparkMemberHandlers.ImportHandler> importHandlers () { throw new RuntimeException(); }
  /**
   * Retrieves a list of unique defined and imported names in the compiler.
   * <p>
   * @return The list of "term" names
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> visibleTermNames () { throw new RuntimeException(); }
  /** Another entry point for tab-completion, ids in scope */
    scala.collection.immutable.List<java.lang.String> unqualifiedIds () { throw new RuntimeException(); }
  /** Parse the ScalaSig to find type aliases */
  private  scala.Option<java.lang.String> aliasForType (java.lang.String path) { throw new RuntimeException(); }
  private  void withoutUnwrapping (scala.Function0<scala.runtime.BoxedUnit> op) { throw new RuntimeException(); }
    java.lang.String symbolDefString (scala.reflect.internal.Symbols.Symbol sym) { throw new RuntimeException(); }
  private  void showCodeIfDebugging (java.lang.String code) { throw new RuntimeException(); }
   <T extends java.lang.Object> T debugging (java.lang.String msg, T res) { throw new RuntimeException(); }
}

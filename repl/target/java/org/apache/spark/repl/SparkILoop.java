package org.apache.spark.repl;
/** The Scala interactive shell.  It provides a read-eval-print loop
 *  around the Interpreter class.
 *  After instantiation, clients should call the main() method.
 * <p>
 *  If no in0 is specified, then input will come from the console, and
 *  the class will attempt to provide input editing feature such as
 *  input history.
 * <p>
 *  @author Moez A. Abdel-Gawad
 *  @author  Lex Spoon
 *  @version 1.2
 */
public  class SparkILoop implements scala.tools.nsc.interpreter.LoopCommands, org.apache.spark.repl.SparkILoopInit, org.apache.spark.Logging {
  // no position
  private  class paste$ extends scala.tools.nsc.interpreter.Pasted {
    public   paste$ () { throw new RuntimeException(); }
    public  java.lang.String ContinueString () { throw new RuntimeException(); }
    public  java.lang.String PromptString () { throw new RuntimeException(); }
    public  void interpret (java.lang.String line) { throw new RuntimeException(); }
    public  void transcript (java.lang.String start) { throw new RuntimeException(); }
  }
  public  class IMainOps<T extends org.apache.spark.repl.SparkIMain> {
    public  T intp () { throw new RuntimeException(); }
    // not preceding
    public   IMainOps (T intp) { throw new RuntimeException(); }
    public  void printAfterTyper (scala.Function0<java.lang.String> msg) { throw new RuntimeException(); }
    /** Strip NullaryMethodType artifacts. */
    private  scala.reflect.internal.Types.Type replInfo (scala.reflect.internal.Symbols.Symbol sym) { throw new RuntimeException(); }
    public  void echoTypeStructure (scala.reflect.internal.Symbols.Symbol sym) { throw new RuntimeException(); }
    public  void echoTypeSignature (scala.reflect.internal.Symbols.Symbol sym, boolean verbose) { throw new RuntimeException(); }
  }
  public  class SparkILoopInterpreter extends org.apache.spark.repl.SparkIMain {
    public   SparkILoopInterpreter () { throw new RuntimeException(); }
    public  java.lang.Object formatting () { throw new RuntimeException(); }
    protected  java.lang.ClassLoader parentClassLoader () { throw new RuntimeException(); }
  }
  static public  org.apache.spark.repl.SparkIMain loopToInterpreter (org.apache.spark.repl.SparkILoop repl) { throw new RuntimeException(); }
  static public  java.lang.String[] getAddedJars () { throw new RuntimeException(); }
  static   java.lang.String runForTranscript (java.lang.String code, scala.tools.nsc.Settings settings) { throw new RuntimeException(); }
  /** Creates an interpreter loop with default settings and feeds
   *  the given code to it as input.
   * @param code (undocumented)
   * @param sets (undocumented)
   * @return (undocumented)
   */
  static   java.lang.String run (java.lang.String code, scala.tools.nsc.Settings sets) { throw new RuntimeException(); }
  static   java.lang.String run (scala.collection.immutable.List<java.lang.String> lines) { throw new RuntimeException(); }
  private  scala.Option<java.io.BufferedReader> in0 () { throw new RuntimeException(); }
  protected  java.io.PrintWriter out () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> master () { throw new RuntimeException(); }
  // not preceding
  public   SparkILoop (scala.Option<java.io.BufferedReader> in0, java.io.PrintWriter out, scala.Option<java.lang.String> master) { throw new RuntimeException(); }
  public   SparkILoop (java.io.BufferedReader in0, java.io.PrintWriter out, java.lang.String master) { throw new RuntimeException(); }
  public   SparkILoop (java.io.BufferedReader in0, java.io.PrintWriter out) { throw new RuntimeException(); }
  public   SparkILoop () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.InteractiveReader in () { throw new RuntimeException(); }
  public  scala.tools.nsc.Settings settings () { throw new RuntimeException(); }
  public  org.apache.spark.repl.SparkIMain intp () { throw new RuntimeException(); }
  public  org.apache.spark.repl.SparkIMain interpreter () { throw new RuntimeException(); }
  /** Having inherited the difficult "var-ness" of the repl instance,
   *  I'm trying to work around it by moving operations into a class from
   *  which it will appear a stable prefix.
   * @param f (undocumented)
   * @return (undocumented)
   */
  private <T extends java.lang.Object> T onIntp (scala.Function1<org.apache.spark.repl.SparkIMain, T> f) { throw new RuntimeException(); }
  public  org.apache.spark.repl.SparkILoop.IMainOps<org.apache.spark.repl.SparkIMain> stabilizeIMain (org.apache.spark.repl.SparkIMain intp) { throw new RuntimeException(); }
  /** TODO -
   *  -n normalize
   *  -l label with case class parameter names
   *  -c complete - leave nothing out
   * @param expr (undocumented)
   * @param verbose (undocumented)
   * @return (undocumented)
   */
  private  scala.tools.nsc.interpreter.LoopCommands.Result typeCommandInternal (java.lang.String expr, boolean verbose) { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  public  void echoCommandMessage (java.lang.String msg) { throw new RuntimeException(); }
    boolean isAsync () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.session.History history () { throw new RuntimeException(); }
  /** The context class loader at the time this object was created */
  protected  java.lang.ClassLoader originalClassLoader () { throw new RuntimeException(); }
  private  java.lang.String addedClasspath () { throw new RuntimeException(); }
  /** A reverse list of commands to replay if the user requests a :replay */
  private  scala.collection.immutable.List<java.lang.String> replayCommandStack () { throw new RuntimeException(); }
  /** A list of commands to replay if the user requests a :replay */
  private  scala.collection.immutable.List<java.lang.String> replayCommands () { throw new RuntimeException(); }
  /** Record a command for replay should the user request a :replay */
  private  void addReplay (java.lang.String cmd) { throw new RuntimeException(); }
  private <T extends java.lang.Object> T savingReplayStack (scala.Function0<T> body) { throw new RuntimeException(); }
  private <T extends java.lang.Object> T savingReader (scala.Function0<T> body) { throw new RuntimeException(); }
  private  void sparkCleanUp () { throw new RuntimeException(); }
  /** Close the interpreter and set the var to null. */
  private  void closeInterpreter () { throw new RuntimeException(); }
  /**
   * Constructs a new interpreter.
   */
  protected  void createInterpreter () { throw new RuntimeException(); }
  /** print a friendly help message */
  private  scala.tools.nsc.interpreter.LoopCommands.Result helpCommand (java.lang.String line) { throw new RuntimeException(); }
  private  void helpSummary () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result ambiguousError (java.lang.String cmd) { throw new RuntimeException(); }
  private  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> matchingCommands (java.lang.String cmd) { throw new RuntimeException(); }
  private  scala.Option<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> uniqueCommand (java.lang.String cmd) { throw new RuntimeException(); }
  private  boolean fallbackMode () { throw new RuntimeException(); }
  private  void toggleFallbackMode () { throw new RuntimeException(); }
  /** Show the history */
  private  scala.tools.nsc.interpreter.LoopCommands.LoopCommand historyCommand () { throw new RuntimeException(); }
    void echoAndRefresh (java.lang.String msg) { throw new RuntimeException(); }
    void echo (java.lang.String msg) { throw new RuntimeException(); }
  private  void echoNoNL (java.lang.String msg) { throw new RuntimeException(); }
  /** Search the history */
  private  void searchHistory (java.lang.String _cmdline) { throw new RuntimeException(); }
  private  java.lang.String currentPrompt () { throw new RuntimeException(); }
  /**
   * Sets the prompt string used by the REPL.
   * <p>
   * @param prompt The new prompt string
   */
  public  void setPrompt (java.lang.String prompt) { throw new RuntimeException(); }
  /**
   * Represents the current prompt string used by the REPL.
   * <p>
   * @return The current prompt string
   */
  public  java.lang.String prompt () { throw new RuntimeException(); }
  /** Standard commands */
  private  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> standardCommands () { throw new RuntimeException(); }
  /** Power user commands */
  private  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> powerCommands () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<scala.Tuple2<java.lang.String, java.lang.String>> typeTransforms () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result importsCommand (java.lang.String line) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result implicitsCommand (java.lang.String line) { throw new RuntimeException(); }
  private  scala.Option<scala.reflect.io.File> findToolsJar () { throw new RuntimeException(); }
  private  scala.tools.nsc.util.ScalaClassLoader addToolsJarToLoader () { throw new RuntimeException(); }
  private  scala.tools.util.JavapClass newJavap () { throw new RuntimeException(); }
  private  scala.tools.util.JavapClass javap () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result typeCommand (java.lang.String line0) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result warningsCommand () { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result javapCommand (java.lang.String line) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result wrapCommand (java.lang.String line) { throw new RuntimeException(); }
  private  java.lang.String pathToPhaseWrapper () { throw new RuntimeException(); }
  /**
   * Provides a list of available commands.
   * <p>
   * @return The list of commands
   */
  public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> commands () { throw new RuntimeException(); }
  private  java.lang.String replayQuestionMessage () { throw new RuntimeException(); }
  private  boolean crashRecovery (java.lang.Throwable ex) { throw new RuntimeException(); }
  /** The main read-eval-print loop for the repl.  It calls
   *  command() for each line of input, and stops when
   *  command() returns false.
   */
  private  void loop () { throw new RuntimeException(); }
  /** interpret all lines from a specified file */
  private  void interpretAllFrom (scala.reflect.io.File file) { throw new RuntimeException(); }
  /** create a new interpreter and replay the given commands */
  private  void replay () { throw new RuntimeException(); }
  private  void resetCommand () { throw new RuntimeException(); }
  private  void reset () { throw new RuntimeException(); }
  /** fork a shell and run a command */
  private  scala.tools.nsc.interpreter.LoopCommands.LoopCommand shCommand () { throw new RuntimeException(); }
  private  void withFile (java.lang.String filename, scala.Function1<scala.reflect.io.File, scala.runtime.BoxedUnit> action) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result loadCommand (java.lang.String arg) { throw new RuntimeException(); }
  private  void addAllClasspath (scala.collection.Seq<java.lang.String> args) { throw new RuntimeException(); }
  private  void addClasspath (java.lang.String arg) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result powerCmd () { throw new RuntimeException(); }
    void enablePowerMode (boolean isDuringInit) { throw new RuntimeException(); }
  private  void asyncEcho (boolean async, scala.Function0<java.lang.String> msg) { throw new RuntimeException(); }
  private  void verbosity () { throw new RuntimeException(); }
  /** Run one command submitted by the user.  Two values are returned:
   * (1) whether to keep running, (2) the line to record for replay,
   * @param line (undocumented)
   * @return (undocumented)
   * if any. */
    scala.tools.nsc.interpreter.LoopCommands.Result command (java.lang.String line) { throw new RuntimeException(); }
  private  scala.collection.Iterator<java.lang.String> readWhile (scala.Function1<java.lang.String, java.lang.Object> cond) { throw new RuntimeException(); }
  private  scala.tools.nsc.interpreter.LoopCommands.Result pasteCommand () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  private  org.apache.spark.repl.SparkILoop.paste$ paste () { throw new RuntimeException(); }
  /** Interpret expressions starting with the first line.
   * Read lines until a complete compilation unit is available
   * or until a syntax error has been seen.  If a full unit is
   * read, go ahead and interpret it.  Return the full string
   * to be recorded for replay, if any.
   * @param code (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<java.lang.String> interpretStartingWith (java.lang.String code) { throw new RuntimeException(); }
  private  void loadFiles (scala.tools.nsc.Settings settings) { throw new RuntimeException(); }
  /** Tries to create a JLineReader, falling back to SimpleReader:
   *  unless settings or properties are such that it should start
   *  with SimpleReader.
   * @param settings (undocumented)
   * @return (undocumented)
   */
  private  scala.tools.nsc.interpreter.InteractiveReader chooseReader (scala.tools.nsc.Settings settings) { throw new RuntimeException(); }
  private  scala.reflect.api.JavaUniverse u () { throw new RuntimeException(); }
  private  org.apache.spark.repl.SparkILoop.u m () { throw new RuntimeException(); }
  private <T extends java.lang.Object> scala.reflect.api.TypeTags.TypeTag<T> tagOfStaticClass (scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  private  boolean process (scala.tools.nsc.Settings settings) { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext createSparkContext () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext createSQLContext () { throw new RuntimeException(); }
  private  java.lang.String getMaster () { throw new RuntimeException(); }
  /** process command-line arguments and do as they request */
  public  boolean process (java.lang.String[] args) { throw new RuntimeException(); }
  private  void main (scala.tools.nsc.Settings settings) { throw new RuntimeException(); }
}

package org.apache.spark.examples.streaming;
/**
 * A sample actor as receiver, is also simplest. This receiver actor
 * goes and subscribe to a typical publisher/feeder actor and receives
 * data.
 * <p>
 * @see org.apache.spark.examples.streaming.FeederActor
 */
public  class SampleActorReceiver<T extends java.lang.Object> implements akka.actor.Actor, org.apache.spark.streaming.receiver.ActorHelper {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   SampleActorReceiver (java.lang.String urlOfPublisher, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  private  akka.actor.ActorSelection remotePublisher () { throw new RuntimeException(); }
  public  void preStart () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  public  void postStop () { throw new RuntimeException(); }
}

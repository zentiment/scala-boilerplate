package com.common

import akka.actor.{ActorSystem, PoisonPill, Props}


object ApplicationMain extends App {

  val settings = new CommonSettings
  import settings._

  val system = ActorSystem(AppName)
  val rootActor = system.actorOf(Props(new ActorManager(settings)), "actor-manager")

  system.registerOnTermination {
    rootActor ! PoisonPill
  }
  system.awaitTermination()
}

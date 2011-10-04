import scala.actors.Actor
import scala.actors.Actor._

class Redford extends Actor {
    def act() {
        println("this is a redford test call")
    }
}

val newman = actor {
    println("to be an actor, you must be a child")
}

val robert = new Redford
robert.start


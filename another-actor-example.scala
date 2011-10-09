import scala.actors.Actor
import scala.actors.Actor._

val countActor = actor {
    loop {
        react {
            case "how many?" => {
                println("there are "+mailboxSize.toString+" in the queue right now")
            }
        }
    }
}

countActor ! 
countActor ! 2
countActor ! 3
countActor ! 4
countActor ! 5
countActor ! "how many?"
countActor ! "how many?"
countActor ! 6
countActor ! 7
countActor ! "how many?"

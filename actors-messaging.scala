import scala.actors.Actor
import scala.actors.Actor._

val fussyActor = actor {
    loop {
        receive {
            case s:String => println("this is a test")
            case i:Int => println("int case: "+i)
            case _ => println("default case")
        }
    }
}

fussyActor ! "testing"
fussyActor ! 3

import scala.actors.Actor
import scala.actors.Actor._

val fussyActor = actor {
    loop {
        receive {
            case s:String if s.length < 14 => println("this is a test")
            case i:Int => println("int case: "+i)
            case _ => println("default case")
        }
    }
}

fussyActor ! "testing"
fussyActor ! List(1,2,3,4)
fussyActor ! 3
fussyActor.!(4)

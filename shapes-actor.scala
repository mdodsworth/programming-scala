package shapes

import scala.actors._
import scala.actors.Actor._

object ShapeDrawer extends Actor {
    def act() {
        loop {
            receive {
                case s:Shape => s.draw
                case "exit" => println("exiting..."); exit
                case x:Any => println("Error: Unknown type")
            }
        }
    }
}

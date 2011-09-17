import scala.util.Random

val randomNum = new Random() nextInt 10

randomNum match {
    case 7 => println("lucky 7!")
    case anythingElse => println(anythingElse + " is a terrible number!")
}

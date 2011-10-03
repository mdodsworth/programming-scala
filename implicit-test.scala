import scala.collection.immutable.StringOps

class FancyString(val value:String)

object FancyString2StringOps{
    implicit def fancyString2StringOps(x:FancyString) = new StringOps(x.value)
}

import FancyString2StringOps._

val impStr = new FancyString("this is a fancy string")
println("this is a test" + impStr.reverse)


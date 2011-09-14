object StringUtil {
    def joiner(strings :List[String], separator:String = " "):String = strings.mkString(separator)
}

import StringUtil._

println(StringUtil.joiner(List("testing", "joiner")))

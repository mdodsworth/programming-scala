abstract class BulkReader[+T] {
    val source:T
    def read(): String
}

class StringBulkReader(val source:String) extends BulkReader[String] {
    def read() = source
}


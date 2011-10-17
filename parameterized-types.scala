package prmt

sealed class SuperC[+T](val name:String)

class C(name:String) extends SuperC[String](name){
    var testSuper = new SuperC[AnyRef]("asda")
    testSuper = new SuperC[String]("again")
    def get:String = return "testing"
}

def processList(i:List[Any]) :Unit = {
    i match {
        case head :: tail =>
            println(head)
            processList(tail)
        case Nil => println("")
    }
}

val willWork = List(1, 3, 23, 90)
val willNotWork = List(4, 18, 52)
val empty = List() 

for (i <- List(willWork, willNotWork, empty)) {
    println("List: ")
    processList(i)
}

for (i <- List(willWork, willNotWork, empty)) {
    i match {
        case List(1,_,someValue,_) if someValue > 24 => println("first")
        case somethingElse => println("something else was passed")
    }
}


def factorial(i:Int):Int= {
    i match {
        case 1 => i
        case _ => i * factorial(i-1)
    }
}

println(factorial(4))

def exceptionToLeft[T](f: => T): Either[Exception, T] = {
    try {
        Right(f)
    }
    catch {
        case e:Exception => Left(e)
    }
}

def testExceptionThrower(i:Int) = {
    i % 2 match {
        case 0 => throw new RuntimeException("boom!")
        case 1 => i
    }
}

for(i <- 1 to 3) {
    exceptionToLeft(testExceptionThrower(i)) match {
        case Left(ex) => println("pop!")
        case Right(x) => println(x)
    }
}


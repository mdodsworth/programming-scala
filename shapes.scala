package shapes

class Point(val x:Double, val y:Double) {
    override def toString = "Point(" + x + ", " + y + ")"
}

abstract class Shape {
    def draw() :Unit
}

class Square(val height:Double, val width:Double) extends Shape {
    override def draw() = println("drawing a square(" + height + ", " + width + ")")
}

package shapes.cases

case class Point(x:Int, y:Int)

abstract class Shape {
    def draw()
}

case class Triangle(p1:Point, p2:Point, p3:Point) {
    def draw() = println("triangle")
}

case class Square(length:Int, width:Int) {
    def draw = println("Square")
}

case class Circle(radius:Int, center:Int) {
    def draw = println("Circle")
}


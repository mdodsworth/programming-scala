package ui3

abstract class Widget {
    def draw():Unit
    override def toString() = "(Widget)"
}

class Button(val name :String) extends Widget with Clickable {
    def click() = println("click!")
    def draw() = println("draw!")
    override def toString() = "(Button: " + name + ")"
}

trait Clickable {
    def click():Unit
}


package ui

abstract class Widget

class Button(val name:String) extends Widget {
    def click() = println("the user clicked something")
}


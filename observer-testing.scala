package ui

import observer._

class ObservableButton(name :String) extends Button(name) with Subject {
    override def click() = {
        super.click()
        println("this is a test")
        notifyObservers
    }
}

class ButtonCounter {
    var count = 0
    def receiveUpdate(subject :Any) = count += 1
}

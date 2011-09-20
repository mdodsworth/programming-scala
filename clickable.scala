package ui2
import observer._

trait Clickable {
    def click()
}

trait ObservableClick extends Clickable with Subject {
    abstract override def click() {
        super.click()
        notifyObservers
    }
}


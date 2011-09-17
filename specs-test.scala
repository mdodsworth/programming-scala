package ui

import org.specs._
import observer._

object ButtonObserverSpec extends Specification {
    "A button observer" should {
        "observer button clicks" in {
            val observableButton = new ObserverableButton("Testing")
            val buttonObserver = new ButtonCounter
            observableButton addObserver buttonObserver

            for (i <- 1 to 3) observableButton.click()
            buttonObserver.count mustEqual 3
        }
    }
}

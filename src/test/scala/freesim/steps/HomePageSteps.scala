package freesim.steps

import core.StepDefs
import org.scalatest.selenium.WebBrowser
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

class HomePageSteps extends StepDefs with WebBrowser {

  implicit val driver = new HtmlUnitDriver

  When("""^I open home page$"""){
    go to("http://freesim.o2.co.uk")
  }

  Then("""^I should see the page title as "([^"]*)"$"""){ (title:String) =>
    pageTitle should be(title)
  }

  After{
    driver.close()
  }
}

package freesim.steps

import core.{StepDefs}
import org.scalatest.selenium.WebBrowser
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import freesim.page.HomePage
import org.openqa.selenium.chrome.ChromeDriver

object HomePageSteps extends StepDefs[HomePage]{
  Then("""^I should see the page title as "([^"]*)"$"""){ (title:String) =>
    page.verifyTitle(title)
  }
}

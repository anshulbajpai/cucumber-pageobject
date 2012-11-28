package core

import org.scalatest.selenium.WebBrowser
import org.scalatest.matchers.ShouldMatchers

class BrowserPage extends WebBrowser with ShouldMatchers{
  implicit val driver = WebDriverFactory.driver
}

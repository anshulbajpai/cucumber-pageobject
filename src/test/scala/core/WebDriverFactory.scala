package core

import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

object WebDriverFactory {
    lazy val driver : WebDriver = new HtmlUnitDriver
}

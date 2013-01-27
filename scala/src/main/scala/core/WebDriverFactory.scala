package core

import org.openqa.selenium.{Platform, WebDriver}
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.safari.SafariDriver
import org.openqa.selenium.remote.DesiredCapabilities

object WebDriverFactory {

  sys.addShutdownHook{
    driver.quit()
  }

  lazy val driver: WebDriver = sys.props.get("driver") match {
    case Some(Firefox(true)) => new FirefoxDriver
    case Some(Chrome(true)) => new ChromeDriver
    case Some(Safari(true)) => new SafariDriver
    case Some(IE(true)) => new InternetExplorerDriver
    case None => new HtmlUnitDriver(getHtmlUnitCapabilties)
  }

  private def getHtmlUnitCapabilties =  {
    val capabilities = new DesiredCapabilities("htmlunit", "firefox", Platform.ANY)
    capabilities.setJavascriptEnabled(true)
    capabilities
  }
}

class Driver(browser : String) {
  def unapply(value: String): Option[Boolean] = Some(value.equals(browser))
}

object Firefox  extends Driver("firefox")
object Chrome  extends Driver("chrome")
object Safari extends Driver("safari")
object IE extends Driver("ie")

package core;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import static java.lang.System.getProperty;

public class DriverFactory {

    private static SharedDriver sharedDriver;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                 if(sharedDriver != null){
                     sharedDriver.quit();
                 }
            }
        });
    }

    public SharedDriver getDriver() {
        if (sharedDriver == null) {
            sharedDriver = new SharedDriver(createWebDriver(getProperty("driver")));
        }
        return sharedDriver;
    }

    private WebDriver createWebDriver(String driver) {
        if ("firefox".equals(driver))
            return new FirefoxDriver();
        else if ("chrome".equals(driver))
            return new ChromeDriver();
        else if ("safari".equals(driver))
            return new SafariDriver();
        else if ("ie".equals(driver))
            return new InternetExplorerDriver();
        else {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities("htmlunit", "firefox", Platform.ANY);
            desiredCapabilities.setJavascriptEnabled(true);
            return new HtmlUnitDriver(desiredCapabilities);
        }
    }
}

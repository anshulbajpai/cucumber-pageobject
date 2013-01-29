package core.steps;

import core.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenshotStep {

    private final WebDriver driver;

    public ScreenshotStep(DriverFactory driverFactory) {
        driver = driverFactory.getDriver();
    }

    @After
    public void takeScreenshot(Scenario scenario){
        if(scenario.isFailed() && canTakeScreenshot()){
            scenario.embed(captureScreenshot(),"image/png");
        }
    }

    private byte[] captureScreenshot(){
        return ((EventFiringWebDriver)driver).getScreenshotAs(OutputType.BYTES);
    }

    private boolean canTakeScreenshot() {
        return driver instanceof TakesScreenshot;
    }
}

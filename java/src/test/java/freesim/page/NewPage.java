package freesim.page;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;

public class NewPage {

    private final WebDriver driver;

    public NewPage(DriverFactory driverFactory) {
        driver = driverFactory.getDriver();
    }

    public void openHomePage() {
        driver.get("http://freesim.o2.co.uk/");
    }
}

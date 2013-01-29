package freesim.page;

import core.DriverFactory;
import core.steps.SharedDriver;

public class NewPage {

    private final SharedDriver driver;

    public NewPage(DriverFactory driverFactory) {
        driver = driverFactory.getDriver();
    }

    public void openHomePage() {
        driver.get("http://freesim.o2.co.uk/");
    }
}

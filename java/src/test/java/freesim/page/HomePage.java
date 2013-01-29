package freesim.page;

import core.DriverFactory;
import core.steps.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.fest.assertions.Assertions.assertThat;

public class HomePage {

    private final SharedDriver driver;

    public HomePage(DriverFactory driverFactory) {
        driver = driverFactory.getDriver();
    }

    public void verifyTitle(String title) {
        assertThat(driver.getTitle()).isEqualTo(title);
    }

    public void chose(String planName) {
        driver.findElement(By.xpath("//div[@id='" + planName + "']//input[@class='orderNowPlanButton']")).click();
    }

    public void verifySignInTextPresent() {
        WebElement element = driver.findElement(By.xpath("//span[@class='orderFormHeaderText']"));
        if(element != null){
            assertThat(element.getText()).isEqualTo("Sign up");
        }
        else throw new AssertionError("Sign up text not found");
    }
}

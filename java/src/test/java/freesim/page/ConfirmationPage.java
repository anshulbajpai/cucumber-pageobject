package freesim.page;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.fest.assertions.Assertions.assertThat;

public class ConfirmationPage {

    private final WebDriver driver;

    @FindBy(xpath = "//div[contains(@class,'tariffPlanHeaderDivConfirmation')]/h1")
    private WebElement orderConfirmation;

    @FindBy(xpath = "//div[@class='userOffersDiv']/h3")
    private WebElement userConfirmation;


    public ConfirmationPage(DriverFactory driverFactory) {
        driver = driverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void orderConfirmed(String firstname) {
        assertThat(orderConfirmation.getText()).isEqualTo("Thank you");
        assertThat(userConfirmation.getText()).isEqualTo(firstname + ", your sim will be on its way to you within 3 working days");
    }
}

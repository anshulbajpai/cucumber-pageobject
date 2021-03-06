package freesim.page;

import core.DriverFactory;
import freesim.domain.Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.fest.assertions.Assertions.assertThat;

public class HomePage {

    private final WebDriver driver;

    private WebElement title;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement email;
    private WebElement houseNumber;
    private WebElement town;
    private WebElement postcode;
    private WebElement manualAddressLink;
    private WebElement termsAndConditionsAgreement;
    private WebElement orderFormSubmit;

    public HomePage(DriverFactory driverFactory) {
        driver = driverFactory.getDriver();
        PageFactory.initElements(driver, this);
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

    public void enterCustomerDetails(Customer customer) {
        manualAddressLink.click();
        new Select(title).selectByValue(customer.title);
        firstName.sendKeys(customer.firstName);
        lastName.sendKeys(customer.lastName);
        email.sendKeys(customer.email);
        houseNumber.sendKeys(customer.houseNumber);
        town.sendKeys(customer.town);
        postcode.sendKeys(customer.postcode);
        if(!termsAndConditionsAgreement.isSelected()){
            termsAndConditionsAgreement.click();
        }
        orderFormSubmit.click();
    }
}

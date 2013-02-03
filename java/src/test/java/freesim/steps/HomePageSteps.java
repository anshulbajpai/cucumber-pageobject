package freesim.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import freesim.domain.Customer;
import freesim.page.HomePage;

import java.util.List;

public class HomePageSteps {

    private final HomePage homePage;

    public HomePageSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Then("^I should see the page title as \"([^\"]*)\"$")
    public void I_should_see_the_page_title_as(String title) throws Throwable {
        homePage.verifyTitle(title);
    }

    @When("^I click on \"([^\"]*)\"$")
    public void I_click_on(String planName) throws Throwable {
        homePage.chose(planName);
    }

    @Then("^I should see Signup form$")
    public void I_should_see_Signup_form() throws Throwable {
        homePage.verifySignInTextPresent();
    }

    @When("^I fill in the Signup form$")
    public void I_fill_in_the_Signup_form(List<Customer> customers) throws Throwable {
        Customer customer = customers.get(0);
        homePage.enterCustomerDetails(customer);
    }
}

package freesim.steps;

import cucumber.api.java.en.Then;
import freesim.page.ConfirmationPage;

public class ConfirmationPageSteps {

    private final ConfirmationPage page;

    public ConfirmationPageSteps(ConfirmationPage page) {
        this.page = page;
    }


    @Then("^I should see the confirmation page for user \"([^\"]*)\"$")
    public void I_should_see_the_confirmation_page_for_user(String firstname) throws Throwable {
        page.orderConfirmed(firstname);
    }
}

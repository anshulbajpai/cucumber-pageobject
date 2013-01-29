package freesim.steps;

import cucumber.api.java.en.Given;
import freesim.page.NewPage;

public class NewPageSteps {

    private NewPage newPage;

    public NewPageSteps(NewPage newPage) {
        this.newPage = newPage;
    }

    @Given("^I am on home page$")
    public void I_am_on_home_page() throws Throwable {
        newPage.openHomePage();
    }
}

package freesim.steps

import core.StepDefs
import freesim.page.HomePage
import cucumber.api.DataTable

class HomePageSteps extends StepDefs[HomePage]{
  Then("""^I should see the page title as "([^"]*)"$"""){ (title:String) =>
    page.verifyTitle(title)
  }

  When("""^I click on "([^"]*)"$"""){ (planName:String) =>
    page.chose(planName)
  }

  Then("""^I should see Signup form$"""){ () =>
    page.isSignInTextPresent
  }

  When("""^I fill in the Signup form$"""){ (dataTable:DataTable) =>
//    val customer = dataTable.convert[Customer](classOf[Customer])
  }
}

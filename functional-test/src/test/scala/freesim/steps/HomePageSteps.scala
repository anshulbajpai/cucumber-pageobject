package freesim.steps

import core.StepDefs
import freesim.page.HomePage

class HomePageSteps extends StepDefs[HomePage]{
  Then("""^I should see the page title as "([^"]*)"$"""){ (title:String) =>
    page.verifyTitle(title)
  }
}

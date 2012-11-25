package freesim.steps

import core.StepDefs
import freesim.page.NewPage

object NewPageSteps extends StepDefs[NewPage] {

  Given("""^I am on home page$"""){ () =>
    page.openHomePage
  }

}

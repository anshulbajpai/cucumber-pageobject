package core.steps

import core.{StepDefs, BrowserPage}

object CloseBrowserStep extends StepDefs[BrowserPage] {
  After{
    page.close()(page.driver)
  }
}
package core.steps

import core.{StepDefs, BrowserPage}

class CloseBrowserStep extends StepDefs[BrowserPage] {
//  private def captureScreenShot = new ByteArrayInputStream(page.driver.asInstanceOf[TakesScreenshot].getScreenshotAs[Array[Byte]](OutputType.BYTES))

//  After{scenarioResult : ScenarioResult =>
//    if(scenarioResult.isFailed && page.isScreenshotSupported(page.driver)){
//      scenarioResult.embed(captureScreenShot,  "image/png")
//    }
//    page.close()(page.driver)
//  }
  After{
    page.close()(page.driver)
  }

}
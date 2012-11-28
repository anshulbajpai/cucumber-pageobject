package freesim.page

import core.BrowserPage

class HomePage extends BrowserPage{
  def verifyTitle(expectedTitle: String) {
    title should be(expectedTitle)
  }
}

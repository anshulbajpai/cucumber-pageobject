package freesim.page

import core.BrowserPage

class HomePage extends BrowserPage{
  def verifyTitle(title: String) {
    pageTitle should be(title)
  }
}
